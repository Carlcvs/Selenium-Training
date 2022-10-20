package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class OpenGooglewithfirebox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:\\firebox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://firebox.com/");
	}
}
