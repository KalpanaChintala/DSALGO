package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.SigninPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SigninPageSteps {
	private SigninPage signinPage = new SigninPage(DriverFactory.getDriver());

	@Given("The user is on Login Page")
	public void the_user_is_on_login_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	}

	@When("The user clicks Login button after entering {string} and {string}")
	public void the_user_clicks_login_button_after_entering_and(String string, String string2, DataTable dataTable) {
		signinPage.userNameData(dataTable);
		signinPage.pwdData(dataTable);
		signinPage.clickLoginButton();
	}

	@When("The user clicks Login button")
	public void the_user_clicks_login_button() {
		signinPage.clickLoginButton();
	}

	@Then("User should be landed on homepage")
	public void user_should_be_landed_on_homepage() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/home");
	}

	@Then("User should be able to see the alert message {string}.")
	public void user_should_be_able_to_see_the_alert_message(String expectedMessageStr) {
		String actualMessageStr = signinPage.getMessageString();
		Assert.assertEquals(expectedMessageStr, actualMessageStr);
	}

}
