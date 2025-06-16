package testcases;

import org.testng.annotations.Test;

import pageclasses.CommonLinks;
import pageclasses.ContactPage;

public class ContactPageTest extends BaseTest{
	
	
	@Test
	public void ContactPagefillform() throws InterruptedException {
		
		CommonLinks links= new CommonLinks(driver);
		links.contactPage();
		
		ContactPage fillform= new ContactPage(driver);
		fillform.enterFN();
		fillform.enterLN();
		fillform.enterEmail();
		fillform.enterSubject();
		Thread.sleep(3000);
		fillform.enterMessage();
		
		
	}

}
