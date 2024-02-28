package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class GraphPage {

	private WebDriver driver;

	
	
	// 1. By Locators:
	private By graphLink=By.xpath("//a[text()='Graph']");
	private By graphrepresentationLink=By.xpath("//a[text()='Graph Representations ']");
	@FindBy(xpath="//*[text()=\"Try here>>>\"]")
	private WebElement tryhere;
	
	
	
	// 2. Constructor of the page class:
	public GraphPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
		
	}
	
	
	public void clickOngraphLink() {
		driver.findElement(graphLink).click();
	}
	
	public void clickOngraphrepresentationLink() {
		driver.findElement(graphrepresentationLink).click();	
	}
	public WebElement getTryhere()
	{
		return tryhere;
	}
		
	}
	
