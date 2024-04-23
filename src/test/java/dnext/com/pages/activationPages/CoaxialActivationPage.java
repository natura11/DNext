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
public class CoaxialActivationPage extends BasePage {


    @FindBy(xpath = "//input[@id='MACAddress']")
    public WebElement inputFieldForMACAddress;

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;


    public void numbersCreationForMacAdreess() {
        List<String> Numbers = new ArrayList<>(Arrays
                .asList("0024D186E41F", "0024D186E426", "0024D186E42D", "0024D186E434", "0024D186E43B",
                        "0024D186E442", "0024D186E449", "0024D186E450", "0024D186E457", "0024D186E45E",
                        "0024D186E465", "0024D186E46C", "0024D186E473", "0024D186E47A", "0024D186E481",
                        "0024D186E488", "0024D186E48F", "0024D186E496", "0024D186E49D", "0024D186E4A4", "0024D186E648",
                        "0024D186E4AB", "0024D186E4B2", "0024D186E4B9", "0024D186E4C0", "0024D186E4C7", "0024D186E64F",
                        "0024D186E4CE", "0024D186E4D5", "0024D186E4DC", "0024D186E4E3", "0024D186E4EA", "0024D186E617",
                        "0024D186E4F1", "0024D186E4F8", "0024D186E4FF", "0024D186E506", "0024D186E50D", "0024D186E514",
                        "0024D186E51B", "0024D186E522", "0024D186E529", "0024D186E530", "0024D186E537", "0024D186E53E",
                        "0024D186E545", "0024D186E54C", "0024D186E553", "0024D186E55A", "0024D186E561", "0024D186E568",
                        "0024D186E56F", "0024D186E576", "0024D186E57D", "0024D186E584", "0024D186E58B", "0024D186E592",
                        "0024D186E599", "0024D186E5A0", "0024D186E5A7", "0024D186E5AE", "0024D186E5B5", "0024D186E5BC",
                        "0024D186E5C3", "0024D186E5CA", "0024D186E5D1", "0024D186E5D8", "0024D186E5DF", "0024D186E5E6",
                        "0024D186E5ED", "0024D186E5F4", "0024D186E5FB", "0024D186E602", "0024D186E609", "0024D186E610",
                        "0024D186E61E", "0024D186E625", "0024D186E62C", "0024D186E633", "0024D186E63A", "0024D186E641"
                ));
        Random random = new Random();
        int randomIndex = random.nextInt(Numbers.size());
        System.out.println("Numbers.get(randomIndex) = " + Numbers.get(randomIndex));
        sendKeys(inputFieldForMACAddress, Numbers.get(randomIndex));
    }

    public void checkCoaxialMacNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitForVisibility(By.xpath(successMessageXpath), 3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                inputFieldForMACAddress.clear();
                numbersCreationForMacAdreess();
                clickField(addToCartBtn);
                Utils.waitFor(3);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }

}







