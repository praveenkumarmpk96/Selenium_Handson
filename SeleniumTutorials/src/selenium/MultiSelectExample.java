package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiSelectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		
		Actions actions = new Actions(driver);
		
		WebElement selen = driver.findElement(By.xpath("//h3[text()='Selenium']"));
		
		WebElement appium = driver.findElement(By.xpath("//h3[text()='Appium']"));
		WebElement test = driver.findElement(By.xpath("//h3[text()='Testproject.io']"));
		actions.keyDown(Keys.CONTROL).click(selen).click(appium).click(test).perform();
		
	}

}
