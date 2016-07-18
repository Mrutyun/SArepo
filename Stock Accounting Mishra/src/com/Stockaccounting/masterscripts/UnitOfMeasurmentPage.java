package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitOfMeasurmentPage 
{
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")
	WebElement AddButton;
	
	@FindBy(id="x_UOM_ID")
	WebElement UomId;
	
	@FindBy(id="x_UOM_Description")
	WebElement UomDesc;
	
	@FindBy(id="btnAction")
	WebElement UomSubmit;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button[1]")
	WebElement UomConfirm;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement UomSucc;
	
	public void Uom(String Umid,String UmDes)
	{
		AddButton.click();
		UomId.sendKeys(Umid);
		UomDesc.sendKeys(UmDes);
		UomSubmit.click();
		UomSucc.click();
	}

}
