package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//1.Accept the Alert
		WebElement acceptbox = driver.findElement(By.id("accept"));
		acceptbox.click();
		
		Alert acceptalert = driver.switchTo().alert();
		
		acceptalert.accept();
		
		//2.Dismiss the alert and print the text
		WebElement dismissbox = driver.findElement(By.id("confirm"));
		dismissbox.click();
		
		Alert dismissalert = driver.switchTo().alert();
			
		dismissalert.dismiss();
		
		//3.Type your name and accept
		WebElement namebox = driver.findElement(By.id("prompt"));
		namebox.click();
		
		Alert namealert = driver.switchTo().alert();
		
		namealert.sendKeys("Dhoni");
		namealert.accept();
		
		//4.Sweet Alert
		WebElement modernbox = driver.findElement(By.xpath("//*[@id=\"modern\"]"));
		modernbox.click();
		Thread.sleep(3000);
		WebElement modernalert = driver.findElement(By.xpath("/html/body/app-root/app-alert/section[1]/div/div/div[1]/div/div/div[5]/div[2]/div/div/p"));
		String displaymodern = modernalert.getText();
		System.out.println(displaymodern);
				
	}

}
