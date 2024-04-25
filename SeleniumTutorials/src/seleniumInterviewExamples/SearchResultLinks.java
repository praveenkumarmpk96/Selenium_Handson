package seleniumInterviewExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement searchterm = driver.findElement(By.name("q"));
		searchterm.sendKeys("Game of thrones \n");
		
		/*Printing all the URL's on the webpage*/
		List<WebElement>  totallinks = driver.findElements(By.xpath("//a"));
		
		for(WebElement links:totallinks) {
			String httplinks = links.getAttribute("href");
			System.out.println(httplinks);
		}
		
		/*Printing the above link of heading link*/
		List<WebElement> citelinks = driver.findElements(By.xpath("//*[@id='search']//following::h3//following::div/cite"));
		
		for (WebElement links1 : citelinks) {
			String citelinks1 = links1.getText();
			System.out.println(citelinks1);
		}
		
	}

}
