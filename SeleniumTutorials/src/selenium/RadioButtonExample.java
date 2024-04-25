package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement anyone = driver.findElement(By.id("yes"));
		anyone.click();
		
		WebElement unchecked = driver.findElement(By.id("foo"));
		boolean selectstatus = unchecked.isSelected();
	
		WebElement checked = driver.findElement(By.id("notfoo"));
		boolean selectstatus1 = checked.isSelected();
		
		System.out.println(selectstatus);
		System.out.println(selectstatus1);
		
		WebElement disabled = driver.findElement(By.id("maybe"));
		boolean disabledstatus = disabled.isEnabled();
		System.out.println(disabledstatus);
		
		WebElement remember = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		boolean rememberstatus = remember.isSelected();
		System.out.println(rememberstatus);
		
		driver.quit();

	}

}
