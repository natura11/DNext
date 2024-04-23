package dnext.com.pages.customerUpdatePages;

import com.github.javafaker.Faker;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class GovermentDefaultBillingAdressUpdatePage extends BasePage {
    @FindBy(xpath = "//mat-select[@panelclass=\"dropDown-overlay\"]")
    public WebElement selectSearchTypeBtn;
    @FindBy(xpath = "//*[text()=' Customer ID ']")
    public WebElement selectSearchTypeWithCostomerId;
    @FindBy(xpath = "(//*[text()=' Customer Name '])[2]")
    public WebElement selectSearchTypeWithCostomerName;
    @FindBy(xpath = "//*[@placeholder=\"Enter Customer ID..\"]")
    public WebElement enterCustomerIdfield;

    @FindBy(xpath = "//*[@class=\"mat-autocomplete-panel custom-mat-autocomplete ng-star-inserted mat-autocomplete-visible\"]")
    public WebElement idInfofield;
    @FindBy(xpath = "//div[@class='mat-tab-label-content'][normalize-space()='Address']")
    public WebElement adressFieldOnCustomerSerch;
    @FindBy(xpath = "//td[normalize-space()='DEFAULT_BILLING_ADDRESS']")
    public WebElement defaultBillingAdressfielForAseertion;
    @FindBy(xpath = "//mat-icon[normalize-space()='more_vert']")
    public WebElement editIconForUndateBillingAdress;
    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButtonForUndateBillingAdress;
    @FindBy(xpath = "//*[@formcontrolname=\"street1\"]")
    public WebElement editStreet1OnBillingAdress;
    @FindBy(xpath = "//*[@formcontrolname=\"street2\"]")
    public WebElement editStreet2OnBillingAdress;
    @FindBy(xpath = "//input[@formcontrolname=\"postCode\"]")
    public WebElement editPostCodeOnBillingAdress;
    @FindBy(xpath = "//*[.='save']")
    public WebElement saveBtnOnDefaultBillingAdress;
    @FindBy(xpath = "//span[.='Address updated successfully!']")
    public WebElement adressUpdatedSuccessfullyMessage;
    @FindBy(xpath = "//*[*='cancel']")
    public WebElement cancelButtonOnAddressPage;
    @FindBy(xpath = "//*[@formcontrolname=\"city\"]")
    public WebElement cityDropdownButtonOnAddressPage;
    @FindBy(xpath = "(//*[.='BERAT'])[6]")
    public WebElement cityBeratButtonOnAddressPage;
    @FindBy(xpath = "//span[.=' Ok ']")
    public WebElement okButtonForConsentInformationOfThisCustomer;


    public void usingValidCustomerId(String validId) {
        Utils.waitForPageToLoad();
        enterCustomerIdfield.sendKeys(validId);
    }
    public void usingNewDataForAddress1(String newStreet1) {
        Utils.waitForPageToLoad();
        editStreet1OnBillingAdress.clear();
        Utils.waitFor(1);
        editStreet1OnBillingAdress.sendKeys(newStreet1);
    }
    public void usingNewDataForAddress2(String newStreet1) {
        Utils.waitForPageToLoad();
        editStreet2OnBillingAdress.clear();
        Utils.waitFor(1);
        editStreet2OnBillingAdress.sendKeys(newStreet1);
    }
    public void usingNewDataForPostCode(String rondomPostCode) {
       Faker faker1= new Faker();
        Utils.waitForPageToLoad();
        editPostCodeOnBillingAdress.clear();
        editPostCodeOnBillingAdress.sendKeys(faker1.address().zipCode());
    }
    public void verifyAddressupdatedsuccessfullyMessage(String message) {
        try {
            Utils.waitFor(3);
            Assert.assertEquals(message, adressUpdatedSuccessfullyMessage.getText());
        }catch(Exception e){
            log.info(message + "is not matched");
        }

    }

}
