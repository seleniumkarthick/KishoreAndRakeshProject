package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_default");
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		String val=driver.findElement(By.xpath("//h1")).getText();
		System.out.println(val);
		
		driver.switchTo().defaultContent();
	}

}
