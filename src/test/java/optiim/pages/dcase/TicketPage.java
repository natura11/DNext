package optiim.pages.dcase;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class TicketPage extends PageBase {
    public static final By hrefLogin = By.xpath("//a[@href ='/auth/login']");
    public static final By ticketForm = By.id("ticket-form");
    public static final By myTickets = By.cssSelector("[id='tickets-index']");
    public static final By userPanel = By.cssSelector("[class='user-panel']");
    public static final By userDirectoryPageTitle = By.xpath("//*[text()='List of Users']");
    public static final By txtFilterSearch = By.xpath("//input[@placeholder='Type and press enter to search...']");


    private final WorldHelper worldHelper;

    public TicketPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public TicketPage openPage() throws MalformedURLException {
        //getWebDriver().navigate().to(new URL(Props.getProp("site.url")));
        log.info("Web page açılıyor: " + worldHelper.getFrontEndURL());
        getWebDriver().navigate().to(new URL(worldHelper.getFrontEndURL()));
        return this;
    }


    public TicketPage enterFilterSearch(String searchName) throws InterruptedException {
        sendKeys(txtFilterSearch, searchName, true);
        log.info("Enter Search Name:" + searchName);
        return this;
    }

    public TicketPage controlTicket() {
        String expectedTicketName = worldHelper.getCustomerCaseManagementData().getTicketSubjectName();
        log.info(expectedTicketName + "Ticket is checking.");
        control(isElementExist(By.xpath("//a[contains(text(),'" + expectedTicketName + "')]")), expectedTicketName + "Ticket is exist.", "ERROR:" + expectedTicketName + "Ticket is not exist.");
        return this;
    }

    public TicketPage controlCustomerNameAndTicketDescription() {
        String expectedCustomerName = worldHelper.getCustomerName();
        log.info("Customer Name and Ticket Description is checking.");
        List<WebElement> elementList = findElements(By.xpath("//span[contains(text(),'DNextDescription')]//following-sibling::span"));
        String incomingDescription = elementList.get(0).getText();
        String expectedDescription = "Optimization Problem";
        log.info("Expected Ticket Description" + expectedDescription);
        log.info("Incoming Ticket Description" + incomingDescription);
        control(incomingDescription.contains(expectedDescription), expectedDescription + "Ticket Description is successfully.", "ERROR:" + expectedDescription + "Ticket Description is not successfully.");
        control(isElementExist(By.xpath("//span[contains(text(),'" + expectedCustomerName + "')]")), expectedCustomerName + "Customer Name is exist.", "ERROR:" + expectedCustomerName + "Customer Name is not exist.");
        return this;
    }

    public TicketPage clickOneTicket() throws InterruptedException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(By.xpath("//tr//td//div//h3"));
        clickJS(elementList.get(0));
        log.info("Ticket clicked.");
        return this;
    }

    public TicketPage controlTitle(String titleName) throws InterruptedException {
        Thread.sleep(2000);
        log.info("Title is checking.");
        control(isElementExist(By.xpath("//*[contains(text(),'" + titleName + "')]")), titleName + " title is exist.", "ERROR:" + titleName + " title is not exist.");
        return this;
    }

    public TicketPage clickTicketDetailsButton(String buttonName) throws InterruptedException {
        clickJS(By.xpath("//button[contains(text(),'" + buttonName + "')]"));
        log.info(buttonName + " Button clicked.");
        return this;
    }

    public TicketPage enterDueDate(String dueDate) throws InterruptedException {
        Thread.sleep(500);
        clickJS(By.cssSelector("[placeholder='Select Date']"));
        Thread.sleep(500);
        clickJS(By.cssSelector("td[class*='today']"));
        Thread.sleep(500);
        clickJS(By.xpath("//button[contains(text(),'OK')]"));
        Thread.sleep(500);
        clickJS(By.xpath("//button[contains(text(),'Update')]"));
        return this;
    }

    public TicketPage enterDepartment(String department) throws InterruptedException, AWTException {
        Thread.sleep(2000);
        List<WebElement> elementList = findElements(By.cssSelector("input[placeholder='Search or Select']"));
        elementList.get(0).sendKeys(department);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_BACK_SPACE);
        robot.keyRelease(KeyEvent.VK_BACK_SPACE);
        Thread.sleep(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        log.info("Select Department:" + department);
        return this;
    }

    public TicketPage controlDNextContextUrl() {
        log.info("DNextContextUrl Field is checking.");
        control(isElementExist(By.xpath("//span[contains(text(),'DNextContextUrl')]//following-sibling::span[contains(text(),'https://dev.dnext-vfal.com/ui/customerManagement/customer360/search?customerId')]")),"DNextContextUrl Field Link is exist.","ERROR: DNextContextUrl Field Link is not exist.");
        return this;
    }

    public TicketPage clickDNextContextUrl() throws InterruptedException {
        List<WebElement> elementList = findElements(By.xpath("//span[contains(text(),'DNextContextUrl')]"));
        clickJS(elementList.get(0));
        log.info("DNextContextUrl Field clicked.");
        Thread.sleep(2000);
        clickJS(By.xpath("//a[contains(text(),'https://dev.dne')]"));
        log.info("DNextContextUrl Field Link clicked.");
        return this;
    }
}
