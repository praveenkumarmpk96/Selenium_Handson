package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
     System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://letcode.in/file");
     
     WebElement downloadexcel = driver.findElement(By.linkText("Download Excel"));
     downloadexcel.click();
     
     Thread.sleep(4000);
     File file = new File("C:\\Users\\Prave\\Downloads");
     
     File[] totalfiles = file.listFiles();
    
    
     for (File file2 : totalfiles) {
		if (file2.getName().equals("sample.xlsx")) {
			System.out.println("excel is downloaded");
			break;
		}
	}
    
     WebElement downloadpdf = driver.findElement(By.linkText("Download Pdf"));
     downloadpdf.click();
     Thread.sleep(4000);
    File file1 = new File("C:\\Users\\Prave\\Downloads");
     
     File[] totalfiles1 = file.listFiles();
     
     for (File file3 : totalfiles1) {
    	 if (file3.getName().equals("sample.pdf")){
 			System.out.println("PDF is downloaded");
 			break;
 		}
 		
	}
     
     WebElement downloadtext = driver.findElement(By.xpath("//*[@id=\"txt\"]"));
     downloadtext.click();
     Thread.sleep(4000);
     File file2 = new File("C:\\Users\\Prave\\Downloads");
     
     File[] totalfiles2 = file.listFiles();
     for (File file4 : totalfiles2) {
		if (file4.getName().equals("sample.txt")) {
			System.out.println("Text files is downloaded");
			break;
		}
	}
     
     driver.quit();
	}

}
