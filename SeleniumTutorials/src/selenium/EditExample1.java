package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/edit");
		
		//1.Enter your full name
		WebElement namebox = driver.findElement(By.id("fullName"));
		namebox.sendKeys("Praveen");
		
		//2.Append a text
		WebElement appendbox = driver.findElement(By.id("join"));
		appendbox.sendKeys("person");
		
		//3.what is inside the textbox
		WebElement insidebox = driver.findElement(By.id("getMe"));
		String insidevalue = insidebox.getAttribute("value");
		System.out.println(insidevalue);
		
		//4.clear the textbox
		WebElement clearbox = driver.findElement(By.id("clearMe"));
		clearbox.clear();
		
		//5.confirm edit field is disabled
		WebElement disabledbox = driver.findElement(By.id("noEdit"));
		boolean confirmdisabled = disabledbox.isEnabled();
		System.out.println(confirmdisabled);
		
		//6.confirm text is readonly
		
		WebElement readonly = driver.findElement(By.id("dontwrite"));
		String isreadonly = readonly.getAttribute("readonly");
		System.out.println(isreadonly);
		
		driver.quit();

	}

}
