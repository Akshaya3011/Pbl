package Runnner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/AK20464076/Documents/training/irctc/src/main/java/Feature/ABC.feature"
		,glue={"Binding"},
		tags = "@ABC",
		dryRun = true,
		monochrome = true
		//plugin = { "pretty", "html:target/cucumber-reports"}
		)
public class Runner {
	
	

}
