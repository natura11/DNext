package dnext.com.pages.createGovernmentCustomerPages;

import com.utilities.CustomerFakerDataCreator;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class SearchGovernmentPage extends BasePage {

    @FindBy(xpath = "//input[@formcontrolname = 'organizationNumber']")
    public WebElement niptNumberField;

    @FindBy(xpath = "//span[normalize-space()='Search']/parent::button")
    public static WebElement searchBtnOnSearchOrganizationPage;

    CustomerFakerDataCreator customerFakerDataCreator = new CustomerFakerDataCreator();

    public void fillNIPTFieldWithRandomAlbanianNumber() {
        sendKeys(niptNumberField,
                customerFakerDataCreator.niptNumberForAlbanian());
    }

    public void checkNIPTIsAvailableOrNot() {
        String warningMessageXpath = "//span[text()='Grouping only allowed between same type of customers!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (!Driver.getDriver().findElements(By.xpath(warningMessageXpath)).isEmpty()) {
                niptNumberField.clear();
                fillNIPTFieldWithRandomAlbanianNumber();
                clickField(searchBtnOnSearchOrganizationPage);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

}