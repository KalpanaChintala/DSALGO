package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {
	
	private static WebDriver driver;

	// 1. By Locators: OR
	private By SignInButton = By.xpath("//a[@href='/login']");
	private By UsernameTxtBox = By.xpath("/html/body/div[2]/div/div[2]/form/input[2]");
	private By PasswordTxtBox = By.xpath("/html/body/div[2]/div/div[2]/form/input[3]");
	private By LogInButton = By.xpath("/html/body/div[2]/div/div[2]/form/input[4]");
	private By divHomePageTitle  = By.className("navbar-brand");
    private static By divErrorMsgUN = By.xpath("//div[contains(text(),'The email')]");
    private By divErrorMsgPWD = By.xpath("//div[contains(text(),'The password')]");
    private By Youareloggedin = By.className("alert alert-primary");
    private By SignoutButton = By.xpath("//a[@href='/logout']");
	
    // 2. Constructor of the page class:
	
    public SignInPage(WebDriver driver) {
		SignInPage.driver = driver;
	}

	// 3. page actions: features(behavior) of the page the form of methods:

	public String getSignInPageTitle() {
		return driver.getTitle();
	}
	public void clickOnSignin() {
		driver.findElement(SignInButton).click();
	}
	public void enterUsername(String username) {
		driver.findElement(UsernameTxtBox).sendKeys("Numpyninja");
	}

	public void enterPassword(String password) {
		driver.findElement(PasswordTxtBox).sendKeys("Codecrafters@123");
	}

	public void clickOnLogin() {
		driver.findElement(LogInButton).click();
	}

	public SignInPage doLogin(String un, String pwd) {
		System.out.println("login with: " + un + " and " + pwd);
		driver.findElement(UsernameTxtBox).sendKeys(un);
		driver.findElement(PasswordTxtBox).sendKeys(pwd);
		driver.findElement(LogInButton).click();
		return new SignInPage(driver);
	}
	 public String getErrMsgUN() {
		    return ((WebElement) divErrorMsgUN).getText();  
		  }
	 public String getErrMsgPWD() {
		    return ((WebElement) divErrorMsgPWD).getText(); 	  
	 }
	 public String getHomePgTitle() {
		    return ((WebElement) divHomePageTitle).getAttribute("aria-label");  
		  }

	public static boolean contains(String textboxes) {
		// TODO Auto-generated method stub
		return false;
	}
	public static boolean isMessageExist() {
		return driver.findElement(divErrorMsgUN).isDisplayed();
    }
	
	public void clickOnSignout() {
		driver.findElement(SignoutButton).click();
}

	public static boolean Pleasefilloutthisfield() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean Youareloggedin() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean Youareloggedout() {
		// TODO Auto-generated method stub
		return false;
	}

	public static boolean Invalidusernameandpassword() {
		// TODO Auto-generated method stub
		return false;
	}

	

	
}


