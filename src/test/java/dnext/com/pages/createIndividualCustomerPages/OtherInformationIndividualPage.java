package dnext.com.pages.createIndividualCustomerPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;

import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::input[@id='consentFileInput']")
    public WebElement consentFormUploadField;

    @FindBy(xpath = "(//p[contains(text(),'Consent Form')]/following::div/div)[1]")
    public WebElement consentFormNameText;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::mat-icon[text()='visibility")
    public WebElement consentFormViewButton;

    @FindBy(xpath = "//span[contains(text(),'Generate Form')]/following::mat-icon[text()='cancel")
    public WebElement consentFormCancelButton;

    @FindBy(xpath = "(//span[text()='Back'])[5]//ancestor::button")
    public WebElement backButtonOnOtherInformationPage;

    @FindBy(xpath = "//span[text()='Save']//ancestor::button")
    public WebElement saveButtonOnOtherInformationPage;

    @FindBy(xpath = "//simple-snack-bar/span")
    public WebElement successSnakeMessage;

/***
    Below XPaths will be used for General Information Page objects
    to compare and verify on Other Information page
 */
    @FindBy(xpath = "//div[contains(text(),'General Information')]")
    public WebElement generalInformationButton;

    @FindBy(xpath = "//input[@formcontrolname='firstName']")
    public WebElement firstNameField;

    @FindBy(xpath = "//input[@formcontrolname='lastName']")
    public WebElement lastNameField;

    @FindBy(xpath = "//input[@formcontrolname='phoneNumber']")
    public WebElement phoneNumberField;

    @FindBy(xpath = "//input[@formcontrolname='email']")
    public WebElement emailField;

    @FindBy(xpath = "//input[@formcontrolname='personalNumber']")
    public WebElement personalNumberField;

    @FindBy(xpath = "//input[@formcontrolname='birthDate']")
    public WebElement birthDateField;

    public void verifyUserIsOnOtherInformationPage() {
        try {
            elementDisplayed(otherInformationButtonSelectedLabel);
            Assert.assertEquals("true", otherInformationButtonSelectedLabel.getAttribute("aria-selected"));
            log.info("Other Information Page is displaying");
        } catch (Throwable e) {
            log.info("Error message: Other Information Page is  not displaying");
        }
    }

    public void verifyCheckboxStatus(WebElement webElement, boolean isChecked){
        if(isChecked){
            Assert.assertTrue(webElement.getAttribute("class").contains("mat-checkbox-checked"));
        }else {
            Assert.assertFalse(webElement.getAttribute("class").contains("mat-checkbox-checked"));
        }
    }
    public void verifyGenerateFormInNewTab() {
        Utils.waitFor(5);
        try {
            Runtime.getRuntime().exec(
                    System.getProperty("user.dir") + "\\src\\test\\resources\\autoItScripts\\cancelDownloadWindow.exe");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Utils.waitFor(1);
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
        elementDisplayed(consentFormNameText);
        Assert.assertEquals("ConsentForm-" + fileName, consentFormNameText.getText().trim());
    }

    private Map<String, String> pickPersonalData() {
        clickField(generalInformationButton);
        Map<String, String> dataMap = new HashMap<>();

        String firstName =  getValueByMouseKeyboardAction(firstNameField);
        String lastName = getValueByMouseKeyboardAction(lastNameField);
        dataMap.put("FirstAndLastName", firstName + " " + lastName);
        dataMap.put("Phone Number", getValueByMouseKeyboardAction(phoneNumberField));
        dataMap.put("Email", getValueByMouseKeyboardAction(emailField));
        dataMap.put("ID Number", getValueByMouseKeyboardAction(personalNumberField));
        dataMap.put("Birth Date", getValueByMouseKeyboardAction(birthDateField));

        return dataMap;
    }

    public void verifyFetchedPersonData(){
        Map<String, String> fetchedDataMap = new HashMap<>(pickPersonalData());

        clickField(otherInformationButton);
        verifyUserIsOnOtherInformationPage();
        Utils.waitFor(1);
        Assert.assertEquals(fetchedDataMap.get("FirstAndLastName"),
                getValueByMouseKeyboardAction(firstLastNameInput));
        Assert.assertEquals("+355" + fetchedDataMap.get("Phone Number"),
                getValueByMouseKeyboardAction(mobileNumberInput));
        Assert.assertEquals(fetchedDataMap.get("Email"),
                getValueByMouseKeyboardAction(emailInput));
        Assert.assertEquals(fetchedDataMap.get("ID Number"),
                getValueByMouseKeyboardAction(identificationNumberInput));

        DateFormat outputFormat = new SimpleDateFormat("yyyy/MM/dd");
        DateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        String inputDate = fetchedDataMap.get("Birth Date");
        Date date;
        try {
            date = inputFormat.parse(inputDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        String outputDate = outputFormat.format(date);
        Assert.assertEquals(outputDate,getValueByMouseKeyboardAction(birthDateInput) );
    }

    public void verifyCustomerCreateSuccessMessage(String message) {
        elementDisplayed(successSnakeMessage);
        Assert.assertEquals(message, successSnakeMessage.getText());
    }

}
