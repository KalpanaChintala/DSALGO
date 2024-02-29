package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
	
	private WebDriver driver ;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}

	
	public StaticWebPage clickOnLinkedListButton() {
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		return new StaticWebPage(driver);
	}
	
	public StaticWebPage clickOnStackButton() {
		try
		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@href='stack']")).click();
		return new StaticWebPage(driver);
	}


}





