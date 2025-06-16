package testcases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.BaseUtils;

public class BaseTest {
	
	//1.do not repeat
	//2. Solid principle:
	//S: Single responsibility
	//O: Open close principle: open to extension, close to modify
	
	WebDriver driver ;
	
	@BeforeMethod
	public void init() throws IOException {
		
		String browser= BaseUtils.getConfigValue("browser");
		
		switch (browser) {
		case "chrome":
			driver= new ChromeDriver();
			break;
		case "firefox":
			driver= new FirefoxDriver();
			break;
		case "edge":
			driver= new EdgeDriver();
			break;

		default:
			break;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.valueOf(BaseUtils.getConfigValue("implicitwait"))));
		driver.manage().window().maximize(); 
		driver.navigate().to(BaseUtils.getConfigValue("url"));
	}
	
	@AfterMethod
	public void quitBrowser() {
		driver.quit();
	}
	
	
}
