package com.Stockaccounting.masterscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiPagePOM 
{
	@FindBy(id="btnreset")
	WebElement Reset;
	@FindBy(id="username")
	WebElement Uname;
	@FindBy(id="password")
	WebElement Pass;
	@FindBy(id="btnsubmit")
	WebElement Login;
	
	public void AdminLogin(String Un,String Pwd)
	{
		Reset.click();
		Uname.sendKeys(Un);
		Pass.sendKeys(Pwd);
		Login.click();
		
		
		
	}	
	
	
	
	

}
