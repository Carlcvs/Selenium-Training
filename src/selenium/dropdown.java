package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/Dropdown.html");
		  
		  WebElement dropdown1= driver.findElement(By.id("dropdown1"));
		  Select select = new Select(dropdown1);
		  
		  select.selectByIndex(4);
		  select.selectByValue("2");
		  select.selectByVisibleText("Selenium");
		  
		  List< WebElement> listofoptions = select.getOptions();
		  int size= listofoptions.size();
		  System.out.println("Number of elements : "+ size);
		  

	}
}
