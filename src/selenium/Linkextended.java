package selenium;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkextended {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/Link.html");
		  
		  WebElement linkextend= driver.findElement(By.linkText("Go to Home Page"));
		  linkextend.click();
		  
		  driver.navigate().back();
		  
		  WebElement wheretogo=driver.findElement(By.partialLinkText("Find where"));
		  String where=wheretogo.getAttribute("href");
		  System.out.println("This link is going to ;"+ where);
		  
		  WebElement broken=driver.findElement(By.linkText("Verify am I broken?"));
		  broken.click();
		  
		  String title=driver.getTitle();
		  if (title.contains("404")) {
			  System.out.println("Link is broken");}
		  driver.navigate().back();
		  WebElement linkextend1= driver.findElement(By.linkText("Go to Home Page"));
         linkextend1.click();
		  driver.navigate().back();
		  List<WebElement> total= driver.findElements(By.tagName("a"));
		  int linkcount=total.size();
			  
			 System.out.println("total link is :"+linkcount);
		  
	


}}
