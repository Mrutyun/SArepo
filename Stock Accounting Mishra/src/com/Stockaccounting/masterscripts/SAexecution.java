package com.Stockaccounting.masterscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Stockaccounting.tests.FontColorChange;

public class SAexecution 
{
	@Test
	public void Execution()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://webapp.qedgetech.com");
		
		LogiPagePOM Lp=PageFactory.initElements(driver,LogiPagePOM.class);
		Lp.AdminLogin("admin","master");
		
		HomePage Hp=PageFactory.initElements(driver,HomePage.class);
		//Hp.Customer();
		//Hp.Suppliers();
		//Hp.StockItems();
		//Hp.Sale();
		//Hp.LogOut();
		
		//SuppliersCreationsPage Scp=PageFactory.initElements(driver,SuppliersCreationsPage.class);
		
		//Scp.SuppCreate("Expidition","BBSR","BBSR1", "India","Vicky","90902000","V@hotmail.com","9999999999","SelfRemark");
		
		/*Actions act=new Actions(driver);
		
		act.moveToElement(Hp.Stockitems).build().perform();
		Hp.StockCetagory();
		
		
	     act.moveToElement(Hp.Stockitems).build().perform();
	     Hp.UnitOfMeasurement();*/
	     
	 	Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mci_Settings']/a"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath(".//*[@id='mci_Themes2fColors']/a"))).build().perform();

	     
	     FontColorChange Fc=PageFactory.initElements(driver, FontColorChange.class);
	     Fc.BlueColor();
	     Fc.DarkColor();
	     Fc.GreenColor();
	     Fc.Color();
		
		
		
		
		
	}

}
