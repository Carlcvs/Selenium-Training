package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;


public class Findtheelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get ("https://www.google.com/");
		  driver.findElement(By.name("q")).sendKeys("carl"+Keys.ENTER);



	}

}
