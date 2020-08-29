package com.testng.basics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.*;

public class XlsSample {
	WebDriver driver;
	
	 @DataProvider(name = "REGISTRATION")
	    public Object[][] createData1() throws Exception{
	        Object[][] retObjArr=getTableArray("C:\\Users\\Karthick Kumar\\Desktop\\kishoreAndRakesh.xls",
	                "Sheet1", "xxx");
	        return(retObjArr);
	    }
	

		@BeforeTest
		public void setup(){
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://localhost:81/product/register.php");
		}
		

		@AfterTest
		public void teardown(){
			//driver.quit();
		}
		
		
		@Test(priority=1,dataProvider="REGISTRATION")
		public void b_m1(String user,String email,String pss,String mobile){
			driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys(user);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys(pss);
			
			driver.findElement(By.id("mobile")).clear();
			driver.findElement(By.id("mobile")).sendKeys(mobile);
		}
	 
	 
	 
	 
	 public String[][] getTableArray(String xlFilePath, String sheetName, String tableName) throws Exception{
	        String[][] tabArray=null;
	        
	            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
	            Sheet sheet = workbook.getSheet(sheetName); 
	            int startRow,startCol, endRow, endCol,ci,cj;
	            Cell tableStart=sheet.findCell(tableName);
	            startRow=tableStart.getRow();
	            startCol=tableStart.getColumn();

	            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                

	            endRow=tableEnd.getRow();
	            endCol=tableEnd.getColumn();
	            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
	                    "startCol="+startCol+", endCol="+endCol);
	            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
	            ci=0;

	            for (int i=startRow+1;i<endRow;i++,ci++){
	                cj=0;
	                for (int j=startCol+1;j<endCol;j++,cj++){
	                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
	                }
	            }
	        

	        return(tabArray);
	    }
	    

}
