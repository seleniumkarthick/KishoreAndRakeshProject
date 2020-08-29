package com.java.selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.product.admin.pages.LoginPage;

public class WindowsSample {
	
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
		
		LoginPage loginPageObj=new LoginPage(driver);
		loginPageObj.userDetails("admin","admin");
		
		driver.findElement(By.linkText("Registered Listings")).click();
		driver.findElement(By.linkText("karthick kumar")).click();
		
		String parent=driver.getWindowHandle();
		
		for(String child:driver.getWindowHandles()){
			driver.switchTo().window(child);
		}
		
		driver.close();
		
		driver.switchTo().window(parent);
		
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
	}

}
