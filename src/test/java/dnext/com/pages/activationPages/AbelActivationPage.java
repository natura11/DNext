package dnext.com.pages.activationPages;
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
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import static com.utilities.Utils.waitFor;
import static dnext.com.pages.camundaPage.HomePageCamunda.*;

@Log4j2
public class AbelActivationPage extends BasePage {


    @FindBy(xpath = "//input[@id=\"SmartCardSerialNumber\"]")
    public WebElement smartCardSerialNumberField;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;


    public void fillAbelSmartCardNumber() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList(
                        "002001380290", "002001380308", "002001380316", "002001380324", "002001380332", "002001380340", "002001380357",
                        "002001380365", "002001380373", "002001380381", "002001380399", "002001380407", "002001380415", "002001380423",
                        "002001380431", "002001380449", "002001380456", "002001380464", "002001380472", "002001380480", "002001380498",
                        "002001380506", "002001380514", "002001380522", "002001380530", "002001380548", "002001380555", "002001380563",
                        "002001380571", "002001380589", "002001380597", "002001380605", "002001380613", "002001379003", "002001379011",
                        "002001379029", "002001379037", "002001379045", "002001379052", "002001379060", "002001379078", "002001379086",
                        "002001379094", "002001379102", "002001379110", "002001379128", "002001379136", "002001379144", "002001379151",
                        "002001379169", "002001379177", "002001379193", "002001379201", "002001379219", "002001379227", "002001380282"));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(smartCardSerialNumberField, abelNumbers.get(randomIndex));
    }

    public void checkAbelNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                smartCardSerialNumberField.clear();
                fillAbelSmartCardNumber();
                clickField(addToCartBtn);
                Utils.waitFor(3);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }


}