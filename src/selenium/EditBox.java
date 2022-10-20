package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		  
		WebElement emailbox=driver.findElement(By.id("email"));
		emailbox.sendKeys("carl@gmail.com");
		
	 WebElement appendbox=driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
      appendbox.sendKeys("text");
      
      WebElement gettextbox=driver.findElement(By.name("username"));
      String value=gettextbox.getAttribute("value");
      System.out.println(value);
      
      WebElement clearbox=driver.findElement(By.name("username"));
      clearbox.clear();
      
      WebElement disablebox= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
      boolean enabled=disablebox.isDisplayed();
      System.out.println(enabled);
      
      
	}

}
