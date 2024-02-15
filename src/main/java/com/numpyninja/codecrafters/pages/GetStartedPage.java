package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GetStartedPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By GetStartedButton = By.xpath("//button[text()='Get Started']");
	private By Message = By.xpath("//p[text()='You are at the right place']");
	
	// 2. Constructor of the page class:
	public GetStartedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public boolean isMessageExist() {
		return driver.findElement(Message).isDisplayed();
	}
	
	
}
