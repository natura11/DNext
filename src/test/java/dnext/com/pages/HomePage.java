package dnext.com.pages;

import com.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/button[1]/span/div/img")
    WebElement profileSignBtn;


    @FindBy(xpath = "//mat-icon[contains(text(),'keyboard_arrow_down')]")
    WebElement profileSignDropdownArrowBtn;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[1]/span")
    WebElement myProfileBtn;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[2]/span")
    WebElement inboxBtn;

    @FindBy(xpath = "//*[@id=\"mat-menu-panel-0\"]/div/button[3]/span")
    WebElement logoutBtn;

    @FindBy(xpath = "//*[@id=\"container-3\"]/toolbar/mat-toolbar/div/div[2]/fuse-search-bar/div/div/label/button/span/mat-icon")
    WebElement searchSignBtn;












}
