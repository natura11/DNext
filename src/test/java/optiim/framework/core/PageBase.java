package optiim.framework.core;

import lombok.extern.log4j.Log4j2;
import optiim.framework.helpers.WebDriverHelper;
import optiim.framework.utils.log;
import optiim.models.data.GetData;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Log4j2
public abstract class PageBase {
    private static final Duration DRIVER_WAIT_TIME = Duration.ofSeconds(GetData.DRIVER_WAIT_TIME);
    private static final long DRIVER_LOADER_WAIT_TIME = GetData.DEFAULT_WAIT_LOADERBOX;
    public static final By btnConfirm = By.cssSelector("[class='swal2-confirm swal2-styled']");

    protected WebDriverWait wait;
    protected WebDriver webDriver;
    private WebDriverHelper webDriverHelper;

    public WebDriverWait getWait() {
        return wait;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    protected PageBase(WebDriverHelper webDriverHelper) {
        this.webDriverHelper = webDriverHelper;
        this.webDriver = this.webDriverHelper.getDriver();
        this.wait = new WebDriverWait(webDriver, DRIVER_WAIT_TIME);
    }

    /**
     * Returns the current Url from page
     **/
    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    /**
     * Returns the current page title from page
     */
    public String getCurrentPageTitle() {
        return getWebDriver().getTitle();
    }

    /**
     * An expectation for checking the title of a page.
     *
     * @param title the expected title, which must be an exact match
     * @return true when the title matches, false otherwise
     */
    public boolean checkPageTitle(String title) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.titleIs(title));
    }

    /**
     * An expectation for checking that the title contains a case-sensitive
     * substring
     *
     * @param title the fragment of title expected
     * @return true when the title matches, false otherwise
     */
    public boolean checkPageTitleContains(String title) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.titleContains(title));
    }

    /**
     * An expectation for the URL of the current page to be a specific url.
     *
     * @param url the url that the page should be on
     * @return <code>true</code> when the URL is what it should be
     */
    public boolean checkPageUrlToBe(String url) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.urlToBe(url));
    }

    /**
     * An expectation for the URL of the current page to contain specific text.
     *
     * @param fraction the fraction of the url that the page should be on
     * @return <code>true</code> when the URL contains the text
     */
    public boolean checkPageUrlContains(String fraction) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.urlContains(fraction));
    }

    /**
     * Expectation for the URL to match a specific regular expression
     *
     * @param regex the regular expression that the URL should match
     * @return <code>true</code> if the URL matches the specified regular expression
     */

    public boolean checkPageUrlMatches(String regex) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.urlMatches(regex));
    }

    /**
     * Find the dynamic element wait until its visible
     *
     * @param by Element location found by css, xpath, id etc...
     **/
    protected WebElement waitForExpectedElement(final By by) {
        return wait.until(visibilityOfElementLocated(by));
    }

    /**
     * Find the dynamic element wait until its visible for a specified time
     *
     * @param by                Element location found by css, xpath, id etc...
     * @param waitTimeInSeconds max time to wait until element is visible
     **/

    public WebElement waitForExpectedElement(final By by, long waitTimeInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME);
            return wait.until(visibilityOfElementLocated(by));
        } catch (NoSuchElementException e) {
            log.info(e.getMessage());
            return null;
        } catch (TimeoutException e) {
            log.info(e.getMessage());
            return null;
        }
    }

    private ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) throws NoSuchElementException {
        return driver -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                log.error(e.getMessage());
            }
            WebElement element = getWebDriver().findElement(by);
            return element.isDisplayed() ? element : null;
        };
    }


    /**
     * An expectation for checking if the given text is present in the specified element.
     *
     * @param element the WebElement
     * @param text    to be present in the element
     * @return true once the element contains the given text
     */
    public boolean textToBePresentInElement(WebElement element, String text) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.textToBePresentInElement(element, text));
    }


    /**
     * An expectation for checking if the given text is present in the element that matches
     * the given locator.
     *
     * @param by   used to find the element
     * @param text to be present in the element found by the locator
     * @return true once the first element located by locator contains the given text
     */
    public boolean textToBePresentInElementLocated(final By by, final String text) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }


    /**
     * An expectation for checking if the given text is present in the specified
     * elements value attribute.
     *
     * @param element the WebElement
     * @param text    to be present in the element's value attribute
     * @return true once the element's value attribute contains the given text
     */
    public boolean textToBePresentInElementValue(final WebElement element, final String text) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.textToBePresentInElementValue(element, text));
    }


    /**
     * An expectation for checking if the given text is present in the specified
     * elements value attribute.
     *
     * @param by   used to find the element
     * @param text to be present in the value attribute of the element found by the locator
     * @return true once the value attribute of the first element located by locator contains
     * the given text
     */
    public boolean textToBePresentInElementValue(final By by, final String text) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.textToBePresentInElementValue(by, text));
    }


    /**
     * An expectation for checking whether the given frame is available to switch
     * to. <p> If the frame is available it switches the given driver to the
     * specified frame.
     *
     * @param frameLocator used to find the frame (id or name)
     */
    public WebDriver frameToBeAvailableAndSwitchToIt(final String frameLocator) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
    }


    /**
     * An expectation for checking whether the given frame is available to switch
     * to. <p> If the frame is available it switches the given driver to the
     * specified frame.
     *
     * @param by used to find the frame
     */
    public WebDriver frameToBeAvailableAndSwitchToIt(final By by) {
        return new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }


    /**
     * An expectation for checking that an element is either invisible or not
     * present on the DOM.
     *
     * @param by used to find the element
     */
    public boolean invisibilityOfElementLocated(By by) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    /**
     * An expectation for checking that an element with text is either invisible
     * or not present on the DOM.
     *
     * @param by   used to find the element
     * @param text of the element
     */
    public boolean invisibilityOfElementWithText(final By by, final String text) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.invisibilityOfElementWithText(by, text));
    }


    /**
     * An expectation for checking an element is visible and enabled such that you
     * can click it.
     *
     * @param by used to find the element
     * @return the WebElement once it is located and clickable (visible and enabled)
     */
    public WebElement elementToBeClickable(By by) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(by));
    }


    /**
     * An expectation for checking an element is visible and enabled such that you
     * can click it.
     *
     * @param element the WebElement
     * @return the (same) WebElement once it is clickable (visible and enabled)
     */

    public WebElement elementToBeClickable(final WebElement element) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementToBeClickable(element));
    }


    /**
     * Wait until an element is no longer attached to the DOM.
     *
     * @param element The element to wait for.
     * @return false is the element is still attached to the DOM, true
     * otherwise.
     */
    public boolean stalenessOf(final WebElement element) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.stalenessOf(element));
    }

    /**
     * An expectation for checking if the given element is selected.
     */
    public boolean elementToBeSelected(final By by) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementToBeSelected(by));
    }

    /**
     * An expectation for checking if the given element is selected.
     */
    public boolean elementToBeSelected(final WebElement element) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementToBeSelected(element));
    }

    /**
     * An expectation for checking if the given element is selected.
     */
    public boolean elementSelectionStateToBe(final WebElement element, final boolean selected) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementSelectionStateToBe(element, selected));
    }

    /**
     * An expectation for checking if the given element is selected.
     */
    public boolean elementSelectionStateToBe(final By by,
                                             final boolean selected) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.elementSelectionStateToBe(by, selected));
    }

    public void waitForAlert() {
        (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.alertIsPresent());
    }

    public void switchAndExceptAlert() {
        waitForAlert();
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }

    /**
     * An expectation for checking that all elements present on the web page that
     * match the locator are visible. Visibility means that the elements are not
     * only displayed but also have a height and width that is greater than 0.
     *
     * @param by used to find the element
     * @return the list of WebElements once they are located
     */
    public List<WebElement> visibilityOfAllElementsLocatedBy(final By by) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }


    /**
     * An expectation for checking that all elements present on the web page that
     * match the locator are visible. Visibility means that the elements are not
     * only displayed but also have a height and width that is greater than 0.
     *
     * @param elements list of WebElements
     * @return the list of WebElements once they are located
     */
    public List<WebElement> visibilityOfAllElements(final List<WebElement> elements) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.visibilityOfAllElements(elements));
    }


    /**
     * An expectation for checking that there is at least one element present on a
     * web page.
     *
     * @param by used to find the element
     * @return the list of WebElements once they are located
     */
    public List<WebElement> presenceOfAllElementsLocatedBy(final By by) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    /**
     * An expectation for checking that an element, known to be present on the DOM
     * of a page, is visible. Visibility means that the element is not only
     * displayed but also has a height and width that is greater than 0.
     *
     * @param element the WebElement
     * @return the (same) WebElement once it is visible
     */

    public WebElement visibilityOf(final WebElement element) {
        return (new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME)).until(ExpectedConditions.visibilityOf(element));
    }


    /**
     * An expectation for checking that an element is present on the DOM of a
     * page. This does not necessarily mean that the element is visible.
     *
     * @param by used to find the element
     * @return the WebElement once it is located
     */
    public boolean isElementPresent(final By by) {
        try {
            new WebDriverWait(getWebDriver(), DRIVER_WAIT_TIME).until(ExpectedConditions.presenceOfElementLocated(by));

        } catch (TimeoutException exception) {
            log.info(exception.getMessage());
            return false;
        }
        return true;
    }


    public WebDriver getBrowserByPageTitle(String pageTitle) {
        for (String windowHandle : webDriver.getWindowHandles()) {
            webDriver = webDriver.switchTo().window(windowHandle);
            if (pageTitle.equalsIgnoreCase(webDriver.getTitle())) {
                return webDriver;
            }
        }
        return null;
    }


    public void navigateToPreviousPageUsingBrowserBackButton() {
        webDriver.navigate().back();
    }

    public void clickWithinElementWithXYCoordinates(WebElement webElement, int x, int y) {
        Actions builder = new Actions(webDriver);
        builder.moveToElement(webElement, x, y);
        builder.click();
        builder.perform();
    }

    public String getElementByTagNameWithJSExecutor(String tagName) {
        return ((JavascriptExecutor) webDriver).executeScript("return window.getComputedStyle(document.getElementsByTagName('" + tagName + "')").toString();
    }

    public String getElementByQueryJSExecutor(String cssSelector) {
        return ((JavascriptExecutor) webDriver).executeScript("return window.getComputedStyle(document.querySelector('" + cssSelector + "')").toString();
    }

    /**
     * Wrapper for driver.findElement
     *
     * @param by Element location found by css, xpath, id etc...
     **/
    protected WebElement element(final By by) {
        return getWebDriver().findElement(by);
    }

    /**
     * Wrapper for clear data and sendKeys in Input Text box
     *
     * @param by        Element location found by css, xpath, id etc...
     * @param inputText text to be entered
     **/

    protected void clearEnterText(By by, String inputText) {
        element(by).clear();
        element(by).sendKeys(inputText);
    }

    /**
     * Wrapper for wait, clear data and sendKeys in Input Text box
     * <p>
     * * @param by Element location found by css, xpath, id etc...
     *
     * @param inputText text to be entered
     **/
    protected void waitClearEnterText(By by, String inputText) {
        waitForExpectedElement(by).clear();
        element(by).sendKeys(inputText);

    }

    /**
     * Use this method click to element
     *
     * @param by
     * @throws InterruptedException
     */
    protected void click(By by) {

        WebElement element;
        try {
            element = findElement(by);
            element.click();
        } catch (Exception e) {
            log.error("Error while clicking webelement : " + e);

            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method click to element
     *
     * @param by
     * @throws InterruptedException
     */
    protected void click(By by, boolean clickable) throws InterruptedException {
        try {
            if (!clickable)
                click(by);
            else {
                wait.until(ExpectedConditions.visibilityOfElementLocated(by));
                WebElement elem = wait.until(ExpectedConditions.visibilityOf(getWebDriver().findElement(by)));
                // String elemText = elem.getText();
                elem.click();
                //LogPASS("Click Button : " + elemText);
            }
        } catch (Exception e) {
            log.info("Error while clicking webelement : " + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to find element by cssSelector
     *
     * @param by
     * @param index
     * @return A WebElement, or an empty if nothing matches
     * @throws InterruptedException
     */
    protected WebElement findElement(By by, int... index) throws InterruptedException {
        // driver.manage().timeouts().implicitlyWait(GetData.DEFAULT_WAIT,
        // TimeUnit.SECONDS);

        WebElement element = null;
        untilElementAppear(by);
        try {
            if (index.length == 0)
                element = getWebDriver().findElement(by);
            else
                element = getWebDriver().findElements(by).get(index[0]);

            ((JavascriptExecutor) getWebDriver()).executeScript("arguments[0].scrollIntoView(false);arguments[0].focus();",
                    element);
            // ((JavascriptExecutor)
            // driver).executeScript("arguments[0].focus();", element);
            // wait.until(ExpectedConditions.visibilityOf(element));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            log.error("Error while clicking webelement : " + e);
            throw new RuntimeException(e);
        }
        return element;
    }

    /**
     * Wait until element appears
     *
     * @param by
     */
    protected void untilElementAppear(By by) {

        try {
            waitLoaderBox(DRIVER_LOADER_WAIT_TIME);// , 40
            Thread.sleep(300);
            // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
            // wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (Exception e) {
            log.error("Error while waiting until element appears : " + e);
            throw new RuntimeException(e);
        }
    }

    public void waitLoaderBox(long time) throws InterruptedException {

        int counter = 0;

        if (GetData.ENVIRONMENT.contains("Product Catalog")) {
            log.info(GetData.ENVIRONMENT);

            getWebDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            while (getWebDriver().findElements(By.xpath("//*[starts-with(@role,'progressbar')]")).size() != 0 && counter < 30) {
                Thread.sleep(1000);
                counter++;
                log.info("Product Catalog Waiting loaderbox...");
            }
            getWebDriver().manage().timeouts().implicitlyWait(GetData.DEFAULT_WAIT, TimeUnit.SECONDS);


        }


        getWebDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (getWebDriver().findElements(By.xpath("//div[starts-with(@class,'preloader')]")).size() != 0) {
            getWebDriver().manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
            getWebDriver().findElement(By.xpath("//div[@class='preloader' and @style='display: none;']"));
            //driver.findElement(By.xpath("//div[@class='loader-box' and @style='display: none;']"));
        }
        getWebDriver().manage().timeouts().implicitlyWait(DRIVER_WAIT_TIME);
    }

    /**
     * Get the visible (i.e. not hidden by CSS) innerText of this element.
     *
     * @param by
     * @param index
     * @return The innerText of this element.
     * @throws InterruptedException
     */
    protected String getTextOfElement(By by, int... index) throws InterruptedException {

        String text = null;

        try {
            if (index.length == 0)
                text = getWebDriver().findElement(by).getText();
            else
                text = getWebDriver().findElements(by).get(index[0]).getText();
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);
            throw new RuntimeException(e);
        }
        return text;
    }

    @SuppressWarnings("finally")
    protected String getTextOfElement(WebElement elem) {
        String text = null;
        try {
            text = elem.getText();
        } finally {
            return text;
        }
    }

    /**
     * Get the visible (i.e. not hidden by CSS) innerText of this element.
     *
     * @param by
     * @param index
     * @return The innerText of this element.
     * @throws InterruptedException
     */
    protected String getTextOfElement2(By by, int... index) throws InterruptedException {
        WebElement element;
        String text = null;

        try {
            element = findElement(by, index);
            text = element.getText();
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);

            throw new RuntimeException(e);
        }
        return text;

    }


    protected String getValueOfAttribute(By by, int... index) throws InterruptedException {
        WebElement element;
        String value = null;

        try {
            element = findElement(by, index);
            value = element.getAttribute("value");
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);

            throw new RuntimeException(e);
        }
        return value;

    }

    protected void selectComboboxByText(By by, String text) throws InterruptedException {
        WebElement element = findElement(by);
        String elemText = null;
        try {
            if (element.isEnabled()) {
                elemText = findElement(by).getText();
                Select selectBox = new Select(findElement(by));
                selectBox.selectByVisibleText(text);
            }
            // log.info("Value : " + text + " - SelectComboBox : " + elemText);
        } catch (Exception e) {
            log.info(elemText + " comboboxında " + text + " seçimi yapılamadı.");
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    protected void selectMatCombobox(By by, String text) throws InterruptedException {
        WebElement element = findElement(by);
        String elemText = null;
        try {
            if (element.isEnabled()) {
                click(by);
                click(By.xpath("//mat-option/span[contains(.,'" + text + "')]"));
            }
            // log.info("Value : " + text + " - SelectComboBox : " + elemText);
        } catch (Exception e) {
            log.info(elemText + " comboboxında " + text + " seçimi yapılamadı.");
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }


    }


    protected void selectMatComboboxTrial(By by, String text) throws InterruptedException {
        WebElement element = findElement(by);
        String elemText = null;
        boolean dropdownOK = true;
        int loopcount = 0;
//        try {
            if (element.isEnabled()) {
                //loop tehlikesi
                while (dropdownOK) {
                    try {
                        clickJS(by);
                    } catch (Exception e) {
                        if (e.getMessage().contains(("ElementClickInterceptedException"))) {
                            clickJS(By.xpath("//mat-option/span[contains(.,'" + text + "')]"));
                        }
                        log.info(e.getMessage());
                    }
                    dropdownOK = false;
                }
                clickJS(By.xpath("//mat-option/span[contains(.,'" + text + "')]"));
            }
            // log.info("Value : " + text + " - SelectComboBox : " + elemText);
//        } catch (Exception e) {
//            log.info(elemText + " comboboxında " + text + " seçimi yapılamadı.");
//            log.error("Error while filling field : " + e);
//            throw new RuntimeException(e);
//        }
    }

    protected void selectMatComboboxJS(By by, String text) throws InterruptedException {

            clickJS(by);
            Thread.sleep(750);
            clickJS(By.xpath("//mat-option/span[contains(.,'" + text + "')]"));
            
    }

    protected void selectMatComboboxJS(WebElement element, String text) throws InterruptedException {

        clickJS(element);
        Thread.sleep(500);
        clickJS(By.xpath("//mat-option/span[contains(.,'" + text + "')]"));

    }

    protected void selectComboboxByText(WebElement element, String text) throws InterruptedException {
        // String elemText = null;
        try {
            if (element.isEnabled()) {
                //   elemText = element.getText();
                Select selectBox = new Select(element);
                selectBox.selectByVisibleText(text);


            }
            //LogPASS("Value : " + text + " - SelectComboBox : " + elemText);
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    public void clickJS(By by) throws InterruptedException {

        WebElement element = element(by);
        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickJS(WebElement element) throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) getWebDriver();
        executor.executeScript("arguments[0].click();", element);
    }

    public void clickJS2(String by) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
        js.executeScript("document.querySelector('" + by + "').click();");
    }

    protected void moveToElement(By by) {
        try {
            Actions action = new Actions(getWebDriver());
            WebElement we = getWebDriver().findElement(by);
            action.moveToElement(we).build().perform();
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    protected boolean isElementExist(By by) {
        return isElementExist(by, GetData.DEFAULT_WAIT);
    }

    protected boolean isElementExist(By by, int timeSeconds) {

        boolean isExist = getWebDriver().findElements(by).size() > 0;
        getWebDriver().manage().timeouts().implicitlyWait(DRIVER_WAIT_TIME);

        return isExist;
    }

    protected String getValueOfElement(By by, int... index) {
        String value = null;

        try {
            if (index.length == 0) {
                value = getWebDriver().findElement(by).getAttribute("value");
            } else {
                value = getWebDriver().findElements(by).get(index[0]).getAttribute("value");
            }
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);

            throw new RuntimeException(e);
        }
        return value;
    }

    public int getRandomNumberInRange(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public void clearText(By by, int... index) throws InterruptedException {

        WebElement element = null;
        element = findElement(by, index);
        element.clear();
        //element.sendKeys(Keys.CONTROL + "a");
        //element.sendKeys(Keys.DELETE);
        //log.info("Text Box silindi");
    }

    /**
     * Use this method to simulate typing into an element if it is enable. Send
     * enter if pressEnter is true, do nothing otherwise. Note : Before sending
     * operation, element is cleared.
     *
     * @param by
     * @param text
     * @param pressEnter
     * @throws InterruptedException
     */
    protected void sendKeys(By by, String text, boolean pressEnter, int... index) throws InterruptedException {

        WebElement element = null;
        String elemText = null;
        try {
            element = findElement(by, index);
            if (element.isEnabled()) {
                //   elemText = element.getText();
                element.clear();
                element.sendKeys(text);
                if (pressEnter) {
                    waitLoaderBox();
                    element.sendKeys(Keys.ENTER);
                }
            }
            //LogPASS("Value : " + text + " - SendKeys : " + elemText);
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Use this method to simulate typing into an element if it is enable. Note
     * : Before sending operation, element is cleared.
     *
     * @param by
     * @param text
     * @throws InterruptedException
     */
    protected void sendKeys(By by, String text, int... index) throws InterruptedException {
        sendKeys(by, text, false, index);
    }

    /**
     * Use this method to simulate typing into an element if it is enable. Send
     * enter if pressEnter is true, do nothing otherwise. Note : Before sending
     * operation, element is cleared.
     *
     * @param text
     * @param by
     * @throws InterruptedException
     */
    protected void sendKeys(By by, String text) throws InterruptedException {
        WebElement element = null;
        String elemText = null;
        try {
            element = findElement(by);
            if (element.isEnabled()) {
                //  elemText = element.getText();
                element.sendKeys(text);
            }
            //LogPASS("Value : " + key.toString() + " - SendKeys : " + elemText);
        } catch (Exception e) {
            log.error("Error while filling field : " + e);

            throw new RuntimeException(e);
        }
    }

    public void waitForElement(By by, int... index) throws InterruptedException {
        waitLoaderBox();
        findElement(by, index);
    }

    public void waitLoaderBox() throws InterruptedException {
        waitLoaderBox(GetData.DEFAULT_WAIT_LOADERBOX);// 90
    }

    public static String getSysDate() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        String sysDate = dtf.format(now);

        return sysDate;
    }

    public void control(boolean statement, String onTrue, String onFalse) {
        if (statement == true) {
            log.info(onTrue);
        } else {
            log.error(onFalse);
            Assert.assertTrue(false);
        }

    }

    /**
     * @Usage to scrool page on vertical side and horizontal page
     * Don't use like below
     * {@code ...
     * JavascriptExecutor jsx = (JavascriptExecutor) driver;
     * jsx.executeScript("window.scrollBy(0,350)", "");
     * -->
     * scroolMainWindow(0,350);
     * }
     */
    protected void scrollMainWindow(int numberX, int numberY) throws InterruptedException {

        ((JavascriptExecutor) getWebDriver()).executeScript("window.scrollBy('" + numberX + "','" + numberY + "')", "");

    }

    // Element gelene kadar bekler
    protected void waitElement(By by) throws InterruptedException {
        boolean durum = getTextOfElement(by).length() > 0;
        int i = 0;
        while (!durum) {
            Thread.sleep(2000);
            durum = getTextOfElement(by).length() > 0;
            i += 2;
            if (i == 40) {
                log.info("Element gelmemektedir");
                break;
            }
        }

    }

    public static String changeDateFormat(String strDate) throws ParseException {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat yy = new SimpleDateFormat("yyyy-MM-dd");
        Date actualDate = null;

        if (strDate.contains("-") && (strDate != null && !strDate.isEmpty())) {
            actualDate = yy.parse(strDate);
            strDate = myFormat.format(actualDate);
        }

        return strDate;
    }

    public static String getSysDate3() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        String sysDate = dtf.format(now);

        return sysDate;
    }

    protected WebElement findElementOnTableByColumnInputInAllPagesSS(By by, int columnIndex, String columnInput) throws InterruptedException {
        waitElement(by);
        WebElement element = null;
        while (element == null) {
            element = tablodaKontrolXX(by, columnIndex, columnInput);
            if (element == null) {
                if (element.isDisplayed() == false) {
//                    System.out.println("Element tablodaki hiç bir sayfada bulunamadı.");
                    return null; // Element hiç bir sayfada bulunamazsa null döner.
                }
            }
        }
//        System.out.println("Tabloda element bulundu.");
        return element;
    }

    protected WebElement tablodaKontrolXX(By by, int columnIndex, String columnInput) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {
            try {
                elem = row.findElements(By.tagName("td")).get(columnIndex - 1);
                row.findElements(By.tagName("i")).get(0).click();
                if (elem.getText().equals(columnInput)) {
                    return row;
                }
            } catch (IndexOutOfBoundsException index) {
                continue;
            }

//            log.info("Seçilen Kolon İçerikleri: " + elem.getText());
//            if (elem.getText().equals(columnInput)) {
//                return row;
//            }
        }
        return null;
    }

    /**
     * Use this method to find elements by cssSelector
     *
     * @param by
     * @return A list of WebElements, or an empty if nothing matches
     */
    protected List<WebElement> findElements(By by) {
        List<WebElement> webElements = null;
        untilElementAppear(by);
        try {
            webElements = getWebDriver().findElements(by);
        } catch (Exception e) {
            log.error("Error while listing webelements by css selector : " + e);
            throw new RuntimeException(e);
        }
        return webElements;
    }

    protected ArrayList<String> findElementOnTableByColumnInputInAllPages2(By by, int columnIndex, String columnInput) throws InterruptedException {
        waitElement(by);
        ArrayList<String> element = null;
        while (element == null) {
            element = tablodaKontrol2(by, columnIndex, columnInput);
        }
        return element;
    }

    protected ArrayList<String> findElementOnTableByColumnInputInAllPages3(By by, int columnIndex1, int columnIndex2, String columnInput1, String columnInput2) throws InterruptedException {
        waitElement(by);
        ArrayList<String> element = null;
        while (element == null) {
            element = tablodaKontrol3(by, columnIndex1, columnIndex2, columnInput1, columnInput2);
        }
        return element;
    }

    protected ArrayList<String> tablodaKontrol2(By by, int columnIndex, String columnInput) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));
        ArrayList<String> allRowVal = new ArrayList<String>();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {

            elem = row.findElements(By.tagName("td")).get(columnIndex - 1);
            if (elem.getText().contains(columnInput)) {
                allRowVal.add(row.getText());
            }
        }
        return allRowVal;
    }

    protected ArrayList<String> tablodaKontrol3(By by, int columnIndex1, int columnIndex2, String columnInput1, String columnInput2) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));
        ArrayList<String> allRowVal = new ArrayList<String>();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));

        rowCount = allRows.size();
        if (rowCount == 0)
            return null;
        WebElement elem1 = null;
        WebElement elem2 = null;
        for (WebElement row : allRows) {
            elem1 = row.findElements(By.tagName("td")).get(columnIndex1 - 1);
            elem2 = row.findElements(By.tagName("td")).get(columnIndex2 - 1).findElement(By.tagName("a"));
            String content = elem2.getAttribute("data-original-title");
            if (elem1.getText().contains(columnInput1) && content.contains(columnInput2)) {
                allRowVal.add(row.getText() + " " + content);
            }
        }
        return allRowVal;
    }

    public String trGununTarihi() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        log.info(dtf.format(now)); // 2016/11/16 12:08:43
        String sysDate = dtf.format(now);
        return sysDate;
    }

    protected WebElement findElementOnTableByColumnInputInAllPagesS(By by, int columnIndex, String columnInput) throws InterruptedException {
        waitElement(by);
        WebElement element = null;
        while (element == null) {
            element = tablodaKontrolX(by, columnIndex, columnInput);
            if (element == null) {
                if (element.isDisplayed() == false) {
//                    System.out.println("Element tablodaki hiç bir sayfada bulunamadı.");
                    return null; // Element hiç bir sayfada bulunamazsa null döner.
                }
            }
        }
//        System.out.println("Tabloda element bulundu.");
        return element;
    }

    protected WebElement findElementOnTableByColumnInputFromTarife(By by, int columnIndex, String columnInput) throws InterruptedException {
        waitElement(by);
        WebElement element = null;
        while (element == null) {
            element = tablodaKontrolFromTarife(by, columnIndex, columnInput);
            if (element == null) {
                if (element.isDisplayed() == false) {
//                    System.out.println("Element tablodaki hiç bir sayfada bulunamadı.");
                    return null; // Element hiç bir sayfada bulunamazsa null döner.
                }
            }
        }
//        System.out.println("Tabloda element bulundu.");
        return element;
    }

    protected WebElement tablodaKontrolX(By by, int columnIndex, String columnInput) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {
            try {
                elem = row.findElements(By.tagName("td")).get(columnIndex - 1);
                elem.findElements(By.tagName("i")).get(0).click();

//                if (GetData.browserName.equals("Firefox")) {
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("personal_video") && columnInput.contains("ANALOG KABLOTV")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("ondemand_video") && columnInput.contains("KABLOTV")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("router") && columnInput.contains("KABLONET")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("phone") && columnInput.contains("KABLOSES-NCS")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("local_movies") && columnInput.contains("FİLMBOX LİVE")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("vpn_key") && columnInput.contains("CİHAZ KİRALAMA")) {
//                        return row;
//                    }
//                    if (elem.findElements(By.tagName("i")).get(0).getText().contains("pin_drop") && columnInput.contains("SABİT IP")) {
//                        return row;
//                    }
//
//                }
                // if (GetData.browserName.equals("Chrome")) {
                if (elem.findElements(By.tagName("i")).get(0).getAttribute("data-original-title").equals(columnInput)) {
                    return row;
                }
                //}
            } catch (IndexOutOfBoundsException index) {
                continue;
            }

//            log.info("Seçilen Kolon İçerikleri: " + elem.getText());
//            if (elem.getText().equals(columnInput)) {
//                return row;
//            }
        }
        return null;
    }

    protected WebElement tablodaKontrolFromTarife(By by, int columnIndex, String columnInput) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {
            try {
                elem = row.findElements(By.tagName("td")).get(columnIndex - 1);

                if (elem.getText().equals(columnInput)) {
                    return row;
                }
            } catch (IndexOutOfBoundsException index) {
                continue;
            }

//            log.info("Seçilen Kolon İçerikleri: " + elem.getText());
//            if (elem.getText().equals(columnInput)) {
//                return row;
//            }
        }
        return null;
    }

    protected ArrayList<WebElement> findElementOnTableByColumnInputInAllPages2X(By by, String hizmet) throws InterruptedException {
        waitElement(by);
        ArrayList<WebElement> element = null;
        while (element == null) {
            element = tablodaKontrol2X(by, hizmet);
        }

        return element;
    }

    protected ArrayList<WebElement> tablodaKontrol2X(By by, String hizmet) throws InterruptedException {
        int rowCount = 0;
        By data = By.cssSelector("[data-original-title='" + hizmet + "']");
        waitElement(data);
        click(data);
        boolean durum = getWebDriver().findElement(data).isDisplayed();

        while (!durum) {
            waitElement(data);
            durum = getWebDriver().findElement(data).isDisplayed();
        }

        WebElement table = findElement(by).findElement(By.tagName("tbody"));
        ArrayList<WebElement> allRowVal = new ArrayList<WebElement>();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        String getTextData = getTextOfElement(data);


        for (int i = 0; i < rowCount; i++) {

            if (allRows.get(i).getText().contains(getTextData)) {
                allRowVal.add(allRows.get(i));
            }
        }
        if (allRows.size() == 0) {
            log.info("allRows size : " + allRows.size());
        }
        return allRowVal;
    }

    public void getDisableText(String controlText, By element) throws InterruptedException {
        boolean controlStat = true;
        int check = 10;
        while (controlStat && check > 0) {
            try {
                isElementExist(element);
                moveToElement(element);
                String ekrandakiText = getValueOfElement(element);
                if (controlText.equals(ekrandakiText))
                    controlStat = false;
            } catch (Exception e) {
                Thread.sleep(1000);
                check--;
            }
        }
    }

    protected void selectCombobox(By by, String value) throws InterruptedException {
        WebElement element = findElement(by);
        // String elemText = null;
        try {
            if (element.isEnabled()) {
                //    elemText = element.getText();
                Select selectBox = new Select(findElement(by));
                selectBox.selectByValue(value);
            }
        } catch (Exception e) {
            log.error("Error while filling field : " + value + " - " + e);

            throw new RuntimeException(e);
        }

    }

    public String trGununTarihi2() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        log.info(dtf.format(now)); // 2016/11/16 12:08:43
        String sysDate = dtf.format(now);
        return sysDate;
    }

    public String trGununTarihi3() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDateTime now = LocalDateTime.now();
        log.info(dtf.format(now)); // 2016/11/16 12:08:43
        String sysDate = dtf.format(now);
        return sysDate;
    }

    protected WebElement findElementOnTableByColumnInputInAllPages(By by, int columnIndex, String columnInput) throws InterruptedException {
        waitElement(by);
        WebElement element = null;
        while (element == null) {
            element = tablodaKontrol(by, columnIndex, columnInput);
            if (element == null) {
                if (element.isDisplayed() == false) {
//                    System.out.println("Element tablodaki hiç bir sayfada bulunamadı.");
                    return null; // Element hiç bir sayfada bulunamazsa null döner.
                }
            }
        }
//        System.out.println("Tabloda element bulundu.");
        return element;
    }

    protected WebElement tablodaKontrol(By by, int columnIndex, String columnInput) throws InterruptedException {
        int rowCount = 0;
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        WebElement table = findElement(by).findElement(By.tagName("tbody"));

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {
            try {
                elem = row.findElements(By.tagName("td")).get(columnIndex - 1);
            } catch (IndexOutOfBoundsException index) {
                continue;
            }
            log.info("Seçilen Kolon İçerikleri: " + elem.getText());
            if (elem.getText().equals(columnInput)) {
                return row;
            }
        }
        return null;
    }

    protected void selectComboboxByTextContains(By by, String text) throws InterruptedException {
        WebElement element = findElement(by);
        //   String elemText = null;
        try {
            if (element.isEnabled()) {
                //      elemText = element.getText();
                Select selectBox = new Select(getWebDriver().findElement(by));
                for (int i = 0; i < selectBox.getOptions().size(); i++) {
                    log.info("test" + i + selectBox.getOptions().get(i).getText());
                    if (selectBox.getOptions().get(i).getText().contains(text)) {
                        selectBox.getOptions().get(i).click();
                        break;
                    }
                }
            }
            //LogPASS("Value : " + text + " - SelectComboBox : " + elemText);
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    protected String getDataErrorOfElement(By by, int... index) {
        String title = null;

        try {
            if (index.length == 0) {
                title = getWebDriver().findElement(by).getAttribute("data-error");
            } else {
                title = getWebDriver().findElements(by).get(index[0]).getAttribute("data-error");
            }
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);
            throw new RuntimeException(e);
        }
        return title;
    }

    protected void selectComboboxByIndex(By by, int index) throws InterruptedException {
        WebElement element = findElement(by);
        try {
            if (element.isEnabled()) {
                Select selectBox = new Select(findElement(by));
                for (int i = 0; i < GetData.DEFAULT_WAIT; i++) {
                    if (selectBox.getAllSelectedOptions().size() >= 1) {
                        break;
                    }
                }
                selectBox.selectByIndex(index);
            }
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    /**
     * Usage:
     * It is able to pass WebElement Parameter to function from "List<WebElement>" which index is known.
     * {@code
     * moveToElement(charts.get(0));
     * moveToElement(charts.get(2));
     * moveToElement(charts.get(i));
     * }
     *
     * @param we
     * @author kurtulus.akkaya
     */
    protected void moveToElement(WebElement we) {
        try {
            Actions action = new Actions(getWebDriver());
            action.moveToElement(we).build().perform();
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
    }

    protected String checkComboboxSelectedValue(By by) throws InterruptedException {
        WebElement element = findElement(by);
        String elemText = null;
        try {
            if (element.isEnabled()) {
                //  elemText = element.getText();
                Select selectBox = new Select(findElement(by));
                return selectBox.getFirstSelectedOption().getText();
                //selectBox.selectByValue(value);
            }
            //LogPASS("Value : " + value + " - SelectComboBox : " + elemText);
        } catch (Exception e) {
            log.error("Error while filling field : " + e);
            throw new RuntimeException(e);
        }
        return "";
    }

    protected String getTitleOfElement(By by, int... index) {
        String title = null;

        try {
            if (index.length == 0) {
                title = getWebDriver().findElement(by).getAttribute("title");
            } else {
                title = getWebDriver().findElements(by).get(index[0]).getAttribute("title");
            }
        } catch (Exception e) {
            log.error("Error while getting text of element : " + e);
            throw new RuntimeException(e);
        }
        return title;
    }

    public String formatterKampanyaFiyat(String val) {
        int i = val.indexOf('.');
        if (val.length() - i > 2) {
            String aktvKampanyaFiyat = val.substring(0, i) + "." + val.substring(i + 1, i + 3) + " ₺";
            return aktvKampanyaFiyat;
        } else {
            String aktvKampanyaFiyat = val.substring(0, i) + "." + val.substring(i + 1) + "0" + " ₺";
            return aktvKampanyaFiyat;
        }
    }

    public String formatterGecerliSure(int val) {
        return val + " Ay";
    }

    public void ClearText(By by, int... index) throws InterruptedException {

        WebElement element = null;

        element = findElement(by, index);
        element.clear();
        //element.sendKeys(Keys.CONTROL + "a");
        //element.sendKeys(Keys.DELETE);
        log.info("Text Box silindi");
    }

    protected ArrayList<String> findColumnOnTableByColumnInputInAllPages(By by, int columnIndex, String columnInput, int returnCol1, int returnCol2, int returnCol3) throws InterruptedException {
        waitElement(by);
        ArrayList<String> element = null;
        while (element == null) {
            element = tablodaKontrolReturnColumn(by, columnIndex, columnInput, returnCol1, returnCol2, returnCol3);
        }
        return element;
    }

    protected ArrayList<String> tablodaKontrolReturnColumn(By by, int columnIndex, String columnInput, int returnCol1, int returnCol2, int returnCol3) throws InterruptedException {
        int rowCount = 0;
        WebElement table = findElement(by).findElement(By.tagName("tbody"));
        ArrayList<String> allRowVal = new ArrayList<String>();

        List<WebElement> allRows = table.findElements(By.tagName("tr"));
        rowCount = allRows.size();
        if (rowCount == 0)
            return null;

        WebElement elem = null;
        for (WebElement row : allRows) {

            elem = row.findElements(By.tagName("td")).get(columnIndex - 1);
            if (elem.getText().equals(columnInput)) {
                allRowVal.add(row.findElements(By.tagName("td")).get(returnCol1 - 1).getText());
                allRowVal.add(row.findElements(By.tagName("td")).get(returnCol2 - 1).getText());
                allRowVal.add(row.findElements(By.tagName("td")).get(returnCol3 - 1).getText());

            }
        }
        return allRowVal;
    }

    public ArrayList<String> waitElementAppear() {
        waitForExpectedElement(btnConfirm, 5);
        return null;

    }

    public void uploadFile(By by, String pathToFile) {
        try {
            getWebDriver().findElement(by).sendKeys(pathToFile);
            log.info("File uploaded.");
            Thread.sleep(1000);
        } catch (Exception e) {
            log.error("Error in attaching file.s : " + e);
            throw new RuntimeException(e);
        }
    }
    public void switchWindowTab() throws InterruptedException {
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(getWebDriver().getWindowHandles());
        getWebDriver().switchTo().window(tabs.get(0));
        getWebDriver().close();
        getWebDriver().switchTo().window(tabs.get(1));
        log.info(getWebDriver().getCurrentUrl());
    }
}