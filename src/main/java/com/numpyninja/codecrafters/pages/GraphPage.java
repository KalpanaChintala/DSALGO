package com.numpyninja.codecrafters.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.numpyninja.codecrafters.util.ReadDatafromFile;



public class GraphPage {

	private WebDriver driver;

	
	
	// 1. By Locators:
	private By graphLink=By.xpath("//a[@class='list-group-item'][@href='graph']");
	private By graphrepresentationLink=By.xpath("//a[text()='Graph Representations']");
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	private WebElement tryhere;
	
	
	
	// 2. Constructor of the page class:
	public GraphPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	
	public void clickOnGraphLink() {
		addDelay();
		driver.findElement(graphLink).click();
	}
	
	public void clickOngraphrepresentationLink() {
		addDelay();
		driver.findElement(graphrepresentationLink).click();	
	}
	public WebElement getTryhere()
	{
		return tryhere;
	}
		
	
public void enterPythonCode(String filePath) throws InvalidFormatException, IOException
{
	ReadDatafromFile readDataFromFile = new ReadDatafromFile(filePath);
	String readData = readDataFromFile.ReadData();
	TryEditor tryEditor=new TryEditor(driver);
	Actions actions=new Actions(driver);
	actions.sendKeys(tryEditor.getEditorTextBox(), readData).build().perform();
}

private void addDelay() {
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
