package com.numpyninja.codecrafters.steps;

import org.testng.Assert;

import com.numpyninja.codecrafters.factory.DriverFactory;
import com.numpyninja.codecrafters.pages.EditorPage;

import io.cucumber.java.en.Then;

public class EditorPageSteps {
	

	private EditorPage editorPage = new EditorPage(DriverFactory.getDriver());
	
	
	
	
	@Then("User lands on the Editor page with title {string}")
	public void user_lands_on_the_editor_page_with_title(String string) {
		String title=editorPage.getPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.equals("Assessment"));
		
	}

}
