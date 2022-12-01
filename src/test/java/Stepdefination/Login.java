package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.POM_Login_Class;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver;
	POM_Login_Class POM1;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
	    System.out.println("user is on login page");
	   System.setProperty("webdriver.chrome.driver","D:/Testing class/Java/Software/chromedriver.exe/");
	    driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
	   
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password()
	{
		POM1 = new POM_Login_Class(driver);
		POM1.User_name();
		POM1.conti();
		POM1.Password();
		
	}

	@When("click on login button")
	public void click_on_login_button() 
	{
	   System.out.println("click on login button");
	   POM1.submit();
	}
	
	@Then("navigate to home page")
	public void navigate_to_home_page() {
	    
		
	}
	

}

 
