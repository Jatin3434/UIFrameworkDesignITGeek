package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageclasses.HomePage;

public class HomePageTest extends BaseTest {
	
	
	@Test
	public void CombinationPlierHeadAsseriton() {
		
		HomePage hp= new HomePage(driver);
		
		Assert.assertEquals(hp.combinationPlierAssertion(), "Combination Pliers");
	}

}
