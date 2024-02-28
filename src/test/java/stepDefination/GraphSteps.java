package stepDefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.numpyninja.codecrafters.pages.GraphPage;
import com.numpyninja.codecrafters.pages.HomePage;

import com.numpyninja.codecrafters.pages.SigninPage;
import codecrafters.factory.DriverFactory;
import io.cucumber.java.en.*;




public class GraphSteps {

	
		private WebDriver driver = DriverFactory.getDriver();
		private SigninPage signinPage = new SigninPage(this.driver);
		private HomePage homepage;
		private GraphPage graphPage;
		
		
		@Given("User has already logged in to application")
		public void user_has_already_logged_in_to_application() {
			String username = "Numpyninja";
			String password = "Codecrafters@123";
			DriverFactory.getDriver()
					.get("https://dsportalapp.herokuapp.com/login");
			homepage = signinPage.doLogin(username, password);
			System.out.print("User login is Successful");
		}
		
		
		@Given("User navigates to Graph page by using dropdown menu in Home page")
		public void user_navigates_to_graph_page_by_using_dropdown_menu_in_home_page() {
			
			graphPage = homepage.navigateToGraphPage();
		}
		

		@When("User clicks on the Graph")
		public void user_clicks_on_the_graph() {
			graphPage.clickOngraphLink();
		}

		

		@When("User clicks on Try here")
		public void user_clicks_on_try_here() {
			Actions actions = new Actions(driver);
			actions.moveToElement(graphPage.getTryhere()).perform();
			graphPage.getTryhere().click();
		}

		@Then("user will be navigated to the Tryeditor Page")
		public void user_will_be_navigated_to_the_tryeditor_page() {
		    
		}
		@When("User clicks on the Graph Represtations")
		public void user_clicks_on_the_graph_represtations() {
		    graphPage.clickOngraphrepresentationLink();
		}

		@Then("User is navigated to the Graph Represtations")
		public void user_is_navigated_to_the_graph_represtations() {
			graphPage = homepage.navigateToGraphPage();
		}
		}


