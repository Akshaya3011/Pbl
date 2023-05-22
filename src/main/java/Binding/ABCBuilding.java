package Binding;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ABCBuilding {
	
	@Given("I am {string}")
	public void i_am(String string) {
	    System.out.println("I am Akshaya");
	}

	@When("I do B")
	public void i_do_b() {
		System.out.println(" I do B");
	}

	@Then("I get C")
	public void i_get_c() {
		System.out.println("I get C");
	    
	}
	@Given("I am reading a name and age")
	public void i_am_reading_a_name_and_age(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists(String.class);
		System.out.println(data.get(0).get(0));
		System.out.println(data.get(1).get(0));
	    
	}

	@When("I enter the above provided name")
	public void i_enter_the_above_provided_name() {
	    
	}







}
