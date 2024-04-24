package dnext.com.pages.activationPages;

import com.github.javafaker.Faker;
import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;
import java.util.Random;

import static dnext.com.pages.backofficePage.BackOfficeIpInventoryPage.*;
@Log4j2
public class BundleActivationPage extends BasePage {


    @FindBy(xpath = "((//p/following-sibling::div/mat-chip-list/div/mat-basic-chip)[1])")
    public WebElement cashOptionOfSelectedProductsForBundleForVbu;

    @FindBy(xpath = "//*[text()=' Public IP for Bundle ']/following::div/mat-chip-list[1]/div/mat-basic-chip[1]")
    public WebElement cashOptionoFPublicIPforBundleForVbu;
    @FindBy(xpath = "(//input[@id='IPAddress'])[2]")
    public WebElement inputFieldForIpAdreessForVbu;
    @FindBy(xpath = "//input[@class='mat-slide-toggle-input cdk-visually-hidden']")
    public WebElement slideButtonForBundle;
    @FindBy(xpath = "//app-bundle-offering//mat-accordion/div/mat-expansion-panel")
    public WebElement resourceSection;








public void usingCreatedIpAddressAtBackOffice(){
        Faker faker=new Faker();
        Driver.getDriver().navigate().to("https://backoffice-ui.uat.dnext.al.vodafone.com/orders/my-group-tasks");
        Utils.waitFor(3);
        clickField(ipInventoryButton);
        Utils.clickWithJS(createButtonToStartIpInventory);
        clickField(adressButtonForIpInventory);
        sendKeys(adressButtonForIpInventory,faker.numerify("###.###.###"));
        clickField(serviceTypeDropdownForIpInventory);
        clickField(ipOptionFromDropdownForIpInventory);
        clickField(addressTypeDropdownForIpInventory);
        clickField(singleOptionFromAddressTypeDropdownForIpInventory);
        clickField(onOptionFromAutoProvForIpInventory);
        clickField(createButtonToCompleteIpInventory);
        String inventedIpAddress=createdIpfieldForIpInventory.getText();
        System.out.println("inventedIpAddress = " + inventedIpAddress);
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        sendKeys(inputFieldForIpAdreessForVbu,inventedIpAddress);
}
    public void selectSpecificResourceAndPrice(String resourceName) {
        Utils.waitForVisibility(resourceSection, 30);
        WebElement selectedResource = Driver.getDriver().findElement(
                By.xpath("//app-bundle-offering//mat-accordion/div/mat-expansion-panel" +
                        "//p[contains(text(),'" + resourceName + "')]/following::button"));
        selectedResource.click();
        log.info(resourceName + " is selected");

        List<WebElement> listedPrices = Driver.getDriver().findElements(
                By.xpath("//app-bundle-offering//mat-accordion/div/mat-expansion-panel"
                        + "//p[contains(text(),'" + resourceName + "')]/following::button[1]" +
                        "//ancestor::span//mat-basic-chip"));
        Random random = new Random();
        int randomIndex = random.nextInt(listedPrices.size());
        listedPrices.get(randomIndex).click();
        log.info("Random price is selected: " + listedPrices.get(randomIndex).getText());
    }



}
