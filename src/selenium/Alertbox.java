package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
          WebDriver driver = new ChromeDriver();		  
		  driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		  
		  WebElement alertbox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		  alertbox.click();
		  
		  Alert alert = driver.switchTo().alert();
		  Thread.sleep(2000);
		  alert.accept();
		  
		      
	}

}
