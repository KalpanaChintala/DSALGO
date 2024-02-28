package com.numpyninja.codecrafters.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;


public class HomePage {

	private WebDriver driver;
	
	// 1. By Locators: OR
	private By getStartedQueueButton = By.xpath("//a[@href='queue']");
	
	private By getStartedTreeButton = By.xpath("//a[@href='tree']");
	
	// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public QueuePage navigateToQueuePage() {
		
		driver.findElement(getStartedQueueButton).click();
		return new QueuePage(driver);
	}
	
	public TreePage navigateToTreePage() {
		
		driver.findElement(getStartedTreeButton).click();
		return new TreePage(driver);
	}
	
	public void getStartedForModule(String string) {
		switch(string){
		case "Datastructures":
			getstarted_DS.click();
			break;
		case "Arrays":
			
			getstarted_Array.click();
			break;
		case "Linkedlist":
			
			getstarted_LL.click();
			break;
		case "Stack":
			
			getstarted_stack.click();
			break;
		case "Queue":
			
			getstarted_queue.click();
			break;
		case "Tree":
			
			getstarted_tree.click();
			break;
		case "Graph":
			
			getstarted_graph.click();
			break;
		}
		}
}
