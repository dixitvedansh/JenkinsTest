package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ThreadTest {
	
	
	@Test (invocationCount=2, threadPoolSize=2 )
	public void launchBrowser() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://google.com");
		driver.quit();
	}

}
