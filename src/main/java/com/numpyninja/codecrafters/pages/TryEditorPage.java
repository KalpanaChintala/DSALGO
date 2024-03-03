package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.WebDriver;

public class TryEditorPage {
	
	private WebDriver driver;

	public TryEditorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
}
