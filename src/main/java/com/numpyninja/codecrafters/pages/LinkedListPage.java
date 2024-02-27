package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedListPage {

	private WebDriver driver;
	
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver clickOnLink(String linkText) {
		addDelay();
		driver.findElement(By.linkText(linkText)).click();
		return driver;
	}

	public String getTitle() {
		addDelay();
		return driver.getTitle();
	}
	
	private void addDelay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
