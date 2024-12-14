package com.fdmgroup.Utilities;

public class ApplicationUtilities extends AppiumDriver {

    public static void resetDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }


    public static void sleep(double scale) {
        try {
            Thread.sleep((long) (scale * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

}
