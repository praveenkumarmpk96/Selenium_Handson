package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample1 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		//1.select the apple using visibletext
		WebElement fruitsselect = driver.findElement(By.id("fruits"));
		
		Select select = new Select(fruitsselect);
		
		select.selectByVisibleText("Apple");
		
		boolean fruitsselect1 = select.isMultiple();
		System.out.println(fruitsselect1);
		
		List<WebElement> totalsize = select.getOptions();
		int noofoptions = totalsize.size();
		System.out.println(noofoptions);
		
		//2.Select your super hero's
		
	    WebElement multiselect = driver.findElement(By.id("superheros"));
	    
	    Select multiselect1 = new Select(multiselect);
	    
	    multiselect1.selectByIndex(0);
	    multiselect1.selectByIndex(1);
	    multiselect1.selectByIndex(2);
	    multiselect1.selectByIndex(3);
	    
	    boolean multiselect2 = multiselect1.isMultiple();
		System.out.println(multiselect2);

	    
	    //3.select the last programming language and print all the options
	    WebElement last = driver.findElement(By.id("lang"));
	    
	    Select last1 = new Select(last);
	    
	    last1.selectByValue("sharp");
//	    List<WebElement> alllanguages = last1.getAllSelectedOptions();
//	    System.out.println(alllanguages);
	    
	    //4.Select india using value and print the selected value
	    WebElement countryselect = driver.findElement(By.id("country"));
	    Select countryselect1 = new Select(countryselect);
	    countryselect1.selectByValue("India");
	    WebElement countryselect2 = countryselect1.getFirstSelectedOption();
	    System.out.println(countryselect2.getText());

	    driver.quit();
	}

}
