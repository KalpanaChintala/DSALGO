package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.WebDriver;

public class EditorPage {
	
	
	private WebDriver driver;
	
	public EditorPage(WebDriver driver) {
		this.driver = driver;
	}
	public String getPageTitle() {
		return driver.getTitle();
		
	}
}