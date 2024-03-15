package com.numpyninja.codecrafters.steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.GraphPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.TryEditor;

import io.cucumber.java.en.*;


public class GraphSteps {

	
		private WebDriver driver = DriverFactory.getDriver();
		private HomePage homePage = new HomePage(driver);
		private GraphPage graphPage;
		
		@Given("User navigates to Graph page by using dropdown menu in Home page")
		public void user_navigates_to_graph_page_by_using_dropdown_menu_in_home_page() {
			
			graphPage = homePage.navigateToGraphPage();
		}
		

		@When("User clicks on the Graph")
		public void user_clicks_on_the_graph() {
			graphPage.clickOnGraphLink();
		}

		

		@And("User clicks on Try here")
		public void user_clicks_on_try_here() {
			
			graphPage.getTryhere().click();
		}

		@When("User enters python code in tryEditor from text file {string}")
		public void user_enters_python_code_in_try_editor_from_text_file(String filePath)
		throws InvalidFormatException, IOException {
			GraphPage graphpage = new GraphPage (driver);
			graphpage.enterPythonCode(filePath);

		}
		
		@Then("User should get output {string}")
		public void user_should_get_output(String expectedOutput) {
			TryEditor tryEditor = new TryEditor(driver);
			tryEditor.clickOnRunButton();
			String output = tryEditor.getTextFromOutput();
			
			Assert.assertTrue(output.equals(expectedOutput));
		}
	
	
		
		
		@When("User clicks on the Graph Represtations")
		public void user_clicks_on_the_graph_represtations() {
		    graphPage.clickOngraphrepresentationLink();
		}

		@Then("User is navigated to the Graph Represtations")
		public void user_is_navigated_to_the_graph_represtations() {
			graphPage = homePage.navigateToGraphPage();
		}
	}


