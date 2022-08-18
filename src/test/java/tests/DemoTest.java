package tests;

import common.TestBase;
import driverManager.DriverFactory;
import driverManager.LocalDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DemoTest extends TestBase {

    @BeforeEach
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @Test
    @Tag("DemoTest")
    public void demo() throws IOException {
        WebDriver driver = LocalDriver.getDriver();
        driver.get("https://cacert.org/");
    }

    @AfterEach
    public void afterTest() {
        System.out.println("After Test");
    }
}
