package dnext.com.pages.activationPages;

import com.utilities.Driver;
import com.utilities.Utils;
import dnext.com.pages.BasePage;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Log4j2
public class CryptoguardActivationPage extends BasePage {


    @FindBy(xpath = "//input[@id='SmartCardSerialNumber']")
    public WebElement smartCardSerialNumberField;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;


    public void cryptoguardNumbersCreationForSerialNumbers() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList("00340005209191", "00340005219190", "00340005234193", "00340005247193",
                        "00340005261199", "00340005267191", "00340005268198", "00340005274199",
                        "00340005287199", "00340005297198", "00340005312198", "00340005334190",
                        "00340005344199", "00340005352194", "00340005358196", "00340005365194",
                        "00340005343192"
                ));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(smartCardSerialNumberField, abelNumbers.get(randomIndex));
    }

    public void checkCryptoguardNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                smartCardSerialNumberField.clear();
                cryptoguardNumbersCreationForSerialNumbers();
                clickField(addToCartBtn);
                Utils.waitFor(4);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

}


