package dnext.com.pages.createIndividualCustomer;

import dnext.com.pages.BasePage;
import dnext.com.pages.createBusinnesCustomerPages.CreateBusinessCustomerCommonPage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SearchIndividualPage extends BasePage {
    @FindBy(xpath = "//span[text()='Create Individual Customer']")
    public WebElement createIndividualCustomerBtnOnHomePage ;

    @FindBy(xpath = "//*[text()=' New Individual Customer ']")
    public WebElement newIndividualCustomerHeaderOnHomePage;

    @FindBy(xpath = "//input[@name=\"personalNumber\"]")
    public WebElement identificationNumberBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "//span[@class=\"mat-button-wrapper\"][.='Search ']")
    public WebElement searchBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "(//span[contains(text(),'Next')])[1]")
    public WebElement nextBtnOnSearchIndividualHomePage;

    @FindBy(xpath = "//span[text()='Individual with this Identification Number already exist!']")
    public WebElement warningForExistingIdNumberOnSearchIndividualHomePage;







    public  SearchIndividualPage verificationNewIndividualCustomerHeader(String header) {
        String actualHeader = newIndividualCustomerHeaderOnHomePage.getText();
        String expectedHeader = header;
        System.out.println("header = " + header);
        Assert.assertEquals(header,actualHeader);
        return this;
    }






}
