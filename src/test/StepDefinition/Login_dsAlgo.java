package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.concurrent.*;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver.*;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObject.GetStartedPom;
import PageObject.LoginPOM;
import PageObject.QueuePOM;
public class Login_dsAlgo {
	
	WebDriver driver;
	WebElement signInElm;
	String baseUrl ;
	LoginPOM homePage;
	QueuePOM queuePage;
	@Given("User Launch Chrome Browser")
	public void user_launch_chrome_browser() {
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
	}

	@Given("User opens URL {string}")
	public void user_opens_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
		baseUrl = url;
		driver.get(url);
		
	}
	@Given("Page Title should be {string}")
	public void page_title_should_be(String title) {
		
		String t = driver.getTitle();
		
		
	    // Write code here that turns the phrase above into concrete actions
	    // new io.cucumber.java.PendingException();
	}

	@Given("Get Started button appeared")
	public void get_started_button_appeared() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}

	@Given("User clicks on the Get Started button")
	public void user_clicks_on_the_get_started_button() {
		GetStartedPom gsPom = new GetStartedPom(driver);
		gsPom.clickGetStarted();
	}

	

	@Given("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {

		homePage = new LoginPOM(driver);
		homePage.clickSignInLink();
		
	}


	@Given("User enters Valid Username as {string} and Password as {string}")
	public void user_enters_valid_username_as_and_password_as(String userName, String password) {
		
		homePage.loginToPage(userName, password);
		
	}
	

	@Then("User should be logged in and can see home page")
	public void user_should_be_logged_in_and_can_see_home_page() {
	 
	}

	@Then("Click on Get Started button in Queue section")
	public void click_on_get_started_button_in_queue_section() {
		
		homePage.clickQueueGetStarted();
//		driver.get("https://dsportalapp.herokuapp.com/queue/");
	}
	@Then("verify editor is working for following pages:")
	public void verify_editor_is_working_for_following_pages(io.cucumber.datatable.DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // rows = {"a", "asd","sdf"}
	    // For other transformations you can register a DataTableType.
		List<String> rows = table.asList();
		int len = rows.size();
		
		queuePage = new QueuePOM(driver);
		
		for(int i=0; i<len; i++) {
			String pageName = rows.get(i);
			queuePage.run_print_hello_world(pageName);
		}
		driver.close();
		
	}
	
}
	

