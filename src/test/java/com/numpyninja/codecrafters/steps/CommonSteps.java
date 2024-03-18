package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.StaticWebPage;
import com.numpyninja.codecrafters.util.LoggerLoad;
import com.numpyninja.codecrafters.pages.SigninPage;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
	
	private SigninPage signInPage = new SigninPage(DriverFactory.getDriver());
	private HomePage homePage;
	private StaticWebPage webPage;
	
	
	@Given("user has already logged in to application with username {string} and password {string}")
	public void user_has_already_logged_in_to_application_with_username_and_password(String userName, String password) {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		homePage = signInPage.doLogin(userName, password);
		LoggerLoad.info("User logged-in successfully.");
	}

	@Given("User is on the LinkedList page after loggedin")
	public void user_is_on_the_linked_list_page_after_loggedin() {
		webPage = homePage.clickOnLinkedListButton();
	}
	
	@Given("User is on the Stack page after loggedin")
	public void user_is_on_the_stack_page_after_loggedin() {
		webPage = homePage.clickOnStackButton();
	}
	
	@When("User clicks on link {string}")
	public void user_clicks_on(String linkText) {
		webPage.clickOnLink(linkText);
	}

	@Then("User lands on page with title {string}")
	public void user_lands_on_page_with_title(String title) {
	    Assert.assertEquals(webPage.getTitle(), title);
	}

}
