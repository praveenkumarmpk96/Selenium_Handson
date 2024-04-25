package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		WebElement visibletext = driver.findElement(By.id("fruits"));
		Select select1 = new Select(visibletext);
		select1.selectByVisibleText("Apple");
		
		boolean multiplevalues1 = select1.isMultiple();
		System.out.println(multiplevalues1);
		
		WebElement superheros = driver.findElement(By.id("superheros"));
		
		Select multiselect = new Select(superheros);
		
		multiselect.selectByIndex(0);
		multiselect.selectByIndex(2);
		multiselect.selectByIndex(4);
		
		boolean multiplevalues = multiselect.isMultiple();
		System.out.println(multiplevalues);
		
		WebElement selectvalue = driver.findElement(By.id("country"));
		Select selectvalue1 = new Select(selectvalue);
		selectvalue1.selectByValue("India");
		WebElement selectvalue2 = selectvalue1.getFirstSelectedOption();
		System.out.println(selectvalue2.getText());
		
		WebElement last = driver.findElement(By.id("lang"));
		Select lastlanguage = new Select(last);
		lastlanguage.selectByVisibleText("C#");
		
		List<WebElement> noofoptions = lastlanguage.getOptions();
		int noofoptions1 = noofoptions.size();
		System.out.println(noofoptions1);
		
		//List<WebElement> alloptions = multiselect.getAllSelectedOptions();
		
		
	}

}
