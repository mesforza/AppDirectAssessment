package AppDirect.Automation.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
public WebDriver driver;
	
	By MailBox=By.cssSelector("input[name='emailAddress'][type='email']"); 
	By RegisterButton=By.id("idb");
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement MailBox() {
		// TODO Auto-generated method stub
		return driver.findElement(MailBox);
	}

	public WebElement RegisterButton() {
		// TODO Auto-generated method stub
		return driver.findElement(RegisterButton);
	}

	public boolean ErrorMessage() {
		// TODO Auto-generated method stub
		WebElement aderrorregistereduser = driver.findElement(By.xpath("//*[@id='ida']/fieldset/div[2]/div/span/div/div/div/p"));
		String ErrorMessage="ya está registrada en nuestro sistema";
	    System.out.println("The mail is already in use, the showed error is correct.");
		return aderrorregistereduser.getText().contains(ErrorMessage);
		
	}

}
