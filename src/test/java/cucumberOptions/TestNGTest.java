package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Features", glue = "StepDefinition", monochrome = true, tags = "@PlaceOrder or @SearchOrder", 
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "rerun:target/failed_scenarios.txt " })
public class TestNGTest extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)

	public Object[][] scenarios() {
		return super.scenarios();
	}

}
