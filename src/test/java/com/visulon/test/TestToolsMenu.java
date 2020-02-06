package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.AddProduct;
import com.visulon.pom.AddTocart;
import com.visulon.pom.BasePage;
import com.visulon.pom.CreateAssortmentByProductsearch;
import com.visulon.pom.CreateAssortmentaftercart;
import com.visulon.pom.SearchHierarchy;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Add_Customer;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_AssortmentFilter;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Clear_Delete_Copy;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Customer_Assortment;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Marquee;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Snap_to_Grid;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_clickonTools;

public class TestToolsMenu extends BaseTest
{

	@Test
	
	
	public void testToolsMenu() throws InterruptedException, SikuliException
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
		//popup details
			rv2.selectfiscalyear(2);
			rv2.clickonproceed();
		//click on search buttons
			SearchHierarchy rv3=new SearchHierarchy(driver);
			rv3.ClickoOnSearchHierarchy();
			Thread.sleep(5000);
			rv3.accessories();
			rv3.Boys();
			rv3.Hats();
			Thread.sleep(10000);
			rv3.quickSearch("shoe");
			rv3.ClickOnQuickSearchButton();
		//Add Products to cart
			AddProduct rv4= new AddProduct(driver);
			rv4.SelectAll();
			Thread.sleep(10000);
			rv4.addcart();
			AddTocart rv5= new AddTocart(driver);
			rv5.SaveasAssortment();
		//Create Assortment after products added into cart
			CreateAssortmentaftercart rv6 =new CreateAssortmentaftercart(driver);
			rv6.AssortmentName("ty22");
			rv6.Select_Milestones(2);
			rv6.Select_Privacy();
			rv6.GroupBy(3);
			rv6.SortBy(2);
			rv6.Global_Assortment();
			rv6.create_Assortment();
			Thread.sleep(5000);
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
    Thread.sleep(10000);
    
    //CLick on AddToCustomer
    
    ToolsMenu_Add_Customer rv15 = new ToolsMenu_Add_Customer(driver);
    rv15.ClickOnCustomer();
    rv15.SelectAllProduct();
    rv15.SelectCustomer(0);
    rv15.addButton();
    rv15.closeButton();
    Thread.sleep(5000);
    
    //CLick on customerAssortment
    ToolsMenu_Customer_Assortment rv16 = new ToolsMenu_Customer_Assortment(driver);
    rv16.ClickOnCustomerAssortment();
    rv16.SelectCustomerAssortment(0);
    rv16.ClickOnCreateButton();
    Thread.sleep(5000);
    rv16.ClickOnPrev_Assortment();
  //rv16.ClickOnNoProductFoundButton();
    Thread.sleep(5000);
    
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
