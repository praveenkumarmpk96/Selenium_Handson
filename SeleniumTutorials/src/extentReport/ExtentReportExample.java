package extentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentReportExample {

	WebDriver driver;
	ExtentReports extentreport;
	ExtentHtmlReporter htmlreport;
	ExtentTest testcase;
	
	@Test
	public void opengoogle() {
		testcase = extentreport.createTest("Open Google");
		testcase.log(Status.INFO, "Navigating to Google");
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		testcase.log(Status.INFO,"Actual title is:"+title);
		testcase.log(Status.INFO, "Expected title is:" +"Google");
		testcase.log(Status.INFO, "verification of actual and expected title");
		if(title.equals("Google")) {
			testcase.log(Status.PASS, "Actual and expected title are equal");
		}else {
            testcase.log(Status.FAIL, "Actual and expected title are not equal");
		}
	}
	
	@Test
	public void openbing() {
		testcase = extentreport.createTest("Open bing");
		testcase.log(Status.INFO, "Navigating to bing");
		driver.get("https://www.bing.com");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual title is:"+title);
		testcase.log(Status.INFO, "Expected title is:"+"bing");
		if(title.equals("bing")) {
			testcase.log(Status.PASS, "Actual and expected title are equal");
		}else {
			testcase.log(Status.FAIL, "Actual and expected title are not equal");
		}
	}
	
	@Test
	public void openwikipedia() {
		testcase = extentreport.createTest("Open Wikipedia");
		testcase.log(Status.INFO, "Navigating to wikipedia");
		driver.get("https://www.wikipedia.com");
		String title = driver.getTitle();
		testcase.log(Status.INFO, "Actual title is:"+title);
		testcase.log(Status.INFO, "Expected title is:" +"Wikipedia");
		if(title.equals("Wikipedia")) {
			testcase.log(Status.PASS, "Actual title and expected title are equal");
		}else {
			testcase.log(Status.FAIL, "Actual and expected title are not equal");
		}
	}
	
	@BeforeSuite
	public void launchbrowser() {
	 extentreport = new ExtentReports();
	 htmlreport = new ExtentHtmlReporter("extentreport.html");
	 extentreport.attachReporter(htmlreport);
	    driver = new ChromeDriver();
	}
	
	@AfterSuite
	public void closebrowser() {
		driver.close();
		extentreport.flush();
	}
}
