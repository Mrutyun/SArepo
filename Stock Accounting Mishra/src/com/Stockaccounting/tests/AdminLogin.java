package com.Stockaccounting.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AdminLogin {

	
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://webapp.qedgetech.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("btnreset")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		driver.findElement(By.linkText("Suppliers")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		driver.findElement(By.id("x_Supplier_Name")).sendKeys("Lupin");
		driver.findElement(By.id("x_Address")).sendKeys("plot45");
		driver.findElement(By.id("x_City")).sendKeys("Bhubaneswar");
		driver.findElement(By.id("x_Country")).sendKeys("India");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("mr");
     	driver.findElement(By.id("x_Phone_Number")).sendKeys("06652-231157");
		driver.findElement(By.id("x__Email")).sendKeys("mn@hotmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9000000000");
		driver.findElement(By.id("x_Notes")).sendKeys("Reputed");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath(".//button[@class='ajs-button btn btn-primary']")).click(); 
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[4]/div[2]/button")).click();
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		Sleeper.sleepTightInSeconds(3);
	    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();   
	    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
	    driver.findElement(By.id("x_Category_Name")).sendKeys("Medicines");
	    driver.findElement(By.id("btnAction")).click();
	    driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
	   	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		Sleeper.sleepTightInSeconds(3);
	    driver.findElement(By.linkText("Unit of Measurement")).click();
	    
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("x_UOM_ID")).sendKeys("M001");
		driver.findElement(By.id("x_UOM_Description")).sendKeys("100Strips");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("html/body/div[11]/div[2]/div/div[4]/div[2]/button")).click();
		driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		driver.findElement(By.id("x_Category")).sendKeys("Medicines");
		driver.findElement(By.id("x_Supplier_Number")).sendKeys("Lupin");
		driver.findElement(By.id("x_Stock_Name")).sendKeys("Medicines");
		driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("100Strips");
		driver.findElement(By.id("x_Purchasing_Price")).sendKeys("20000");
		driver.findElement(By.id("x_Selling_Price")).sendKeys("30000");
		driver.findElement(By.id("x_Notes")).sendKeys("anti cold");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[1]/button[3]")).click();
		
		    act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
		    Sleeper.sleepTightInSeconds(3);
		    driver.findElement(By.xpath(".//*[@id='mi_a_stock_categories']/a")).click();   
		    driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		    driver.findElement(By.id("x_Category_Name")).sendKeys("Ciprofloxacin");
		    driver.findElement(By.id("btnAction")).click();
		    driver.findElement(By.xpath("html/body/div[*]/div[2]/div/div[4]/div[2]/button[1]")).click();
		   	act.moveToElement(driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a"))).build().perform();
			Sleeper.sleepTightInSeconds(3);
		    driver.findElement(By.linkText("Unit of Measurement")).click();
		    
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			driver.findElement(By.id("x_UOM_ID")).sendKeys("C001");
			driver.findElement(By.id("x_UOM_Description")).sendKeys("200Strips");
			driver.findElement(By.id("btnAction")).click();
			driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
			driver.findElement(By.xpath("html/body/div[11]/div[2]/div/div[4]/div[2]/button")).click();
			driver.findElement(By.xpath(".//*[@id='mi_a_stock_items']/a")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
			driver.findElement(By.id("x_Category")).sendKeys("Ciprofloxacin");
			driver.findElement(By.id("x_Supplier_Number")).sendKeys("Lupin");
			driver.findElement(By.id("x_Stock_Name")).sendKeys("Cipro");
			driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("200Strips");
			driver.findElement(By.id("x_Purchasing_Price")).sendKeys("25000");
			driver.findElement(By.id("x_Selling_Price")).sendKeys("40000");
			driver.findElement(By.id("x_Notes")).sendKeys("antibiotic");
			driver.findElement(By.id("btnAction")).click();
			driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
			driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[1]/button[3]")).click();
			
		
		driver.findElement(By.linkText("Purchases")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[2]/div/a")).click();
		
		
		driver.findElement(By.id("x_Supplier_ID")).sendKeys("Lupin");
		driver.findElement(By.xpath(".//*[@id='fa_purchases_detailgrid']/div[1]/div/div/a")).click();
		driver.findElement(By.id("x4_Supplier_Number")).sendKeys("Lupin");
		driver.findElement(By.id("x4_Stock_Item")).click();
		driver.findElement(By.id("x4_Purchasing_Quantity")).sendKeys("Medicines");
		driver.findElement(By.id("x4_Purchasing_Quantity")).sendKeys("100Strips");
		driver.findElement(By.id("x4_Purchasing_Price")).sendKeys("20000");
		driver.findElement(By.id("x4_Selling_Price")).sendKeys("30000");
		driver.findElement(By.id("x_Total_Payment")).sendKeys("1000000");
		driver.findElement(By.xpath(".//*[@id='fa_purchases_detailgrid']/div[1]/div/div/a/span")).click();
		driver.findElement(By.id("x4_Supplier_Number")).sendKeys("Lupin");
		driver.findElement(By.id("x4_Stock_Item")).click();
		driver.findElement(By.id("x4_Purchasing_Quantity")).sendKeys("Cipro");
		driver.findElement(By.id("x4_Purchasing_Quantity")).sendKeys("200Strips");
		driver.findElement(By.id("x4_Purchasing_Price")).sendKeys("25000");
		driver.findElement(By.id("x4_Selling_Price")).sendKeys("40000");
		driver.findElement(By.id("x_Total_Payment")).sendKeys("1000000");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='mi_a_customers']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		driver.findElement(By.id("x_Customer_Name")).sendKeys("Vikram");
		driver.findElement(By.id("x_Address")).sendKeys("BTM");
		driver.findElement(By.id("x_City")).sendKeys("Bangalore");
		driver.findElement(By.id("x_Country")).sendKeys("Bangalore");
		driver.findElement(By.id("x_Contact_Person")).sendKeys("mr");
		driver.findElement(By.id("x_Phone_Number")).sendKeys("8888");
		driver.findElement(By.id("x__Email")).sendKeys("xy@gmail.com");
		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9999");
		driver.findElement(By.id("x_Notes")).sendKeys("note");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[19]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath(".//*[@class='ajs-button ben btn-primary']")).click();
		
		driver.findElement(By.linkText("Sales")).click();
		driver.findElement(By.id("x_Customer_ID")).sendKeys("Vikram");
		driver.findElement(By.xpath(".//*[@id='fa_sales_detailgrid']/div[1]/div/div/a/span")).click();
		driver.findElement(By.id("x6_Supplier_Number")).sendKeys("Lupin");
		driver.findElement(By.id("x6_Stock_Item")).sendKeys("Medicines");
		driver.findElement(By.id("x6_Sales_Quantity")).sendKeys("50");
		driver.findElement(By.id("x6_Purchasing_Price")).sendKeys("20000");
		driver.findElement(By.id("x6_Sales_Price")).sendKeys("30000");
		driver.findElement(By.id("x_Total_Payment")).sendKeys("500000");
		
		driver.findElement(By.xpath(".//*[@id='fa_sales_detailgrid']/div[1]/div/div/a/span")).click();
		driver.findElement(By.id("x6_Supplier_Number")).sendKeys("Lupin");
		driver.findElement(By.id("x6_Stock_Item")).sendKeys("Cipro");
		driver.findElement(By.id("x6_Sales_Quantity")).sendKeys("40");
		driver.findElement(By.id("x6_Purchasing_Price")).sendKeys("25000");
		driver.findElement(By.id("x6_Sales_Price")).sendKeys("40000");
		driver.findElement(By.id("x_Total_Payment")).sendKeys("1000000");
		driver.findElement(By.id("btnAction")).click();
		driver.findElement(By.xpath("html/body/div[18]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
