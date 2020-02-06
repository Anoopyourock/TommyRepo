package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.AddProduct;
import com.visulon.pom.AddTocart;
import com.visulon.pom.BasePage;
import com.visulon.pom.CreateAssortmentByProductsearch;
import com.visulon.pom.CreateAssortmentaftercart;
import com.visulon.pom.SearchHierarchy;
import com.visulon.pom.VisulonLoginPage;

public class TestSearchHierarchy extends BaseTest
{
	@Test
	public void testSearchHierarchy() throws InterruptedException
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
	rv2.clickonproductsearch();
	rv2.selectfiscalyear(2);
	
	rv2.clickonproceed();
	SearchHierarchy rv3=new SearchHierarchy(driver);
	rv3.ClickoOnSearchHierarchy();
	Thread.sleep(5000);
	rv3.accessories();
	rv3.Boys();
	rv3.Hats();
	Thread.sleep(10000);
	rv3.quickSearch("shoe");
	rv3.ClickOnQuickSearchButton();
	AddProduct rv4= new AddProduct(driver);
	rv4.SelectAll();
	Thread.sleep(10000);
	rv4.addcart();
	AddTocart rv5= new AddTocart(driver);
	rv5.SaveasAssortment();
	CreateAssortmentaftercart rv6 =new CreateAssortmentaftercart(driver);
	rv6.AssortmentName("qwertyuiop");
	rv6.Select_Milestones(2);
	rv6.Select_Privacy();
	rv6.GroupBy(0);
	rv6.SortBy(0);
	rv6.Global_Assortment();
	rv6.create_Assortment();
	
	
	
	
	
	
	}	
	
	
	
}
