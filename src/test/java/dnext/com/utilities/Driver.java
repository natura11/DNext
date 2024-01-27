package dnext.com.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {


        private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

        private Driver() {

        }

        public static WebDriver getDriver() {

            if (driverPool.get() == null){


                String browserType = ConfigurationReader.getProperty("browser");



                switch (browserType){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        ChromeOptions chromeOptions = new ChromeOptions();
                        //chromeOptions.addArguments("lang=en-GB");
                        chromeOptions.addArguments("lang=tr");
                        driverPool.set(new ChromeDriver(chromeOptions));
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;

                    case "safari":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new SafariDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                        break;

                }
            }

            return driverPool.get();

        }


        public static void closeDriver(){
            if (driverPool.get() != null){
                driverPool.get().quit();
                driverPool.remove();
  }

    }
}
