package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/alert");
		
		WebElement simplealert = driver.findElement(By.id("accept"));
		simplealert.click();
		
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(3000);
		alert1.accept();
		
		WebElement confirmbutton = driver.findElement(By.id("confirm"));
		confirmbutton.click();
		
		Alert confirmalert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmalert.dismiss();
		
		WebElement promptbutton = driver.findElement(By.id("prompt"));
		promptbutton.click();
		
		Alert promptalert = driver.switchTo().alert();
		promptalert.sendKeys("Dhoni");
		System.out.println(promptalert.getText());
		promptalert.accept();
		
		WebElement prompttext = driver.findElement(By.id("myName"));
		String mytext = prompttext.getText();
		System.out.println(mytext);
		
		WebElement sweetalert = driver.findElement(By.id("modern"));
		sweetalert.click();
		WebElement modernalert = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p"));
		String modernbox = modernalert.getText();
		System.out.println(modernbox);
		
		

	}

}
