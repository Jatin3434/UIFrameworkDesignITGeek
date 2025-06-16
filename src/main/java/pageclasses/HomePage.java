package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		
		this.driver= driver;
	}
	
	//Locators========================================================================================================
	
	By combinationplierhead = By.xpath("//h5[.=' Combination Pliers ']"); 
	
	//Methods=========================================================================================================
	
	public String combinationPlierAssertion() {
		
		return driver.findElement(combinationplierhead).getText();
	}
}
