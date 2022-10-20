package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallelexample {
	@Test
	public void opengoogle() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		  
		  driver.get ("https://www.google.com/");
	}
	@Test
	public void openbing() {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		  
		  driver.get ("https://www.bing.com/");
	}
	
	

}
