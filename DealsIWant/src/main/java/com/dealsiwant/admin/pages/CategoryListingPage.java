package com.dealsiwant.admin.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryListingPage {

	WebDriver driver;
	
	public CategoryListingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Category/Subcategory")
	WebElement catLink;

	@FindBy(xpath="//*[@id='myTable']/tbody/tr")
	List<WebElement> tableRow;
	
	public boolean verifyCategory(String val){
		
		boolean flag=false;
		
		int count=tableRow.size();
		System.out.println(count);
		for(int i=1;i<=count;i++){
			String category=driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr["+i+"]/td[2]")).getText();
			if(category.equals(val)){
				flag=true;
				break;
			}
		}
		return flag;
	}
}
