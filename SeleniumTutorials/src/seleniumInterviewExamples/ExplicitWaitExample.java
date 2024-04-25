package seleniumInterviewExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//   	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		WebElement loginbutton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginbutton.click();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement myinfo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")));
		
		myinfo.click();
	}

}
