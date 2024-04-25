package seleniumInterviewExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://total-qa.com/checkbox-example/");
		
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		List<WebElement> allboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		Thread.sleep(5000);
		
		for(WebElement element : allboxes)
		{
			element.click();
		}
//		driver.quit();
	}

}
