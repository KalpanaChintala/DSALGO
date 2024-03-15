package com.numpyninja.codecrafters.steps;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.GetStartedPage;
import com.numpyninja.codecrafters.pages.RegisterPage;
import com.numpyninja.codecrafters.util.ConfigReader;
import com.numpyninja.codecrafters.util.ExcelReader;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class RegisterPageSteps {
	
	private RegisterPage registerPage = new RegisterPage(DriverFactory.getDriver());
	
	String expectedResult;
	@Given("User is on the Register Page")
	public void user_is_on_the_register_page() {
	    
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/register");
	}

	@When("User fills the page from given sheetname {string} and rownumber {int}")
	public void user_fills_the_page_from_given_sheetname_and_rownumber(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		ConfigReader configReader = new ConfigReader();
		Properties prop = configReader.init_prop();
		//Reading the code from the excel sheet named Success and storing to variables code and result
				ExcelReader reader = new ExcelReader();
				//each row corresponds to a list(testData) and for each row there are a key-value pairs
				String filePath=prop.getProperty("registerexcelfilepath");
				List<Map<String,String>> testData = reader.getData(filePath, sheetName);
				
				String username = testData.get(rowNum).get("Username");
				String password = testData.get(rowNum).get("Password");
				String confirmPassword = testData.get(rowNum).get("ConfirmPassword");
				
			
				//entering the code read from excel sheet into the editor box
				registerPage.enterIntoUsernameTextBox(username);
				registerPage.enterIntoPasswordTextBox(password);
				registerPage.enterIntoConfirmPasswordTextBox(confirmPassword);
				
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		registerPage.clickOnRegisterButton();
		
	}

	
	@Then("User should be able to see the message displayed {string}")
	public void user_should_be_able_to_see_the_message_displayed(String expectedResult) {
		String actualResult=registerPage.getErrorMessage();
		System.out.println(actualResult);
		
		Assert.assertEquals(expectedResult, actualResult);
	}

	@Then("User should be able to see the alert message {string}")
	public void user_should_be_able_to_see_the_alert_message(String expectedMessageStr) {
		String actualMessageStr=registerPage.getMessageString();
		Assert.assertEquals(expectedMessageStr, actualMessageStr);
	}


	
}
