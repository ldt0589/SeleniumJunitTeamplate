package driverManager;

import common.GlobalVariables;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class LocalDriver {

    private static WebDriver webDriver;

    public static WebDriver getDriver() {
        return webDriver;
    }

    public static WebDriver setDriver(String browser) {

            switch (browser.toLowerCase()) {
                case "chrome":
                    if (GlobalVariables.OS_NAME.contains("mac"))
                        System.setProperty("webdriver.chrome.driver", GlobalVariables.CHROME_DRIVER_MAC);
                    else if (GlobalVariables.OS_NAME.contains("windows"))
                        System.setProperty("webdriver.chrome.driver", GlobalVariables.CHROME_DRIVER_WIN);

                    ChromeOptions chrome_options = new ChromeOptions();
                    chrome_options.addArguments("--ignore-certificate-errors");
                    chrome_options.addArguments("--disable-notifications");
//                    WebDriverManager.chromedriver().setup();
                    webDriver = new ChromeDriver(chrome_options);
                    webDriver.manage().window().maximize();
                    break;
                case "edge":
                    if (GlobalVariables.OS_NAME.contains("mac"))
                        System.setProperty("webdriver.edge.driver", GlobalVariables.CHROME_DRIVER_MAC);
                    else if (GlobalVariables.OS_NAME.contains("windows"))
                        System.setProperty("webdriver.edge.driver", GlobalVariables.CHROME_DRIVER_WIN);

                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
                    webDriver = new EdgeDriver();
                    webDriver.manage().window().maximize();
                    break;
//                case "chromeheadless":
//                    chrome_options.addArguments("headless");
//                    chrome_options.addArguments("--ignore-certificate-errors");
//                    chrome_options.addArguments("--disable-dev-shm-usage");
//                    chrome_options.addArguments("--disable-notifications");
//                    chrome_options.addArguments("window-size=1280,1024");
//                    webDriver = new ChromeDriver(chrome_options);
//                    break;
                case "firefox":
                    webDriver = new FirefoxDriver();
                    break;
                case "safari":
                    webDriver = new SafariDriver();
                    break;
                default:
                    System.out.println("Our framework does not support this platform: " + browser);
                    break;
            }
        return webDriver;
    }
}