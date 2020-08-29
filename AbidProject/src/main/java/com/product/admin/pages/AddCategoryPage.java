package com.product.admin.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	
	WebDriver driver;
	
	public AddCategoryPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="cat_name")
	WebElement cat_name;
	
	@FindBy(name="submit")
	WebElement postBtn;
	
	@FindBy(xpath="//*[@id='passwordid']/form/table/tbody/tr[1]/td[3]")
	WebElement errorMessage;
	
	
	
	
	
	public void addNewCategory(String val){
		cat_name.clear();
		cat_name.sendKeys(val);
		
		postBtn.click();
	}
	
	public String getErrorMsg(){
		return errorMessage.getText();
	}

}
