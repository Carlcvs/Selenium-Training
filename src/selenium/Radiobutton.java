package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/radio.html");
		  
		  
		  WebElement unchecked=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div"));
		  WebElement checked= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div"));
		  
		  boolean status1=unchecked.isSelected();
		  boolean status2=checked.isSelected();
		  
		  System.out.println(status1);
		  System.out.println(status2);
		  WebElement below20=driver.findElement(By.name("age"));
		  below20.click();

	}

}
