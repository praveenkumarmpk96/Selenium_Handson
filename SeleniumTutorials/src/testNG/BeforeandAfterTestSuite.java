package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeandAfterTestSuite {
    WebDriver driver;
    long starttime;
	/*open browser and then goto google, then bing then yahoo then close it*/
	
	@BeforeSuite
	public void openbrowser() {
		starttime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void opengoogle() {
		driver.get("https://www.google.com");	
	}
	
	@Test
	public void openbing() {
		driver.get("https://www.bing.com");
	}
	
	@Test
	public void openyahoo() {
		driver.get("https://www.yahoo.com");
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.quit();
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println(starttime);
		System.out.println(endtime);
		System.out.println(totaltime);
			}
}
