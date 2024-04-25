package seleniumInterviewExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutSetPropertyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Setting the chrome driver path in environment variables*/
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
