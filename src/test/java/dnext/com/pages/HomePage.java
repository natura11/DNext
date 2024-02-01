package dnext.com.pages;

import com.utilities.Driver;
import com.utilities.Utils;
import com.utilities.anotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@DefaultUrl("home.page.url")
public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/img")
    public WebElement profileSignBtnOnHomePage;

    @FindBy(xpath = "//mat-icon[contains(text(),'keyboard_arrow_down')]")
    public WebElement profileSignDropdownArrowBtnOnPage;

    @FindBy(xpath = "//span[@class='username mr-12']")
    public WebElement userNameWithProfileOnHomePage;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
    public WebElement myProfileBtnInDropdownOnHomePage;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span")
    public WebElement inboxBtnInDropdownOnHomePage;

    @FindBy(xpath = "//button[3]")
    public WebElement logoutBtnInDropdownOnHomePage;

    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[2]/div[1]/div[2]")
    public WebElement emailOfUserOnHomePage;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[2]/span/div/span")
    public WebElement languageBtnOnHomePage;

    @FindBy(xpath = "//*[@id=\"container-1\"]/fuse-sidebar/navbar/navbar-vertical-style-1/div[1]/div[2]/button[1]")
    public WebElement arrowBackBtnOnHomePage;


    public HomePage logout(){
        Utils.click( profileSignDropdownArrowBtnOnPage);
        Utils.click(logoutBtnInDropdownOnHomePage);

        return this;
    }
    public HomePage isShownEmailOfUserOnHomePage(){
       emailOfUserOnHomePage.isDisplayed();
        System.out.println("emailOfUserOnHomePage.getText() = " + emailOfUserOnHomePage.getText());
        return this;
    }




    public WebElement languageBtn;

    @FindBy(xpath = "//span[.=\"arrow_back\"]/..")
    public WebElement arrowBackBtn;


}
