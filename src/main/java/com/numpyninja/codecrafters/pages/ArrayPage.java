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



public class ArrayPage {

	private WebDriver driver;

	// 1. By Locators:
	private By ArraysinPythonLink=By.xpath("//a[text()='Arrays in Python']");
	
	
	@FindBy(xpath="//*[text()=\"Arrays Using List\"]")
	private WebElement arraysUsingList;

	@FindBy(xpath="//*[text()=\"Basic Operations in Lists\"]")
	private WebElement basicOperationsInLists;

	@FindBy(xpath="//*[text()=\"Applications of Array\"]")
	private WebElement applicationsofArray;
	 
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	private WebElement tryhere;
	
	// 2. Constructor of the page class:
	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	
	public String getPageTitle() {
		return driver.getTitle();
	}

	public WebElement getTryhere()
	{
		return tryhere;
	}
	
	
	
	public void clickOnArraysUsingList()
	{
		Actions actions=new Actions(driver);
		actions.scrollToElement(arraysUsingList).build().perform();
		arraysUsingList.click();
		
	}
	public void clickOnBasicOperationsInLists()
	{
		basicOperationsInLists.click();
	}
	public void clickOnApplicationsofArray()
	{
		applicationsofArray.click();
	}

	public void clickOnArraysInPythonLink() {
		driver.findElement(ArraysinPythonLink).click();	
	}
	
	public void enterPythonCode(String filePath) throws InvalidFormatException, IOException
	{
		ReadDatafromFile readDataFromFile = new ReadDatafromFile(filePath);
		String readData = readDataFromFile.ReadData();
		TryEditor tryEditor=new TryEditor(driver);
		Actions actions=new Actions(driver);
		actions.sendKeys(tryEditor.getEditorTextBox(), readData).build().perform();
	}
}