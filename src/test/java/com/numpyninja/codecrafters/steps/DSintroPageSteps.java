package com.numpyninja.codecrafters.steps;

import com.numpyninja.codecrafters.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSintroPageSteps {
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	}

	@When("User clicks Data-Structures Introduction {string} button")
	public void user_clicks_data_structures_introduction_button(String string) {
	    
	}

	@Then("User should land on page with QA and Time Complexity down")
	public void user_should_land_on_page_with_qa_and_time_complexity_down() {
	    
	}

	@Given("User on DataStructure Introduction page")
	public void user_on_data_structure_introduction_page() {
	    
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String string) {
	    
	}

	@Then("User should land {string} with {string} button down")
	public void user_should_land_with_button_down(String string, String string2) {
	    
	}

	@When("User clicks on {string} button")
	public void user_clicks_on_button(String string) {
	    
	}

	@Then("User should land on page with try editor box and Run button to test")
	public void user_should_land_on_page_with_try_editor_box_and_run_button_to_test() {
	    
	}

	@Then("User should be redirected to the practice questions page")
	public void user_should_be_redirected_to_the_practice_questions_page() {
	    
	}


}
