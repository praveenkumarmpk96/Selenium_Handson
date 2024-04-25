package testNG;

import org.testng.annotations.Test;

public class SkipTestCase {


	/*skip test case*/

	@Test(priority = 0)
	public void Startthecar() {
		System.out.println("Car Started");
	}
	
	@Test(priority = 1,enabled = false)
	public void Turnthemusic() {
		System.out.println("Music on");
	}
	
	@Test(priority = 2)
	public void FirstGear() {
		System.out.println("First Gear");
	}
	
	@Test(priority = 3)
	public void SecondGear() {
		System.out.println("Second Gear");
	}
	
	@Test(priority = 4)
	public void ThirdGear() {
		System.out.println("Third Gear");
	}
	
	@Test(priority = 5)
	public void FourthGear() {
		System.out.println("Fourth Gear");
	}
}
