package testcases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends InheritanceTestSelenium implements ITestListener {
	
	public void onTestFailure(ITestResult arg0) {
		try {
			CaptureSS.newSS();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
	

}
