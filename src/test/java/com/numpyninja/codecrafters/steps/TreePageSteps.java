package com.numpyninja.codecrafters.steps;
import org.testng.Assert;
import java.util.List;
import java.util.Map;
import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;
import com.numpyninja.codecrafters.pages.HomePage;
import com.numpyninja.codecrafters.pages.TreePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageSteps {
	
	private HomePage homePage = new HomePage(DriverFactory.getDriver());
	private TreePage treePage;
	private EditorPage editorPage;
	
	@Given("User is on the tree page")
	public void user_is_on_the_tree_page() {
		treePage = homePage.navigateToTreePage();
	}

	@When("User clicks on link Overview of Trees")
	public void user_clicks_on_link_overview_of_trees() {
		treePage.clickOnOverviewOfTreesLink();
	}
	
	@Then("User lands on Tree page with title  {string}")
	public void user_lands_on_tree_page_with_title(String expectedTitle) {
		String actualTitle=treePage.getPageTitle();
		
		Assert.assertTrue(actualTitle.equals(expectedTitle));
	}
	
	@When("User clicks on Tree page Try Here Button")
	public void user_clicks_on_tree_page_try_here_button() {
		editorPage = treePage.navigateToEditorPage();
	}

	@When("User clicks on link Terminologies")
	public void user_clicks_on_link_terminologies() {
		treePage.clickOnTerminologiesLink();
	   
	}

	@When("User clicks on link Types of Trees")
	public void user_clicks_on_link_types_of_trees() {
		treePage.clickOnTypesOfTreesLink();
	}

	@When("User clicks on link Tree Traversals")
	public void user_clicks_on_link_tree_traversals() {
		treePage.clickOnTreeTraversalsLink();
	}

	@When("User clicks on link Traversals-Illustration")
	public void user_clicks_on_link_traversals_illustration() {
		treePage.clickOnTraversalsIllustrationLink();
	}

	@When("User clicks on link Binary Trees")
	public void user_clicks_on_link_binary_trees() {
		treePage.clickOnBinaryTreesLink();
	}

	@When("User clicks on link Types of Binary Trees")
	public void user_clicks_on_link_types_of_binary_trees() {
		treePage.clickOnTypesOfBinaryTreesLink();
	}

	@When("User clicks on link Implementation in Python")
	public void user_clicks_on_link_implementation_in_python() {
		treePage.clickOnImplementationInPythonLink();
	}

	@When("User clicks on link Binary Tree Traversals")
	public void user_clicks_on_link_binary_tree_traversals() {
		treePage.clickOnBinaryTreeTraversalsLink();
	}

	@When("User clicks on link Implementation of Binary Trees")
	public void user_clicks_on_link_implementation_of_binary_trees() {
		treePage.clickOnImplementationOfBinaryTreesLink();
	}

	@When("User clicks on link Applications of Binary trees")
	public void user_clicks_on_link_applications_of_binary_trees() {
		treePage.clickOnApplicationOfBinaryTreesLink();
	}

	@When("User clicks on link Binary Search Trees")
	public void user_clicks_on_link_binary_search_trees() {
		treePage.clickOnBinarySearchTreesLink();
	}

	@When("User clicks on link Implementation Of BST")
	public void user_clicks_on_link_implementation_of_bst() {
		treePage.clickOnImplementaionOfBSTLink();
	}

	
	
	
}
