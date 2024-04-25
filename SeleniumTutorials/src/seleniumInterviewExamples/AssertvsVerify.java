package seleniumInterviewExamples;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertvsVerify {
	
	@Test
	public void asserttest() {
		//HardAssertion
		System.out.println("Before Assertion");
		Assert.fail();//fail() or assertEquals(true, false);
		System.out.println("After Assertion");
	}
	
	@Test
	public void verifytest() {
		//SoftAssertion
		
		System.out.println("Before Assertion");
		SoftAssert softAssert = new SoftAssert();
		softAssert.fail();
		System.out.println("After Assertion");
	}

}
