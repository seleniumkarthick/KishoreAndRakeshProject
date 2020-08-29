package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product");
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("testing123"))).build().perform();
		
		driver.findElement(By.linkText("subtesting123")).click();
	}

}
