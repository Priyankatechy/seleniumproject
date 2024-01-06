package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPOM {

	WebDriver driver = null;
	
	
	By signIn_link = By.xpath("//a[contains(text(),'Sign in')]"); 
	
	By enter_userName = By.id("id_username");
	By enter_password = By.id("id_password");
	
	By click_login = By.xpath("//body/div[2]/div[1]/div[2]/form[1]/input[4]");
	
	By click_queueGetStarted = By.xpath("//body/div[3]/div[5]/div[1]/div[1]/a[1]");
	
	String user;
	String password;
	
	public LoginPOM(WebDriver driver) {
		
	this.driver = driver;
	}
	
	
   
	public void loginToPage() {
		retrieveCreds();
		driver.findElement(enter_userName).sendKeys(user);
		driver.findElement(enter_password).sendKeys(password);
		driver.findElement(click_login).click();

	}
	
	
	public void retrieveCreds() {
		try (InputStream input = new FileInputStream("/Users/aditya/eclipse-workspace/SDET141_BDD/src/test/resources/creds.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);

            // get the property value and print it out
          
            user = prop.getProperty("user");
            password = prop.getProperty("password");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		
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
