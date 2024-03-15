package com.numpyninja.codecrafters.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.SigninPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class BasePageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private SigninPage signInPage = new SigninPage(this.driver);
	private HomePage homePage;
	
	@Given("User has already logged in to application")
	public void User_has_already_logged_in_to_application(DataTable credTable) {
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/login");
		homePage = signInPage.doLogin(userName, password);
	}
}
