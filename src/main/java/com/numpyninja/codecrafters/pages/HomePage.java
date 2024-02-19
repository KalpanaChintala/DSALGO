package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class HomePage {

	private WebDriver driver;
	
	

	// 1. By Locators: OR
	private By getStartedQueueButton = By.xpath("//a[@href='queue']");
	private By getStartedArrayButton = By.xpath("//a[@href='array']");
	
	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public QueuePage navigateToQueuePage() {
		
		driver.findElement(getStartedQueueButton).click();
		return new QueuePage(driver);
	}
}