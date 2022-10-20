package testng;

import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class Listenersexample implements ITestNGListener {
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test case is going to execute");
			}
		}

