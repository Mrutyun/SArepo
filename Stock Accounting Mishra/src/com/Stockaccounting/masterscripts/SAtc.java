package com.Stockaccounting.masterscripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SAtc extends testNgbase

{
@Test(priority=2)
public void SC()
   {
   	SL.StockCategories("SSD");
   }

	/*@Test(dataProvider="Udata")
public void Uom(String Umid,String UmDesc)
	{
		SL.UnitOfMeasurement(Umid, UmDesc);
	}

   @DataProvider
   public Object[][] Udata()
   {
	   Object[][] obj=new Object[3][2];
	  
	      obj[0][0]="M00I";
	      obj[0][1]="1000M";
	      
	      obj[1][0]="M01I";
	      obj[1][1]="100M";
	      
	      obj[2][0]="M02I";
	      obj[2][1]="10M";
	      return obj;
	   
   }*/

        
}
