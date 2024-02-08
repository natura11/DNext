package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
<<<<<<< HEAD
import dnext.com.pages.HomePage;
=======
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
>>>>>>> master
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {

    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

<<<<<<< HEAD
    HomePage homePage = new HomePage();





=======
    @FindBy(xpath = "//div[.='General Information']//div")
    public WebElement generalInformationBtn;
>>>>>>> master

}
