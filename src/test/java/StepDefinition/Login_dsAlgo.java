package StepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;


import java.time.Duration;

import org.openqa.selenium.*;

import org.openqa.selenium.chrome.*;

import PageObject.GetStartedPom;
import PageObject.LoginPOM;
import PageObject.QueuePOM;
public class Login_dsAlgo {
	
	WebDriver driver;
	WebElement signInElm;
	String baseUrl = "https://dsportalapp.herokuapp.com";
	LoginPOM homePage;
	QueuePOM queuePage;
	String pageName;
	@Before
	public void setup() {
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@Given("User logged in to dsportalapp")
	public void user_logged_in_to_dsportalapp() {
		driver.get(baseUrl);
		
		GetStartedPom gsPom = new GetStartedPom(driver);
		gsPom.clickGetStarted();
		
		homePage = new LoginPOM(driver);
		homePage.clickSignInLink();
		
		homePage.loginToPage("phoenixteam", "phoenix123/");		
	}
	
	@When("User reviews queue section")
	public void user_reviews_queue_section() {
		
		homePage.clickQueueGetStarted();
		
	}
	@Then("user is able to navigate to following pages:")
	public void user_is_able_to_navigate_to_following_pages(io.cucumber.datatable.DataTable table) {
		List<String> lst = table.asList();
		int len = lst.size();
		
		queuePage = new QueuePOM(driver);
		
		for(int i=0; i<len; i++) 
		{
			pageName = lst.get(i);
			queuePage.run_print_hello_world(pageName);
		}
	}
	
	
	@After
	public void teardown() {
		driver.close();
	}
	
}
	

