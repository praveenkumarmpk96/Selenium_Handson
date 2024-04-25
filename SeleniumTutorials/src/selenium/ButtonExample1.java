package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://letcode.in/buttons");
		
		//1.go to home and come back here using driver command
		WebElement gohome = driver.findElement(By.id("home"));
		gohome.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//2.Get the X & Y coordinates
		WebElement getposition = driver.findElement(By.id("position"));
		Point xycoordinates = getposition.getLocation();
		int xpoint = xycoordinates.getX();
		int ypoint = xycoordinates.getY();
		System.out.println("X value is:" +xpoint+ "Y value is:" +ypoint);
		
		//3.Find the color of the button
		WebElement bgcolor = driver.findElement(By.id("color"));
		String backgroundcolor = bgcolor.getCssValue("background-color");
		System.out.println("Color of the button is:" +backgroundcolor);
		
		//4.Find the height and width of the button
		WebElement size = driver.findElement(By.id("property"));
		int height = size.getSize().getHeight();
		int width = size.getSize().getWidth();
		System.out.println("Height of the button is: " +height+ "Width of  the button is: "+width);
		
		//5.confirm button is disabled
		WebElement disabledbox = driver.findElement(By.id("isDisabled"));
		boolean buttondisabled = disabledbox.isEnabled();
		System.out.println(buttondisabled);
		
		
	}

}
