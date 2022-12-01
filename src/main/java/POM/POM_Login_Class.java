
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Login_Class {
	
	WebDriver driver;

	@FindBy(xpath="//*[@id=\'ap_email\']")
	WebElement user_name;
	
	@FindBy(xpath="//*[@id=\"continue\"]")
	WebElement conti;
	
	
	@FindBy(xpath="//*[@id=\'ap_password\']")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"signInSubmit\"]")
	WebElement submit;
	
	public POM_Login_Class(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void User_name()
	{
		user_name.sendKeys("7385844621");
	}
	
	public void conti()
	{
		conti.click();
	}
	
	public void Password()
	{
		password.sendKeys("shweta");
	}
	
	public void submit()
	{
		submit.click();
	}

}
