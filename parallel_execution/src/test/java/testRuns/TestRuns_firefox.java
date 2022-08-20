package testRuns;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"src\\test\\resources\\features\\firefox"},
		glue = {"stepDefinations"},
		monochrome = true,
		dryRun = false
		)

public class TestRuns_firefox extends AbstractTestNGCucumberTests{

}
