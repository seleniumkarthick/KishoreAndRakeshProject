package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebDriverSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/");
		
		String titile=driver.getTitle();
		System.out.println(titile);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		String source=driver.getPageSource();
		System.out.println(source);
		
		driver.quit();
	}

}
