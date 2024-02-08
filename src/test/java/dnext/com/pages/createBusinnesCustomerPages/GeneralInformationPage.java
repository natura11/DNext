package dnext.com.pages.createBusinnesCustomerPages;
import dnext.com.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GeneralInformationPage extends BasePage {
    @FindBy(xpath = "//*[@formcontrolname=\"organization\"]")
    public WebElement organizationNumberBox;
    @FindBy(xpath = " //*[@id=\"name\"]")
    public WebElement nameBox;
    @FindBy(xpath = "(//*[@formcontrolname=\"industry\"])[1]")
    public WebElement industryDropdown;
    @FindBy(xpath = "//*[text()=' Finance & Insurance ']")
    public WebElement industryDropdownFinanceOption;
    @FindBy(xpath = "//*[text()=' Manufacturing ']")
    public WebElement industryDropdownManufacturingOption;
    @FindBy(xpath = "//*[text()=' Construction  ']")
    public WebElement industryDropdownConstructionOption;
    @FindBy(xpath = "//*[text()=' Mining & Agriculture ']")
    public WebElement industryDropdownMiniAgriculereOption;
    @FindBy(xpath = "//*[text()=' Retail & Wholesale ']")
    public WebElement industryDropdownRetailWholesaleOption;
    @FindBy(xpath = "//*[text()=' Professional Services ']")
    public WebElement industryDropdownProfessionalServicesleOption;
    @FindBy(xpath = "//*[text()=' Transport & Logistics ']")
    public WebElement industryDropdownTransportLogisticsOption;
    @FindBy(xpath = "//*[text()=' Media ']")
    public WebElement industryDropdownMediaOption;
    @FindBy(xpath = "//*[text()=' Telecoms ']")
    public WebElement industryDropdownTelecomsOption;
    @FindBy(xpath = "//*[text()=' Utilities ']")
    public WebElement industryDropdownUtilitiesOption;
    @FindBy(xpath = "//*[text()=' Healthcare ']")
    public WebElement industryDropdownHealtcareOption;
    @FindBy(xpath = "//*[text()=' Govt & Education ']")
    public WebElement industryDropdownGovtEducationOption;
    @FindBy(xpath = "//*[@id=\"companyName\"]")
    public WebElement companyNameBox;
    @FindBy(xpath = "//*[@formcontrolname=\"segment\"]")
    public WebElement segmentDropdownBox;
    @FindBy(xpath = "//*[text()=' Corporate ']")
    public WebElement segmentDropdownCorporateOption;
    @FindBy(xpath = "//*[text()=' SME ']")
    public WebElement segmentDropdownSMEOption;
    @FindBy(xpath = "//*[text()=' SOHO ']")
    public WebElement segmentDropdownSOHOoption;
    @FindBy(xpath = "//*[text()=' Other Business ']")
    public WebElement segmentDropdownOtherBusinessOption;
    @FindBy(xpath = "//*[@formcontrolname=\"taxExempt\"]")
    public WebElement taxExemptDropdownBox;
    @FindBy(xpath = "//*[text()=' NO ']")
    public WebElement taxExemptDropdownOOption;
    @FindBy(xpath = "//*[text()=' YES ']")
    public WebElement taxExemptDropdownYESOption;
    @FindBy(xpath = "//*[@formcontrolname=\"communicationMethod\"]")
    public WebElement CommunicationMethodDropDown;
    @FindBy(xpath = "(//*[text()=' Email '])[2]")
    public WebElement CommunicationMethodDropDownEmailOption;
    @FindBy(xpath = "//*[text()=' SMS ']")
    public WebElement CommunicationMethodDropDownSMSoPTİON;
    @FindBy(xpath = "//*[text()=' Email & SMS ']")
    public WebElement CommunicationMethodDropDownEmailAndSmsOption;
    @FindBy(xpath = "//*[@formcontrolname=\"phoneCode\"]")
    public WebElement countryDropdownBox;
    @FindBy(xpath = "(//*[@formcontrolname=\"phoneNumber\"])[1]")
    public WebElement mobilePhoneNumberBox;
    @FindBy(xpath = "//*[@formcontrolname=\"identificationIssuingDate\"]")
    public WebElement issuingDateDropdownBox;
    @FindBy(xpath = "//*[@class=\"mat-form-field-suffix ng-tns-c108-28 ng-star-inserted\"]")
    public WebElement issuingDateIcon;
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator mat-calendar-period-button mat-button mat-button-base\"]")
    public WebElement issuingDateMonth;
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator add-button accent mat-raised-button mat-button-base\"]")
    public WebElement addDocumentButtonOnNewBusinessCustomer;
    @FindBy(xpath = "//*[@id=\"file-label\"]")
    public WebElement documentNameVerify;
    @FindBy(xpath = "//*[@class=\"mat-error ng-star-inserted\"]")
    public WebElement addWarningDocumentMessage;
    @FindBy(xpath = "//*[@class=\"mat-focus-indicator red-fg mat-button mat-button-base\"]")
    public WebElement deleteDocumentButton;
    @FindBy(xpath = "//span[.='Only image and pdf files are accepted!']")
    public WebElement warningMessageForUnmatchedDocument;
    @FindBy(xpath = "//span[.='File size can not be bigger than 5 MB!']")
    public WebElement warningMessageForBiggerDocument;
    @FindBy(xpath = " //*[@id=\"cdk-step-content-0-1\"]/div/button[2]/span/span")
    public WebElement nextButtonOnGeneralInformationPage;


}
