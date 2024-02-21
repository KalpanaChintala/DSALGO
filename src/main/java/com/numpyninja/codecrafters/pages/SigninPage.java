package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	public void SignInPage(WebDriver driver) 
	  {
		PageFactory.initElements(driver, this);
	  }
	
	//public static WebDriver driver ;
	//String URL = "https://dsportalapp.herokuapp.com/home";
	
	@FindBy (xpath = "//a[@href='/login']")
	@CacheLookup WebElement SignIn;
	@FindBy (xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	@CacheLookup WebElement LogIn;
	@FindBy (xpath = "/html/body/div[2]/div/div[2]/form/input[2]")
	@CacheLookup WebElement UsernameTxtBox;
	@FindBy (xpath = "/html/body/div[2]/div/div[2]/form/input[3]") 
	@CacheLookup WebElement PasswordTxtBox;
	@FindBy (className = "navbar-brand")  
	@CacheLookup WebElement divHomePageTitle ;
	@FindBy(xpath="//div[contains(text(),'The email')]")
	@CacheLookup WebElement divErrorMsgUN;
	@FindBy(xpath="//div[contains(text(),'The password')]")
	@CacheLookup WebElement divErrorMsgPWD;
	
	
	      public void ClickBtnSignIn() {
		   SignIn.click();
		  }
	      
	      public void SetUserName(String uName) {
	    	  UsernameTxtBox.clear();
	    	  UsernameTxtBox.sendKeys("Numpyninja");
	      }
		  
		   
		  public void SetPassword(String pwd) {
			  PasswordTxtBox.clear();
			  PasswordTxtBox.sendKeys("Codecrafters@123");
		  }  
		  
		  public void ClickBtnLogin() {
			  LogIn.click();
		  }
		  
		    
		  public String getHomePgTitle() {
		    return divHomePageTitle.getAttribute("aria-label");  
		  }
		  
		  public String getErrMsgUN() {
		    return divErrorMsgUN.getText();  
		  }
		  
		  public String getErrMsgPWD() {
		    return divErrorMsgPWD.getText();  
	}
	

	}


