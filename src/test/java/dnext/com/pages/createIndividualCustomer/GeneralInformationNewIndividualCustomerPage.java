package dnext.com.pages.createIndividualCustomer;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
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
    public  WebElement lastNamePicture;



    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-1\"]/app-individual-general/div/form/div[5]/mat-form-field[1]/div/div[1]/div[2]")
    public  WebElement middleNamePicture;


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







}
