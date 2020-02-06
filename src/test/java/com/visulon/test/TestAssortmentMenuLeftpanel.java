package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;

public class TestAssortmentMenuLeftpanel extends BaseTest

{
	@Test
	public void testassortmentmenuleftpanel() throws InterruptedException
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
		
		//B1.clickonassortment();
		CreateAssortment rv2= new CreateAssortment(driver);
		//click on assortment 
		rv2.clickonAssortment();
		//give document name
		rv2.documentname();
		//select fiscal year
		rv2.selectFiscalyear(2);
		//rv2.clickSeason();
		//select milestone
		rv2.selectMilestone(2);
		//select privacy
		rv2.selectprivacy();
		//select assortment type global or local
		rv2.clickonassortmenttype();
		//click on proceed
		rv2.create();
		Thread.sleep(3000);
		Thread.sleep(5000);
		AssortmentMenuleftpanel rv3=new AssortmentMenuleftpanel(driver);
		//clic on leftpanel
		rv3.clickonleftpanel();
		//click on product search
		rv3.clickonProductsearch();
		//click on search hierarchy
		rv3.clickonHierarchysearch();
		//Enter text
		rv3.EnterQuicksearchtext("hats");
		// click on quick search
		rv3.clickonquicksearchbutton();
		Thread.sleep(5000);
		//click on sort button
		rv3.clickSortButton();
		// clic on sortby style
		rv3.sortbyStyle();
		Thread.sleep(3000);
		//select how many product you want
		rv3.selectproducts(10);
		//click on filter
		rv3.ClickonFilter();
		//search product with images
		rv3.SearchProductwithimages();
		//search product with CA Units
		rv3.SearchProductwithCAUnits();
		//search product with US units
		rv3.SearchProductwithUSUnits();
		//hang tag with wicking
		rv3.HangtagwithWicking();
		//hang tag with downfill
		rv3.HangtagwithDownFill();
		// hang with flex
		rv3.HangtagwithFlex();
		//click on apply
		rv3.clickonApply();
		//clic on continue
		rv3.Clickoncontinue();
		Thread.sleep(10000);
		
		
	}
	
	
}
