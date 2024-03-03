package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

	private WebDriver driver;

	// 1. By Locators:
	private By registerButton = By.xpath("//input[@value='Register'] ");
	private By usernameTextBox = By.xpath("//input[@id='id_username']");
	private By passwordTextBox = By.xpath("//input[@id='id_password1']");
	private By passwordConfirmTextBox = By.xpath("//input[@id='id_password2']");
	private By loginLink = By.xpath("//a[text()='Login ']");
	private By errorMessage = By.xpath(" //div[@class='alert alert-primary']");

	// 2. Constructor of the page class:
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnRegisterButton() {
		driver.findElement(registerButton).click();
		

	}

	public void enterIntoUsernameTextBox(String username) {
		
		driver.findElement(usernameTextBox).sendKeys(username);
	}

	public void enterIntoPasswordTextBox(String password) {
		driver.findElement(passwordTextBox).sendKeys(password);
	}

	public void enterIntoConfirmPasswordTextBox(String confirmPassword) {
		driver.findElement(passwordConfirmTextBox).sendKeys(confirmPassword);
	}

	public String getErrorMessage() {

		String actualResult = driver.findElement(errorMessage).getText();
		System.out.println("Errormessage is :"+actualResult);
		return actualResult;
	}

	public String getMessageString() {
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Alert message is :"+messageStr);
		return messageStr;
	}
}
