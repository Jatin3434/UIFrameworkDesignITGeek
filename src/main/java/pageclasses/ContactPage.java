package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class ContactPage {
	
	WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver= driver;
	}
	
	//Locators=======================================================================================================
	
	By FN= By.id("first_name");
	
	By LN= By.id("last_name");
	
	By Email= By.id("email");
	
	By Subject= By.id("subject");
	
	By Message= By.id("message");
	
	
	//Methods========================================================================================================
	
	
	public void enterFN() {
		driver.findElement(FN).sendKeys(new Faker().name().firstName());
	}
	
	public void enterLN() {
		driver.findElement(LN).sendKeys(new Faker().name().lastName());
	}
	
	public void enterEmail() {
		driver.findElement(Email).sendKeys(new Faker().internet().emailAddress());
	}
	
	public void enterSubject() {
		WebElement sub= driver.findElement(Subject);
		Select dd= new Select(sub);
		dd.selectByIndex(2);
	}
	
	public void enterMessage() {
		driver.findElement(Message).sendKeys(new Faker().lorem().paragraph());
	}
	
	

}
