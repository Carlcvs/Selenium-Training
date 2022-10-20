package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterizationexample {
  @Test
  @Parameters ("name")
	public void printname(String name) {
		System.out.println("the name is :"+name);
	}
}
