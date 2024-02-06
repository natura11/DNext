package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {

    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[.='General Information']//div")
    public WebElement generalInformationBtn;

}
