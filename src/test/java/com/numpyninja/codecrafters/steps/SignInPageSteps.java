package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps {
	
	private SignInPage signinPage =new SignInPage(DriverFactory.getDriver());
	
	@Given("User is on the LoginPage")
	public void user_is_on_the_login_page() {
		
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		
	}

	@When("User clicks on Signin button")
	public void user_clicks_on_signin_button() {
		signinPage.clickOnSignin();
	  
	}

	@Then("An error message {string}  is displayed below Username textbox")
	public void an_error_message_is_displayed_below_username_textbox(String Pleasefilloutthisfield) {
	    Assert.assertTrue(signinPage.Pleasefilloutthisfield());
	}

	@When("User enters valid Username into the username textbox")
	public void user_enters_valid_username_into_the_username_textbox(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		signinPage.enterUsername("Numpyninja");
		
	    
	}

	@Then("An error message {string}  is displayed below Password textbox")
	public void an_error_message_is_displayed_below_password_textbox(String Pleasefilloutthisfield) {
		Assert.assertTrue(signinPage.Pleasefilloutthisfield());
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		signinPage.enterUsername("Numpyninja");
		signinPage.enterPassword("Codecrafters@123");
	    
	}

	@Then("A message You are logged in is displayed")
	public void a_message_is_displayed_below_password_textbox(String string) { 
		Assert.assertTrue(signinPage.isMessageExist());
	    
	}

	@When("User clicks signout button")
	public void user_clicks_signout_button() {
		signinPage.clickOnSignout();
	    
	}

	@Then("A message You are logged out is displayed")
	public void a_message_is_displayed(String string) {
		Assert.assertTrue(signinPage.isMessageExist());
	}
	
	@When("User enters Invalid username and password")
	public void user_enter_invalid_username_and_password(io.cucumber.datatable.DataTable dataTable) {
	signinPage.enterUsername("djhdbchbd");
	signinPage.enterPassword("nnnmnfgsfgs");
	}
	
	@Then("An error message Invalid username and password is displayed")
	public void a_error_message_is_displayed(String string) {
		Assert.assertTrue(signinPage.isMessageExist());
	}
}
