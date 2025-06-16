package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegistrationPage {
	
	WebDriver driver; 
	
	public CustomerRegistrationPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	By firstnameID = By.id("first_name");
	
	By lastnameID= By.id("last_name");
	
	By cutomerregistrationtagname = By.tagName("h3");
	
	
	//=======================================================================
	
	
	public void Enterfirstname(String firstname) 
	{
		driver.findElement(firstnameID).sendKeys(firstname);
		
	}
	public void Enterlastname(String lastname) 
	{
		driver.findElement(lastnameID).sendKeys(lastname);
		
	}
	
	public String getCutomerRegistrationHeading() {
		
		return driver.findElement(cutomerregistrationtagname).getText();
	}
	
	
	
}
