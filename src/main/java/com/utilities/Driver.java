package com.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Driver {
    private static final InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    private Driver() {}

    public static WebDriver getDriver() {

        if (driverPool.get() == null) {
            String browserType = ConfigurationReader.getProperty("browser");
            driverPool.set(switch (browserType) {
                case "firefox" -> new FirefoxDriver(firefoxOptions());
                case "safari" -> new SafariDriver();
                case "grid" -> {
                    yield new ChromeDriver(chromeOptions());
                }
                default -> new ChromeDriver(chromeOptions());
            });
        }
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }

    public static ChromeOptions chromeOptions() {
        var options = new ArrayList<>(Arrays.asList(ConfigurationReader.getProperty("chrome_options").split(";")));
        if(ConfigurationReader.getProperty("is_headless").equalsIgnoreCase("false")) options.remove("--headless=new");
        return new ChromeOptions()
                .addArguments(options);
    }

    public static FirefoxOptions firefoxOptions() {
        var options = new ArrayList<>(Arrays.asList(ConfigurationReader.getProperty("firefox_options").split(";")));

        if(ConfigurationReader.getProperty("is_headless").equalsIgnoreCase("false")) options.add("--headless=new");
        return new FirefoxOptions()
                .addArguments(options);
    }
}
