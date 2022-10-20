package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/checkbox.html");
		  
		  WebElement java= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		  java.click();
		  
		  WebElement selenium= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]"));
		  
		  boolean seleniumSelected= selenium.isSelected();
		  System.out.println(seleniumSelected);
		  
		  WebElement firstelement= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/label"));
		  
		  if(firstelement.isSelected()) {
			  firstelement.click();
		  }

	}

}
