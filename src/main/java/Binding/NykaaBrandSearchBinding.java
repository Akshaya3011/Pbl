package Binding;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaaBrandSearchBinding {
	
	@Given("I Launched the application")
	public void i_launched_the_application() {
	   System.out.println("I Launched the application");
	}

	@When("I Hovered over the Brands Tab")
	public void i_hovered_over_the_brands_tab() {
		System.out.println("I Hovered over the Brands Tab");
	    
	}

	@When("I Searched for a valid BrandName")
	public void i_searched_for_a_valid_brand_name() {
		System.out.println("I Searched for a valid BrandName");
	    
	}

	@Then("I Verified that brandname got searched successfully")
	public void i_verified_that_brandname_got_searched_successfully() {
		System.out.println("I Verified that brandname got searched successfully");
	    
	}
	
	@Given("Hello from background")
	public void hello_from_background() {
		System.out.println("background");
	}




}
