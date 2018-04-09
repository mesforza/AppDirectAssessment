package AppDirect.Automation.assessment;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class RegisterNewUserTestCase {

	@Test
	public void RegisterNewUser()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Martín/Documents/ChromeDriver2.37/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.appdirect.com/");
		
		//Home Page
		HomePage aphomepage=new HomePage (driver);
		aphomepage.LogIn().click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(0));
	    driver.close();
	    driver.switchTo().window(tabs2.get(1));
	    
	    //Login In Page
	    LoginPage aplogin=new LoginPage (driver);
		aplogin.Suscribe().click();
		
		//Register Page
		RegisterPage apregisterpage=new RegisterPage (driver);
		apregisterpage.MailBox().sendKeys("ms20091987@ms20091987.com");
		apregisterpage.RegisterButton().click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Registration Feedback 
		RegistrationFeedbackPage apregistrationfeedbackpage=new RegistrationFeedbackPage (driver);
		apregistrationfeedbackpage.PositiveFeedback();
	}
	
}
