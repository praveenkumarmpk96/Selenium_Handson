package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinksExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		
		//1.Go to dashboard
		WebElement dashboardpage = driver.findElement(By.linkText("Go to Dashboard"));
		dashboardpage.click();
		
		
		driver.navigate().back();
		
		//2.Find the url without clicking me
		WebElement withoutclick = driver.findElement(By.partialLinkText("Find the URL without"));
		
		String findurl = withoutclick.getAttribute("href");
		
		System.out.println("Url is:" +findurl);
		
		//3.verify the link is broken
		WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
		brokenlink.click();
		
		if (driver.getTitle().contains("404")) {
			System.out.println("link is broken");
			
		}else {
			System.out.println("link is not broken");
		}
		
		driver.navigate().back();
		
		//4.find the number of links in the page
		List<WebElement> nooflinks = driver.findElements(By.tagName("a"));
		int totallinks  = nooflinks.size();
		System.out.println("no of links in this page:" +totallinks);
	
		Thread.sleep(3000);
		//5.Go to dashboard - duplicate link
		WebElement dashboardpage1 = driver.findElement(By.linkText("Go to Dashboard"));
		dashboardpage1.click();//staleelement reference exception error( if we use the same link 
                               //which is used previously without finding that webelement again 
                               //we will get this error because the page got loaded several time before using back method so we need to 
                               //find the webelement again and use that element to avoid this error
		
		driver.quit();
	}

}
