package com.java.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {
	
	/*
	 * switchTo().alert()
	 * switchTo().window(windowname)
	 * switchTo().frame(locator)
	 * 
	 */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/admin/login.php");
		
		driver.findElement(By.id("submit")).click();
		
		Alert x=driver.switchTo().alert();
		System.out.println(x.getText());
		
		x.accept();
		
		//x.dismiss();
		//x.sendKeys("test");
	}

}
