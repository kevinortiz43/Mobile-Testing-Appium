package com.fdmgroup.StepDefinitions;


import com.fdmgroup.Utilities.AppiumDriver;

import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sendingMessageToTextBox extends AppiumDriver {

    @Given("User is on main page")
    public void user_is_on_main_page() {
        driver.findElement(AppiumBy.accessibilityId("App")).click();

    }

    @When("User clicks App page")
    public void user_clicks_app_page() {
        driver.findElement(AppiumBy.accessibilityId("Notification")).click();
    }

    @Then("User clicks the Notifications page")
    public void user_clicks_the_notifications_page() {
        driver.findElement(AppiumBy.accessibilityId("IncomingMessage")).click();
    }

    @When("User clicks the Incoming Message button")
    public void user_clicks_the_incoming_message_button() {
        driver.findElement(AppiumBy.accessibilityId("IncomingMessage")).click();
    }

    @When("Verify the API Demo notification is displayed")
    public void verify_the_api_demo_notification_is_displayed() {
        driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/permission_message")).isDisplayed();
    }

    @Then("User clicks the Allow button to clear the notification")
    public void user_clicks_the_allow_button_to_clear_the_notification() {
        // driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).isDisplayed();
        // driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.android.permissioncontroller:id/permission_allow_button\"]")).click();

    }

}
