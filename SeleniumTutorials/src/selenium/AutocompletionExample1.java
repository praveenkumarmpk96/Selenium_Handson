package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompletionExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com");
         
         WebElement wordenter = driver.findElement(By.id("APjFqb"));
         wordenter.sendKeys("Selenium");
         Thread.sleep(5000);
         List<WebElement> optionslist = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));
         
         int noofoptions = optionslist.size();
         System.out.println(noofoptions);
         
         Thread.sleep(4000);
         for (WebElement webElement : optionslist) {
        	 if (webElement.getText().equals("selenium interview questions")) {
        		 webElement.click();
//        		 System.out.println(webElement.getText());
				break;
			}
			
		}
        
         driver.quit();
         
      
	}

}
