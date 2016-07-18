package com.Stockaccounting.masterscripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class notepadUom {

	public static void main(String[] args) throws IOException
	{
		
		Stockaccounting_lib sl=new Stockaccounting_lib();
		sl.launchApp("http://webapp.qedgetech.com");
		sl.AdminLogin("admin","master");
		
		
          /*  String Sread;
            String Fpath="D:\\Mishra1\\Stock Accounting Mishra\\src\\com\\Stockaccounting\\testdata\\UOM.txt";
            String Rpath="D:\\Mishra1\\Stock Accounting Mishra\\src\\com\\Stockaccounting\\Results\\UOMResult.txt";
            String SD;

		FileReader fr=new FileReader(Fpath);
		BufferedReader br=new BufferedReader(fr);
		Sread=br.readLine();
		
		FileWriter fw=new FileWriter(Rpath);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(Sread+"$$$"+"Results");
		bw.newLine();
		while ((SD=br.readLine())!=null) 
		{
			System.out.println(SD);
			String [] SR=SD.split("###");
			String UmId=SR[0];
			System.out.println(UmId);
			String UmDesc=SR[1];
			System.out.println(UmDesc);
			sl.UnitOfMeasurement(UmId, UmDesc);
			bw.write(UmId+"@@@"+UmDesc);
			bw.newLine();
			
			
			
		}
		bw.close();
		br.close();*/
		
		
		
		
		int Rc;
		String Res;
		FileInputStream fi=new FileInputStream("D:\\Mishra1\\Stock Accounting Mishra\\src\\com\\Stockaccounting\\testdata\\Suppliers.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Rc=ws.getLastRowNum();
		for (int i = 1; i <= Rc; i++) 
		{
			XSSFRow row=ws.getRow(i);
			XSSFCell wc =row.getCell(0);
			XSSFCell wc1 =row.getCell(1);
			XSSFCell wc2=row.getCell(2);
		    XSSFCell wc3=row.getCell(3);
		    XSSFCell wc4=row.getCell(4);
		    XSSFCell wc5=row.getCell(5);
		    XSSFCell wc6=row.getCell(6);
		    XSSFCell wc7=row.getCell(7);
		    XSSFCell wc8=row.getCell(8);
		   String Sname= wc.getStringCellValue();
		   String Address=wc1.getStringCellValue();
		   String City=wc2.getStringCellValue();
		   String Country=wc3.getStringCellValue();
		   String CPerson =wc4.getStringCellValue();
		   String PNumber =wc5.getStringCellValue();
		   String Email=wc6.getStringCellValue();
		   String MNumber =wc7.getStringCellValue();
		   String Note=wc8.getStringCellValue();
		   Res=sl.SuppliersCreation(Sname, Address, City, Country, CPerson , PNumber , Email, MNumber , Note);
		    XSSFCell cell8=row.createCell(7);
		    cell8.setCellValue(Res);
		}
		FileOutputStream fo=new FileOutputStream("D:\\Mishra1\\Stock Accounting Mishra\\src\\com\\Stockaccounting\\Results\\SupplierRes.xlsx");
		wb.write(fo);
		
		fo.close();
		wb.close();
		
		

	}

}
