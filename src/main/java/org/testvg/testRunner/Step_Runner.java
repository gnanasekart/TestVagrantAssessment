package org.testvg.testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {
        "src/main/resources/Features/RCB_Team_Player_Details.feature"},
        glue = {"org.testvg.StepDefinitions"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json"})
public class Step_Runner {
}
