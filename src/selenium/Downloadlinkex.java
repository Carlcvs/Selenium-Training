package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadlinkex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/download.html");
		  
		  WebElement downlink=driver.findElement(By.linkText("Download Excel"));
		  downlink.click();
		  Thread.sleep(4000);
		  
		  file filelocation=new file()
	}

}
