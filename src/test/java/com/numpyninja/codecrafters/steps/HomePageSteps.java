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
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks on Get Started button on homepage {string} without login")
	public void user_clicks_on_get_started_button_on_homepage_without_login(String string) {
	    
		  homePage.getStartedForModule(string);
		
	}

	@Then("User gets warning message {string}")
	public void user_gets_warning_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on DatastructuresDropdown {string}")
	public void user_clicks_on_datastructures_dropdown(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
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

	@When("User click on signin link")
	public void user_click_on_signin_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on Signin page with title {string}")
	public void user_lands_on_signin_page_with_title(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on register link")
	public void user_click_on_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User lands on Register page with title {string}")
	public void user_lands_on_register_page_with_title(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
}
