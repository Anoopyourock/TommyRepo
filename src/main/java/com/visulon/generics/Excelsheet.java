package com.visulon.generics;

import java.io.FileInputStream;
import java.io.FileOutputStream;

//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.visulon.generics.AutoConstant;

public class Excelsheet 
{
	private static Workbook wb;
	//private static Sheet s;
	//private static Row r;
	//private static Cell c;

	
		public static String readData(String sheetname,int rownum,int cellnum)
		{
			try 
			{
				wb=WorkbookFactory.create(new FileInputStream(AutoConstant.excelpath));
			} 
			catch (Exception e) 
			{
			
			}
			return 	wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
			
		}
		
		public static void writeData(String sheetname,int rownum,int cellnum,String value)
		{
			try 
			{
				wb=WorkbookFactory.create(new FileInputStream(AutoConstant.excelpath));
			} 
			catch (Exception e) 
			{
			
			}
			wb.getSheet(sheetname).getRow(rownum).createCell(cellnum).setCellValue(value);
			try 
			{
				wb.write(new FileOutputStream(AutoConstant.excelpath));
			} 
			catch (Exception e) 
			{
				
			}
			
		}
		
		public static int lastrowcount(String sheetname)
		{
			try 
			{
				wb=WorkbookFactory.create(new FileInputStream(AutoConstant.excelpath));
			} 
			catch (Exception e) 
			{
			
			}
			return wb.getSheet(sheetname).getLastRowNum();
		}
		public static int lastCellCount(String sheetname,int rownum)
		{
			try 
			{
				wb=WorkbookFactory.create(new FileInputStream(AutoConstant.excelpath));
			} 
			catch (Exception e) 
			{
			
			}
			return wb.getSheet(sheetname).getRow(rownum).getLastCellNum();
		}
		
		
		
		
		
		
		
}


