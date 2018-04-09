package AppDirect.Automation.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	By LogIn=By.id("login");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement LogIn() {
		// TODO Auto-generated method stub
		return driver.findElement(LogIn);
	}

}
