package com.numpyninja.codecrafters.steps;

import org.testng.Assert;
import java.util.List;
import java.util.Map;
import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.QueuePage;
import com.numpyninja.codecrafters.pages.SignInPage;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePageSteps {
	
	private SignInPage signInPage = new SignInPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private QueuePage queuePage;
	private EditorPage editorPage;

	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application() {
		
		//List<Map<String, String>> credList = credTable.asMaps();
		
		//String username = credList.get(0).get("username");
		//String password = credList.get(0).get("password");
		String username = "Numpyninja";
		String password = "Codecrafters@123";
		DriverFactory.getDriver()
				.get("https://dsportalapp.herokuapp.com/login");
		homePage = signInPage.doLogin(username, password);
		
	}
	
	@Given("User is on the queue page")
	public void user_is_on_the_queue_page_with_title() {
		queuePage = homePage.navigateToQueuePage();
	}
	
	@When("User clicks on link Implementation of Queue in Python")
	public void user_clicks_on_link_implementation_of_queue_in_python() {
	   
		queuePage.clickOnImplementationOfQueueLink();
	}

	@Then("User lands on page with title  {string}")
	public void user_lands_on_landing_page_with_title(String string) {
		String title=queuePage.getPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.equals(string));
	}

	@When("User clicks on Try Here Button")
	public void user_clicks_on_try_here_button() {
		
		editorPage = queuePage.navigateToEditorPage();
	
	}

	@Then("User lands on the Editor page with title {string}")
	public void user_lands_on_the_editor_page_with_title(String string) {
		String title=editorPage.getPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.equals("Assessment"));
		
	}

	@When("User clicks on link Implementation using collections.deque")
	public void user_clicks_on_link_implementation_using_collections_deque() {
	   
		queuePage.clickOncollectionsDequeLink();
	}

	

	@When("User clicks on link Implementation using array")
	public void user_clicks_on_link_implementation_using_array() {
	
		queuePage.clickOnimplementationUsingArrayLink();
		
	}

	

	@When("User clicks on link Queue Operations")
	public void user_clicks_on_link_queue_operations() {
	   
		queuePage.clickOnqueueOperationsLink();
		
	}

	

}
