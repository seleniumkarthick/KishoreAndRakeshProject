package com.dealsiwant.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.dealsiwant.admin.pages.CategoryListingPage;
import com.dealsiwant.admin.pages.DashboardPage;
import com.dealsiwant.admin.pages.LoginPage;

public class BaseTest {
	
	public WebDriver driver;
	public LoginPage loginPageObj;
	public DashboardPage dashboardPageObj;
	public CategoryListingPage catListingPageObj;
	
	public FileInputStream fis = null;
    public Properties prop = null;
	public String env="staging";
	
	
	//builds a new report using the html template 
    public ExtentHtmlReporter htmlReporter;
    
    public ExtentReports extent;
    
    //helps to generate the logs in test report.
    public ExtentTest test;
	
   
	
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String brows){
		
		//======================PROPERTY FILE READING=====================
		String fileName="";
		try {
			fis = new FileInputStream("E:\\SeleniumAutomation\\2020\\DealsIWant\\src\\test\\resources\\"+env+"\\testData.properties");
			 prop = new Properties();
		        try {
					prop.load(fis);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		//======================REPORTS=====================
		
		 //Date object
		 Date date= new Date();
	         //getTime() returns current time in milliseconds
		 long time = date.getTime();
	         //Passed the milliseconds to constructor of Timestamp class 
		 Timestamp ts = new Timestamp(time);
		
		
		// initialize the HtmlReporter
		 System.out.println(System.getProperty("user.dir"));
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/Reports/testReport.html");
        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
      
    	
        //======================BROWSER LAUNCH=====================
		if(brows.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(brows.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(brows.equals("ie")){
			System.setProperty("webdriver.ie.driver", "drivers\\IEDriver.exe");
			driver=new InternetExplorerDriver();
		}
	
		
		
		driver.get("http://localhost:81/product/admin/login.php");
		
		//======================OBJECT CREATION=====================
		loginPageObj=new LoginPage(driver);
		dashboardPageObj=new DashboardPage(driver);
		catListingPageObj=new CategoryListingPage(driver);
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
		extent.flush();
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
