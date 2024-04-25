package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://letcode.in/selectable");
       
       List<WebElement> selectall = driver.findElements(By.xpath("//*[@id=\"selectable\"]"));
       
       Actions actions = new Actions(driver);
      
       //1st method
      actions.keyDown(Keys.CONTROL).click(selectall.get(0)).click(selectall.get(1)).build().perform();
       
       //2nd method
        actions.clickAndHold(selectall.get(0)).clickAndHold(selectall.get(1)).build().perform();
	}

}
