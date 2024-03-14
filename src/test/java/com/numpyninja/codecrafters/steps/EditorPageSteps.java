package com.numpyninja.codecrafters.steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.util.ConfigReader;
import com.numpyninja.codecrafters.util.ExcelReader;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditorPageSteps {
	
	private EditorPage editorPage = new EditorPage(DriverFactory.getDriver());
	
	@Given("User is on the editor page")
	public void user_is_on_the_editor_page() {
	
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com/tryEditor");
	}
	
	
	@Then("User lands on the Editor page with title {string}")
	public void user_lands_on_the_editor_page_with_title(String string) {
		String title=editorPage.getPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.equals("Assessment"));
		
	}

	@When("User enters valid python code in Editor from sheet {string} and {int}")
	public void user_enters_valid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		System.out.println("Sheet name "+sheetName);
		ConfigReader configReader = new ConfigReader();
		Properties prop = configReader.init_prop();
		//Reading the code from the excel sheet named Success and storing to variables code and result
		ExcelReader reader = new ExcelReader();
		//each row corresponds to a list(testData) and for each row there are a key-value pairs
		
		String filePath=prop.getProperty("pythonexcelfilepath");
		
		System.out.println("Excel sheet path is: "+ filePath);
		List<Map<String,String>> testData = reader.getData(filePath, sheetName);
		
		String code = testData.get(rowNum).get("pythonCode");
		String result = testData.get(rowNum).get("result");
		
		System.out.println("Current code = "+code);
		//entering the code read from excel sheet into the editor box
		editorPage.enterCodeToEditor(code);
		
	}

	@When("Clicks on run button")
	public void clicks_on_run_button() {
	  
		editorPage.clickOnRunButton();
	}

	@Then("User should be able to see the output")
	public void user_should_be_able_to_see_the_output() {
	    
		editorPage.verifyOutputInEditor();
	}


}
