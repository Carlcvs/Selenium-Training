package testng;

import org.testng.annotations.Test;

public class Groupingexample {
	@Test (groups={"apple"})
	public void appletesting1() {
		System.out.println("apple testing");
	}
	@Test (groups={"apple"})
	public void appletesting2() {
		System.out.println("apple testing");}
	@Test (groups={"moto"})
	public void moto1() {
		System.out.println("moto testing");
	}
	@Test (groups={"moto"})
	public void moto2() {
		System.out.println("moto testing");
	}
	@Test (groups={"vivo"})
	public void vivo1() {
		System.out.println("vivo testing");
		
		
	}
	@Test (groups={"vivo"})
	public void vivo2() {
		System.out.println("vivo testing");
		
		
	}
	
	

}
