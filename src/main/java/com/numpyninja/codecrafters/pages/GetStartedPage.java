package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GetStartedPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By getStartedButton = By.xpath("//button[text()='Get Started']");
	private By message = By.xpath("//p[text()='You are at the right place']");
	
	// 2. Constructor of the page class:
	public GetStartedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public boolean isMessageExist() {
		return driver.findElement(message).isDisplayed();
	}
	
	public void clickOnGetStartedButton() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(getStartedButton).click();
		
	}
	
	public String getPageTitle() {
		return driver.getTitle();//returns title of the next page
	}
	
	
}
