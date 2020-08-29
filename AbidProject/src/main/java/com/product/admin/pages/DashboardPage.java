package com.product.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	public DashboardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Category/Subcategory")
	WebElement catLink;
	
	@FindBy(linkText="Registered Listings")
	WebElement regLink;
	
	
	public void clickCategory(){
		catLink.click();
	}
	
	public void clickRegListing(){
		regLink.click();
	}
	

}
