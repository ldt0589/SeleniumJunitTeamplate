package driverManager;

import common.GlobalVariables;

public class DriverFactory {

    public static void initializeDriver() {

        switch (GlobalVariables.RUN_ON.toLowerCase()) {
            case "headspin":
                System.out.println("TBD");
                break;
            case "web":
                LocalDriver localDriver = new LocalDriver();
                localDriver.setDriver(GlobalVariables.BROWSER);
                break;
            default:
                System.out.println("Our framework does not support this platform: " + GlobalVariables.BROWSER);
                break;
        }
    }

    public static void shutDownDriver() {
        LocalDriver.getDriver().quit();
    }
}
