package com.numpyninja.codecrafters.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	private WebDriver driver;
	
	@FindBy(xpath="//*[text()=\"Data Structures\"]")
	private WebElement dataStructuredropdown;
	
	@FindBy(xpath="//*[text()=\"Arrays\"]")
	private WebElement Arraysoptions;
	
	@FindBy(xpath="//*[text()=\"Graph\"]")
	private WebElement Graphoptions;

	
	@FindBy(xpath="//*[text()=\"A")
	// 1. By Locators: OR
	private By getStartedQueueButton = By.xpath("//a[@href='queue']");
	
	
	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public QueuePage navigateToQueuePage() {
		
		driver.findElement(getStartedQueueButton).click();
		return new QueuePage(driver);
	}
	
	public ArrayPage navigateToArrayPage()
	{
		dataStructuredropdown.click();
		Arraysoptions.click();
		return new ArrayPage(driver);
	}
	
	
	public GraphPage navigateToGraphPage()
	{
		dataStructuredropdown.click();
		Graphoptions.click();
		return new GraphPage(driver);
	}
	
}
