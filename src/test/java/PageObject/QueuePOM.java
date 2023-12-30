package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

	public class QueuePOM {
	
	WebDriver driver = null;
	String baseUrl = "https://dsportalapp.herokuapp.com";
	
	
	By try_here_button= By.xpath("//*[text()='Try here>>>']");

	By try_editor_box= By.xpath("//*[@id=\"answer_form\"]/div/div/div[1]/textarea");

	By run_button = By.xpath("//button[contains(text(),'Run')]");


	public QueuePOM(WebDriver driver) {
	
	this.driver = driver;
	}
	

	
	public void clickOnTryhereButton() {
		
		driver.findElement(try_here_button);
	}
	
	public void typeHelloWorld() {
		
		driver.findElement(try_editor_box).sendKeys("");
	}
	
	
	public void run_print_hello_world(String pageName) {
//Open url: https://dsportalapp.herokuapp.com/queue/implementation-lists/
		
		driver.get(baseUrl + "/queue/"+pageName+"/");
		//click tryhere button
		driver.findElement(try_here_button).click();
		// define variable string input= print('implementation-lists')
		String input = "print('"+pageName+"')";
		//type input value into editor box
		driver.findElement(try_editor_box).sendKeys(input);
		//click run button
		driver.findElement(run_button).click();

		String output = driver.findElement(By.id("output")).getText();
		if(output == pageName) {
			System.out.println("##################");
			System.out.println(output);
			System.out.println("##################");
//
		}
		else
		{
			System.out.println("##################");
			System.out.println(output);
			System.out.println("##################");
		}
	
	
	}}



