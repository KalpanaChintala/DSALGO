package com.numpyninja.codecrafters.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage {
	
	private WebDriver driver ;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}

	
	public LinkedListPage clickOnLinkedListButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		return new LinkedListPage(driver);
	}

}

