package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
import dnext.com.pages.HomePage;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {

    public GeneralInformationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    HomePage homePage = new HomePage();






}
