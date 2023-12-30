package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

	WebDriver driver = null;
	
	
	By signIn_link = By.xpath("//a[contains(text(),'Sign in')]"); 
	
	By enter_userName = By.id("id_username");
	By enter_password = By.id("id_password");
	
	By click_login = By.xpath("//body/div[2]/div[1]/div[2]/form[1]/input[4]");
	
	By click_queueGetStarted = By.xpath("//body/div[3]/div[5]/div[1]/div[1]/a[1]");
	
	
	public LoginPOM(WebDriver driver) {
		
	this.driver = driver;
	}
	
	

	public void loginToPage(String userName, String password) {
		driver.findElement(enter_userName).sendKeys(userName);
		driver.findElement(enter_password).sendKeys(password);
		driver.findElement(click_login).click();

	}
	
	
	
	public void clickSignInLink() {
		
		driver.findElement(signIn_link).click();
	}
	
	public void enterUserName(String Username) {
		
		driver.findElement(enter_userName).sendKeys(Username);
	}
	
	public void enterPassword(String Password) {
		driver.findElement(enter_password).sendKeys(Password);
		
	}
	
	public void clickLoginButton() {
		
		driver.findElement(click_login).click();
	}
	
	public void clickQueueGetStarted() {
		
		driver.findElement(click_queueGetStarted);
	}
	
	
}
