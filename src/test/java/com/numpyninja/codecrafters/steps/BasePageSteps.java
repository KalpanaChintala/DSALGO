package com.numpyninja.codecrafters.steps;

import java.util.List;
import java.util.Map;

import com.numpyninja.codecrafters.factory.DriverFactory;

import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.SigninPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class BasePageSteps {

	private SigninPage signinPage = new SigninPage(DriverFactory.getDriver());
	private HomePage homePage;

	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) {

		List<Map<String, String>> credList = credTable.asMaps();

		//String username = credList.get(0).get("username");
		//String password = credList.get(0).get("password");

		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		//homePage = signinPage.doLogin(username, password);

	}

}