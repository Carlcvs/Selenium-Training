package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://testleaf.herokuapp.com/pages/Image.html");
		  
		 
		  
		  WebElement brokenimage=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/img"));
		//"naturalWidth" = 0
		  if (brokenimage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken");
		}else {
			System.out.println("The image is not broken");}

		
	}

}
