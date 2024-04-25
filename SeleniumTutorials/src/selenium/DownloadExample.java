package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");

		WebElement downloadexcel = driver.findElement(By.linkText("Download Excel"));
		downloadexcel.click();

		Thread.sleep(4000);

		File filelocation = new File("C:\\Users\\Prave\\Downloads");

		File[] totalfiles = filelocation.listFiles();

		//		System.out.println(totalfiles);

		for (File inputfile : totalfiles) {
			if(inputfile.getName().equals("sample.xlsx"))
			{
				System.out.println("Excel File is downloaded");
				break;
			}

		}

		WebElement downloadpdf = driver.findElement(By.linkText("Download Pdf"));
		downloadpdf.click();

		Thread.sleep(4000);
		//		
		//		File filelocation = new File("C:\\Users\\Prave\\Downloads");
		//		
		//		File[] totalfiles = filelocation.listFiles();

		//		System.out.println(totalfiles);

		for (File inputfile1 : totalfiles) {
			if(inputfile1.getName().equals("sample.pdf"))
			{
				System.out.println("PDF File is downloaded");
				break;
			}

		}

		WebElement downloadtext = driver.findElement(By.linkText("Download Text"));
		downloadtext.click();

		Thread.sleep(4000);
		//		
		//		File filelocation = new File("C:\\Users\\Prave\\Downloads");
		//		
		//		File[] totalfiles = filelocation.listFiles();

		//		System.out.println(totalfiles);

		for (File inputfile : totalfiles) {
			if(inputfile.getName().equals("sample.txt"))
			{
				System.out.println("Text File is downloaded");
				break;
			}

		}
	}

}
