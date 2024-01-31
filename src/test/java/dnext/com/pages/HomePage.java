package dnext.com.pages;

import com.utilities.anotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("home.page.url")
public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/img")
    public WebElement profileSignBtn;

    @FindBy(xpath = "//mat-icon[contains(text(),'keyboard_arrow_down')]")
    public WebElement profileSignDropdownArrowBtn;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/span")
    public WebElement userNameWithProfile;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
    public WebElement myProfileBtn;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span")
    public WebElement inboxBtn;

    @FindBy(xpath = "//button[3]")
    public WebElement logoutBtn;

    @FindBy(css = "button[aria-label='Expand Search Bar'] mat-icon[role='img']")
    public WebElement searchSignBtn;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[2]/span/div/span")
    public WebElement languageBtn;

    @FindBy(xpath = "//span[.=\"arrow_back\"]/..")
    public WebElement arrowBackBtn;

    @Override
    public boolean isPageLoad() {
        return false;
    }
}
