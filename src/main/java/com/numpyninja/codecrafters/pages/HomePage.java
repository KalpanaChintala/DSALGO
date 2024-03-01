package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private  WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	// 1. By Locators: OR
	private By GetStartedButton = By.className ("btn");
	private  By Datastructures = By.xpath ("//a[@href='data-structures-introduction']");
	private  By Array = By.xpath ("//a[@href='/array']");
	private  By Linkedlist = By.xpath ("//a[@href='/linked-list']");
	private  By Stack = By.xpath ("//a[@href='/stack']");
	private  By Queue = By.xpath ("//a[@href='/queue']");
	private  By Tree = By.xpath ("//a[@href='/tree']");
	private  By Graph = By.xpath ("//a[@href='/graph']");
	private  By Youarenotloggedinlink = By.xpath ("//a[@href='/graph']");
	
	
	
	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	//3.page actions: features(behavior) of the page the form of methods:
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	public boolean isYouarenotloggedinlinkExist() {
		return driver.findElement(Youarenotloggedinlink).isDisplayed();
		
	}
	public void clickOnGetStarted() {
		driver.findElement(GetStartedButton).click();
	}
	public  void clickOnDatastructures() {
		driver.findElement(Datastructures).click();
	}
	public  void clickOnArray() {
		driver.findElement(Array).click();
    }
	public  void clickOnLinkedlist() {
		driver.findElement(Linkedlist).click();
	}
	public  void clickOnStack() {
		driver.findElement(Stack).click();
	}
	public  void clickOnQueue() {
		driver.findElement(Queue).click();
	}
	public  void clickOnTree() {
		driver.findElement(Tree).click();
	}
	public  void clickOnGraph() {
		driver.findElement(Graph).click();
		
	}

	public DSintroPage navigateTodataintroductionPage() {
		driver.findElement(Datastructures).click();
		
		return new DSintroPage(driver);
	}

	
	

}
