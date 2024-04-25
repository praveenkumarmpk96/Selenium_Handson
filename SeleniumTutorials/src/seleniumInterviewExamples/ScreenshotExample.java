package seleniumInterviewExamples;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourcefile = screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile = new File("D:\\Selenium_Screenshots\\Sample.png");
		
		FileHandler.copy(sourcefile, destinationfile);
		
		FileUtils.copyFile(sourcefile, destinationfile);
		
		WebElement simplealert = driver.findElement(By.id("accept"));
		simplealert.click();
		
		Thread.sleep(3000);
		/*Using Robot class*/
		
		Robot robot = new Robot();
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(screensize);
		BufferedImage srcfile = robot.createScreenCapture(rectangle);
		
		File destinationfile1 = new File("D:\\Selenium_Screenshots\\Sample1.png");
		
		ImageIO.write(srcfile, "png", destinationfile1);
		
		driver.quit();
	}

}
