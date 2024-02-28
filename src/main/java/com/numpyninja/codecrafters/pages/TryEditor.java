package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TryEditor {
	WebDriver driver;
	public TryEditor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[contains(@class,\"CodeMirror cm-s-default\")]")
	private WebElement editortextbox;
	
	@FindBy(xpath="//*[text()=\"Run\"]")
	private WebElement runButton;

	@FindBy(xpath="//*[@id=\"output\"]")
	private WebElement output;

	

	
	public WebElement getEditorTextBox()
	{
		return editortextbox;
	}
	public void clickOnRunButton()
	{
		runButton.click();
	}
	
	public String getTextFromOutput()
	{
		return output.getText();
	}
}

