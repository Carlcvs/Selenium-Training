package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Suiteexample {
	WebDriver driver;
	long starttime;
	long endtime;
	
	@BeforeSuite
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        starttime=System.currentTimeMillis();
		
	
	}
@Test
	public void opengoogle() {
		  
		  driver.get("https://www.google.com/");
	}
	@Test
	public void openbing() {
			  
		  driver.get("https://www.bing.com/");
	
	}
	@Test
	public void openyahoo() {
		  
		  driver.get("https://www.yahoo.com/");
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		 endtime = System.currentTimeMillis();
		 long totalTime = endtime-starttime;
		System.out.println("The Total time taken is"+totalTime);
}
}