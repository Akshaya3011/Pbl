package IntroductionToBDD;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupBinding {
	
	public static String Url = "https://www.linkedin.com/";
	
	@Given("I Launch the LinkedIn Application")
	public void i_launch_the_linked_in_application() {
	   System.out.println("I Launch the LinkedIn Application");
	}

	@When("I Entered the EmailId")
	public void i_entered_the_email_id() {
		System.out.println("I Entered the EmailId");
	    
	}

	@Then("I Clicked the Agree and Join")
	public void i_clicked_the_agree_and_join() {
		System.out.println("I Clicked the Agree and Join");
	    
	}

	@Then("I successfully Logined")
	public void i_successfully_logined() {
		System.out.println("I successfully Logined");
	    
	}




}
