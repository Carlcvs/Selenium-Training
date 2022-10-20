package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\\\chrome\\\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://testleaf.herokuapp.com/pages/frame.html");
		  
		  driver.switchTo().frame(0);
		  WebElement button1=driver.findElement(By.id("Click"));
		  button1.click();
		  Thread.sleep(3000);
		  
		  String text=driver.findElement(By.id("Click")).getText();
		  System.out.println(text);
		  
		  driver.switchTo().defaultContent();
		  driver.switchTo().frame(1);
		  WebElement button2=driver.findElement(By.id("Click1"));
		  Thread.sleep(3000);
		  button2.click();
		  
		  driver.switchTo().defaultContent();
		  List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		  
		  int size= totalFrames.size();
		  System.out.println(size);
		  

	}

}
