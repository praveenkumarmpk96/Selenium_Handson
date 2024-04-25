package seleniumInterviewExamples;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms11.htm");
		
		//Scroll to some position Using Javascript executor
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scroll(0,400)", "");
		Thread.sleep(3000);
		executor.executeScript("window.scroll(0,-400)", "");
		
		//Scroll to bottom of the page
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
		//scroll to top of the page
		executor.executeScript("window.scroll(0,0)", "");
		
		//scroll to some element by identify it
		WebElement link = driver.findElement(By.linkText("online tool"));
		executor.executeScript("arguments[0].scrollIntoView(true);", link);
		
		//*Using Robot class*/
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		}

}
