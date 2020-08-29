package com.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.product.admin.pages.AddCategoryPage;
import com.product.admin.pages.CategoryListingPage;
import com.product.admin.pages.DashboardPage;
import com.product.admin.pages.LoginPage;

public class AnnotatinSample2 {
	
	
	@Test(priority=3)
	public void c_m1(){
		System.out.println("33333333");
	}
	
	

	@Test(priority=4)
	public void m2(){
		System.out.println("4444444");
	}
	

	@Test(priority=3)
	public void c_m3(){
		System.out.println("33333333");
	}
	
	@Test(priority=4)
	public void m4(){
		System.out.println("4444444");
	}
	
	

}
