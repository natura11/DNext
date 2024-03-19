package dnext.com.pages.customer360;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class BusinessCustomerTaxExemptUpdatePage extends BasePage {
    @FindBy(xpath = "//div[contains(text(),'General')]")
    public WebElement generalButtonOnCustomerSearch;

    @FindBy(xpath = "//*[.='Organization updated successfully!']")
    public WebElement warningMessageAfterUpdatingCustomerInfo;
    @FindBy(xpath = "(//mat-icon[normalize-space()='more_vert'])[1]")
    public WebElement threeDotToUpdateCustomerInfo;
    @FindBy(xpath = "//*[.='Edit']")
    public WebElement editButtonForUpdateCustomerInfo;
    @FindBy(css = ".mat-focus-indicator.accent.mr-12.mat-stroked-button.mat-button-base")
    public WebElement saveButtonForUpdateCustomerInfo;
    @FindBy(xpath = "//*[@formcontrolname=\"taxExempt\"]")
    public WebElement taxExemptDropdownBox;
    @FindBy(xpath = "//*[text()=' NO ']")
    public WebElement taxExemptDropdownNOption;
    @FindBy(xpath = "//*[text()=' YES ']")
    public WebElement taxExemptDropdownYESOption;

}
