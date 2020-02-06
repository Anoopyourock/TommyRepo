package com.visulon.test;



import org.testng.annotations.Test;

import com.visulon.pom.BasePage;

public class TestHomePage extends TestVisulonLoginpage
{
	
	
	@Test
	public void testHomepage() throws InterruptedException
	{
		
		BasePage B1= new BasePage(driver);
		//click on workbook
		B1.clickonWorkbook();
		//hover to visulon admin
		B1.HoverVisulonAdmin();
		
		
	}

}
