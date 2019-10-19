package com.slel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableData {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	WebElement table=driver.findElement(By.className("dataTable"));
	
	List<WebElement> tr=table.findElements(By.tagName("tr"));
	
	System.out.println("total no .of rows "+tr.size());
	
	for(WebElement row:tr){
		
		List<WebElement> td=row.findElements(By.tagName("td"));
		
		for(WebElement col:td){
			
			System.out.println(col.getText());
		}
	}
	
		
	}

	
}
