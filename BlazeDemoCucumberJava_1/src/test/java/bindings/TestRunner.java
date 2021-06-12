package bindings;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles",
				glue = {"actions"},
				monochrome=true,
				plugin = {"pretty","html:target/HTMLReports", "pretty","json:target/JSONReports/jsonreport.json","pretty","junit:target/JUnitReports/junitreport.xml"},
				tags = "@SmokeTest"
)
public class TestRunner {

}
