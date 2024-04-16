package dnext.com.pages;

import com.utilities.Utils;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CreateCustomerCommonPage extends BasePage {
    @FindBy(xpath = "//div[contains(@class,'h2')]")
    public WebElement customerHeader;
    @FindBy(xpath = "//div[contains(text(),'Search Individual')]")
    public WebElement searchIndividualHeader;
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

    public void verificationCustomerHeader(String header) {
        elementDisplayed(customerHeader);
        String actualHeader = customerHeader.getText().trim();
        Assert.assertEquals(header, actualHeader);
    }

    public void verifyInCorrectTab(String tabName) {
        Utils.waitFor(1);
        switch (tabName) {
            case "Search Individual":
                Assert.assertEquals("true", searchIndividualHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Search Organization":
                Assert.assertEquals("true", searchOrganisationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "General Information":
                Assert.assertEquals("true", generalInformationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Admin Information":
                Assert.assertEquals("true", adminInformationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Contact Information":
                Assert.assertEquals("true", contactInformationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Address Information":
                Assert.assertEquals("true", adressInformationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Invoice Account":
                Assert.assertEquals("true", invoiceAccountHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            case "Other Information":
                Assert.assertEquals("true", otherInformationHeader
                        .findElement(By.xpath(".//ancestor::mat-step-header"))
                        .getAttribute("aria-selected"));
                break;
            default:
        }
    }
}