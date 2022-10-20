package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendersexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();		  
 driver.get("http://www.leafground.com/pages/Calendar.html");		  
		  
		  
		  WebElement calender=driver.findElement(By.id("datepicker"));
		  calender.sendKeys("07/10/2022"+Keys.ENTER);
		  
	}

}
