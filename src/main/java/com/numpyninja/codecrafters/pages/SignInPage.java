package com.numpyninja.codecrafters.pages;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.datatable.DataTable;

public class SignInPage {
	private WebDriver driver;

	// 1. By Locators: OR
	private By UserName = By.xpath("//input[@id='id_username']");
	private By Password = By.xpath("//input[@id='id_password']");
	private By LoginButton = By.xpath("//*[@value='Login']");
	
	// 2. Constructor of the page class:
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public HomePage doLogin(String username, String password) {
		
		driver.findElement(UserName).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(LoginButton).click();
		return new HomePage(driver);//returns the next page
	}
	
	public void userNameData(DataTable datatable) {
		List<Map<String, String>> userName=datatable.asMaps(String.class, String.class);
		
		for(Map<String,String> detail:userName) {
			String uName = detail.get("username");
			driver.findElement(UserName).sendKeys(uName);
		}
		
		}	
		}
	
	
	

