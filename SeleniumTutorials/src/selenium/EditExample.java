package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		WebElement enterbox = driver.findElement(By.id("fullName"));
		enterbox.sendKeys("Praveen kumar");
		
		WebElement appendbox = driver.findElement(By.id("join"));
		appendbox.sendKeys(" person",Keys.TAB);
		
		WebElement insidevalue = driver.findElement(By.id("getMe"));
		String value = insidevalue.getAttribute("value");
		System.out.println(value);
		
		WebElement clearbox = driver.findElement(By.id("clearMe"));
		clearbox.clear();
		
		WebElement disabledbox = driver.findElement(By.id("noEdit"));
		boolean value1 = disabledbox.isEnabled();
		System.out.println(value1);

		WebElement readonly = driver.findElement(By.id("dontwrite"));
		String isreadonly = readonly.getAttribute("readonly");
		System.out.println(isreadonly);
		
		driver.quit();
	}

}
