package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SearchProd {
	
	WebDriver driver;
	
	@Given("I have browser opened and url is navigated")
	public void i_have_browser_opened_and_url_is_navigated() {
		 System.setProperty("webdriver.chrome.driver","D:/Testing class/Java/Software/chromedriver.exe/");
		driver = new ChromeDriver();
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
	}

	@Given("I search prodect as {string}")
	public void i_search_prodect_as(String string) {
	 WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	 searchbox.sendKeys("Dell laptop");
	 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	   
	}

	@When("product list should apper")
	public void product_list_should_apper() {
	    driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
	   driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
	}

}
