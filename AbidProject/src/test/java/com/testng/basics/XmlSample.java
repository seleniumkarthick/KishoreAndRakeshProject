package com.testng.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.product.admin.pages.LoginPage;

public class XmlSample {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:81/product/admin/login.php");
	}
	

	@AfterTest
	public void teardown(){
		driver.quit();
	}
	
	@Parameters({"username","password"})
	@Test(priority=1)
	public void b_m1(String user,String pass){
		
		LoginPage loginObj=new LoginPage(driver);
		loginObj.userDetails(user,pass);
		
	}
	
	

}
