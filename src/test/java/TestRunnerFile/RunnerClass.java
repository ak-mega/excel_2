package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
 features="Features",
 glue= "Stepdefinitionfile",
 dryRun = false,
 monochrome = true,
 plugin= {"pretty","html:trget/cucumber-reports/reports_html.html"}
		        )



public class RunnerClass {

	// empty
}
