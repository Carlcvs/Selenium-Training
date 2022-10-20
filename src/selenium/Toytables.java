package selenium;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toytables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/table.html");
		  
		   List<WebElement> coloumn=driver.findElements(By.tagName("th"));
		   int coloumncount=coloumn.size();
		   System.out.println("total coloumn is :"+coloumncount);
		   
		   List<WebElement> rows=driver.findElements(By.tagName("tr"));
		   int rowcount=rows.size();
		   System.out.println("total coloumn is :"+rowcount);
		   
		   
		   
	}

}
