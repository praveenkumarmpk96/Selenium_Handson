package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/windows");
		
		String oldwindow = driver.getWindowHandle();
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newwindow : handles) {
			
			driver.switchTo().window(newwindow);
			
		}
		
		String titleofpage = driver.getTitle();
		System.out.println(titleofpage);
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement multiwindow = driver.findElement(By.id("multi"));
		multiwindow.click();
		
		Set<String> allwindows = driver.getWindowHandles();
		
		for (String multiplewindows : allwindows) {
			if(!multiplewindows.equals(oldwindow)) {
			driver.switchTo().window(multiplewindows);
			String allwindowstitle = driver.getTitle();
			System.out.println(allwindowstitle);
			driver.close();
			}
		}
		
        driver.quit();
	}

}
