package dnext.com.pages.customerUpdatePages;

import com.github.javafaker.Faker;
import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndividualBilingAdressUpdatePage extends BasePage {
    Faker faker=new Faker();
    @FindBy(xpath = "//span[.='KEMAL SUNAL ']")
    public WebElement selectEnteredName;
    @FindBy(xpath = "//input[@placeholder=\"Type text..\"]")
    public WebElement enterCustomerNamefield;
    @FindBy(xpath = "//input[@formcontrolname=\"postCode\"]")
    public WebElement editPostCodeOnBillingAdress;
    @FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-address-tab/div/table/tbody/tr[2]/td[2]")
    public WebElement addressLine1OnDefoultAddressPage;
    @FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-address-tab/div/table/tbody/tr[2]/td[3]")
    public WebElement addressLine2OnDefoultAddressPage;
    @FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-address-tab/div/table/tbody/tr[2]/td[4]")
    public WebElement addressLinePostCodeOnDefoultAddressPage;
    @FindBy(xpath = "//*[@id=\"mat-tab-content-1-1\"]/div/app-address-tab/div/table/tbody/tr[2]/td[5]")
    public WebElement addressLineCityNameOnDefoultAddressPage;

public void randomPostCodeCreation(){
    sendKeys(editPostCodeOnBillingAdress,faker.numerify("####"));
}

}
