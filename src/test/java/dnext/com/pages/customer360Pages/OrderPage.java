package dnext.com.pages.customer360Pages;

import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

@Log4j2
public class OrderPage extends BasePage {

    @FindBy(xpath = "//input[@id='Id']")
    public  WebElement orderIdFieldOnCamundaHomePage;
    @FindBy(xpath = "//div[@aria-label='Product Order']")
    public WebElement productOrderSearchCamundaOnHomePage;
    @FindBy(xpath = "//td[@aria-label='Expand']/div")
    public WebElement fullfillmentTypeFirstChoiceIconOnCamunda;
    @FindBy(xpath = "//span[text()='Variables']")
    public WebElement variablesChoiceIconOnCamunda;
    @FindBy(xpath = "//td[text()='GatewayUtilClassExceptionMessage' or " +
            "text()='BrmStateChangeDescription']//following-sibling::td[2]")
    public WebElement exceptionMessage;
    @FindBy(xpath = "//mat-table[@class='mat-table cdk-table mat-sort products-table ps ng-star-inserted']/mat-header-row/following-sibling::mat-row/mat-cell/span")
    public WebElement orderIdOfOrder;




    public void veriyOrderIsCreatedOnOrderPage(String columnName){
        Utils.waitForVisibility(By.xpath("//mat-row"), 10);
        Assert.assertFalse(getMatCellDataByColumnName(columnName, 1).isBlank());
    }

    public void veriyOrderDataWithParameter(String columnName, String text){
        Utils.waitForVisibility(By.xpath("//mat-row"), 10);
        Assert.assertFalse(getMatCellDataByColumnName(columnName, 1).isBlank());
        Assert.assertEquals(text, getMatCellDataByColumnName(columnName, 1));
    }

    public void getErrorMessageIfAny(String columnName, String status) {
        Utils.waitForVisibility(By.xpath("//mat-row"), 10);
        if (getMatCellDataByColumnName(columnName, 1).equalsIgnoreCase(status)) {
            System.out.println("Status is " + status);
            Assert.assertEquals("completed", getMatCellDataByColumnName(columnName, 1));
        } else {
            System.out.println("OrderStatus is = " + getMatCellDataByColumnName(columnName, 1));
            String OrderId = getMatCellDataByColumnName("Order Id", 1);
            Driver.getDriver().get(ConfigurationReader.getProperty("comundaViewer.site.url"));
            Utils.waitFor(2);
            sendKeys(orderIdFieldOnCamundaHomePage, OrderId);
            Utils.waitFor(1);
            clickField(productOrderSearchCamundaOnHomePage);
            Utils.waitFor(1);
            clickField(fullfillmentTypeFirstChoiceIconOnCamunda);
            clickField(variablesChoiceIconOnCamunda);
            Utils.waitForVisibility(exceptionMessage, 180);
            log.error("Error message is " + exceptionMessage.getText());
            Assert.fail();
        }
    }
}