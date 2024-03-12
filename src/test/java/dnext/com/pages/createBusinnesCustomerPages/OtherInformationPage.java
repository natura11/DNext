package dnext.com.pages.createBusinnesCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class OtherInformationPage extends BasePage {
    Faker faker = new Faker();
    @FindBy(xpath = "//div[@id='cdk-step-content-0-1']//span[contains(text(),'Next')]")
    public WebElement nextBtnOnGeneralInformation;

    public OtherInformationPage nextBtnClickGeneralInformation() {
        Utils.waitFor(1);
        Utils.click(nextBtnOnGeneralInformation);
        return this;
    }
}