package dnext.com.pages.createBusinessCustomerPages;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CreateBusinessCustomerCommonPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'h2')]")
    public WebElement newBusinessCustomerHeader;
    @FindBy(xpath = "//div[contains(text(),'Search Organization')]")
    public WebElement searchOrganisationHeader;
    @FindBy(xpath = "//div[contains(text(),'General Information')]")
    public WebElement generalInformationHeader;
    @FindBy(xpath = "//div[contains(text(),'Admin Information')]")
    public WebElement adminInformationHeader;
    @FindBy(xpath = "//div[contains(text(),'Contact Information')]")
    public WebElement contactInformationHeader;
    @FindBy(xpath = "//div[contains(text(),'Address Information')]")
    public WebElement adressInformationHeader;
    @FindBy(xpath = "//div[contains(text(),'Invoice Account')]")
    public WebElement invoiceAccountHeader;
    @FindBy(xpath = "//div[contains(text(),'Other Information')]")
    public WebElement otherInformationHeader;

    public void VerificationNewBusinessCustomerHeader(String header) {
        elementDisplayed(newBusinessCustomerHeader);
        String actualHeader = newBusinessCustomerHeader.getText().trim();
        Assert.assertEquals(header, actualHeader);
    }

    public void controlTab(String tabName) {
        switch (tabName) {
            case "Search Organization":
                Assert.assertTrue(tabName.equals(searchOrganisationHeader.getText()));
                log.info(tabName + " is " + searchOrganisationHeader.getText());
                break;
            case "General Information":
                Assert.assertTrue(tabName.equals(generalInformationHeader.getText()));
                log.info(tabName + " is same with " + generalInformationHeader.getText());
                System.out.println("General Information");
                break;
            case "Admin Information":
                Assert.assertTrue(tabName.equals(adminInformationHeader.getText()));
                log.info(tabName + " is same with " + adminInformationHeader.getText());
                break;
            case "Contact Information":
                Assert.assertTrue(tabName.equals(contactInformationHeader.getText()));
                log.info(tabName + " is same with " + contactInformationHeader.getText());
                break;
            case "Address Information":
                Assert.assertTrue(tabName.equals(adressInformationHeader.getText()));
                log.info(tabName + " is same with " + adressInformationHeader.getText());
                break;
            case "Invoice Account":
                Assert.assertTrue(tabName.equals(invoiceAccountHeader.getText()));
                log.info(tabName + " is same with " + invoiceAccountHeader.getText());
                break;
            case "Other Information":
                Assert.assertTrue(tabName.equals(otherInformationHeader.getText()));
                log.info(tabName + " is same with " + otherInformationHeader.getText());
                break;
            default:
        }
    }
}