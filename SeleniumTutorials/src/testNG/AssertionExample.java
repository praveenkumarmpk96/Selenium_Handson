package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	String name = "Praveen";
	boolean value = true;
	
	@Test
	public void checkequal() {
		
		Assert.assertEquals(name, "Praveen");
	}
			
	@Test
	public void checkvalue() {
		Assert.assertTrue(value, "This message is true");
	}
}
