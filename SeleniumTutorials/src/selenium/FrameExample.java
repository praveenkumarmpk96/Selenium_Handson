package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("firstFr");
		WebElement fnamepath = driver.findElement(By.xpath("//iframe[@src='frameUI']"));
		driver.switchTo().frame(fnamepath);
		
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Praveen");
		
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("Kumar");
		
		WebElement emailxpath = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(emailxpath);
		WebElement emailid = driver.findElement(By.name("email"));
		emailid.sendKeys("mpkumar1117@gmail.com");
		
		driver.switchTo().parentFrame();
		lastname.sendKeys(" M ");
		
		driver.switchTo().defaultContent();
		
		WebElement watchtutoriallink = driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"));
		watchtutoriallink.click();
	}

}
