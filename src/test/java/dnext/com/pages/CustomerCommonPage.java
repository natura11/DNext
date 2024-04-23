package dnext.com.pages;

import com.utilities.Driver;
import com.utilities.Utils;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class CustomerCommonPage extends BasePage {
    @FindBy(xpath = "//*[.=' Customer Search ']")
    public WebElement customerSearchIcon;
    @FindBy(xpath = "//mat-select[@panelclass='dropDown-overlay']")
    public WebElement selectSearchTypeBtn;
    @FindBy(xpath = "//mat-option/span[contains(text(),'Customer Name')]")
    public WebElement selectSearchTypeWithCostomerName;
    @FindBy(xpath = "//*[@placeholder=\"Type text..\"]")
    public WebElement enterCustomerNamefield;
    @FindBy(xpath = "//span[text()='Search ']")
    public WebElement searchBtnOnCustomerSearch;
    @FindBy(xpath = "//div[@role='listbox']//span[@class='mat-option-text']/span")
    public WebElement searchedNameField;

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
        Utils.waitFor(3);
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

    public void openCreateCustomerPages(String customerType) {
        elementDisplayed(dnextlogoOnNavbar);
        Utils.hover(dnextlogoOnNavbar);
        Utils.waitFor(3);
        switch (customerType){
            case "Individual":
                Utils.click(createIndividualCustomerBtn);
                break;
            case "Business":
                Utils.click(createBusinessCustomerBtn);
                break;
            case "Government":
                Utils.click(createGovernmentCustomerBtn);
                break;
        }
    }

    public void clickSpecificTabOnCustomer360(String tabName){
        String xpathOfTab = "//div[@role='tab']/div[text()='" + tabName + "']";
        Utils.waitForVisibility(By.xpath(xpathOfTab), 15);
        WebElement tabButton = Driver.getDriver().findElement(By.xpath(xpathOfTab));
        clickField(tabButton);
        Utils.waitForPageToLoad();
    }
    public void clickNewOrderButton(String orderType){
        Utils.waitForVisibility(By.xpath("//span[contains(text(),'New Order')]"), 15);
        WebElement newOrderButton = Driver.getDriver().findElement(By.xpath(
                "//span[contains(text(),'" + orderType +
                        "')]/following::span[contains(text(),'New Order')]"));
        newOrderButton.click();
    }
}