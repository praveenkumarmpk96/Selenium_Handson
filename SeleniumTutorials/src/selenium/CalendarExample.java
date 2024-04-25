package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
		Thread.sleep(3000);
		WebElement fromdate = driver.findElement(By.id("first_date_picker"));
		fromdate.click();
		
		WebElement selectdate = driver.findElement(By.xpath("//a[contains(text(),'13')]"));
        selectdate.click();
		
        WebElement sixthdate = driver.findElement(By.xpath("//img[@title='Calendar-icon']"));
        sixthdate.click();
        
        WebElement nextbutton  = driver.findElement(By.xpath("//a[@title='Next']"));
        nextbutton.click();
        
        WebElement novdate = driver.findElement(By.xpath("//a[contains(text(),'16')]"));
        novdate.click();
       Thread.sleep(3000);
        driver.quit();
        
	}

}
