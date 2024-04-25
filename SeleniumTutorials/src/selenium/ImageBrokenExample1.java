package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBrokenExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		Thread.sleep(3000);
		WebElement img1 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		
		if (img1.getAttribute("naturalWidth").equals("0")) 
		{
			System.out.println("Image is broken");
		}else {
			System.out.println("image is not broken");
		}
		
		WebElement img2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[3]"));
		
		if (img2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image is broken");
			
		}else
		{
			System.out.println("Image is not broken");
		}
		driver.quit();
	}

}
