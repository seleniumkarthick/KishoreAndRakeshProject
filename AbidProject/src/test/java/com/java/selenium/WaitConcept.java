package com.java.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * implicity wait - entire page to get loaded
		 * Explicit wait - particular element to load
		 * Fluent wait - particular element to load we will give polling time
		 * 
		 */

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/user_product_upload.php");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Select cat=new Select(driver.findElement(By.id("drop_1")));
		cat.selectByVisibleText("testing123");
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id( "tier_two")));
		

		Select sub_cat=new Select(driver.findElement(By.id("tier_two")));
		sub_cat.selectByVisibleText("subtesting123");
	}

}
