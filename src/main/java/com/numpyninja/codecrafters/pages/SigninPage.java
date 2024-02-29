package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {

	private WebDriver driver;

	// 1. By Locators: OR
	private By UserName = By.xpath("//input[@id='id_username']");
	private By Password = By.xpath("//input[@id='id_password']");
	private By LoginButton = By.xpath("//*[@value='Login']");
	
	// 2. Constructor of the page class:
	public SigninPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePage doLogin(String username, String password) {
		
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginButton).click();
		return new HomePage(driver);//returns the next page
	}

}