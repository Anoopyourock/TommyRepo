package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Add_Customer;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_AssortmentFilter;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Clear_Delete_Copy;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Customer_Assortment;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Marquee;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Snap_to_Grid;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_clickonTools;

public class ToolsMenuCompleteActions extends BaseTest
{
	@Test
	public void toolsMenuCompleteActions() throws InterruptedException, SikuliException
	{
		VisulonLoginPage rv1 = new VisulonLoginPage(driver);
		// data driven from excel
		// username
		String un = Excelsheet.readData("Sheet1", 0, 0);
		// password
		String pass = Excelsheet.readData("Sheet1", 0, 1);
		// set Username and password
		rv1.setCredentials(un, pass);
		rv1.ClickonRememberMe();
		rv1.ClickOnLoginButton();

		// B1.clickonassortment();
		CreateAssortment rv2 = new CreateAssortment(driver);
		// click on assortment
		rv2.clickonAssortment();
		// give document name
		rv2.documentname();
		// select fiscal year
		rv2.selectFiscalyear(2);
		// rv2.clickSeason();
		// select milestone
		rv2.selectMilestone(2);
		// select privacy
		rv2.selectprivacy();
		// select assortment type global or local
		rv2.clickonassortmenttype();
		// click on proceed
		rv2.create();
		Thread.sleep(3000);

		// leftpanelmenu
		AssortmentMenuleftpanel rv3 = new AssortmentMenuleftpanel(driver);
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
		// click on left panel
		rv3.clickonleftpanel();
		FileMenu_Open rv4 = new FileMenu_Open(driver);
		// click on file Menu
		rv4.clickonfileMenu();
		// click on save
		rv4.clickonsave();
		// click on left panel
		rv3.clickonleftpanel();
		Thread.sleep(4000);
		
		//click on toolsMenu
		ToolsMenu_clickonTools rv11 =new ToolsMenu_clickonTools(driver) ;
	    rv11.ClickOnTool();
	    
	    //Click On Marquee
	    ToolsMenu_Marquee rv12 = new ToolsMenu_Marquee(driver);
	    rv12.ClickOnMarquee();
	    
	    //Click on copy, delete, clear
	    ToolsMenu_Clear_Delete_Copy rv13 = new ToolsMenu_Clear_Delete_Copy(driver);
	    Thread.sleep(3000);
	    rv13.ClickOnClear("../Tommy/SikuliImages/ok.PNG");
	    Thread.sleep(3000);
	    
	    rv13.ClickOnDelete("../Tommy/SikuliImages/ok.PNG");
	    Thread.sleep(3000);
	    rv13.ClickOnCopy ("../Tommy/SikuliImages/ok.PNG");
	    Thread.sleep(5000);
	    
	    //Click on SnapToGrid
	    ToolsMenu_Snap_to_Grid rv14= new ToolsMenu_Snap_to_Grid(driver);
	    rv14.ClickOnSnapToGrid();
	    Thread.sleep(3000);
	    
	    //CLick on AddToCustomer
	    
	    ToolsMenu_Add_Customer rv15 = new ToolsMenu_Add_Customer(driver);
	    rv15.ClickOnCustomer();
	    Thread.sleep(3000);
	    rv15.SelectAllProduct();
	    Thread.sleep(3000);
	    rv15.SelectCustomer(0);
	    Thread.sleep(3000);
	    rv15.addButton();
	    Thread.sleep(3000);
	    rv15.closeButton();
	    Thread.sleep(3000);
	    
	    //CLick on customerAssortment
	    ToolsMenu_Customer_Assortment rv16 = new ToolsMenu_Customer_Assortment(driver);
	    rv16.ClickOnCustomerAssortment();
	    rv15.closeButton();
	    Thread.sleep(3000);
	   	    
	    //Click on Assortment Filter
	    ToolsMenu_AssortmentFilter rv17= new ToolsMenu_AssortmentFilter(driver);
	    rv17.ClickOnAssortmentFilter();
	    rv17.withimages();
	    rv17.TTLCAUnits();
	    rv17.TTLUSUnits();
	    rv17.wicking();
	    rv17.primaloft();
	    rv17.apply();
	    Thread.sleep(3000);
	    rv17.editFilter();
	    Thread.sleep(3000);
	    rv17.withimages();
	    rv17.apply();
	    Thread.sleep(3000);
	    rv17.groupAndSort();
	    rv17.groupBy(0);
	    rv17.firstSortBy(0);
	    rv17.SecondSortBy(0);
	    rv17.ThirdSortBy(0);
	    rv17.ForthSortBy(0);
	    rv17.Group_sortapplyButton();
	    Thread.sleep(3000);
	    rv17.ListView();
	    Thread.sleep(3000);
	    rv17.Top10View();
	    rv17.Top10(0);
	    rv17.style(0);
	    rv17.retail(0);
	    Thread.sleep(3000);
	    rv17.Top10ExportToExcel();
	    Thread.sleep(3000);
	    rv17.Top10Closebutton();
	    Thread.sleep(3000);
	    rv17.createAsssortment();
	    rv17.SaveAssortmentName();
	    rv17.SaveAssortmentSaveButton();
	    rv17.NoProductSerachOkButton();
	    rv17.SaveAssortmentCloseButton();
	    Thread.sleep(3000);
	    rv17.productCollectionCloseButton();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
