package dnext.com.pages.customer360Pages;

import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Log4j2
public class FiscalizationReceiptsPage extends BasePage {

    @FindBy(xpath = "//div[@role='tab']/div[text()='Order']")
    public WebElement orderTab;
    @FindBy(xpath = "//div[@role='tab']/div[text()='Fiscalization Receipts']")
    public WebElement fiscalizationReceiptsTab;
    @FindBy(xpath = "(//div[@class='mat-tab-header-pagination-chevron'])[2]")
    public WebElement directionSignTofiscalizationReceiptsButton;
    @FindBy(xpath = "(//span[.=' Detail '])[1]")
    public WebElement detailFirstButtonOnFiscalization;
    @FindBy(xpath = "//div[contains(text(),'Payment Id')]/following-sibling::div")
    public WebElement paymentIdOfFiscalizationDetail;

    public void verificationOfFiscalizationWithOrder() {
        clickField(orderTab);
        Utils.waitForVisibility(By.xpath("//mat-row"), 10);
        String agrementIdOfOrder = getMatCellDataByColumnName("Agreement Id", 1);
        String orderDateOfOrder = getMatCellDataByColumnName("Order Date", 1);
        System.out.println("agrementIdOfOrder is :" + agrementIdOfOrder);
        System.out.println("orderDateOfOrder is :" + orderDateOfOrder);

        if(directionSignTofiscalizationReceiptsButton.isDisplayed()){
            Utils.waitForVisibility(directionSignTofiscalizationReceiptsButton,10);
            clickField(directionSignTofiscalizationReceiptsButton);
        }

        clickField(fiscalizationReceiptsTab);
        Utils.waitForVisibility(By.xpath("//tbody/tr"), 10);
        String agreementIdOfFiscalizationReceipt = getTableCellDataByColumnName("Agreement Id", 1);
        String orderDateOfFiscalizationReceipt = getTableCellDataByColumnName("Invoice Date", 1);

        Assert.assertEquals(agrementIdOfOrder,agreementIdOfFiscalizationReceipt);

        String[] orderDateOfOrderHourAndMinute = ((orderDateOfOrder.split(" "))[1].split(" "))[0].split(":");
        int temp1 = Integer.parseInt(orderDateOfOrderHourAndMinute[0])*3600 +   Integer.parseInt(orderDateOfOrderHourAndMinute[1])*60;
        String[] orderDateOfFiscOrderHourAndMinute = (orderDateOfFiscalizationReceipt.split(" "))[1].split(":");
        int temp2 = Integer.parseInt(orderDateOfFiscOrderHourAndMinute[0])*3600 +   Integer.parseInt(orderDateOfFiscOrderHourAndMinute[1])*60;
        System.out.println("Time difference in seconds : " + (temp2 - temp1));
        Assert.assertTrue(temp2 - temp1 <= 180); // Time difference is less than or equal 3 minutes
    }
}
