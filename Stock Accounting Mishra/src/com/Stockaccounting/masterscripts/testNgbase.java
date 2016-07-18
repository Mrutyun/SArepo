package com.Stockaccounting.masterscripts;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class testNgbase
{
  Stockaccounting_lib SL=new Stockaccounting_lib();
  
  @BeforeTest
  public void beforeTest() 
  {
	  
	  SL.AdminLogin("admin", "master");
  }

  @AfterTest
  public void LogOut() throws InterruptedException 
  {
	  
	  SL.logOut();
	  
  }

  @BeforeSuite
  public void LaunchApp() throws IOException 
  {
	  SL.launchApp("http://webapp.qedgetech.com");
  }

  @AfterSuite
  public void CloseApp() 
  {
	  SL.CloseApp();
  }

}
