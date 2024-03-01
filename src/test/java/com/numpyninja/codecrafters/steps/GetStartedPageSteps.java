package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.GetStartedPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GetStartedPageSteps {

	
	private GetStartedPage getStartedPage = new GetStartedPage(DriverFactory.getDriver());

	@Given("User is on GetStartedPage")
	public void user_is_on_get_started_page() {

		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");

	}

	@Then("You are at the right place message should be displayed")
	public void message_should_be_displayed() {

		Assert.assertTrue(getStartedPage.isMessageExist());
	}
	
	@When("User click on GetStartedButton")
	public void user_click_on_get_started_button() {
	  
		getStartedPage.clickOnGetStartedButton();
	}

	@Then("User lands on Homepage with title NumpyNinja")
	public void user_lands_on_homepage_with_title_numpyninja() {
	    
		String title=getStartedPage.getPageTitle();
		Assert.assertTrue(title.equals("NumpyNinja"));
		
	}

}
