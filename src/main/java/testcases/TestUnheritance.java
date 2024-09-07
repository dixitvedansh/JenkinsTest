package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestUnheritance extends InheritanceTestSelenium {
	
	@Test (priority=1)
	//(invocationCount = 2, threadPoolSize = 2)
	public void doLogin() {
		preRequisite();
		driver.findElement(By.id("APjFqb")).sendKeys("Height of falcon 6??");
		driver.findElement(By.id("APjFq")).sendKeys(Keys.RETURN);
		
	}
	
	@AfterTest
	public void ExitBrowser() {
		driver.quit();
	}

}
