package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private  WebDriver driver;

	// 1. By Locators: OR
	private By SignInButton = By.xpath("//a[@href='/login']");
	private By UsernameTxtBox = By.xpath("//input[@id='id_username']");
	private By PasswordTxtBox = By.xpath("//input[@id='id_password']");
	private By LogInButton = By.xpath("//*[@value='Login']");
	
    // 2. Constructor of the page class:
	
    public SignInPage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	

    public HomePage doLogin(String username, String password) {
		
		driver.findElement(UsernameTxtBox).sendKeys(username);
		driver.findElement(PasswordTxtBox).sendKeys(password);
		driver.findElement(LogInButton).click();
		return new HomePage(driver);//returns the next page
	}
	 
	

	
	

	
}


