package dnext.com.pages.camunda;

import dnext.com.pages.BasePage;
import dnext.com.pages.customer360.VtvActivationPage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Log4j2
public  class HomePageCamunda extends BasePage {


    @FindBy(xpath = "//input[@id=\"Id\"]")
    public WebElement idFieldOnHomePage;

    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public WebElement productOrderOnHomePage;

//    @FindBy(xpath = "//*[@id=\"payments\"]/thead/tr/th[6]")
//    public List<WebElement> agreementIds;


}
