package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.java.utils.BaseTest;

public class WebDriverSample2 extends BaseTest {

	public static void main(String[] args) {
		
		BaseTest obj=new BaseTest();
		obj.launchBrowser();
		
		driver.findElement(By.linkText("FAQ")).click();
		
		String actual=driver.getCurrentUrl();
		String expected="http://localhost:81/product/faq.php";
		
		Assert.assertEquals(actual,expected);
		
		driver.quit();
		
		
	}

}
