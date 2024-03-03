package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IntroductionPage {
	
	private WebDriver driver;
	
	public IntroductionPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		
		return driver.getTitle();
	}
	
	public TryEditorPage clickOnTryHereButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@href='/tryEditor']")).click();
		return new TryEditorPage(driver);
	}

}
