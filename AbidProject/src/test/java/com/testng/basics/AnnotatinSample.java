package com.testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.product.admin.pages.AddCategoryPage;
import com.product.admin.pages.CategoryListingPage;
import com.product.admin.pages.DashboardPage;
import com.product.admin.pages.LoginPage;
import org.testng.annotations.Listeners;

@Listeners(com.testng.basics.ListenerTest.class)	

public class AnnotatinSample {
	
	//builds a new report using the html template 
    ExtentHtmlReporter htmlReporter;
    
    ExtentReports extent;
    //helps to generate the logs in test report.
    ExtentTest test;
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setup(){
		
		// initialize the HtmlReporter
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
         
		
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost:81/product/admin/login.php");
	}
	

	@AfterTest
	public void teardown(){
		driver.quit();
		extent.flush();
	}
	
	@Test(priority=1)
	public void b_m1(){
		
		test = extent.createTest("Test Case b_m1");

		LoginPage loginPageObj=new LoginPage(driver);
		DashboardPage dashboardObj=new DashboardPage(driver);
		CategoryListingPage categoryListObj=new CategoryListingPage(driver);
		AddCategoryPage addCategoryObj=new AddCategoryPage(driver);
		
		loginPageObj.userDetails("admin","admin");
		
		test.log(Status.PASS, "Login passed");
		
		dashboardObj.clickCategory();
		categoryListObj.clickNewCategory();
		
		test.log(Status.PASS, "add category passed");
		
		//testcase:1
		addCategoryObj.addNewCategory("testing123");
		
		String actual=addCategoryObj.getErrorMsg();
		String expected="Category name is already exist. please entesdsdr new category name";
		
		Assert.assertEquals(actual, expected);
	}
	

	@Test(priority=2,dependsOnMethods="b_m1",alwaysRun=true,enabled=true)
	public void a_m2(){
		
		test = extent.createTest("Test Case a_m2");
		
		LoginPage loginPageObj=new LoginPage(driver);
		DashboardPage dashboardObj=new DashboardPage(driver);
		CategoryListingPage categoryListObj=new CategoryListingPage(driver);
		AddCategoryPage addCategoryObj=new AddCategoryPage(driver);
		
		
		addCategoryObj.addNewCategory("");
		
		String actual1=addCategoryObj.getErrorMsg();
		String expected1="Category name should not be empty";
		
		Assert.assertEquals(actual1, expected1);
	}
	
	

	@Test(priority=3,groups="sanity")
	public void c_m3(){
		
		test = extent.createTest("Test Case c_m3");
		System.out.println("33333333");
	}
	
	

	@Test(priority=4,groups={"sanity","regression"})
	public void m4(){
		test = extent.createTest("Test Case m4");
		System.out.println("4444444");
	}
	
	 @AfterMethod
	    public void getResult(ITestResult result) {
	        if(result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" FAILED ", ExtentColor.RED));
	            test.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" PASSED ", ExtentColor.GREEN));
	        }
	        else {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" SKIPPED ", ExtentColor.ORANGE));
	            test.skip(result.getThrowable());
	        }
	    }
	 
	 
	 

}
