package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://letcode.in/table");
		
		
		List<WebElement> simpletable = driver.findElements(By.xpath("//*[@id='simpletable']/thead/tr/th"));
		int totalcolumns = simpletable.size();
		System.out.println(totalcolumns);
		
		List<WebElement> totalrows = driver.findElements(By.xpath("//*[@id='simpletable']/tbody/tr"));
		int rowscount = totalrows.size();
		System.out.println(rowscount);
		Thread.sleep(5000);
		WebElement lastname = driver.findElement(By.xpath("//td[normalize-space()='Raj']//following::td[2]/input"));
		lastname.click();
		Thread.sleep(3000);
		
    	List<WebElement> Productprice= driver.findElements(By.xpath("//table[@id='shopping']/tbody/tr/td[2]"));
		
		WebElement total = driver.findElement(By.xpath("//*[@id='shopping']/tfoot/td[2]/b"));
		
		
		String totalamount = total.getText();
		int total1 =Integer.parseInt(totalamount);
		
		int sum =0;
		for (WebElement totalprice : Productprice) {
			String priceslist = totalprice.getText();
			int price = Integer.parseInt(priceslist);
			sum = sum+price;
		}
		System.out.println(sum);
		
		if(sum == total1) {
			System.out.println("Total price is correct");
		}
		else {
			System.out.println("Total price is not correct");
		}
		driver.quit();
		
			}

}
