package com.numpyninja.codecrafters.steps;

import org.testng.Assert;
import java.util.List;
import java.util.Map;
import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.QueuePage;
import com.numpyninja.codecrafters.pages.SigninPage;
import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePageSteps {
	
	private SigninPage signInPage = new SigninPage(DriverFactory.getDriver());
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private QueuePage queuePage;
	private EditorPage editorPage;

	
	
	@Given("User is on the queue page")
	public void user_is_on_the_queue_page_with_title() {
		queuePage = homePage.navigateToQueuePage();
	}
	
	@When("User clicks on link Implementation of Queue in Python")
	public void user_clicks_on_link_implementation_of_queue_in_python() {
	   
		queuePage.clickOnImplementationOfQueueLink();
	}

	@Then("User lands on Queue page with title  {string}")
	public void user_lands_on_queue_page_with_title(String expectedTitle) {
		String actualTitle=queuePage.getPageTitle();
	
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	}

	@When("User clicks on Queue page Try Here Button")
	public void user_clicks_on_queue_page_try_here_button() {
		
		editorPage = queuePage.navigateToEditorPage();
	
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
	
	@When("User clicks on link Practice Questions")
	public void user_clicks_on_link_practice_questions() {
	 
		queuePage.clickPracticeQuestionsLink();
		
	}

	

}
