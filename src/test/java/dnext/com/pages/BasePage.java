package dnext.com.pages;

import com.github.javafaker.Faker;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import com.utilities.TestContext;
import com.utilities.Utils;
import com.utilities.anotations.DefaultUrl;
import dnext.com.step_definitions.gui.HooksUI;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import static com.utilities.Driver.getDriver;
import static com.utilities.Utils.*;

@Log4j2
@AllArgsConstructor
public abstract class BasePage {
    protected Faker faker;





    @FindBy(xpath = "//span[normalize-space()='Customer360']")
    public WebElement customer360btn;

    @FindBy(xpath = "//span[@class='nav-link-title ng-tns-c97-1 ng-star-inserted']")
    public WebElement covarageMapBtn;

    @FindBy(xpath = "//span[normalize-space()='Operations']")
    public WebElement operationsBtn;

    @FindBy(xpath = "//span[normalize-space()='Create Individual Customer']")
    public WebElement createIndividualCustomerBtn;

    @FindBy(xpath = "//span[normalize-space()='Create Business Customer']")
    public WebElement createBusinessCustomerBtn;

    @FindBy(xpath = "//span[normalize-space()='Create Government Customer']")
    public WebElement createGovernmentCustomerBtn;

    @FindBy(xpath = "//span[normalize-space()='Enterprise Parent Account']")
    public WebElement enterpriseParentAccountBtn;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Batch Operations']")
    public WebElement batchOperationsBtn;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Partner']")
    public WebElement partnerBtn;

    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Skeda']")
    public WebElement skedaBtn;

    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]")
    public WebElement dnextlogoOnNavbar;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/img")
    public WebElement profileSignBtnOnHomePage;

    @FindBy(xpath = "//mat-icon[normalize-space()='keyboard_arrow_down']")
    public WebElement profileSignDropdownArrowBtnOnPage;

    @FindBy(xpath = "//span[@class='username mr-12']")
    public WebElement userNameWithProfileOnHomePage;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
    public WebElement myProfileBtnInDropdownOnHomePage;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span")
    public WebElement inboxBtnInDropdownOnHomePage;

    @FindBy(xpath = "//button[3]")
    public WebElement logoutBtnInDropdownOnHomePage;

    @FindBy(xpath = "//span[@class='username mr-12']")
    public WebElement emailOfUserOnHomePage;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[2]/span/div/span")
    public WebElement languageBtnOnHomePage;

    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]/div[2]/button[1]")
    public WebElement arrowBackBtnOnHomePage;

    @FindBy(xpath = "//span[.=\"arrow_back\"]/..")
    public WebElement arrowBackBtn;

    @FindBy(xpath = "//div[contains(text(),'Payment Id')]/following-sibling::div")
    public WebElement paymentIdOfFiscalizationDetail;

    @FindBy(xpath = "//*[@id=\"mat-tab-content-0-4\"]/div/app-order-page/mat-drawer-container/mat-drawer/div/div[2]/div[1]/mat-list/mat-list-item[1]/div/div[3]/div[2]")
    public WebElement orderIdForCoaxial;







    public BasePage(Faker faker) {
        this.faker = faker;
    }

    public BasePage() {
        PageFactory.initElements(getDriver(), this);
    }

    public static ThreadLocal<List<TestContext>> testContext = new InheritableThreadLocal<>();

    public void setTestData(String key, String value) {
        testContext.get().add(new TestContext(HooksUI.scenarioName.get(), Map.of(key, value)));
    }

    public String getTestDate(String key, String scenarioName) {
        return testContext.get().stream()
                .filter(n -> n.scenarioName().equals(scenarioName))
                .map(n -> n.testData().get(key))
                .toList().getFirst();
    }

    public String getTestDate(String key) {
        return testContext.get().stream()
                .filter(n -> n.testData().containsKey(key))
                .toList().getFirst().testData().get(key);
    }

    public <T> void openPage(Class<T> className) {
        getDriver().get(ConfigurationReader.getProperty(className.getAnnotation(DefaultUrl.class).value()));
        Utils.waitForPageToLoad();
    }

    public void refreshPage() {
        Utils.refreshThePage();
    }

    public static void elementDisplayed(WebElement webElement) {
        Utils.waitForVisibility(webElement, 10);
        Assert.assertTrue(webElement.isDisplayed());
        log.info(webElement.getTagName() + " is displaying");
    }

    public static boolean isElementDisplayed(WebElement webElement) {
        Utils.waitForVisibility(webElement, 10);
        return webElement.isDisplayed();
    }

    public static void elementNotDisplayed(WebElement webElement) {
        Utils.waitForInvisibilityOf(webElement);
        try {
            Assert.assertFalse(webElement.isDisplayed());
            log.info("WebElement is not displaying");
        } catch (NoSuchElementException exception) {
            log.info("WebElement is displaying");
        }
    }

    public void logout() {
        Utils.waitFor(3);
        log.info("User logs out from the page");
        Utils.click(profileSignDropdownArrowBtnOnPage);
        Utils.click(logoutBtnInDropdownOnHomePage);
    }

    public static void warningMessage(String message, WebElement element) {
        Utils.waitForVisibility(element,3);
        String actualMessage = element.getText();
        Assert.assertEquals(message, actualMessage);
    }


    public static void sendKeys(WebElement element, String data) {
        getElement(element).sendKeys(data);
    }

    public static void clickField(WebElement element) {
        Utils.waitForClickablility(element);
        //Utils.waitForPageToLoad();
        Utils.click(element);
    }


    public static void enterValidFormatEmail(String validEmail, WebElement emailButton) {
        emailButton.clear();
        Utils.sendKeys(emailButton, validEmail);
    }

    public static void
    uploadFile(WebElement addElement, WebElement sendFieldElement, String fileName) {
        String path = System.getProperty("user.dir") + "\\src\\test\\resources\\fotosAndDoc\\" + fileName;
        Utils.waitFor(3);
        addElement.click();
        sendFieldElement.sendKeys(path);
        Utils.waitFor(1);
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);
    }

    public static void verifyTheUploadedBigger5MbSizeFile(String fileName, WebElement warningMsg, WebElement addBtn, WebElement sendFieldBtn, String warningTxt) {
        uploadFile(addBtn, sendFieldBtn, fileName);
        Utils.waitForVisibility(warningMsg, 10);
        log.info(warningMsg.getText());
        Assert.assertEquals(warningTxt, warningMsg.getText());
    }

    public static void isDropdownSelectable() {
        List<WebElement> options = Driver.getDriver().findElements(By.xpath("//*[@class='mat-option-text']"));
        System.out.println("options.size() = " + options.size());
        for (WebElement option : options) {
            if (option.isDisplayed()) {
                log.info("Option '" + option.getText() + "' is selectable.");
            } else {
                log.info("Option '" + option.getText() + "' is not selectable.");
            }
        }
    }

    public static void randomOptionFromDropdown() {
        List<WebElement> options = Driver.getDriver().findElements(By.xpath("//*[@class='mat-option-text']"));
        if (!options.isEmpty()) {
            Random random = new Random();
            int randomIndex = random.nextInt(options.size());
            Utils.waitForClickablility(options.get(randomIndex));
            options.get(randomIndex).click();
            log.info("Random option selected: " + options.get(randomIndex).getText());
        } else {
            log.info("No options found in the dropdown.");
        }
    }

    public static void selectSpecificOptionFromDropdown(String toBeSelectedOption) {
        List<WebElement> options = Driver.getDriver()
                .findElements(By.xpath("//*[@class='mat-option-text']"));
        if (!options.isEmpty()) {
            options.stream().filter(option -> option.getText().trim().equals(toBeSelectedOption))
                    .findFirst()
                    .ifPresent(WebElement::click);
            log.info(toBeSelectedOption + " option is selected!");
        } else {
            log.info("No options found in the dropdown.");
        }
    }

    public static void performKeyboardAction(Keys keys) {
        Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(keys)
                .perform();
        waitFor(1);
    }

    public static String getValueByMouseKeyboardAction(WebElement webElement) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(webElement)
                .click(webElement)
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .keyUp(Keys.CONTROL)
                .keyDown(Keys.CONTROL)
                .sendKeys("c")
                .keyUp(Keys.CONTROL)
                .perform();

        waitFor(1);
        return getClipboardText();
    }


    public static void warningBackgroundRedColorOne(WebElement webElement, boolean isRed) {
        Utils.waitFor(1);
        try {
            String expectedRedColorCode;
            expectedRedColorCode = (isRed) ? "#f44336" : "#000000";
            String backgroundColor = webElement.getCssValue("color");
            Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertEquals(expectedRedColorCode, actualBackRoundColorCode);
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is not displaying!!");
        }
    }

    public static String getValueByJS(String idOfElement) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        String text = js.executeScript("return document.getElementById('" + idOfElement + "').value").toString();
        System.out.println("Value in Box: " + text);
        return text;
    }

    public static void clearEnterText(WebElement element, String inputText) {
        element.clear();
        element.sendKeys(inputText);
    }

    public static void switchToWindow1(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }

    public static void switchToWindowNew(int number) {
        List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
        Driver.getDriver().switchTo().window(tumWindowHandles.get(number));
    }

    private static String getClipboardText() {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        try {
            return (String) clipboard.getData(DataFlavor.stringFlavor);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void verifyValidFormatEmail(String dotSign, String tagSign, String email) {
        Assert.assertTrue(String.valueOf(email.contains(dotSign)), email.contains(tagSign));
    }

    public static void fillInput(WebElement element, String text) {
        element.clear();
        Utils.sendKeys(element, text);
    }

    public static void fillInputWithTab(WebElement element, String text) {
        element.clear();
        Utils.sendKeys(element, text + Keys.TAB);
    }

    public static void verifyInputErrorMessage(WebElement webElement, String message) {
        elementDisplayed(webElement);
        Assert.assertEquals(message, webElement.getText().trim());
    }

    public static void verifyPageErrorMessage(WebElement webElement, String message) {
        elementDisplayed(webElement);
        Assert.assertEquals(message, webElement.getText().trim());
    }
    public static void slidingButton(WebElement slideButton){
        Actions action = new Actions(Driver.getDriver());
        int buttonWidth = slideButton.getSize().getWidth();
        action.clickAndHold(slideButton).moveByOffset(buttonWidth, 0).release().perform();
    }

    public static int getMatTableHeaderIndex(String label) {
        List<WebElement> tableHeaders = Driver.getDriver().findElements(By.xpath("//mat-header-row//div[@role]/div[text()]"));
        for (int i = 0; i < tableHeaders.size(); i++) {
            if (tableHeaders.get(i).getText().contains(label)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static String getMatCellDataByColumnName(String label, int rowNumber) {
        WebElement tableCellElement = Driver.getDriver()
                .findElement(By.xpath("//mat-row[" + rowNumber +  "]" +
                        "/mat-cell[" + getMatTableHeaderIndex(label) +  "]/span"));
        return tableCellElement.getText().trim();
    }

    public static int getTableHeaderIndex(String label) {
        List<WebElement> tableHeaders = Driver.getDriver().findElements(By.xpath("//table/thead/tr/th[contains(text(),'')]"));
        for (int i = 0; i < tableHeaders.size(); i++) {
            if (tableHeaders.get(i).getText().contains(label)) {
                return i + 1;
            }
        }
        return -1;
    }

    public static String getTableCellDataByColumnName(String label, int rowNumber) {
        WebElement tableCellElement = Driver.getDriver()
                .findElement(By.xpath("//tbody/tr[" + rowNumber +  "]" +
                        "/td[" + getTableHeaderIndex(label) +  "]/*[text()]"));

        return tableCellElement.getText().trim();
    }


}