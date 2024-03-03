package com.numpyninja.codecrafters.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.numpyninja.codecrafters.util.ElementUtil;
public class HomePage {

	private WebDriver driver;

	// ElementUtil elementUtil = new ElementUtil(driver);

	// webelements for modules
	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement getStartedDSIntroductionButton;
	@FindBy(xpath = "//a[@href='array']")
	WebElement getStartedArrayButton;
	@FindBy(xpath = "//a[@href='linked-list']")
	WebElement getStartedLinkedlistButton;
	@FindBy(xpath = "//a[@href='stack']")
	WebElement getStartedStackButton;
	@FindBy(xpath = "//a[@href='queue']")
	WebElement getStartedQueueButton;
	@FindBy(xpath = "//a[@href='tree']")
	WebElement getStartedTreeButton;
	@FindBy(xpath = "//a[@href='graph']")
	WebElement getStartedGraphButton;

// webelement for user not logged in alert msg
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement alertmsg;

// webelements for dropdown
	@FindBy(xpath = "//a[text()='Data Structures']")
	WebElement dropdown_DS;
	@FindBy(xpath = "//a[text()='Arrays']")
	WebElement dropdown_array;
	@FindBy(xpath = "//a[text()='Linked List']")
	WebElement dropdown_linkedlist;
	@FindBy(xpath = "//a[text()='Stack']")
	WebElement dropdown_stack;
	@FindBy(xpath = "//a[text()='Queue']")
	WebElement dropdown_queue;
	@FindBy(xpath = "//a[text()='Tree']")
	WebElement dropdown_tree;
	@FindBy(xpath = "//a[text()='Graph']")
	WebElement dropdown_graph;

// Webelement for register and login links
	@FindBy(xpath = "//a[@href='/register']")
	WebElement register;
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;

// 2. Constructor of the page class:
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	String URL = "https://dsportalapp.herokuapp.com/";

	public StaticWebPage clickOnLinkedListButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[@href='linked-list']")).click();
		return new StaticWebPage(driver);
	}

	public StaticWebPage clickOnStackButton() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("//a[@href='stack']")).click();
		return new StaticWebPage(driver);
	}

	public QueuePage navigateToQueuePage() {

		getStartedQueueButton.click();
		return new QueuePage(driver);
	}

	public TreePage navigateToTreePage() {

		getStartedTreeButton.click();
		return new TreePage(driver);
	}

	public void getStartedForModules(String string) {
		switch (string) {
		case "Datastructures":
			getStartedDSIntroductionButton.click();
			break;
		case "Arrays":

			getStartedArrayButton.click();
			break;
		case "Linkedlist":

			getStartedLinkedlistButton.click();
			break;
		case "Stack":

			getStartedStackButton.click();
			break;
		case "Queue":

			getStartedQueueButton.click();
			break;
		case "Tree":

			getStartedTreeButton.click();
			break;
		case "Graph":

			getStartedGraphButton.click();
			break;
		}
	}

	public String alertmsg() {
		// elementUtil.waitForElement(alertmsg);

		String msg = alertmsg.getText();
		System.out.println("Alert message is:" + msg);
		return msg;
	}

	// dropdown options
	public void clickOnDropdown(String string) {

		dropdown_DS.click();
		switch (string) {

		case "Arrays":
			dropdown_array.click();
			break;

		case "Linkedlist":

			dropdown_linkedlist.click();

			break;

		case "Stack":
			dropdown_stack.click();
			break;

		case "Queue":
			dropdown_queue.click();
			break;

		case "Tree":
			dropdown_tree.click();
			break;

		case "Graph":
			dropdown_graph.click();
			break;
		}

	}

	public void click_register() {
		register.click();
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}

	public void clickOnSignIn() {
		login.click();
	}

	public boolean displaySiginLink() {
		return (login.isDisplayed());
	}

	public boolean displayRegisterLink() {
		return (register.isDisplayed());

	}
}
