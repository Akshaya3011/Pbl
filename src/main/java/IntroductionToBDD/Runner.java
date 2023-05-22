package IntroductionToBDD;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/AK20464076/Documents/training/irctc/src/main/java/IntroductionToBDD/Signup.feature"
		,glue={"IntroductionToBDD.SignupBinding"}
		)

public class Runner {

}
