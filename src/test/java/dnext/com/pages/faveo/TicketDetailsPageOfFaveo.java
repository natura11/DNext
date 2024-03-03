package dnext.com.pages.faveo;

import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TicketDetailsPageOfFaveo extends BasePage {
    @FindBy(xpath = "(//*[@data-toggle='dropdown'])[8]")
    public WebElement changeStatusBtnOnFaveoPage;

    @FindBy(xpath = "//div[@class='card-body']//a[2]")
    public WebElement changeStatusWithResolvedBtnOnFaveoPage;

    @FindBy(xpath = "//button[@id='submit_btn']")
    public WebElement proceedBtnOnFaveoPage;

    @FindBy(xpath = "//span[.=\"Ticket status changed successfully!!\"]")
    public WebElement ticketStatusChangedSuccessfullyMessage;

}
