package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase1 {
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Open");
		
	}
	
	
	@AfterMethod
	public void closeBrowser() {

		System.out.println("Close");
	}
	
	@Test(priority=1)
	public void doLogin() {
		SoftAssert SA = new SoftAssert();
		System.out.println("Executing Test");
		SA.fail("My Failure");
		SA.assertAll();
		
	}

	@Test(priority=2, dependsOnMethods="doLogin")
	public void maximize() {
		System.out.println("maximize window");
		
	}
	

	
	
	
}
