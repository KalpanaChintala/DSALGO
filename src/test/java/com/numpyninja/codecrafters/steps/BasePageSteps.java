package com.numpyninja.codecrafters.steps;

import java.util.List;
import java.util.Map;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.QueuePage;
import com.numpyninja.codecrafters.pages.SignInPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class BasePageSteps {

	private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private QueuePage queuePage;
	private EditorPage editorPage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {
		
		List<Map<String, String>> credList = credTable.asMaps();
		
		String username = credList.get(0).get("username");
		String password = credList.get(0).get("password");
	
		DriverFactory.getDriver()
				.get("https://dsportalapp.herokuapp.com/login");
		homePage = signInPage.doLogin(username, password);
		
	}
	
	
	
	
}
