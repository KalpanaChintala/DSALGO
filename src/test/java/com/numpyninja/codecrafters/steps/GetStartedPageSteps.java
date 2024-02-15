package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.GetStartedPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetStartedPageSteps {

	
	private GetStartedPage getStartedPage = new GetStartedPage(DriverFactory.getDriver());

	@Given("User is on GetStartedPage")
	public void user_is_on_get_started_page() {

		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");

	}

	@Then("{string} message should be displayed")
	public void message_should_be_displayed(String string) {

		Assert.assertTrue(getStartedPage.isMessageExist());
	}

}
