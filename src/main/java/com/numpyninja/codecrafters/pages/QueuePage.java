package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class QueuePage {

	private WebDriver driver;

	// 1. By Locators:
	private By implementationOfQueueLink=By.xpath("//a[text()='Implementation of Queue in Python']");
	private By collectionsDequeLink=By.xpath("//a[text()='Implementation using collections.deque']  ");
	private By implementationUsingArrayLink=By.xpath("//a[text()='Implementation using array']");
	private By queueOperationsLink=By.xpath("//a[text()= 'Queue Operations'] ");
	
	private By tryHereButton = By.xpath("//a[text()='Try here>>>']");
	
	
	
	// 2. Constructor of the page class:
	public QueuePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	
	public void clickOnImplementationOfQueueLink() {
		driver.findElement(implementationOfQueueLink).click();	
	}
	
	public void clickOncollectionsDequeLink() {
		driver.findElement(collectionsDequeLink).click();		
	}
	public void clickOnimplementationUsingArrayLink() {
		driver.findElement(implementationUsingArrayLink).click();		
	}	
	
	public void clickOnqueueOperationsLink() {
		driver.findElement(queueOperationsLink).click();		
	}	
	
	public EditorPage navigateToEditorPage() {
		driver.findElement(tryHereButton).click();
		return new EditorPage(driver);
		
	}
	
}
