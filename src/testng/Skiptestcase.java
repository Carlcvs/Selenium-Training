package testng;

import org.testng.annotations.Test;

public class Skiptestcase {
	@Test (priority = 1)
	public void staracar() {
		System.out.println("start the car");}
	@Test (priority = 2)
	public void firstcar() {
		System.out.println("first gear of the car");}
	
	@Test (priority = 4,enabled = false)
	public void musicon() {
		System.out.println("Music turned on");
	}
			
			@Test (priority = 3)
	public void secondcar() {
		System.out.println("second gear of the car");}
	}


