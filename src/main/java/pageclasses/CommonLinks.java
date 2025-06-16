package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonLinks{

	WebDriver driver;
	
	public CommonLinks(WebDriver driver) {
		this.driver= driver;
		
	}
	
	//Locators=================================================================================================================
	
	By clickingonsignIn= By.xpath("//a[.='Sign in']");
	
	By clickonContactpagelink= By.xpath("//a[.='Contact']");
	
	By homepagelink = By.xpath("//a[.='Home']");
	//==========================================================================================================================
	
	//Methods===================================================================================================================
	
	public void clickSignin() {
		
		driver.findElement(clickingonsignIn).click();
		
	}
	
	public void contactPage() {
		
		driver.findElement(clickonContactpagelink).click();
	}
	
	public void HomePage() {
		driver.findElement(homepagelink).click();
	}
	

}
