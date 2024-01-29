package com.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class Utils {

        public static void uploadFile(String fileName, WebElement uploadElement) {
            String separator = System.getProperty("file.separator");
            String path = System.getProperty("user.dir") + separator + "src" + separator + "test" + separator + "resources" + separator + "fotos" + separator + fileName;
            Utils.waitFor(2);
            uploadElement.sendKeys(path);
        }

        public static void highlightElement(WebElement element) {
            String highlightScript = "arguments[0].style.border='3px solid yellow';";
            ((JavascriptExecutor) Driver.getDriver()).executeScript(highlightScript, element);

            try {
                Thread.sleep(2000); // 2 saniye waityin
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            String resetScript = "arguments[0].style.border='';";
            ((JavascriptExecutor) Driver.getDriver()).executeScript(resetScript, element);
        }

        public static void waitForAndClick(WebElement element) {
            int maxWaitTimeInSeconds = 10;
            long startTime = System.currentTimeMillis();

            while ((System.currentTimeMillis() - startTime) < (maxWaitTimeInSeconds * 1000)) {
                try {
                    if (element.isDisplayed() && element.isEnabled()) {
                        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
                        break;
                    }
                } catch (Exception ignored) {}
                wait(1);
            }
        }

        public static void getValueByJS(String id, String attributeName) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
            String attribute_Value = (String) js.executeScript("return document.getElementById('" + id + "')." + attributeName);
            System.out.println("Attribute Value: = " + attribute_Value);

        }

        public static String getCssJavaScript(String xpath) {
            WebElement spanElement = Driver.getDriver().findElement(By.xpath(xpath));

            // JavaScriptExecutor kullanarak metni alın
            String metin = (String) ((JavascriptExecutor) Driver.getDriver()).executeScript("return arguments[0].textContent;", spanElement);

            return metin;

        }

        public static String getTextWithJavaScript(String className) {
            WebElement element = Driver.getDriver().findElement(By.className(className));

            JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
            String text = (String) jsExecutor.executeScript("return arguments[0].textContent;", element);
            return text;
        }

        public static void robotClassDosyaYukleme(String filePath) {
            try {
                Utils.wait(3);
                StringSelection stringSelection = new StringSelection(filePath);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
                Robot robot = new Robot();
                //pressing ctrl+v
                robot.keyPress(KeyEvent.VK_CONTROL);
                Utils.wait(3);
                robot.keyPress(KeyEvent.VK_V);
                Utils.wait(3);
                //releasing ctrl+v
                robot.keyRelease(KeyEvent.VK_CONTROL);
                Utils.wait(3);
                robot.keyRelease(KeyEvent.VK_V);
                Utils.wait(3);
                System.out.println("PASSED");
                //pressing enter
                Utils.wait(3);
                robot.keyPress(KeyEvent.VK_ENTER);
                Utils.wait(3);
                //releasing enter
                robot.keyRelease(KeyEvent.VK_ENTER);
                Utils.wait(3);
                System.out.println("ENTER");
            } catch (Exception e) {
            }
        }

        public static void alertWait(int sayi) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(sayi));
            wait.until(ExpectedConditions.alertIsPresent());
        }

        public static void switchToWindowNew(int sayi) {
            List<String> tumWindowHandles = new ArrayList<String>(Driver.getDriver().getWindowHandles());
            Driver.getDriver().switchTo().window(tumWindowHandles.get(sayi));
        }

        public static void click(WebElement element) {
            try {
                element.click();
            } catch (Exception e) {
                JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
                js.executeScript("arguments[0].click();", element);
            }
        }

        public static String getScreenshot(String name) throws IOException {
            var date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
            var ts = (TakesScreenshot) Driver.getDriver();
            var source = ts.getScreenshotAs(OutputType.FILE);
            var target = System.getProperty("user.dir") + "/target/Screenshots/" + name + date + ".png";
            var finalDestination = new File(target);
            FileUtils.copyFile(source, finalDestination);
            return target;
        }

        //========Switching Window=====//
        public static void switchToWindow(String targetTitle) {
            String origin = Driver.getDriver().getWindowHandle();
            for (String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getTitle().equals(targetTitle)) {
                    return;
                }
            }
            Driver.getDriver().switchTo().window(origin);
        }

        //========Hover Over=====//
        public static void hover(WebElement element) {
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(element).perform();
        }


        public static void wait(int saniye) {
            try {
                Thread.sleep(saniye * 1000);
            } catch (InterruptedException ignored) {
            }
        }

        //===============Explicit Wait==============//
        public static WebElement waitForVisibility(WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            return wait.until(ExpectedConditions.visibilityOf(element));
        }

        public static WebElement waitForVisibility(By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        public static WebElement waitForClickablility(WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        }

        public static WebElement waitForClickablility(By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        }

        public static void clickWithTimeOut(WebElement element, int timeout) {
            for (int i = 0; i < timeout; i++) {
                try {
                    element.click();
                    return;
                } catch (WebDriverException e) {
                    wait(1);
                }
            }
        }

        public static void waitForPageToLoad(long timeout) {
            ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                }
            };
            try {
                System.out.println("Waiting for page to load...");
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
                wait.until(expectation);
            } catch (Throwable error) {
                System.out.println(
                        "Timeout waiting for Page Load Request to complete after " + timeout + " seconds");
            }
        }

        //======Fluent Wait====//
        public static WebElement fluentWait(final WebElement webElement, int timeout) {
            //FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(timeinsec, TimeUnit.SECONDS).pollingEvery(timeinsec, TimeUnit.SECONDS);
            FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                    .withTimeout(Duration.ofSeconds(3))//Wait 3 second each time
                    .pollingEvery(Duration.ofSeconds(1));//Check for the element every 1 second

            WebElement element = wait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    return webElement;
                }
            });

            return element;
        }

        public static void sleep(int second) {
            second *= 1000;
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {

            }
        }

        public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

            Set<String> allWindowsHandles = Driver.getDriver().getWindowHandles();

            for (String each : allWindowsHandles) {

                Driver.getDriver().switchTo().window(each);

                System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

                if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                    break;
                }
            }

            //5. Assert:Title contains “expectedInTitle”
            String actualTitle = Driver.getDriver().getTitle();
        }

        public static void waitForInvisibilityOf(WebElement webElement) {

            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            wait.until(ExpectedConditions.invisibilityOf(webElement));
        }

        public static List<String> dropdownOptionsAsString(WebElement dropdownElement) {
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

        public static void switchToWindow1(String targetTitle) {
            var origin = Driver.getDriver().getWindowHandle();
            for (String handle : Driver.getDriver().getWindowHandles()) {
                Driver.getDriver().switchTo().window(handle);
                if (Driver.getDriver().getTitle().equals(targetTitle)) {
                    return;
                }
            }
            Driver.getDriver().switchTo().window(origin);
        }


        public static void hover1(WebElement element) {
            Actions actions = new Actions(Driver.getDriver());
            actions.moveToElement(element).perform();
        }


        public static List<String> getElementsText(List<WebElement> list) {
            return list.stream().map(WebElement::getText).toList();
        }

        public static List<String> getElementsText(By locator) {
            return Driver.getDriver().findElements(locator)
                    .stream().map(WebElement::getText).toList();
        }

        public static void waitFor(int seconds) {
            try {
                Thread.sleep(seconds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static WebElement waitForVisibility1(WebElement element, int timeToWaitInSec) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            return wait.until(ExpectedConditions.visibilityOf(element));
        }

        public static WebElement waitForVisibility1(By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }

        public static WebElement waitForClickablility1(WebElement element, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            return wait.until(ExpectedConditions.elementToBeClickable(element));
        }

        public static WebElement waitForClickablility1(By locator, int timeout) {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
            return wait.until(ExpectedConditions.elementToBeClickable(locator));
        }

        public static void waitForPageToLoad1(long timeOutInSeconds) {
            ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
                public Boolean apply(WebDriver driver) {
                    return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
                }
            };
            try {
                WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
                wait.until(expectation);
            } catch (Throwable error) {
                error.printStackTrace();
            }
        }

        public static void waitForStaleElement(WebElement element) {
            int y = 0;
            while (y <= 15) {
                if (y == 1)
                    try {
                        element.isDisplayed();
                        break;
                    } catch (StaleElementReferenceException st) {
                        y++;
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } catch (WebDriverException we) {
                        y++;
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            }
        }

        public static void clickWithJS(WebElement element) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
        }

        public static void scrollToElement(WebElement element) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        }

        public static void doubleClick(WebElement element) {
            new Actions(Driver.getDriver()).doubleClick(element).build().perform();
        }

        public static void setAttribute(WebElement element, String attributeName, String attributeValue) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);", element, attributeName, attributeValue);
        }

        public static void highlight(WebElement element) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
            waitFor(1);
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].removeAttribute('style', 'background: yellow; border: 2px solid red;');", element);
        }

        public static void selectCheckBox(WebElement element, boolean check) {
            if (check) {
                if (!element.isSelected()) {
                    element.click();
                }
            } else {
                if (element.isSelected()) {
                    element.click();
                }
            }
        }

        public static void clickWithTimeOut1(WebElement element, int timeout) {
            for (int i = 0; i < timeout; i++) {
                try {
                    element.click();
                    return;
                } catch (WebDriverException e) {
                    waitFor(1);
                }
            }
        }

        public static void executeJScommand(WebElement element, String command) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript(command, element);

        }

        public static void executeJScommand(String command) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript(command);

        }

        public static void clickWithWait(By by, int attempts) {
            int counter = 0;

            while (counter < attempts) {
                try {

                    clickWithJS(Driver.getDriver().findElement(by));

                    break;
                } catch (WebDriverException e) {

                    e.printStackTrace();
                    ++counter;

                    waitFor(1);
                }
            }
        }

        public static void waitForPresenceOfElement(By by, long time) {
            new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15)).until(ExpectedConditions.presenceOfElementLocated(by));
        }

        public static void retryClick(WebElement element) {
            for (int i = 0; i < 3; i++) {
                try {
                    click(element);
                    break;
                } catch (StaleElementReferenceException | NoSuchElementException e) {
                    waitFor(2);
                }
            }
        }
}
