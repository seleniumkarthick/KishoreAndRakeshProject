package com.product.admin.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.product.admin.pages.AddCategoryPage;
import com.product.admin.pages.CategoryListingPage;
import com.product.admin.pages.DashboardPage;
import com.product.admin.pages.LoginPage;

public class CategoryTest {
	
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:81/product/admin/login.php");
	
		LoginPage loginPageObj=new LoginPage(driver);
		DashboardPage dashboardObj=new DashboardPage(driver);
		CategoryListingPage categoryListObj=new CategoryListingPage(driver);
		AddCategoryPage addCategoryObj=new AddCategoryPage(driver);
		
		loginPageObj.userDetails("admin","admin");
		dashboardObj.clickCategory();
		categoryListObj.clickNewCategory();
		
		//testcase:1
		addCategoryObj.addNewCategory("testing123");
		
		String actual=addCategoryObj.getErrorMsg();
		String expected="Category name is already exist. please enter new category name";
		
		Assert.assertEquals(actual, expected);
		
		//testcase:2
		
		addCategoryObj.addNewCategory("");
		
		String actual1=addCategoryObj.getErrorMsg();
		String expected1="	Category name should not be empty";
		
		Assert.assertEquals(actual1, expected1);
		
		
	}
	

}
