package com.fdmgroup.Utilities;

import java.net.MalformedURLException;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AppiumDriver {

    private static final String appium_Host = "127.0.0.1";
    private static final int appiumPort = 4723;
    private static final String deviceName = "appiumDevice";
    // private static final String application = "C:\\Users\\kevin\\Mobile-Testing-Appium\\src\\test\\java\\com\\fdmgroup\\APK\\ApiDemos-debug.apk";
    private static final String application = "C:\\Users\\kevin\\Mobile-Testing-Appium\\src\\test\\java\\com\\fdmgroup\\APK\\ngf.apk";

    protected static AndroidDriver driver;
    protected AppiumDriverLocalService service;

    public void setUpAndroid() throws MalformedURLException {
        service = new AppiumServiceBuilder()
                .withIPAddress(appium_Host)
                .usingPort(appiumPort)
                .build();
        service.start();

        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setDeviceName(deviceName)
                .setApp(application)
                .setAutomationName("UiAutomator2");

        uiAutomator2Options.setCapability("appium:enableMultiWindows", true);

        driver = new AndroidDriver(service.getUrl(), uiAutomator2Options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

}
