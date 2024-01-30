package dnext.com.pages;

import com.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public static class NavbarComponent {

    }

    public static class CommonElements {

    }

    public abstract boolean isPageLoad();
}