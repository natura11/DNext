package dnext.com.pages.createIndividualCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SearchIndividualPage extends BasePage {
    @FindBy(xpath = "//span[text()='Create Individual Customer']")
    public WebElement createIndividualCustomerBtnOnHomePage ;

    @FindBy(xpath = "//*[text()=' New Individual Customer ']")
    public WebElement newIndividualCustomerHeaderOnHomePage;

    @FindBy(xpath = "//div[contains(text(),'Search Individual')]")
    public WebElement searchIndividualButton;

    @FindBy(xpath = "//div[contains(text(),'Search Individual')]//ancestor::mat-step-header")
    public WebElement searchIndividualButtonSelectedLabel;

    @FindBy(xpath = "//input[@name='personalNumber']")
    public WebElement identificationNumberBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "//input[@name='personalNumberWithName']")
    public WebElement identificationNumberInputNewCustomer;

    @FindBy(xpath = "//span[@class=\"mat-button-wrapper\"][.='Search ']")
    public WebElement searchBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "(//span[contains(text(),'Next')])[1]")
    public WebElement nextBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "//span[text()='Individual with this Identification Number already exist!']")
    public WebElement warningForExistingIdNumberOnSearchIndividualHomePage;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();


    public void fillIDFieldWithRandomNumber(){
        sendKeys(identificationNumberBtnOnSearchIndividualHomePage,
                customerFakerDataCreator.identificationNumberFromFaker());
    }

    public void checkNumberIsExistsOrNot(){
        String warningMessageXpath = "//span[text()='Individual with this Identification Number already exist!']";
        boolean isNumberUnique = false;
        do {
            Utils.waitFor(3);
            if(!Driver.getDriver().findElements(By.xpath(warningMessageXpath)).isEmpty()){
                identificationNumberBtnOnSearchIndividualHomePage.clear();
                fillIDFieldWithRandomNumber();
                clickField(searchBtnOnSearchIndividualHomePage);
            }else {
                isNumberUnique = true;
            }
        }while (!isNumberUnique);

    }

    public void verifyCustomerIsNew(){
        Assert.assertTrue(getValueByMouseKeyboardAction(identificationNumberInputNewCustomer).contains("New Customer"));
    }


}
