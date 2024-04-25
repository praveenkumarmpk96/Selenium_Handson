package seleniumInterviewExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToSearchInGoogle {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement googlesearch = driver.findElement(By.name("q"));
		
		//1./*Using sendkeys with enter*/
		googlesearch.sendKeys("dhoni"+Keys.ENTER);
		
		//2.*using sendkeys with submit*/
		googlesearch.sendKeys("dhoni");
		googlesearch.submit();
		
		//3.*using Robot class*/
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//4.*using \n*/
		googlesearch.sendKeys("dhoni \n");
		
		
	}

}
