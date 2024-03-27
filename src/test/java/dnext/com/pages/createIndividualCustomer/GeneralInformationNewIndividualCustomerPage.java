package dnext.com.pages.createIndividualCustomer;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.AdminInformationPage;
import dnext.com.pages.createBusinnesCustomerPages.GeneralInformationPage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class GeneralInformationNewIndividualCustomerPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameFieldOnGeneralInformationForNewIndividualCustomer;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lastNameFieldOnGeneralInformationForNewIndividualCustomer;
    @FindBy(xpath = "//*[@id=\"secondaryName\"]")
    public WebElement middleNameFieldOnGeneralInformationForNewIndividualCustomer;
    @FindBy(xpath = "//*[@formcontrolname='citizenShip']")
    public WebElement citizenShipFieldOnNewIndividualCustomer;
    @FindBy(xpath = "//*[text()=' ALBANIAN '] ")
    public WebElement albanianOptionOnNewIndividualCustomer;
    @FindBy(xpath = "(//div[@class='mat-form-field-wrapper ng-tns-c108-19'])[1]")
    public WebElement picture;
    @FindBy(xpath = "//*[text()='General Information']")
    public WebElement generalInformationOnNewIndividualCustomer;
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
    public WebElement cancelButtonOnDateOfBirthFieldOnIndividual;
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

    public GeneralInformationNewIndividualCustomerPage warningBackgroundIsNotRedColor() {
        Utils.waitFor(1);
        try {
            String expectedRedColorCode = "#f44336";
            String backgroundColor = firstNamePicture.getCssValue("color");
            org.openqa.selenium.support.Color color = Color.fromString(backgroundColor);
            String actualBackRoundColorCode = color.asHex();
            Assert.assertFalse(expectedRedColorCode.equals(actualBackRoundColorCode));
        } catch (Exception e) {
            log.info("Error Message: Red Warning message is  displaying!!");
        }
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage enterInvalidFormatEmailsOnIndividual(String email) {
        Utils.sendKeys(emailFieldOnIndividual, email + Keys.TAB);
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage selectMaleOptionFromGenderDropdownOnIndividual() {
        elementDisplayed(genderDropdown);
        genderDropdown.click();
        maleOptionOfGender.click();
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage selectDateOfBirthOnIndividual(String date) {
        clickField(birthDateField);
        sendKeys(birthDateField, date + Keys.TAB);
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage selectAlbaniaFromDropdownOnIndividual() {
        clickField(countryOfBirthField);
        clickField(albaniaOptionFromCountryDropdown);
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage selectPlaceOfBirthFromDropdownOnIndividual() {
        placeOfBirthField.click();
        beratCityFromPlaceOfBirthDropdown.click();
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage communicationMethodDropdownSelectableOnIndividual() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage communicationMethodOptionFromDropdownOnIndividual() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage segmentDropdownSelectableOnIndividual() {
        isDropdownSelectable(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }

    public GeneralInformationNewIndividualCustomerPage segmentOptionFromDropdownOnIndividual() {
        optionFromDropdown(By.xpath("//*[@class=\"mat-option-text\"]"));
        return this;
    }
}