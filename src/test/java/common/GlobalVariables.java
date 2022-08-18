package common;

public class GlobalVariables {

    //OS name
    public static final String OS_NAME = System.getProperty("os.name").toLowerCase();

    //Project path
    public static final String PROJECT_PATH = System.getProperty("user.dir");

    //Driver variables
    public static final String CHROME_DRIVER_MAC = "src/test/java/driverManager/driver/chromedriver";
    public static final String CHROME_DRIVER_WIN = PROJECT_PATH + "/src/test/java/driverManager/driver/chromedriver.exe";

    //Execution parameters
    public static String RUN_ON = "Web";
    public static String BROWSER = "Chrome";
}
