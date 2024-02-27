package dnext.com.pages.customer360;

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
    @FindBy(xpath = "//*[@placeholder=\"Enter Customer ID..\"]")
    public WebElement enterCustomerIdfield;
    @FindBy(xpath = "//span[text()='Search ']")
    public WebElement searchBtnOnCustomerSearch;
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
    @FindBy(xpath = "//*[@formcontrolname=\"postCode\"]")
    public WebElement editPostCodeOnBillingAdress;
    @FindBy(xpath = "//button[@class=\"mat-focus-indicator accent mr-12 mat-stroked-button mat-button-base\"]")
    public WebElement saveBtnOnDefaultBillingAdress;
    @FindBy(xpath = "//span[.='Address updated successfully!']")
    public WebElement adressUpdatedSuccessfullyMessage;
    public GovermentDefaultBillingAdressUpdatePage usingValidCustomerId(String validId) {
        Utils.waitForPageToLoad();
        enterCustomerIdfield.sendKeys(validId);
        return this;
    }
    public GovermentDefaultBillingAdressUpdatePage usingNewDataForAddress1(String newStreet1) {
        Utils.waitForPageToLoad();
        editStreet1OnBillingAdress.clear();
        editStreet1OnBillingAdress.sendKeys(newStreet1);
        return this;
    }
    public GovermentDefaultBillingAdressUpdatePage usingNewDataForAddress2(String newStreet1) {
        Utils.waitForPageToLoad();
        editStreet2OnBillingAdress.clear();
        editStreet2OnBillingAdress.sendKeys(newStreet1);
        return this;
    }
    public GovermentDefaultBillingAdressUpdatePage usingNewDataForPostCode(String rondomPostCode) {
       Faker faker1= new Faker();
        Utils.waitForPageToLoad();
        editPostCodeOnBillingAdress.clear();
        editPostCodeOnBillingAdress.sendKeys(faker1.address().zipCode());
        return this;
    }
    public GovermentDefaultBillingAdressUpdatePage verifyAddressupdatedsuccessfullyMessage( String message) {
        try {
            Utils.waitFor(3);
            Assert.assertEquals(message, adressUpdatedSuccessfullyMessage.getText());
        }catch(Exception e){
            log.info(message + "is not matched");
        }return this;

    }

}
