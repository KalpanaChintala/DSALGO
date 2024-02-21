package com.numpyninja.codecrafters.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePage {
	
	private WebDriver driver ;
	String URL = "https://dsportalapp.herokuapp.com/";
	
	
	public HomePage(WebDriver driver) {
		this.driver =driver;
	}
	
	
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}

    @FindBy (className = "btn") WebElement GetStartedBtn;
	@FindBy (xpath = "/html/body/div/nav/div/div/div/a") WebElement Datastructures;
	@FindBy (xpath = "//a[@href='/array']") WebElement Arrays;
	@FindBy (xpath = "//a[@href='/linked-list']") WebElement LinkedList;
	@FindBy (xpath = "//a[@href='/stack']") WebElement Stack;
	@FindBy (xpath = "//a[@href='/queue']") WebElement Queue;
	@FindBy (xpath = "//a[@href='/tree']") WebElement Tree;
	@FindBy (xpath = "//a[@href='/graph']") WebElement Graph;


	public void DSALGOHomePage() {
		
		

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//driver.get(URL);
		
		PageFactory.initElements(driver, this);
		
		GetStartedBtn.click();
		Datastructures.click();
		Arrays.click();
		LinkedList.click();
		Stack.click();
		Queue.click();
		Tree.click();
		Graph.click();
		
	}
	public static void main(String[] args) {
		
		HomePage obj = new HomePage();
			obj.DSALGOHomePage();
	}

}


