package AppDirect.Automation.assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationFeedbackPage {

	public WebDriver driver;
	
	By MailBox=By.cssSelector("input[name='emailAddress'][type='email']"); 

	
	public RegistrationFeedbackPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean PositiveFeedback() {
		// TODO Auto-generated method stub
		WebElement adpositivefeedback = driver.findElement(By.xpath("//*[@id='id10']/div/section/div/h3"));
		String FeedbackMessage="Gracias por registrarse.";
	    System.out.println("The first step of registration is complete.");
		return adpositivefeedback.getText().contains(FeedbackMessage);
		
	}

}
