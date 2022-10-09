package stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
		
		// to get report we have run only runner class only
		
		monochrome =true, //unneccery things won't come
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},// for report in html format . traget : index :open with browser
		features = "src/test/java/features", // feature file path
		glue = "stepdef", // package path
		tags = {"@sanity"} // tag for particular Scenario
		//tags = { "@sanity or @Regression" } // tag for multiple Scenario

)

public class TestRunner {

}
