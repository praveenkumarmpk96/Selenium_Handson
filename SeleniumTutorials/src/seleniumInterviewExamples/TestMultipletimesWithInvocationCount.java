package seleniumInterviewExamples;

import org.testng.annotations.Test;

public class TestMultipletimesWithInvocationCount {

	@Test(invocationCount = 3)
	public void test() {
		System.out.println("Dhoni");
	}
}
