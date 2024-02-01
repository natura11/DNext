package dnext.com.pages.createBusinnesCustomerPages;

import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateBusinessCustomerCommonPage {
    public CreateBusinessCustomerCommonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'h2')]")
    public WebElement newBusinessCustomerHeader;

    public CreateBusinessCustomerCommonPage newBusinessCustomerHeaderVerification(String header){
        String actualHeader=newBusinessCustomerHeader.getText();
        String expectedHeader=header;
        System.out.println("header = " + header);
        Assert.assertTrue(header.equals(actualHeader));
      return this;
    }



}
