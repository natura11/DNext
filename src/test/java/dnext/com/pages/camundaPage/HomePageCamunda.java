package dnext.com.pages.camundaPage;

import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public  class HomePageCamunda extends BasePage {


    @FindBy(xpath = "//input[@id=\"Id\"]")
    public WebElement idFieldOnHomePage;

    @FindBy(xpath = "//div[@id=\"devextreme1\"]")
    public WebElement productOrderOnHomePage;

//    @FindBy(xpath = "//*[@id=\"payments\"]/thead/tr/th[6]")
//    public List<WebElement> agreementIds;


}
