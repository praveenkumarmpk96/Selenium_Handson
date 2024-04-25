package seleniumInterviewExamples;

import org.openqa.selenium.TimeoutException;
import org.testng.annotations.Test;

public class TimeOutExample {

	@Test(timeOut = 2000)
	public void test() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Dhoni");
	}
	
	//Exception handling - If we give what exception we expect instead of failing that test case will get passed
	
	@Test(timeOut = 2000,expectedExceptions = TimeoutException.class)//ArrayIndexOutOfBoundsException.class
	public void test1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Dhoni");
	}
}
