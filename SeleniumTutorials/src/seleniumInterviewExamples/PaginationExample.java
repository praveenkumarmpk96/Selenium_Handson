package seleniumInterviewExamples;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationExample {

	static WebElement nextbutton;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nameslist = new ArrayList<String>();
		List<WebElement> listofnames;
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/pagination/");
		
		 int SizeofPagination = driver.findElements(By.xpath("//div[@id='dtBasicExample_paginate']//a")).size();
		 System.out.println(SizeofPagination);
		 
		 if(SizeofPagination>0) {
			 
			 do {
			listofnames = driver.findElements(By.xpath("//td[@class='sorting_1']"));
			for (WebElement names : listofnames) {
				nameslist.add(names.getText());
			}
			
			nextbutton = driver.findElement(By.id("dtBasicExample_next"));
			 String nextclassname = nextbutton.getAttribute("class");
			 
			 if(!nextclassname.contains("disabled")) {
				 nextbutton.click();
			 }else {
				   break;
			 }
			 }while(true);
			 
		 }
			 else {
			 System.out.println("No pagination in this page");
		 }
		 for (String allnames : nameslist) {
			 System.out.println(allnames);
		}
		}
}
