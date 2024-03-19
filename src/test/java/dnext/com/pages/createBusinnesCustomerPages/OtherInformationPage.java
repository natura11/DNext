package dnext.com.pages.createBusinnesCustomerPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import dnext.com.step_definitions.gui.createBusinessCustomerStepDefinition.GeneralInformationStepDefinition;
import lombok.extern.log4j.Log4j2;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.apache.hc.core5.net.WWWFormCodec;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Locale;

@Log4j2
public class OtherInformationPage extends BasePage {
    Faker faker = new Faker();
    public String seeCompanyName;
    public String seeNiptNumber;
    public String seeIndustry;
    @FindBy(xpath = "//div[@id='cdk-step-content-0-1']//span[contains(text(),'Next')]")
    public WebElement nextBtnOnGeneralInformation;
    @FindBy(xpath = "(//span[text()='Next'])[6]//ancestor::button")
    public WebElement nextButtonOnInvoiceAccountPage;
    @FindBy(xpath = "//input[@formcontrolname='companyName']")
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
    @FindBy(xpath = "(//input[@id='fileInput'])[2]")
    public WebElement fileInputGeneralOnOtherInformation;
    @FindBy(xpath = "//button[@class='mat-focus-indicator save-product-button mat-raised-button mat-button-base']")
    public WebElement saveButtonOnOtherInformation;
    @FindBy(xpath = "//span[contains(text(),'Customer created successfully')]")
    public WebElement createPopup;
    @FindBy(xpath = "//div[@fxlayoutalign='space-between']//div[@id='file-label']")
    public WebElement nameOfUploadedFileOnOther;

    public OtherInformationPage nextBtnClickGeneralInformation() {
        Utils.waitFor(1);
        Utils.click(nextBtnOnGeneralInformation);
        return this;
    }

    public OtherInformationPage nextBtnClickInvoiceAccount() {
        Utils.waitFor(1);
        Utils.click(nextButtonOnInvoiceAccountPage);
        return this;
    }

    public OtherInformationPage seeIndustryFields() {
        seeIndustry = industryOnOtherInformation.getAttribute("value");
        log.info("otherInformation okunan industry değer => " + seeIndustry);
        return this;
    }

    public OtherInformationPage checkIndustryFields() {
        Utils.click(generalInformationTab);
        Utils.waitFor(1);
        String expectedIndustryNumber = selectedIndustry.getText().toUpperCase(Locale.ENGLISH);
        expectedIndustryNumber = expectedIndustryNumber.replace(" ", "_");
        expectedIndustryNumber = expectedIndustryNumber.replace("&", "");
        expectedIndustryNumber = expectedIndustryNumber.replace("__", "_");
        log.info("generalInofrmation seçilen industry değer => " + expectedIndustryNumber);
        Utils.waitFor(1);
        Utils.click(otherInformationTab);
        Assert.assertEquals(seeIndustry, expectedIndustryNumber);
        return this;
    }

    public OtherInformationPage seeCompanyName() {
        seeCompanyName = companyNameOnOtherInformation.getAttribute("value");
        log.info("otherInformation okunan company değer => " + seeCompanyName);
        return this;
    }

    public OtherInformationPage checkCompanyName(String expectedCompanyName) {
        Utils.waitFor(1);
        log.info("generalInformation girilen company değer => " + expectedCompanyName);
        Assert.assertEquals(seeCompanyName, expectedCompanyName);
        return this;
    }

    public OtherInformationPage seeNiptNumber() {
        seeNiptNumber = niptNumberOnOtherInformation.getAttribute("value");
        log.info("otherInformation okunan nipt değer => " + seeNiptNumber);
        return this;
    }

    public OtherInformationPage checkNiptNumber(String expectedNiptNumber) {
        Utils.waitFor(1);
        log.info("generalInformation girilen nipt değer => " + expectedNiptNumber);
        Assert.assertEquals(seeNiptNumber, expectedNiptNumber);
        return this;
    }

    public OtherInformationPage clickGenerateButton() {
        Utils.click(generateFormButton);
        return this;
    }

    public OtherInformationPage checkOpenedForm() throws AWTException {
        Utils.waitFor(2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ESCAPE);
        robot.keyRelease(KeyEvent.VK_ESCAPE);

        boolean pageSize = false;
        if (Driver.getDriver().getWindowHandles().size() > 0) {
            pageSize = true;
        }
        Assert.assertTrue(pageSize);
        switchToWindowNew(0);
        Utils.waitFor(5);
        return this;
    }

    public OtherInformationPage clickSaveButton() {
        Utils.waitFor(1);
        Utils.click(saveButtonOnOtherInformation);
        return this;
    }

    public OtherInformationPage checkCustomerCreatePopup() {
        Utils.waitForVisibility(createPopup, 5);
        return this;
    }
}