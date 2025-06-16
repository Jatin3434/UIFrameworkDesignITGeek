package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pageclasses.CommonLinks;
import pageclasses.CustomerRegistrationPage;
import pageclasses.LoginPage;

public class CustomerRegistrationTests extends BaseTest{
	
	@Test
	public void newCustomerRegTest() {
		
		CommonLinks links= new CommonLinks(driver);
		links.clickSignin();
		
		LoginPage register= new LoginPage(driver);
		register.ClickOnRegisterAccount();
		
		CustomerRegistrationPage crpage= new CustomerRegistrationPage(driver);
		crpage.Enterfirstname(new Faker().name().firstName());
		crpage.Enterlastname(new Faker().name().lastName());
		
		Assert.assertEquals( crpage.getCutomerRegistrationHeading(), "Customer registration");
	}
	
	
	
	
}
