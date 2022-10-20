package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocompletionexample {

	public static void main(String[] args) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver","D:\\\\chrome\\\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/autoComplete.html");
		  
		  WebElement inputs=driver.findElement(By.id("tags"));
		  inputs.sendKeys("s");
		  Thread.sleep(4000);
		  
		  List<WebElement> optionslist=driver.findElements(By.xpath("//*[@id=\'tags\']/li"));
System.out.println(optionslist.size());
		  for (WebElement webElement : optionslist) {
			
		
			  if (webElement.getText().equals("Web Services")) {
				  webElement.click();
				  System.out.println("selecting "+webElement.getText());
				  break;
				
			}
			
		}}}
		  



