package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/radio");
		
		//1.select anyone
		WebElement selectone = driver.findElement(By.id("no"));
		selectone.click();
		
		//2.Find which one is  selected
		//First method
//		WebElement foo = driver.findElement(By.id("foo"));
//		boolean selected = foo.isSelected();
//		System.out.println(selected);
//		
//		WebElement notfoo = driver.findElement(By.id("notfoo"));
//		boolean selected1 = notfoo.isSelected();
//		System.out.println(selected1);
		
		//Second method
		WebElement foo = driver.findElement(By.id("foo"));
    	WebElement notfoo = driver.findElement(By.id("notfoo"));
    	
    	if(foo.isSelected()) 
    	{
    		System.out.println("foo is selected");
    	}
    	else if(notfoo.isSelected())
    	{
		    System.out.println("notfoo is selected");
    	}
    	
    	//3.Confirm last field is disabled
    	WebElement disabledbox = driver.findElement(By.id("maybe"));
    	boolean disabledbox1 = disabledbox.isEnabled();
    	System.out.println(disabledbox1);
    	
    	//4.Find if the checkbox is selected
    	WebElement check = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
    	boolean check1 = check.isSelected();
    	System.out.println(check1);
	}

}
