package testng;

import org.testng.annotations.Test;

public class Dependanicesmanagement {
	@Test (enabled =true)
	public void middleschool() {
		System.out.println("Middle school");}
	
	@Test (dependsOnMethods = "middleschool")
	public void highschool() {
		System.out.println("high school");}
	
	@Test (dependsOnMethods = "highschool" )
	public void collage() {
		System.out.println("collage");}
	
	}
