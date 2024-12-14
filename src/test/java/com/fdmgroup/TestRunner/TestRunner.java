package com.fdmgroup.TestRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/java/com/fdmgroup/CucumberFeatures", glue = "com.fdmgroup",
        plugin = {
            "pretty" }, dryRun = false, publish = true, monochrome = true,
            tags="@ClickingNotificationsMenu"
)
public class TestRunner {

}
