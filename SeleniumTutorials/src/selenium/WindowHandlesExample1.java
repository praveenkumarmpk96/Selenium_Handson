package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://letcode.in/windows");
         
         String oldwindow = driver.getWindowHandle();
         
         //1.click on the home button
         WebElement homebutton = driver.findElement(By.id("home"));
         homebutton.click();
         
         //2.goto the newly opened tab and print the title of the page
         Set<String>  newtab = driver.getWindowHandles();
         
         for (String newwindow : newtab) {
      
        	 driver.switchTo().window(newwindow);
			
		}     
         String titlepage = driver.getTitle();
    	 System.out.println(titlepage);
    	 
    	 //3.close the child window
    	for (String allwindows : newtab) {
    		if (!allwindows.equals(oldwindow)) {
    			driver.close();
				
			}
			
		}
    	
       	 driver.switchTo().window(oldwindow);
       	 
       	 //4.click on the multiple windows button and print all the title
       	 WebElement multiplewindows = driver.findElement(By.id("multi"));
       	 multiplewindows.click();
       	 
       	Set<String> multipletabs = driver.getWindowHandles();
       	
       	for (String allwindows : multipletabs) {
			
       		driver.switchTo().window(allwindows);
       		String titlepage1 = driver.getTitle();
       	 System.out.println(titlepage1);
		}
    	
	}

}
