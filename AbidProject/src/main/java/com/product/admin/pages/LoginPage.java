package com.product.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="txtusername")
	WebElement username;
	
	@FindBy(name="txtpassword")
	WebElement pass;
	
	@FindBy(name="submit")
	WebElement submitBtn;
	
	
	public void userDetails(String username1,String password1){
		username.clear();
		username.sendKeys(username1);
		
		pass.clear();
		pass.sendKeys(password1);
		
		submitBtn.click();
	}
	

}
