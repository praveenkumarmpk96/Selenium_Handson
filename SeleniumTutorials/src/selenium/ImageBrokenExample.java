package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageBrokenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		WebElement brokenimage = driver.findElement(By.xpath("//*[@id=\"content\"]/div/img[1]"));
		
		
		if(brokenimage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else {
			System.out.println("Image is not broken");
		}
	}

}
