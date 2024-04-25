package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://letcode.in/buttons");
		
		WebElement home = driver.findElement(By.id("home"));
		home.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		
		
		WebElement getposition = driver.findElement(By.id("position"));
		Point xypoint = getposition.getLocation();
		int xpoint = xypoint.getX();
		int ypoint = xypoint.getY();
		System.out.println("X value is :" +xpoint+ "Y value is :" +ypoint);
		
		WebElement getcolor = driver.findElement(By.id("color"));
		String bgcolor = getcolor.getCssValue("background-color");
		System.out.println("Color of the button is :" +bgcolor);
		
		WebElement getheightwidth = driver.findElement(By.id("property"));
		int height = getheightwidth.getSize().getHeight();
		int width = getheightwidth.getSize().getWidth();
		System.out.println("Height of the button is :" +height+ "Width of the button is:" +width);
		
		WebElement disabled = driver.findElement(By.id("isDisabled"));
		boolean value = disabled.isEnabled();
		System.out.println(value);
		
		WebElement homepage = driver.findElement(By.id("home"));
		homepage.click();
		
	}

}
