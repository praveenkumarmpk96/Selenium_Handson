package seleniumInterviewExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/windows");
		
		WebElement multiplewindows = driver.findElement(By.id("multi"));
		multiplewindows.click();
		
//		driver.close();
		
		driver.quit();
	}

}
