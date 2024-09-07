package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test
	public void testAssert() {
		String one = "Hey";
		String two = "Hello";
		
		//Assert.assertEquals(one,two);
		
		SoftAssert SA = new SoftAssert();
		
		SA.assertEquals(one,two);
		System.out.println("Failed but still ran");
		SA.assertAll();
		System.out.println("can run ?");
		
	}
	
	

}
