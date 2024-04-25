package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		
		WebElement dragdrop = driver.findElement(By.id("draggable"));
		
		Actions drag = new Actions(driver);
		
		WebElement droppable = driver.findElement(By.id("droppable"));
		
		drag.dragAndDrop(dragdrop, droppable).perform();
	}

}
