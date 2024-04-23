package dnext.com.pages.customer360Pages;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CustomerMainPage extends BasePage {

    @FindBy(xpath = "//h2[.='Customer Information']")
    public WebElement customerInformationTxtOnGeneral;
    @FindBy(xpath = "//span[normalize-space()='Load Tickets']")
    public WebElement loadTicketsOnTroubleTickets;
    @FindBy(xpath = "//td[contains(text(),'Open')]/following::button[@aria-label='More']")
    public WebElement threeDotsIconNearOpenTicket;
    @FindBy(xpath = "//button/span[text()='DCase']")
    public WebElement dCaseButton;


    public void switchToFaveoFromDnext() {
        clickField(dCaseButton);
        switchToWindowNew(1);
        System.out.println("moved to faveo succesfully!!");
    }


}