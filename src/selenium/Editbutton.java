package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Editbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();		  
		  driver.get ("http://www.leafground.com/pages/Button.html");
		  
		  WebElement getpositionbutton=driver.findElement(By.id("position"));
		  Point xypoint=getpositionbutton.getLocation();
		  int Xvalue=xypoint.getX();
		  int Yvalue=xypoint.getY();
		  System.out.println("x value is :"+ Xvalue +"Y value is :"+Yvalue);
		  
		  
		  WebElement colorbutton= driver.findElement(By.id("color"));
		 String color=colorbutton.getCssValue("background-color");
		 System.out.println("button color is :"+color);
		 
		 
		 WebElement sizebutton= driver.findElement(By.id("size"));
		 int height= sizebutton.getSize().getHeight();
		 int width= sizebutton.getSize().getWidth();
		 System.out.println("height is :"+height +"weigh is :"+width);
		 
	}}
		  
		  
		  



