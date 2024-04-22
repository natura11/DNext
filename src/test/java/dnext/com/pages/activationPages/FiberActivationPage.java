package dnext.com.pages.activationPages;

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

@Log4j2
public class FiberActivationPage extends BasePage {

    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "(//input[@id='PPPoEUser'])[1]")
    public WebElement pPPoEUserInputField;
    @FindBy(xpath = "//input[@id='ONTSerialNumber']")
    public WebElement oNTSerialNumberInputField;


    public void fillFiberPostpaidCardNumber() {
        List<String> fiberNumbers = new ArrayList<>(Arrays
                .asList(
                        "485754436BD1BB1F", "485754436BD1F71F", "485754436BD2331F", "485754436BD2511F",
                        "485754436BD28D1F", "485754436BD2E71F", "485754436BD44E32", "485754436BD4631F",
                        "485754436BD48B1F", "485754436BD49F1F", "485754436BD55583", "4485754431F02C9A",
                        "448575443A2F0F9B", "4854544351AD279B", "485754430003CE76", "485754430009099A",
                        "4857544300091D76", "485754430009608F", "48575443000F7A76", "485754430037B242",
                        "48575443003A9642", "48575443003DCA42", "48575443003E5660", "48575443003a3242",
                        "48575443003ee242", "485754430047AB9A", "48575443004A878F", "48575443004EF042",
                        "485754430052449A", "485754430055EE42", "485754430057F29A", "485754430058899A",
                        "48575443005D029A", "48575443005E6F60", "48575443005EE042", "48575443005a1242",
                        "48575443005e0442"));
        Random random = new Random();
        int randomIndex = random.nextInt(fiberNumbers.size());
        sendKeys(pPPoEUserInputField, fiberNumbers.get(randomIndex));
        sendKeys(oNTSerialNumberInputField, fiberNumbers.get(randomIndex));
    }

    public void fillFiberPrepaidCardNumber() {
        List<String> abelNumbers = new ArrayList<>(Arrays
                .asList(
                        "4857544313F18C92", "4857544314170A9D", "4857544314191E9D", "4857544314228925", "485754431423CD25",
                        "485754431424C025", "4857544314269425", "485754431428B925", "48575443142B2625", "48575443144CC225",
                        "48575443145F87A1", "485754431469A2A1", "4857544314705F81", "48575443147142A1", "485754431471D142",
                        "4857544314741540", "4857544314749681", "4857544314749742", "485754431475EB42", "4857544314765942",
                        "4857544314794281", "48575443147B6D42", "48575443147E3342", "48575443147E7942", "4857544314800942",
                        "4857544314840F42", "4857544314844142", "4857544314847d42", "4857544314852742", "4857544314859542",
                        "485754431485BC80", "485754431485FAA1", "4857544314862B42", "4857544314886540", "48575443148B8542",
                        "48575443148C5742", "485754431490AB81", "4857544314921380", "4857544314933493", "485754431493B942",
                        "485754431494E542", "485754431494F942", "4857544314A0EB81", "4857544314A20580", "4857544314AB2980",
                        "4857544314B13881", "4857544314B29380", "4857544314B36781", "4857544314DF0F80", "4857544314DFD280",
                        "4857544314E27944", "4857544314E3F6A1", "4857544314E8C280", "4857544314F06805", "4857544314F0AE05",
                        "4857544314F23405", "4857544314F23E05", "4857544314F25205", "4857544314FE7C3F", "4857544315017A86",
                        "4857544315074780", "48575443150FC681", "48575443151004A3", "4857544315133C44", "485754431519FC44",
                        "4857544315218B44", "485754431522FCA1", "4857544315278A69", "485754431529FEA1", "48575443152DD08F",
                        "4857544313F2367B", "4857544313F54A25", "4857544313F62225", "4857544313F65825", "4857544313F84344",
                        "4857544313FBD69A", "4857544313FD6025", "4857544313FF358F", "4857544314020425", "4857544314039025",
                        "4857544314064E25", "48575443140A1580", "48575443140B6725", "48575443140C3625", "48575443140D759C",
                        "4857544314146725", "4857544314165D92", "485754431416DD25"));
        Random random = new Random();
        int randomIndex = random.nextInt(abelNumbers.size());
        sendKeys(pPPoEUserInputField, abelNumbers.get(randomIndex));
        sendKeys(oNTSerialNumberInputField, abelNumbers.get(randomIndex));
    }

    public void checkFiberPostpaidNumberIsAvailableOrNot() {
        String successMessageXpath = "//simple-snack-bar/span[text()='Shopping cart created successfully!']";
        boolean isNumberAvailable = false;
        do {
            Utils.waitFor(3);
            if (Driver.getDriver().findElements(By.xpath(successMessageXpath)).isEmpty()) {
                pPPoEUserInputField.clear();
                oNTSerialNumberInputField.clear();
                fillFiberPostpaidCardNumber();
                clickField(addToCartBtn);
                Utils.waitFor(3);
            } else {
                isNumberAvailable = true;
            }
        } while (!isNumberAvailable);
    }



}