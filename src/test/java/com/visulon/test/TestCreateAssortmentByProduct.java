package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.BasePage;
import com.visulon.pom.CreateAssortmentByProductsearch;
import com.visulon.pom.VisulonLoginPage;

public class TestCreateAssortmentByProduct extends BaseTest
{
	@Test
	public void testCreateAssortmentByProduct()
	{
		VisulonLoginPage rv1=new VisulonLoginPage(driver);
		//data driven from excel
		//username
		String un = Excelsheet.readData("Sheet1", 0, 0);
		//password
		String pass = Excelsheet.readData("Sheet1", 0, 1);
		//set credentials
		rv1.setCredentials(un, pass);
		rv1.ClickonRememberMe();
		rv1.ClickOnLoginButton();
		BasePage B1= new BasePage(driver);
		//click on assortment
		B1.clickonassortment();
		CreateAssortmentByProductsearch rv2=new CreateAssortmentByProductsearch(driver);
		//click on product search
		rv2.clickonproductsearch();
		//select fiscal year
		rv2.selectfiscalyear(2);
		//click on proceed
		rv2.clickonproceed();
		
	}
}
