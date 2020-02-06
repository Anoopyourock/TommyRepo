package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentData.Actions.Data_Action_RevisionHistory;
import com.visulon.pom.AssortmentData.Actions.Data_Action_Top10Style;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_CustomTemplateLibrary;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_Menu;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_ProductAnalytics;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_ProductStats;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_RecapView;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;

public class DataActionsCompleteActions extends BaseTest
{
@Test
	public void dataActionsCompleteActions() throws InterruptedException, SikuliException
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
	
	//Click on DataActions
		Data_Actions_Menu rv8= new Data_Actions_Menu(driver);
		rv8.clickonData_Actions();
		//click on recap view
		Data_Actions_RecapView rv9 = new Data_Actions_RecapView(driver);
		rv9.clickonRecapView();
		//click on RecapBy 
		Thread.sleep(2000);
		rv9.SelectRecapBy(2);
		//click on recap by Retail/wholesale category
		Thread.sleep(2000);
		rv9.SelectRecapBy1(1);
		//clic on target
		Thread.sleep(2000);
		rv9.clickonShowTarget();
		Thread.sleep(2000);
		//click on export excel
		rv9.ClickonExportExcel();
		Thread.sleep(5000);
		//rv9.click on cancel
		rv9.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		//click on top10style
		Data_Action_Top10Style rv10= new Data_Action_Top10Style(driver);
		// Click on top 10 SKU/Style
		rv10.ClickonTop10Style();
		Thread.sleep(2000);
		//Select Style top10-20-50
		rv10.SelectTopStyle(2);
		Thread.sleep(2000);
		//Select style
		rv10.SelectStyle();
		Thread.sleep(2000);
		//Select department 
		rv10.SelectDepartment(1);
		Thread.sleep(2000);
		//click on export Excel
		rv10.ExporttoExcel();
		Thread.sleep(5000);
		//click on cancel
		rv9.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		Thread.sleep(5000);
		
		//click on Revisiosn History
		
		Data_Action_RevisionHistory rv11= new Data_Action_RevisionHistory(driver);
		rv11.clickonRevisionHistory();
		//click on export excel
		rv11.ExportToExcel();
		//click on cancel
		rv9.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		
		//click on custom Template Library
		Data_Actions_CustomTemplateLibrary rv12 = new Data_Actions_CustomTemplateLibrary(driver);
		
		rv12.ClickonCustomeTemplateLibrary();
		// click on current page
		//rv12.ClickonCurrentPage();
		//click on all pages
		Thread.sleep(2000);
		rv12.ClickonAllPages();
		//select Template category
		rv12.SelectTemplatesCategory(0);
		Thread.sleep(2000);
		//select templates 
		rv12.SelectTmplate5();
		Thread.sleep(2000);
		//click on Apply
		rv12.clikonApply();
				
	
		//click on Product Statistics
		Data_Actions_ProductStats rv13=new Data_Actions_ProductStats(driver);
			rv13.ClickonProductStats();
			Thread.sleep(5000);
		//click on current Page products
		rv13.clickoncurrentPageProducts();
		Thread.sleep(5000);
		//click on Assortment products
		rv13.clickonAssprtmentProducts();
				//click on cancel
		Thread.sleep(5000);
		rv9.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		//clik on Product Anaylytics
		
		Data_Actions_ProductAnalytics rv14= new Data_Actions_ProductAnalytics(driver);
		rv14.ClickonProductAnalytics();
		
		//click on TableFormat
		Thread.sleep(3000);
		rv14.ClickonTable();
		// click on BarChart Link
		Thread.sleep(5000);
		rv14.ClickonBarchart1Link();
		//click on PieChart Link
		Thread.sleep(5000);
		rv14.ClickonPiechart1Link();
		Thread.sleep(5000);
		rv9.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
