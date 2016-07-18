package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StockCetagoryPage 
{
	@FindBy(id=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement AddButton;
	
	@FindBy(id="x_Category_Name")
	WebElement CateName;
	
	@FindBy(id="btnAction")
	WebElement CateSubmit;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement CateConfirm;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement CateSucc;
	
	public void StockCate(String CName)
	{
		AddButton.click();
		CateName.sendKeys(CName);
		CateSubmit.click();
		CateConfirm.click();
		CateSucc.click();
	}
	
	
	
	
	

}
