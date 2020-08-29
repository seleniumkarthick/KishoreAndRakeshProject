package com.java.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/");
		
		driver.findElement(By.linkText("About Us")).click();
		
		
		WebElement about=driver.findElement(By.linkText("Sign Up"));
		about.click();
		
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("rankesh_and_kishore");
		driver.findElement(By.name("name")).clear();
		driver.findElement(By.name("name")).sendKeys("rankesh_and_kishore");
		
		
		String textbox_val=driver.findElement(By.name("name")).getAttribute("value");
		System.out.println(textbox_val);
		
		String x=driver.findElement(By.xpath("//*[@id='formn']/div[2]/span[1]")).getText();
		System.out.println(x);
		
		System.out.println(driver.findElement(By.xpath("//*[@id='formn']/div[2]/span[1]")).getTagName());;
		
		String textbox_val1=driver.findElement(By.name("name")).getCssValue("width");
		System.out.println(textbox_val1);
		
		
		driver.findElement(By.xpath("//*[@id='formn']/div[2]/span[1]")).isDisplayed();
		
		driver.findElement(By.xpath("//*[@id='formn']/div[2]/span[1]")).isSelected();
		
		driver.findElement(By.xpath("//*[@id='formn']/div[2]/span[1]")).isEnabled();
		
		
	}

}
