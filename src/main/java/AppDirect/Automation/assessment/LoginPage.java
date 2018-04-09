package AppDirect.Automation.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	By Suscribe=By.cssSelector("a[href*='./signup']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement Suscribe() {
		// TODO Auto-generated method stub
		return driver.findElement(Suscribe);
	}

}
