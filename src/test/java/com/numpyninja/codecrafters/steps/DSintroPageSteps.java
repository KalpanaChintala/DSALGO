package com.numpyninja.codecrafters.steps;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.DSintroPage;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.SigninPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DSintroPageSteps {
	
	
	private WebDriver driver = DriverFactory.getDriver();
	
	private SigninPage signinpage = new SigninPage(DriverFactory.getDriver());
	//private SigninPage signInPage = new SigninPage(DriverFactory.getDriver());
	private DSintroPage dataintroductionPage;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private EditorPage editorpage ;


	@Given("User is on the Data Structures Introduction Page")
	public void user_is_on_the_data_structures_introduction_page() {
		dataintroductionPage = homePage.navigateTodataintroductionPage();
	}

	@When("User clicks on link Time Complexity")
	public void user_clicks_on_link_time_complexity() {
		dataintroductionPage.clickOnTimeComplexityLink();
	    
	}

	@Then("User lands on Data Structures Introduction Page with title  {string}")
	public void user_lands_on_data_structures_introduction_page_with_title(String expectedTitle ) {
		String actualTitle=dataintroductionPage.getPageTitle();
		
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	    
	}

	@When("User clicks on Data Structures Introduction Page Try Here Button")
	public void user_clicks_on_data_structures_introduction_page_try_here_button() {
		editorpage = dataintroductionPage.navigateToEditorPage();
	    
	}

	
	}
