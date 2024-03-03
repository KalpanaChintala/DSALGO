package com.numpyninja.codecrafters.steps;
import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.RegisterPage;
import com.numpyninja.codecrafters.pages.SigninPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInPageSteps {
	private SigninPage signInPage = new SigninPage(DriverFactory.getDriver());
	
	@Given("The user is on Login Page")
	public void the_user_is_on_login_page() {
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
	}

	@When("The user clicks Login button after entering {string} and {string}")
	public void the_user_clicks_login_button_after_entering_and(String string, String string2, DataTable dataTable) {
		signInPage.userNameData(dataTable);
		//signInPage.pwdData(dataTable);
		//signInPage.clickLoginButton();
	}

}
