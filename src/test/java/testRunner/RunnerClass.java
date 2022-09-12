package testRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\Workspace\\LIFETIME\\LifetimeDemo\\src\\test\\resources\\features\\dynamics.feature", 
		glue = {"stepDefinitions","com.hooks"},
	plugin={"pretty","json:target/jsonReports/cucumber-report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		tags = "@tag_accountpipeline"
		)
public class RunnerClass {

}