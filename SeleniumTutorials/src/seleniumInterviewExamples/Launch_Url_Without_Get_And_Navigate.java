package seleniumInterviewExamples;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Url_Without_Get_And_Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Url = "https://www.google.com";
		
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.location = \' "+Url+" \'");
		
	}

}
