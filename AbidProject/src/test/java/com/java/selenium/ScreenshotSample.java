package com.java.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/admin/login.php");
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(SrcFile, new File("E:\\rakesh_kishore.jpg"));
		
		driver.get("http://localhost:81/product");

		TakesScreenshot scrShot1 =((TakesScreenshot)driver);
		File SrcFile1=scrShot1.getScreenshotAs(OutputType.FILE);
	
		FileUtils.copyFile(SrcFile1, new File("E:\\rakesh_kishore_home.jpg"));
		
		
	}

}
