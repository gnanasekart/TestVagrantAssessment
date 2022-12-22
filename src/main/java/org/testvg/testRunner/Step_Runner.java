package org.testvg.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/main/resources/Features/RCB_Team_Player_Details.feature"},
        glue = {"src/main/java/org/testvg/StepDefinitions/Player_Details_Step_Definitions.java"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"},
        monochrome = true,
        tags = "not @ignore")
public class Step_Runner {
}
