package com.Stockaccounting.masterscripts;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuppliersCreationsPage
{
	@FindBy(xpath=".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")
	WebElement SuppAdd;
	
	@FindBy(id="x_Supplier_Name")
	WebElement SuppName;
	
	@FindBy(id="x_Address")
	WebElement SuppAddr;
	
	@FindBy(id="x_City")
	WebElement SuppCity;
	
	@FindBy(id="x_Country")
	WebElement SuppCountry;
	
	@FindBy(id="x_Contact_Person")
	WebElement SuppCp;
	
	@FindBy(id="x_Phone_Number")
	WebElement SuppPn;
	
	@FindBy(id="x__Email")
	WebElement SuppEmail;
	
	@FindBy(id="x_Mobile_Number")
	WebElement SuppMn;
	
	@FindBy(id="x_Notes")
    WebElement SuppNotes;
	
	@FindBy(id="btnAction")
	WebElement SuppSubmit;
	
	@FindBy(xpath=".//*[@class='ajs-button btn btn-primary']")
	WebElement SuppConfirm;
	
	@FindBy(xpath="html/body/div[.]/div[2]/div/div[4]/div[2]/button")
	WebElement SuppSucc;

	public void SuppCreate( String Sname,String Add,String City,String Ctry,String Cp,String Pn,String Email,String Mn,String Note) 
	
	{
		SuppAdd.click();
		SuppName.sendKeys(Sname);
		SuppAddr.sendKeys(Add);
		SuppCity.sendKeys(City);
	    SuppCountry.sendKeys(Ctry);
		SuppCp.sendKeys(Cp);
		SuppPn.sendKeys(Pn);
		SuppEmail.sendKeys(Email);
		SuppMn.sendKeys(Mn);
		SuppNotes.sendKeys(Note);
		SuppSubmit.click();
		SuppConfirm.click();
		SuppSucc.click();
	}
	
	
	
	

}
