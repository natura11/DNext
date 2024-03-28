package dnext.com.pages.createIndividualCustomer;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.VtvActivationPage;
import io.cucumber.java.bs.A;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

@Log4j2
public class OtherInformationIndividualPage extends BasePage{

    @FindBy(xpath = "//div[contains(text(),'Other Information')]")
    public WebElement otherInformationButton;

    @FindBy(xpath = "//div[contains(text(),'Other Information')]//ancestor::mat-step-header")
    public WebElement otherInformationButtonSelectedLabel;  // aria-selected : true will be validated

    @FindBy(xpath = "//span[contains(text(),'Disability')]//preceding-sibling::div")
    public WebElement disabilityToggleSwitch;

    @FindBy(xpath = "//input[@formcontrolname='firstLastName']")
    public WebElement firstLastNameInput;

    @FindBy(xpath = "//input[@formcontrolname='mobileNumber']")
    public WebElement mobileNumberInput;

    @FindBy(xpath = "(//input[@formcontrolname='email'])[2]")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@formcontrolname='identificationNumber']")
    public WebElement identificationNumberInput;

    @FindBy(xpath = "(//input[@formcontrolname='birthDate'])[2]")
    public WebElement birthDateInput;

    @FindBy(xpath = "//input[@formcontrolname='gender']")
    public WebElement genderInput;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentFirstClause']")
    public WebElement firstCheckboxAgreement;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentSecondClause']")
    public WebElement secondCheckboxAgreement;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentMesazhSMS']")
    public WebElement messageCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentPhone']")
    public WebElement telephoneCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentEmail']")
    public WebElement emailCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentPosta']")
    public WebElement postCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentFacebook']")
    public WebElement facebookCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentJo']")
    public WebElement joNoCheckbox;

    @FindBy(xpath = "//mat-checkbox[@formcontrolname='consentPo']")
    public WebElement poYesCheckbox;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]")
    public WebElement generateFormButton;

    @FindBy(xpath = "//mat-select[@formcontrolname='consentDocType']")
    public WebElement documentTypeDropdown;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::mat-icon[text()='add']")
    public WebElement addConsentFormButton;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::input[@id='fileInput']")
    public WebElement consentFormUploadField;

    @FindBy(xpath = "//div[@class='text-right attachment-buttons']/preceding-sibling::div")
    public WebElement consentFormNameText;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::mat-icon[text()='visibility")
    public WebElement consentFormViewButton;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::mat-icon[text()='cancel")
    public WebElement consentFormCancelButton;

    @FindBy(xpath = "(//span[text()='Back'])[5]//ancestor::button")
    public WebElement backButtonOnOtherInformationPage;

    @FindBy(xpath = "//span[text()='Save']//ancestor::button")
    public WebElement saveButtonOnOtherInformationPage;

    public void verifyUserIsOnOtherInformationPage() {
        try {
            Assert.assertTrue(otherInformationButtonSelectedLabel.isDisplayed());
            Assert.assertEquals("true", otherInformationButtonSelectedLabel.getAttribute("aria-selected"));
            log.info("Other Information Page is displaying");
        } catch (Throwable e) {
            log.info("Error message: Other Information Page is  not displaying");
        }
    }

    public void verifyFetchedPersonData(Map<String, String> personData) {
        Assert.assertEquals(personData.get("First Name") + " " + personData.get("Last Name"),
                            getValueByMouseKeyboardAction(firstLastNameInput));
        Assert.assertEquals("+355" + personData.get("Mobile Phone Number"), getValueByMouseKeyboardAction(mobileNumberInput));
        Assert.assertEquals(personData.get("Email"), getValueByMouseKeyboardAction(emailInput));
        Assert.assertEquals(personData.get("Identification Number"), getValueByMouseKeyboardAction(identificationNumberInput));
        Assert.assertEquals(personData.get("Birth Date"),getValueByMouseKeyboardAction(birthDateInput) );
        Assert.assertEquals(personData.get("Gender"), getValueByMouseKeyboardAction(genderInput));
    }

    public void verifyCheckboxStatus(WebElement webElement, boolean isChecked){
        if(isChecked){
            Assert.assertTrue(webElement.getAttribute("class").contains("mat-checkbox-checked"));
        }else {
            Assert.assertFalse(webElement.getAttribute("class").contains("mat-checkbox-checked"));
        }
    }
    public void verifyGenerateFormInNewTab() {
        Utils.waitFor(3);
        performKeyboardAction(Keys.ESCAPE);
        Assert.assertEquals(2, Driver.getDriver().getWindowHandles().size());
        switchToWindowNew(1);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("blob"));
    }

    public void switchToOtherInformationPage() {
        switchToWindowNew(0);
        verifyUserIsOnOtherInformationPage();
    }

    public void uploadConsentFormDocument(String fileName) {
        try {
            uploadFile(addConsentFormButton,consentFormUploadField, fileName);
        }catch (Exception e) {
            log.error("Error uploading file: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void verifyUploadedConsentFormDocument(String fileName) {
        Utils.waitForVisibility(consentFormNameText, 3);
        Assert.assertEquals("ConsentForm-" + fileName, consentFormNameText.getText().trim());
    }


}
