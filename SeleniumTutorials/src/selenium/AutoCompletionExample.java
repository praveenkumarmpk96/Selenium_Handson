package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autocomplete.html");
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		
		List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		for (WebElement inputpassing : optionslist) {
			if(inputpassing.getText().equals("webservices"))
			{
				inputpassing.click();
				System.out.println("If part");
				break;
			}
			else
			{
				System.out.println("else part");
			}
		}
	}

}
