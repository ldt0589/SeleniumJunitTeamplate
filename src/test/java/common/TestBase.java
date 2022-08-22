package common;

import driverManager.DriverFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before Class");
        DriverFactory.initializeDriver();


    }

    @AfterAll
    public static void afterClass() {
        System.out.println("After Class");
        DriverFactory.shutDownDriver();
    }
}
