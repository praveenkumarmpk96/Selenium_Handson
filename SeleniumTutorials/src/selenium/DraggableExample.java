package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraggableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://letcode.in/draggable");
		 
		 Actions action = new Actions(driver);
		 
		 WebElement drag = driver.findElement(By.id("sample-box"));
		 
		action.dragAndDropBy(drag, 100, 200).perform();
	}

}
