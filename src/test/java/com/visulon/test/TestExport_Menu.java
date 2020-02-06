package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;

import com.visulon.pom.Assortment_Export.Export_Menu;

public class TestExport_Menu extends BaseTest
{
	@Test
	public void testExport_Menu() throws SikuliException, InterruptedException
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
	//leftpanelmenu
	AssortmentMenuleftpanel rv3=new AssortmentMenuleftpanel(driver);
	// clic on left panel
	rv3.clickonleftpanel();
	// click on product search
	rv3.clickonProductsearch();
	// click on search Hierarchy
	rv3.clickonHierarchysearch();
	// enter the product text
	rv3.EnterQuicksearchtext("PH");
	// click on search button
	rv3.clickonquicksearchbutton();
	Thread.sleep(8000);
	// click on sort button
	rv3.clickSortButton();
	// Sort by Style
	rv3.sortbyStyle();
	Thread.sleep(6000);
	// select how many product you want to search
	rv3.selectproducts(20);
	// clik on continue
	rv3.Clickoncontinue();
	Thread.sleep(4000);
	//click on left panel
	rv3.clickonleftpanel();
	FileMenu_Open rv4= new FileMenu_Open(driver);
	// click on file Menu
	rv4.clickonfileMenu();
	//click on save
	rv4.clickonsave();
	//click on left panel
	rv3.clickonleftpanel();
	Thread.sleep(3000);
	//clickon Export
   
	Export_Menu rv5 = new Export_Menu(driver);
	rv5.exportMenu();
	Thread.sleep(3000);
	//click on pdf
	rv5.exportPDF();
	Thread.sleep(7000);
	//click on ppt
	rv5.exportPPT();
	Thread.sleep(7000);
	//click on excel
	rv5.exportExcel();
	Thread.sleep(5000);
	//include images
	rv5.DesignExcelReport_IncludeProductsImages();
	Thread.sleep(7000);
	//click on export images
	rv5.exportImages();
	Thread.sleep(5000);
	//click on ful assortment 
	rv5.exportImages_fromFullAssortment();
	Thread.sleep(5000);
	
		
	
	
	}
}
