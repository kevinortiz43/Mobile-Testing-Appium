package com.fdmgroup.Hooks;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.TakesScreenshot;

import com.fdmgroup.Utilities.AppiumDriver;
import com.fdmgroup.Utilities.ApplicationUtilities;

import io.cucumber.java.*;

public class Hooks extends AppiumDriver {

    @Before
    public void setUp() throws MalformedURLException {
        setUpAndroid();
    }

    @After
    public void resetDriverAfterTestRuns() {
    //   ApplicationUtilities.resetDriver();

    }

    @AfterStep
    public static void screenshotAndWaitAfterStep(Scenario scenario) throws IOException {
        ApplicationUtilities.sleep(1);

        TakesScreenshot scrShot = ((TakesScreenshot) driver);
        byte[] screenshot = scrShot.getScreenshotAs(org.openqa.selenium.OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");

    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
