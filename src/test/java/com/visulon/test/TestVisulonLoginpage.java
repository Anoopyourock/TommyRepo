package com.visulon.test;


import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.VisulonLoginPage;


public class TestVisulonLoginpage extends BaseTest
{
	
		@Test
		public void testVisulonloginpage() 
		{
			VisulonLoginPage rv1=new VisulonLoginPage(driver);
			String un = Excelsheet.readData("Sheet1", 0, 0);
			String pass = Excelsheet.readData("Sheet1", 0, 1);
			rv1.setCredentials(un, pass);
			rv1.ClickonRememberMe();
			rv1.ClickOnLoginButton();
			
			
			
		}

}
