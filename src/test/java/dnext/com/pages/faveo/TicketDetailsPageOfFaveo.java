package dnext.com.pages.faveo;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketDetailsPageOfFaveo extends BasePage {
    @FindBy(xpath = "//button[@id='status' and @data-toggle='dropdown']")
    public WebElement changeStatusBtnOnFaveoPage;

    @FindBy(xpath = "//a[@id='change_status' and contains(text(),'Resolved')]")
    public WebElement changeStatusWithResolvedBtnOnFaveoPage;

    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement proceedBtnOnFaveoPage;

    @FindBy(xpath = "//span[.='Ticket status changed successfully!!']")
    public WebElement ticketStatusChangedSuccessfullyMessage;

    public void switchToDnextFromFaveo() {
        switchToWindowNew(0);
        System.out.println("moved to Dnext succesfully!!");
    }

    public void turningBackToCustomerManagementPage(){
        Utils.waitFor(150);
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().close();
        switchToDnextFromFaveo();
    }

}
