package com.numpyninja.codecrafters.steps;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	@Given("User is on the HomePage")
	public void user_is_on_the_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	    
	}

	@When("User clicks on element DatastructuresDropdown")
	public void user_clicks_on_element_datastructures_dropdown() {
	    HomePage.clickOnDatastructures();
	}

	@Then("Verify all the links in DataStructureNavMenuItems\"")
	public void verify_all_the_links_in_data_structure_nav_menu_items(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		HomePage.clickOnArray();
		HomePage.clickOnLinkedlist();
		HomePage.clickOnStack();
		HomePage.clickOnQueue();
		HomePage.clickOnTree();
		HomePage.clickOnGraph();
	    
	}

	@Then("Dropdown section count should be {int}")
	public void dropdown_section_count_should_be(Integer int1) {
	    
	}

	@Then("Sign in link should be displayed")
	public void sign_in_link_should_be_displayed() {
	    
	}

	@Then("Register link should be displayed")
	public void register_link_should_be_displayed() {
	    
	}

	@When("User clicks on link Arrays")
	public void user_clicks_on_link_arrays() {
	   
	}

	@Then("You are not logged in message should be displayed")
	public void you_are_not_logged_in_message_should_be_displayed() {
	    
	}

	@When("User clicks on Data Structures-Introduction GetStartedButton")
	public void user_clicks_on_data_structures_introduction_get_started_button() {
	    
	}

	@Given("User is on HomePage")
	public void user_is_on_home_page() {
	    
	}

	@When("User click on signin link")
	public void user_click_on_signin_link() {
	    
	}

	@Then("User lands on Signin page with title ........")
	public void user_lands_on_signin_page_with_title() {
	    
	}

	@When("User click on register link")
	public void user_click_on_register_link() {
	    
	}

	@Then("User lands on Register page with title ........")
	public void user_lands_on_register_page_with_title() {
	    
	}
	
}
