package seleniumInterviewExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class ActiveElementExample {
	
	static WebElement q;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

   /*1.Using switchto() Active element*/

		driver.switchTo().activeElement().sendKeys("dhoni \n");

   /*2.Without findelement using pagefactory*/
		
		PageFactory.initElements(driver, ActiveElementExample.class);
		
		q.sendKeys("dhoni \n");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
