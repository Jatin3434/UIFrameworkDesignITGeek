package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver= driver;	
	}
	
	By registrationAccountxpath= By.xpath("//a[.='Register your account']");
	
	public void ClickOnRegisterAccount() {
		
		driver.findElement(registrationAccountxpath).click();
		
	}
	
	
}
