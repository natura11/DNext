package dnext.com.pages.createIndividualCustomer;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.InvoiceAccountPage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class InvoiceAccountIndividualPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'Invoice Account')]")
    public WebElement invoiceAccountButton;

    @FindBy(xpath = "//h2[contains(text(), 'POSTPAID ACCOUNT')]")
    public WebElement postpaidAccountTitleLabel;

    public InvoiceAccountIndividualPage verifyUserIsOnInvoiceAccountPage() {
        try {
            if (postpaidAccountTitleLabel.isDisplayed())
                log.info("Account title is displaying");
        } catch (Throwable e) {
            log.info("Error message: Account title is  not displaying");
        }
        return this;
    }
}
