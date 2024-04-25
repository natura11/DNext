package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import static com.utilities.Driver.getDriver;
import static com.utilities.config.Constant.GLOBAL_TIME_OUT;

public class Utils {


    public static void refreshThePage() {
        getDriver().navigate().refresh();
        waitForPageToLoad();
    }

    public static void navigateUrl(String url) {
        getDriver().get(url);
        waitForPageToLoad();
    }

    public static void getCurrentUrl() {
        getDriver().getCurrentUrl();
    }

    public static WebElement getElement(Object element) {
        if(element instanceof WebElement) {
            return new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.visibilityOf((WebElement) element));
        } else {
            return new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.visibilityOfElementLocated((By) element));
        }
    }

    public static void click(WebElement element) {
        waitForVisibility(element, GLOBAL_TIME_OUT);
        highlightElement(element);
        waitForClickablility(element).click();
        waitForPageToLoad();
    }

    public static void sendKeys(WebElement element, String data) {
        getElement(element).sendKeys(data);
    }

    public static void getText(WebElement element) {
        getElement(element).getText();
    }

    public static String getAttribute(WebElement element, String attribute) {
        return getElement(element).getAttribute(attribute);
    }

    public static List<String> getElementsText(List<WebElement> list) {
        return list.stream().map(WebElement::getText).toList();
    }

    public static void highlightElement(WebElement element) {
        scrollToElement(element);
        var highlightScript = "arguments[0].style.border='3px solid yellow';";
        ((JavascriptExecutor) getDriver()).executeScript(highlightScript, element);
    }

    public static String getCssJavaScript(WebElement element) {
        return (String) ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].textContent;", getElement(element));
    }

    public static void alertWait() {
        new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.alertIsPresent());
    }
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getAlertMessage() {
        alertWait();
        var alertMessage = getDriver().switchTo().alert().getText();
        getDriver().switchTo().alert().accept();
        return alertMessage;
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException ignored) {}
    }

    public static void waitForPageToLoad() {
        ExpectedCondition<Boolean> expectation = driver -> ((JavascriptExecutor) getDriver()).executeScript("return document.readyState").equals("complete");
        try {
            new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(expectation);
        } catch (Throwable ignored) {}
    }
    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }
    public static WebElement waitForClickablility(WebElement element) {
        return new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.elementToBeClickable(getElement(element)));
    }
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static WebElement fluentWait(final WebElement webElement, int timeout) {
        FluentWait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(3))
                .pollingEvery(Duration.ofSeconds(1));

        return wait.until(driver -> webElement);
    }

    public static void waitForInvisibilityOf(WebElement webElement) {
        new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.invisibilityOf(webElement));
    }

    public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
        highlightElement(dropdownElement);
        return new Select(dropdownElement)
                .getOptions()
                .stream()
                .map(WebElement::getText).toList();
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {
        radioButtons.stream()
                .filter(k -> k.getText().contains(attributeValue))
                .toList()
                .getFirst().click();
    }

    public static void doubleClick(WebElement element) {
        highlightElement(element);
        new Actions(getDriver()).doubleClick(element).build().perform();
    }

    public static void clickWithJS(WebElement element) {
        highlightElement(element);
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void scrollToElement(WebElement element) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", getElement(element));
    }

    public static void setAttribute(WebElement element, String attributeName, String attributeValue) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", getElement(element), attributeName, attributeValue);
    }

    public static void selectCheckBox(WebElement element) {
        if(!element.isSelected()) click(element);
    }

    public static boolean isElementSelected(WebElement element) {
        waitFor(1);
        return element.isSelected();
    }

    public static void switchToWindowByOrder(int order) {
        var windows = getDriver().getWindowHandles().stream().toList();
        getDriver().switchTo().window(windows.get(order));
    }

    public static void switchToWindowByUrlContains(String urlPart) {
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
            new WebDriverWait(getDriver(), Duration.ofSeconds(GLOBAL_TIME_OUT)).until(ExpectedConditions.urlContains(urlPart));
            if (getDriver().getCurrentUrl().contains(urlPart)) {
                return;
            }
        }
    }

    public static void switchToWindowByTitle(String targetTitle) {
        var origin = getDriver().getWindowHandle();
        for (String handle : getDriver().getWindowHandles()) {
            getDriver().switchTo().window(handle);
            if (getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        getDriver().switchTo().window(origin);
    }

    public static void uploadFile1(String fileName, WebElement uploadElement) {
        var separator = System.getProperty("file.separator");
        var path = System.getProperty("user.dir") + separator + "src" + separator + "test" + separator + "resources" + separator + "fotos" + separator + fileName;
        sleep(2);
        uploadElement.sendKeys(path);
    }



    public static String getScreenshot(String name) throws IOException {
        var date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        var ts = (TakesScreenshot) getDriver();
        var source = ts.getScreenshotAs(OutputType.FILE);
        var target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
        var finalDestination = new File(target);
        FileUtils.copyFile(source, finalDestination);
        return target;
    }

}
