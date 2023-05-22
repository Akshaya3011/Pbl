package Binding;

import Pages.NykaaHomePage;
//import Pages.NykaaHomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NykaaSearchingBinding {
	
	public String SearchData = "Lipstick";
	
	@Given("I Launch the Application")
	public void i_launch_the_application() {
	    
	}

	@When("I Clicked on Search areas")
	public void i_clicked_on_search_areas() {
		
		NykaaHomePage.ClickAndEnterETextInSearchArea(SearchData);
	    
	}

	@When("I verified that search results")
	public void i_verified_that_search_results() {
	      
	}

	@When("I Entered the productNames")
	public void i_entered_the_product_names() {
	   
	}

	@Then("I Selected the data from suggestions")
	public void i_selected_the_data_from_suggestions() {
	    
	}




}
