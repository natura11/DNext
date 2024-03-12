package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Utils;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class AddressInformationPage {
    @FindBy(xpath = "//div[@id='cdk-step-content-0-4']//span[contains(text(),'Next')]")
    public WebElement nextButtonOnAddressInfoPage;
    @FindBy(xpath = "//*[@formcontrolname='street1']")
    public WebElement addressLine1;
    @FindBy(id = "mat-select-24")
    public WebElement clickCity;
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='BERAT']")
    public WebElement selectCity;

    public AddressInformationPage nextBtnClickAddressInformation() {
        Utils.click(nextButtonOnAddressInfoPage);
        Utils.waitFor(3);
        return this;
    }

    public AddressInformationPage addressLine1Filled(String address) {
        Utils.sendKeys(addressLine1, address);
        return this;
    }

    public AddressInformationPage selectCityOnAddressInformationPage() {
        Utils.waitFor(2);
        Utils.click(clickCity);
        Utils.waitFor(2);
        Utils.click(selectCity);
        return this;
    }
}