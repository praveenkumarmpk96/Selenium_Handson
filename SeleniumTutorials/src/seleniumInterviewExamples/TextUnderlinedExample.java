package seleniumInterviewExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextUnderlinedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement underlinedtext = driver.findElement(By.xpath("//a[contains (text(),'தமிழ்')]"));
		
		String beforehovering = underlinedtext.getCssValue("text-decoration");
		System.out.println("Before hovering "+beforehovering);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(underlinedtext);
		actions.perform();
		
		String afterhovering = underlinedtext.getCssValue("text-decoration");
		System.out.println("After hovering "+afterhovering);
		
	}

}
