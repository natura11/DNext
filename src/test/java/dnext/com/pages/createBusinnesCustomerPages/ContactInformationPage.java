package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class ContactInformationPage extends BasePage {
    @FindBy(xpath = "//div[@id='cdk-step-content-0-3']//span[contains(text(),'Next')]")
    public WebElement nextButtonOnContactInfoPage;

    public ContactInformationPage nextBtnClickContactInformation() {
        Utils.waitFor(1);
        Utils.click(nextButtonOnContactInfoPage);
        return this;
    }
}