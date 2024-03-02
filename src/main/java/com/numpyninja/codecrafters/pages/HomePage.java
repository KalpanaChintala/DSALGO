package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	// 1. By Locators: OR

	private By Datastructures = By.xpath("//a[@href='data-structures-introduction']");

	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3.page actions: features(behavior) of the page the form of methods:
	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public void clickOnDatastructures() {
		driver.findElement(Datastructures).click();
	}

	public DSintroPage navigateTodataintroductionPage() {
		driver.findElement(Datastructures).click();

		return new DSintroPage(driver);
	}

}
	
	

