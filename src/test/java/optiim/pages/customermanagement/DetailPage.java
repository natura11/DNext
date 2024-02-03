package optiim.pages.customermanagement;

import optiim.framework.core.PageBase;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.helpers.WorldHelper;
import optiim.framework.utils.log;
import org.openqa.selenium.By;

public class DetailPage extends PageBase {

    //public static final By titleCustomerRecords = By.xpath("//span[contains(text(),'Customer Records')]");

    public static final By btnNewOrder = By.xpath("//span[contains(text(),'New Order')]");
    public static final By btnNewOrderDeactive = By.xpath("//span[contains(text(),'New Order')][disabled='true']");
    public static final By btnSave = By.xpath("//span[contains(text(),'Save')]");
    public static final By btnSaveDeactive = By.xpath("//span[contains(text(),'Save')][disabled='true']");
    //public static final By titleDetailPage =
    public static final By pathTab = By.xpath("//mat-tab-header/div[2]/div[1]/mat-ink-bar[1]");
    public static final By txtName = By.cssSelector("[formcontrolname='name']");
    public static final By cmbStatusReason = By.cssSelector("[formcontrolname='statusReason']");
    public static final By cmbStatus = By.cssSelector("[formcontrolname='status']");
    public static final By pcrStartDate = By.cssSelector("[formcontrolname='startDateTime']");
    public static final By pcrEndDate = By.cssSelector("[formcontrolname='endDateTime']");
    public static final By txtHrefDeactive = By.cssSelector("[formcontrolname='href'][disabled]");
    public static final By titleNewCreditProfile = By.xpath("//h3[contains(text(),'New Credit Profile')]");
    public static final By btnAddNew = By.xpath("//mat-icon[contains(text(),'add')]");
    public static final By btnCreditProfilePanel = By.xpath("//mat-panel-title[contains(text(),'Credit Profile 1')]");

    public static final By btnDelete = By.xpath(" //mat-icon[contains(text(),'delete')]");
    public static final By pcrCreditProfileDate = By.cssSelector("[formcontrolname='creditProfileDate']");
    public static final By txtCreditRiskRating = By.cssSelector("[formcontrolname='creditRiskRating']");
    public static final By txtCreditScore =  By.cssSelector("[formcontrolname='creditScore']");
    public static final By titleNewContactMedium = By.xpath("//h3[contains(text(),'New Contact Medium')]");
    public static final By btnNewContactMediumPanel = By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-title[1]");
    public static final By btnPanel = By.xpath("//mat-expansion-panel-header/span[2]");
    public static final By cmbMediumType = By.cssSelector("[formcontrolname='mediumType']");
    public static final By chkPreferred = By.cssSelector("input[type='checkbox'][ role='switch']");
    public static final By cmbContactType =  By.cssSelector("[formcontrolname='contactType']");
    public static final By txtEmailAddress = By.cssSelector("[formcontrolname='contactType']");
    public static final By txtCountry = By.cssSelector("[formcontrolname='country']");
    public static final By txtCity = By.cssSelector("[formcontrolname='city']");
    public static final By txtStateOrProvince = By.cssSelector("[formcontrolname='stateOrProvince']");
    public static final By txtPostCode = By.cssSelector("[formcontrolname='postCode']");
    public static final By txtAddressLineOne = By.cssSelector("[formcontrolname='street1']");
    public static final By txtAddressLineTwo = By.cssSelector("[formcontrolname='street2']");
    public static final By txtPhoneNumber= By.cssSelector("[formcontrolname='phoneNumber']");
    public static final By cmbRole = By.cssSelector("[formcontrolname='role']");
    public static final By txtValue= By.cssSelector("[formcontrolname='value']");
    public static final By cmbValueType = By.cssSelector("[formcontrolname='valueType']");
    public static final By txtDescription = By.cssSelector("[formcontrolname='description']");
    public static final By cmbPaymentMethod = By.cssSelector("[formcontrolname='name'][role='listbox']");
    public static final By btnMoreProcess = By.xpath("//mat-icon[contains(text(),'more_vert')]");
    public static final By btnCreateNewAccount = By.xpath("//span[contains(text(),'Create New Account')]");
    public static final By btnSearchAccount = By.xpath("//span[contains(text(),'Search Account')]");
    public static final By btnCreateNewParty = By.xpath("//span[contains(text(),'Create New Party')]");
    public static final By btnSearchParty = By.xpath("//span[contains(text(),'Search Party')]");




    private final WorldHelper worldHelper;

    public DetailPage(WebDriverHelper webDriverHelper, WorldHelper worldHelper) {
        super(webDriverHelper);
        this.worldHelper = worldHelper;
    }

    public DetailPage clickAddTicketButton() {
        //click(btnAddTicket);
        getWebDriver().navigate().to("https://dev.dnext-vfal.com/ui/customerCaseManagement");
        log.info("Add Ticket Button clicked.");
        return this;
    }
}
