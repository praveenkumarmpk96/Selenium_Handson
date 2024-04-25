package seleniumInterviewExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickGoogleSuggestions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	    WebElement searchterm = driver.findElement(By.name("q"));
	    searchterm.sendKeys("Game of thrones");
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> searchsuggestions = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	    
//	    /*click using position*/
//	    int position = 0;
//	    for (WebElement webElement : searchsuggestions) {
//			System.out.println(webElement.getText());
//			position++;
//			if(position==3) {
//				webElement.click();
//				break;
//			}
//	    }
		/*click using particular keyword*/
			for (WebElement webElement : searchsuggestions) {
				String text = webElement.getText();
				System.out.println(text);
				if(text.contains("cast")) {
					webElement.click();
					break;
				}
				
		}
	    driver.quit();
	}

}
