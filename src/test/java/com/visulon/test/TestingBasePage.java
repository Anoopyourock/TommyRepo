package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.BasePage;
import com.visulon.pom.VisulonLoginPage;

public class TestingBasePage extends BaseTest 
{
	@Test
	public void testingBasePage() throws InterruptedException
	{
		VisulonLoginPage rv1=new VisulonLoginPage(driver);
		//data driven from excel
		//username
		String un = Excelsheet.readData("Sheet1", 0, 0);
		//password
		String pass = Excelsheet.readData("Sheet1", 0, 1);
		//set Username and password
		rv1.setCredentials(un, pass);
		rv1.ClickonRememberMe();
		rv1.ClickOnLoginButton();
		 
		BasePage rv2= new BasePage(driver);
		rv2.clickonProductMaster();
		Thread.sleep(5000);
		rv2.clickonAdministration();
		Thread.sleep(5000);
		rv2.clickonHome();
		Thread.sleep(5000);
		rv2.clickonStats_Reports();
		Thread.sleep(5000);
		rv2.HoverVisulonAdmin();
		Thread.sleep(2000);
		rv2.clickonAccountsettings();
		Thread.sleep(5000);
		rv2.HoverVisulonAdmin();
		Thread.sleep(3000);
		rv2.hoverchangetheme();
		rv2.selecttheme2();
		Thread.sleep(5000);
		rv2.clickonHome();
		Thread.sleep(5000);
		rv2.ClickonAssortmentNotification();
		Thread.sleep(3000);
		rv2.ClickonAssortment();
		Thread.sleep(3000);
		rv2.ClickonAssortmentNotification();
		rv2.ClickonImportedSheets();
		Thread.sleep(3000);
		rv2.ClickonCancel();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
