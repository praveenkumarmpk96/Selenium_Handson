package seleniumInterviewExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RefreshExample {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

		WebElement searchterm = driver.findElement(By.name("q"));
		searchterm.sendKeys("dhoni");

		/*1.Using Refresh*/
		driver.navigate().to("https://www.google.com");
		WebElement searchterm1 = driver.findElement(By.name("q"));
		searchterm.sendKeys("dhoni");
		driver.navigate().refresh();

		/*2.Using getcurrentURL*/
		driver.get(driver.getCurrentUrl());

		/*3.Using Javascript Executor*/
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("history.go(0)");//location.reload() or history.go(0)

		/*4.Using Robot class*/
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

		/*5.Using sendkeys but this will not work*/
		WebElement searchterm2 = driver.findElement(By.name("q"));
		searchterm.sendKeys("dhoni");

		WebElement refresh = driver.findElement(By.name("q"));
		refresh.sendKeys(Keys.F5);//using F5 or ASCII value \uE035


	}

}
