package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.Productoption;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.ArrangeMenu.Arrange_SelectAll;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;


public class TestProductoptions extends BaseTest
{
	@Test
	public void testProductOptions() throws InterruptedException
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
		rv2.selectFiscalyear(1);
		rv2.clickSeason();
		//select milestone
		rv2.selectMilestone(1);
		//select privacy
		rv2.selectprivacy();
		//select assortment type global or local
		//rv2.clickonassortmenttype();
		//click on proceed
		rv2.create();
		Thread.sleep(3000);
		
		//leftpanelmenu
		AssortmentMenuleftpanel rv3=new AssortmentMenuleftpanel(driver);
		// clic on left panel
		rv3.clickonleftpanel();
		// click on product search
		rv3.clickonProductsearch();
		// click on search Hierarchy
		rv3.clickonHierarchysearch();
		// enter the product text
		rv3.EnterQuicksearchtext("0");
		// click on search button
		rv3.clickonquicksearchbutton();
		Thread.sleep(7000);
		// click on sort button
		rv3.clickSortButton();
		// Sort by Style
		rv3.sortbyStyle();
		Thread.sleep(8000);
		// select how many product you want to search
		rv3.selectproducts(20);
		// clik on continue
		rv3.Clickoncontinue();
		Thread.sleep(4000);
		
		Productoption rv5= new Productoption(driver);
		Thread.sleep(4000);
		rv5.ClickonSKU();
		Thread.sleep(7000);
		
		
		
		
		
		

	}
	
	
	
	
}
