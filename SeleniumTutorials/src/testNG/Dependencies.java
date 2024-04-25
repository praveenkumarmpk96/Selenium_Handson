package testNG;

import org.testng.annotations.Test;

public class Dependencies {
    
	@Test(enabled = true)
	public void HighSchool() {
		System.out.println("High School");
	}
	
	@Test(dependsOnMethods = "HighSchool")
	public void HigherSecondary() {
		System.out.println("Higher Secondary");
	}
	
	@Test(dependsOnMethods = "HigherSecondary")
	public void College() {
		System.out.println("College");
	}
}
