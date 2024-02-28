package com.numpyninja.codecrafters.steps;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());
	private HomePage homePage;

	
	@Given("User is on the HomePage")
	public void user_is_on_the_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}
	
	@Given("User is on the HomePage after successful signin")
	public void user_is_on_the_home_page_after_successful_signin() {
		//List<Map<String, String>> credList = credTable.asMaps();
		//String userName = credList.get(0).get("username");
		//String password = credList.get(0).get("password");
		String userName = "NumpyNinja";
		String password = "NumpyNinja";
		DriverFactory.getDriver()
				.get("https://dsportalapp.herokuapp.com/login");
		//homePage = signInPage.doLogin(userName, password);
	}

	@When("User clicks on element DatastructuresDropdown")
	public void user_clicks_on_element_datastructures_dropdown() {
		
		
	    
	}

	@Then("Verify all the links in DataStructureNavMenuItems\"")
	public void verify_all_the_links_in_data_structure_nav_menu_items(io.cucumber.datatable.DataTable dataTable) {
	   
		
		
	}

	@Then("Dropdown section count should be {int}")
	public void dropdown_section_count_should_be(Integer int1) {
	   
		
		
	}

	@Then("Sign in link should be displayed")
	public void sign_in_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("Register link should be displayed")
	public void register_link_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on link Arrays")
	public void user_clicks_on_link_arrays() {
	  
	}

	@Then("You are not logged in message should be displayed")
	public void you_are_not_logged_in_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on Data Structures-Introduction GetStartedButton")
	public void user_clicks_on_data_structures_introduction_get_started_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
