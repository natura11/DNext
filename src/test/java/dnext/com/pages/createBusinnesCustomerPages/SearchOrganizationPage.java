package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchOrganizationPage extends BasePage {
    public SearchOrganizationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

   HomePage homePage=new HomePage();

    @FindBy(xpath = "//mat-icon[normalize-space()='create']")
        public WebElement searchOrganizationIcon;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/app-corporate-customer-select/div/form/div[1]/mat-form-field/div/div[1]/div[3]")
    public WebElement dropdownBtnOfCustomerType;
    @FindBy(xpath ="//span[.=' Albanian Customer ']")
        public WebElement  albanianCustomerInDropdown;
    @FindBy(xpath ="(//span[.='Foreign Customer'])[2]")
        public WebElement  foreignCustomerInDropdown;

    @FindBy(xpath = "//input[@formcontrolname = 'organizationNumber']")
    public WebElement niptNumberField;

    @FindBy(xpath = "//span[normalize-space()='Search']")
        public WebElement searchBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//*[@id=\"cdk-step-content-0-0\"]/div/button/span/span")
        public WebElement nextBtnOnSearchOrganizationPage;
    @FindBy(xpath = "//mat-error[@id='mat-error-0']")
         public  WebElement warningInvalidNıptNumber;
    @FindBy(xpath = "//input[@id='mat-input-44']")
        public WebElement newCustomerTextWithNumberInNiptField;
    @FindBy(xpath = "//span[contains(text(),'This organization cannot have more than one custom')]")
        public WebElement warningWithExistingNıptNumber;


     public SearchOrganizationPage getCurrentUrl(String currentUrl){
         Utils.waitFor(2);
         Driver.getDriver().getCurrentUrl();
         System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
         Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("customer/create-enterprise-customer"));
         return  this;
     }

     public  SearchOrganizationPage popUpWarningValidationOfExistenceNumber(String popUpMessage){
         Utils.waitForInvisibilityOf(warningWithExistingNıptNumber);
         String actualMessage=warningWithExistingNıptNumber.getText();
         String expectedMessage=popUpMessage;
         System.out.println("actualMessage = " + actualMessage);
         System.out.println("expectedMessage = " + expectedMessage);
         Assert.assertTrue(expectedMessage.equals(actualMessage));
         return this;
     }

     public SearchOrganizationPage usingExistenceNiptNumber(String number){
         Utils.waitForPageToLoad();
         niptNumberField.sendKeys(number);
         return this;
     }

     public SearchOrganizationPage selectOfAlbanianCustomerType(){
         Utils.waitForPageToLoad();
         Utils.click(dropdownBtnOfCustomerType);
         Utils.click(albanianCustomerInDropdown);
         return this;
     }
     public SearchOrganizationPage openCreateBusinessCustomerPage(){
         Utils.hover(dnextlogoOnNavbar);
         Utils.waitForPageToLoad();
         Utils.click(createBusinessCustomerBtn);
         return this;
     }






}
