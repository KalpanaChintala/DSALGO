package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.numpyninja.codecrafters.pages.ArrayPage;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.TryEditor;
import org.testng.Assert;
import java.io.IOException;
import codecrafters.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ArrayPageSteps {
	
	private WebDriver driver = DriverFactory.getDriver();
	private HomePage homePage = new HomePage(driver);
	private ArrayPage arrayPage;
	private EditorPage editorPage = new EditorPage(DriverFactory.getDriver());
	

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
	  
	@When("User enters valid python code in tryEditor from text file {string}")
	public void user_enters_valid_python_code_in_try_editor_from_text_file(String filePath)
	throws InvalidFormatException, IOException {
		ArrayPage arrayPage = new ArrayPage(driver);
		arrayPage.enterPythonCode(filePath);

	}
	
	@Then("User should get appropriate output {string}")
	public void user_should_get_appropriate_output(String expectedOutput) {
		TryEditor tryEditor = new TryEditor(driver);
		tryEditor.clickOnRunButton();
		String output = tryEditor.getTextFromOutput();
		
		Assert.assertTrue(output.equals(expectedOutput));
	}
	
	
	
	
	@Given("User is on Array Page")
	public void user_is_on_array_page() {
		arrayPage = homePage.navigateToArrayPage();
	}
	

	@When("User click on Arrays Using List link")
	public void user_click_on_arrays_using_list_link() {
	   arrayPage.clickOnArraysUsingList();
	}

	@Then("User lands on Arrays page with title {string}")
	public void user_lands_on_arrays_page_with_title(String expectedtitle) {
       String actualTitle=arrayPage.getPageTitle();
		
		Assert.assertTrue(actualTitle.equals(expectedtitle));
	}

	
	
	
	@When("User clicks on Try Here Button")
	public void user_clicks_on_try_here_button() {
		arrayPage.getTryhere().click();
		
	}



	@When("User click on Basic Operations in Lists link")
	public void user_click_on_basic_operations_in_lists_link() {
		 arrayPage.clickOnBasicOperationsInLists();
	}

	@When("User click on Basic Applications of Array link")
	public void user_click_on_basic_applications_of_array_link() {
		 arrayPage.clickOnApplicationsofArray();
	}

	
	@Then("User lands on the Editor page with title {string}")
	public void user_lands_on_the_editor_page_with_title(String string) {
		
			String title=editorPage.getPageTitle();
			System.out.println(title);
			Assert.assertTrue(title.equals("Assessment"));
}
}
	
	
