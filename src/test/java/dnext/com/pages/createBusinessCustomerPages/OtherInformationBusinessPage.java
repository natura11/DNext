package dnext.com.pages.createBusinessCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Log4j2
public class OtherInformationBusinessPage extends BasePage {

    public String seeCompanyName;
    public String seeNiptNumber;
    public String seeIndustry;
    @FindBy(xpath = "//div[contains(text(),'Other Information')]//ancestor::mat-step-header")
    public WebElement otherInformationButtonSelectedLabel;
    @FindBy(xpath = "//h2[text()='Customer Information']//following::*[@formcontrolname='companyName']")
    public WebElement companyNameOnOtherInformation;
    @FindBy(xpath = "//input[@formcontrolname='nipt']")
    public WebElement niptNumberOnOtherInformation;
    @FindBy(xpath = "//input[@formcontrolname='industry']")
    public WebElement industryOnOtherInformation;
    @FindBy(xpath = "//mat-step-header[@id='cdk-step-label-0-1']//div[@class='mat-step-label mat-step-label-active']")
    public WebElement generalInformationTab;
    @FindBy(xpath = "//mat-step-header[@id='cdk-step-label-0-6']//div[@class='mat-step-label mat-step-label-active']")
    public WebElement otherInformationTab;
    @FindBy(xpath = "//span[@class='ng-tns-c116-12 ng-star-inserted']")
    public WebElement selectedIndustry;
    @FindBy(xpath = "//button[@class='mat-focus-indicator mt-16 mb-4 mat-raised-button mat-button-base']")
    public WebElement generateFormButton;
    @FindBy(xpath = "//div[@fxlayoutalign='space-between']//div[@fxlayout='row']//button[@aria-label='Add Document']")
    public WebElement addDocumentButtonOnOtherInformation;
    @FindBy(xpath = "(//input[@id='consentFileInput']")
    public WebElement fileInputGeneralOnOtherInformation;
    @FindBy(xpath = "//span[text()='Save']/ancestor::button")
    public WebElement saveButtonOnOtherInformation;
    @FindBy(xpath = "//span[contains(text(),'Customer created successfully')]")
    public WebElement createPopup;
    @FindBy(xpath = "(//p[contains(text(),'Consent Form')]/following::div/div)[1]")
    public WebElement nameOfUploadedFileOnOther;


    /***
     Below XPaths will be used for General Information Page objects
     to compare and verify on Other Information page
     */
    @FindBy(xpath = "//div[contains(text(),'General Information')]")
    public WebElement generalInformationButton;

    @FindBy(xpath = "//input[@id='companyName']")
    public WebElement companynameOnGeneral;

    @FindBy(xpath = "//input[@formcontrolname='organization']")
    public WebElement organizationNumberOnGeneral;

    @FindBy(xpath = "//mat-select[@formcontrolname='industry']//span/span")
    public WebElement selectedIndustryOption;


    public void verifyUserIsOnOtherInformationPage() {
        try {
            elementDisplayed(otherInformationButtonSelectedLabel);
            Assert.assertEquals("true", otherInformationButtonSelectedLabel.getAttribute("aria-selected"));
            log.info("Other Information Page is displaying");
        } catch (Throwable e) {
            log.info("Error message: Other Information Page is  not displaying");
        }
    }

    private Map<String, String> pickPersonalData() {
        clickField(generalInformationButton);
        Map<String, String> dataMap = new HashMap<>();
        dataMap.put("Company Name", getValueByMouseKeyboardAction(companynameOnGeneral));
        dataMap.put("Organization Number", getValueByMouseKeyboardAction(organizationNumberOnGeneral));
        String industry = selectedIndustryOption.getText();
        if (industry.equals("-")) {
            industry = "EMPTY_SOURCE";
        }
        if (industry.equals("Govt & Education")) {
            industry = "GOVERNMENT_EDUCATION";
        }
        industry = industry.replaceAll("[&_\\s]", "").toUpperCase(Locale.ENGLISH);

        dataMap.put("Industry", industry);
        return dataMap;
    }

    public void verifyFetchedPersonData() {
        Map<String, String> fetchedDataMap = new HashMap<>(pickPersonalData());

        clickField(otherInformationButtonSelectedLabel);
        verifyUserIsOnOtherInformationPage();
        Utils.waitFor(1);
        Assert.assertEquals(fetchedDataMap.get("Company Name"),
                getValueByMouseKeyboardAction(companyNameOnOtherInformation));
        Assert.assertEquals(fetchedDataMap.get("Organization Number"),
                getValueByMouseKeyboardAction(niptNumberOnOtherInformation));

        Assert.assertEquals(fetchedDataMap.get("Industry"),
                getValueByMouseKeyboardAction(industryOnOtherInformation)
                        .replaceAll("[_\\s]", "").toUpperCase());
    }
}