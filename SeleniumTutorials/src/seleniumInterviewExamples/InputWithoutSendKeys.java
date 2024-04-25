package seleniumInterviewExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputWithoutSendKeys {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
//		//using sendkeys
		WebElement searchbox = driver.findElement(By.name("q"));
//		searchbox.sendKeys("Dhoni");
		
		//1.*Using Javascript executor*/
		JavascriptExecutor executor = (JavascriptExecutor) driver;
//		executor.executeScript("document.getElementsByName('q')[0].value = 'Dhoni'", "");
		
//		executor.executeScript("arguments[0].value = 'Dhoni'", searchbox);
		
		//2.Using Robot class
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_D);
		robot.keyRelease(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		
	}

}
