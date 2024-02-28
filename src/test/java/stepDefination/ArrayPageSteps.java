package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.numpyninja.codecrafters.pages.ArrayPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.SigninPage;
import com.numpyninja.codecrafters.pages.TryEditor;

import java.io.IOException;
import codecrafters.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ArrayPageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private SigninPage signInPage = new SigninPage(this.driver);
	private HomePage homePage;
	private ArrayPage arrayPage;

	
	
	@Given("User has already logged in to application")
	public void user_has_already_logged_in_to_application() {
		String username = "Numpyninja";
		String password = "Codecrafters@123";
		DriverFactory.getDriver()
				.get("https://dsportalapp.herokuapp.com/login");
		homePage = signInPage.doLogin(username, password);
		System.out.print("User login is Successful");
	}
	
	@Given("User navigates to Array page by using dropdown menu in Home page")
	public void user_navigates_to_array_page_by_using_dropdown_menu_in_home_page() {
		arrayPage = homePage.navigateToArrayPage();
	}
	
	@When("User set click on Arrays in Python link")
	public void User_click_on_Arrays_in_Python_link() {
	   
		arrayPage.clickOnArraysInPythonLink();
	}
	
	@Then("User will be navigated to tryeditor Page")
	public void user_navigates_to_tryeditor_page() throws InvalidFormatException, IOException {
		Actions actions = new Actions(driver);
		actions.moveToElement(arrayPage.getTryhere()).perform();
		arrayPage.getTryhere().click();

	}
	  
	@Then("User enters valid python code in tryEditor from text file {string}")
	public void user_enters_valid_python_code_in_try_editor_from_text_file(String filePath)
	throws InvalidFormatException, IOException {
		ArrayPage arrayPage = new ArrayPage(driver);
		arrayPage.enterPythonCode(filePath);

	}
	
	@Then("User should get appropriate output")
	public void user_should_get_appropriate_output() {
		TryEditor tryEditor = new TryEditor(driver);
		tryEditor.clickOnRunButton();
		String output = tryEditor.getTextFromOutput();
		
		System.out.println("<<<<<<<<<<<<<<<Arrays in Python link code output>>>>>>>> :" + output);

	}

}
	
	
