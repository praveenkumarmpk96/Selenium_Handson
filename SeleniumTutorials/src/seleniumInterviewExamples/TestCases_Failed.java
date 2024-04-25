package seleniumInterviewExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases_Failed {

	//@Test(retryAnalyzer = RetryListener.class)
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true, false);
	}
	
	//@Test(retryAnalyzer = RetryListener.class)
	@Test
	public void testcase2()
	{
		Assert.assertEquals(true, false);
	}
}
