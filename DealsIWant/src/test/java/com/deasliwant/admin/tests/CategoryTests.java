package com.deasliwant.admin.tests;

import org.testng.Assert;
import org.testng.annotations.*;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.dealsiwant.utils.BaseTest;

public class CategoryTests extends BaseTest {
	
	@Test
	public void verifyCategoryListing(){
		test = extent.createTest("verifyCategoryListing");
		loginPageObj.enterAdminCredential(prop.getProperty("USERNAME"), prop.getProperty("PASSWORD"));
		test.log(Status.PASS, "Login passed");
		dashboardPageObj.clickCategoryMenu();
		test.log(Status.PASS, "click category menu passed");
		boolean actual=catListingPageObj.verifyCategory("Footwears");
		Assert.assertEquals(actual, true);
	}
	
}
