package testRunner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@RunWith(Cucumber.class)

@CucumberOptions(
			features={"src/test/resources/features"},
			glue={"StepDefinition"},
 			monochrome=true,
 			dryRun = false,
			plugin={
					"pretty", "json:target/Cucumber.json",
					"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"pretty", "html:target/Login_dsAlgoReport.html"
					}
		
			
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
}