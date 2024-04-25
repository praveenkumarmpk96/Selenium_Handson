package seleniumInterviewExamples;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserMaximizeExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
/*1.Using maximize() method*/
		driver.manage().window().maximize();
		
/*2.Using Dimension setsize*/
		Dimension dimension = new Dimension(800, 500);
		driver.manage().window().setSize(dimension);
		
/*3.Using chromeoptions*/
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver1 = new ChromeDriver(chromeOptions);
	
		driver1.navigate().to("https://www.google.com");
		
		driver.quit();
	}

}
