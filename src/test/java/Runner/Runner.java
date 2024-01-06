package Runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;





@CucumberOptions(
			features="src/test/resources/features",
			glue={"PageObject", "StepDefinition"},
			plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

public class Runner extends AbstractTestNGCucumberTests {

}