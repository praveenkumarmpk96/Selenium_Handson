package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://letcode.in/frame");
       
       driver.switchTo().frame("firstFr");
       //1.enter first name
       WebElement fname = driver.findElement(By.name("fname"));
       fname.sendKeys("Praveen");
       
       //2.enter last nmae
       WebElement lastname = driver.findElement(By.name("lname"));
       lastname.sendKeys("Kumar");
       
   
       
       WebElement emailframe = driver.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe")); 
       
       driver.switchTo().frame(emailframe);
      
       //3.enter email
       WebElement email = driver.findElement(By.name("email"));
       email.sendKeys("mpkumar1117@gmail.com");
       
       driver.switchTo().defaultContent();
       
       WebElement watchtutoriallink = driver.findElement(By.xpath("/html/body/app-root/app-frames/section[1]/div/div/div[2]/app-learning-point/div/footer/a"));
		watchtutoriallink.click();
	}

}
