package com.numpyninja.codecrafters.steps;
import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.HomePage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	

	private HomePage homePage=new HomePage(DriverFactory.getDriver());
	
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@When("User clicks on Get Started button on homepage {string} without login")
	public void user_clicks_on_get_started_button_on_homepage_without_login(String string) {
	    
		  homePage.getStartedForModules(string);
		
	}

	@Then("User gets warning message {string}")
	public void user_gets_warning_message(String string) {
		 String msg= homePage.alertmsg();
		   Assert.assertEquals(msg, string, "Title do not match");
	}

	@When("User clicks on DatastructuresDropdown {string}")
	public void user_clicks_on_datastructures_dropdown(String string) {
		homePage.clickOnDropdown(string);
	}

	@Then("Sign in link should be displayed")
	public void sign_in_link_should_be_displayed() {
		Boolean value=homePage.displaySiginLink();
		Assert.assertTrue(value, "Signin link not displayed");
		
	}

	@Then("Register link should be displayed")
	public void register_link_should_be_displayed() {
		Boolean value=homePage.displayRegisterLink();
		Assert.assertTrue(value, "Register link not displayed");
	}

	@When("User click on signin link")
	public void user_click_on_signin_link() {
		homePage.clickOnSignIn();
	}

	@Then("User lands on Signin page with title {string}")
	public void user_lands_on_signin_page_with_title(String string) {
		 String msg= homePage.getPageTitle();
		   Assert.assertEquals(msg, string, "Title do not match");
	}

	@When("User click on register link")
	public void user_click_on_register_link() {
		  homePage.click_register();
	}

	@Then("User lands on Register page with title {string}")
	public void user_lands_on_register_page_with_title(String string) {
		 String msg= homePage.getPageTitle();
		 Assert.assertEquals(msg, string, "Title do not match");
	}


	
}
