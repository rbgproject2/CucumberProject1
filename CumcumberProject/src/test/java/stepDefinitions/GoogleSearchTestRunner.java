package stepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit .Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/GoogleSearch.feature", glue={"stepDefinitions"},
monochrome = true,
//plugin = {"pretty","html:target/HtmlReports"}
//plugin = {"pretty","json:target/JsonReports/Report.json"}
//plugin = {"pretty","junit:target/JUnitReports/report.xml"}
plugin = {"pretty","html:target/HtmlReports",
		"json:target/JsonReports/Report.json",
"junit:target/JUnitReports/report.xml"}  )
public class GoogleSearchTestRunner {

}