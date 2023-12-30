package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetStartedPom {
	WebDriver driver;
	
	By button_getStarted = By.xpath("//button[contains(text(),'Get Started')]");
	
	public GetStartedPom(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickGetStarted() {
		
		driver.findElement(button_getStarted).click();
		
	}
	

}
