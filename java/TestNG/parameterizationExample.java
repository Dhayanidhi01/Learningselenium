package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterizationExample {
	
	
	@Test
	@Parameters("Name")
	public void paratmeter(String name) {
		System.out.println("Name is " +name);
	}

}
