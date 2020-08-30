package com.dealsiwant.admin.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="txtusername")
	WebElement user;

	@FindBy(name="txtpassword")
	WebElement pass;

	@FindBy(name="submit")
	WebElement submit;

	
	public void enterAdminCredential(String username,String password){
		user.clear();
		user.sendKeys(username);
		
		pass.clear();
		pass.sendKeys(password);
		
		submit.click();
		
	}
	
	
}
