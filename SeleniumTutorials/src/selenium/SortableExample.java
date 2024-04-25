package selenium;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demoSite/practice/sortable/connect-lists.html");
		
		Thread.sleep(3000);
		
		List<WebElement> itemlist1 = driver.findElements(By.xpath("//*[@id='sortable1']/li"));
		
		List<WebElement> itemlist2 = driver.findElements(By.xpath("//*[@id='sortable2']/li"));
		Thread.sleep(3000);
		WebElement from = itemlist1.get(0);
		WebElement to = itemlist2.get(3);
		
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(from);
		actions.moveToElement(to);
		actions.release(to);
		actions.build().perform();
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
