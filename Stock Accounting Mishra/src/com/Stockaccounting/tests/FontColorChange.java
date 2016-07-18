package com.Stockaccounting.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FontColorChange 
{
	@FindBy(xpath=".//*[@id='mci_Black']/a")
	WebElement BlackColor;
	
	@FindBy(xpath=".//*[@id='mci_Blue']/a")
	WebElement BlueColor;
	
	@FindBy(xpath=".//*[@id='mci_Dark']/a")
     WebElement DarkColor;
	
	@FindBy(xpath=".//*[@id='mci_Green']/a")
	WebElement GreenColor;
	
	public void Color()
	{
		BlackColor.click();
	}
	public void BlueColor()
	{
		BlueColor.click();
	}
	
	public void DarkColor()
	{
		DarkColor.click();
	}
	public void GreenColor()
	{
		GreenColor.click();
	}
	

}
