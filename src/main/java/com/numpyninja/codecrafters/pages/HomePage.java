package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private static WebDriver driver;
	String URL = "https://dsportalapp.herokuapp.com/";

	// 1. By Locators: OR
	private By GetStartedButton = By.className ("btn");
	private static By Datastructures = By.xpath ("/html/body/div/nav/div/div/div/a");
	private static By Array = By.xpath ("//a[@href='/array']");
	private static By Linkedlist = By.xpath ("//a[@href='/linked-list']");
	private static By Stack = By.xpath ("//a[@href='/stack']");
	private static By Queue = By.xpath ("//a[@href='/queue']");
	private static By Tree = By.xpath ("//a[@href='/tree']");
	private static By Graph = By.xpath ("//a[@href='/graph']");
	private static By Youarenotloggedinlink = By.className("alert alert-primary");
	
	
	
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
	public static void clickOnDatastructures() {
		driver.findElement(Datastructures).click();
	}
	public static void clickOnArray() {
		driver.findElement(Array).click();
    }
	public static void clickOnLinkedlist() {
		driver.findElement(Linkedlist).click();
	}
	public static void clickOnStack() {
		driver.findElement(Stack).click();
	}
	public static void clickOnQueue() {
		driver.findElement(Queue).click();
	}
	public static void clickOnTree() {
		driver.findElement(Tree).click();
	}
	public static void clickOnGraph() {
		driver.findElement(Graph).click();
		
	}

	public DSintroPage navigateTodataintroductionPage() {
		driver.findElement(Datastructures).click();
		
		return new DSintroPage(driver);
	}

	
	

}
