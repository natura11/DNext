package dnext.com.pages.createIndividualCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class GeneralInformationIndividualPage extends BasePage {

    @FindBy(xpath = "//div[contains(text(),'General Information')]//ancestor::mat-step-header")
    public WebElement generalInformationButtonSelectedLabel;  // aria-selected : true will be validated

    @FindBy(xpath = "//input[@formcontrolname='personalNumber']")
    public WebElement identificationNumberField;

    @FindBy(xpath = "//*[@id='firstName']")
    public WebElement firstNameFieldOn;
    @FindBy(xpath = "//*[@id='lastName']")
    public WebElement lastNameField;
    @FindBy(xpath = "//*[@id='secondaryName']")
    public WebElement middleNameField;
    @FindBy(xpath = "//*[@formcontrolname='citizenShip']")
    public WebElement citizenShipField;
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='ALBANIAN']")
    public WebElement albanianOptionForCitizenship;
    @FindBy(xpath = "(//div[@class='mat-form-field-wrapper ng-tns-c108-19'])[1]")
    public WebElement picture;
    @FindBy(xpath = "//*[text()='General Information']")
    public WebElement generalInformationLabel;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-individual-general/div/form/div[4]/mat-form-field[1]/div/div[1]/div[2]")
    public WebElement firstNamePicture;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-individual-general/div/form/div[4]/mat-form-field[2]/div/div[1]/div[2]")
    public WebElement lastNamePicture;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-individual-general/div/form/div[5]/mat-form-field[1]/div/div[1]/div[2]")
    public WebElement middleNamePicture;
    @FindBy(xpath = "//app-individual-general//input[@formcontrolname='email']")
    public WebElement emailFieldOnIndividual;
    @FindBy(xpath = "//div[@class='mat-form-field-outline mat-form-field-outline-thick ng-tns-c108-334 ng-star-inserted']")
    public WebElement emailFieldPicture;
    @FindBy(css = "*[formcontrolname=\"gender\"]")
    public WebElement genderDropdown;
    @FindBy(xpath = "(//*[@*='mat-option-text'])[1]")
    public WebElement maleOptionOfGender;
    @FindBy(css = "[formcontrolname = 'birthDate']")
    public WebElement birthDateField;
    @FindBy(css = ".mat-form-field-outline.mat-form-field-outline-thick.ng-tns-c108-16.ng-star-inserted")
    public WebElement birthDateFieldPicture;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mat-icon-button mat-button mat-button-base ng-tns-c108-16 ng-star-inserted']//mat-icon[@role='img'][normalize-space()='close']")
    public WebElement cancelButtonOnDateOfBirthField;
    @FindBy(css = "[formcontrolname = 'birthCountry']")
    public WebElement countryOfBirthField;
    @FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='ALBANIA']")
    public WebElement albaniaOptionFromCountryDropdown;
    @FindBy(css = "[formcontrolname = 'placeOfBirth']")
    public WebElement placeOfBirthField;
    @FindBy(xpath = "//span[normalize-space()='BERAT']")
    public WebElement beratCityFromPlaceOfBirthDropdown;
    @FindBy(css = "app-individual-general [formcontrolname = 'phoneNumber']")
    public WebElement mobilePhoneNumberField;
    @FindBy(xpath = "//*[@formcontrolname=\"communicationMethod\"]")
    public WebElement communicationMethodDropDown;
    @FindBy(xpath = "(//span[text()='Next'])[2]//ancestor::button")
    public WebElement nextButtonOnGeneralInformation;
    @FindBy(xpath = "//*[@formcontrolname=\"segment\"]")
    public WebElement segmentDropdownBoxOnIndividual;
    @FindBy(xpath = "//div[contains(text(),'General Information')]//ancestor::*[@aria-selected='true']")
    public WebElement selectedGeneralInformationOnIndividual;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();

    public void verifyUserIsOnGeneralInformationPage() {
        try {
            elementDisplayed(generalInformationButtonSelectedLabel);
            Assert.assertEquals("true", generalInformationButtonSelectedLabel.getAttribute("aria-selected"));
            log.info("Other Information Page is displaying");
        } catch (Throwable e) {
            log.info("Error message: Other Information Page is  not displaying");
        }
    }

    public void enterInvalidFormatEmailsOnIndividual(String email) {
        Utils.sendKeys(emailFieldOnIndividual, email + Keys.TAB);
    }

    public void selectMaleOptionFromGenderDropdownOnIndividual() {
        elementDisplayed(genderDropdown);
        genderDropdown.click();
        maleOptionOfGender.click();
    }

    public void selectRandomGender() {
        elementDisplayed(genderDropdown);
        genderDropdown.click();
        randomOptionFromDropdown();
    }

    public void selectDateOfBirthOnIndividual(String date) {
        clickField(birthDateField);
        sendKeys(birthDateField, date + Keys.TAB);
    }

    public void selectAlbaniaFromDropdownOnIndividual() {
        clickField(countryOfBirthField);
        clickField(albaniaOptionFromCountryDropdown);
    }

    public void selectPlaceOfBirthFromDropdownOnIndividual() {
        placeOfBirthField.click();
        beratCityFromPlaceOfBirthDropdown.click();
    }

    public void communicationMethodDropdownSelectableOnIndividual() {
        isDropdownSelectable();
    }

    public void communicationMethodOptionFromDropdownOnIndividual() {
        randomOptionFromDropdown();
    }

    public void segmentDropdownSelectableOnIndividual() {
        isDropdownSelectable();
    }

    public void segmentOptionFromDropdownOnIndividual() {
        randomOptionFromDropdown();
    }

    public void fillFirstNameWithRandomString(){
        sendKeys(firstNameFieldOn,
                customerFakerDataCreator.firstNameFromFaker());
    }

    public void fillLastNameWithRandomString(){
        sendKeys(lastNameField,
                customerFakerDataCreator.lastNameFromFaker() + " AUTOMATION");
    }

    public void fillEmailWithRandomEmail(){
        sendKeys(emailFieldOnIndividual,
                customerFakerDataCreator.emailFromFaker());
    }

    public void fillBirthDateWithRandomDate(){
        sendKeys(birthDateField,
                customerFakerDataCreator.birthDateFromFaker());
    }

    public void fillPhoneNumberWithRandomNumber(){
        sendKeys(mobilePhoneNumberField,
                customerFakerDataCreator.phoneFromFaker());
    }

}