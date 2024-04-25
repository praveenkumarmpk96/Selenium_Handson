package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/pages/link.html");
		
		WebElement homepage = driver.findElement(By.linkText("Go to homepage"));
		homepage.click();
		
		WebElement wheretogo = driver.findElement(By.partialLinkText("Find Where"));
		String where = wheretogo.getAttribute("href");
		System.out.println("this link is going to:"+where);
		
		WebElement brokenimage = driver.findElement(By.linkText("Verify am i broken?"));
		brokenimage.click();
		String title = driver.getTitle();
		
		if(title.contains("404"))
		{
			System.out.println("link is broken");
		}
		
		homepage.click();//staleelement reference exception error( if we use the same link 
		                 //which is used previously without finding that webelement again 
		//we will get this error because the page got loaded several time before using back so we need to 
		//find the webelement again and use that element
		
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		int totallinks = nooflinks.size();
		System.out.println(totallinks);
		
	}

}
