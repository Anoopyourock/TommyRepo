package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.Assortment_View.Assortment_ViewMenu;
import com.visulon.pom.Assortment_View.Assortment_View_ProductCollection;

public class TestAssortment_View_ProductCollection extends BaseTest
{

	@Test
	public void testAssortment_View_ProductCollection() throws InterruptedException, SikuliException
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
		//click  on view
		
		Assortment_ViewMenu rv6=new Assortment_ViewMenu(driver);
	     rv6.View();
	     Thread.sleep(5000);
	     //click on Product Collection
	     
	     
	     
	     Assortment_View_ProductCollection rv7= new Assortment_View_ProductCollection(driver);
	     
		   rv7.productCollection();
		   //click on Edit Filter
		   rv7.EditFilter();
		   //clik on images
		   rv7.withimages();
		   //clik on without images
		   rv7.withoutimages();
		   //click on apply
	       rv7.apply();
	      Thread.sleep(3000);
	      //clik on group and sort
	       rv7.groupAndSort();
	       //clik on groupBy
	       rv7.groupBy(0);
	       // click on sortby
	       rv7.firstSortBy(0);
	       //clik on Second sortby
	       rv7.SecondSortBy(0);
	     //clik on third sortby	
	       rv7.ThirdSortBy(0);
	     //clik on Fourth sortby
	       rv7.ForthSortBy(0);
	     //clik on apply button
	       rv7.Group_sortapplyButton();
	       Thread.sleep(3000);
	       //clik on list view
	       rv7.ListView();
	       Thread.sleep(3000);
	       //clik on top 10 view
	       rv7.Top10View();
	       Thread.sleep(3000);
	       //clik on top 10
	       rv7.Top10(1);
	       Thread.sleep(3000);
	       //clik on style
	       rv7.style(1);
	       Thread.sleep(3000);
	       rv7.retail(1);
	       Thread.sleep(3000);
	       //clik on export excel
	       rv7.Top10ExportToExcel();
	       Thread.sleep(3000);
	       //click on close button
	       rv7.Top10Closebutton();
	       Thread.sleep(3000);
	       //clik on create Assortment 
	       rv7.createAsssortment();
	       //provide  assortment name
	       rv7.SaveAssortmentName();
	       //clik on save button
	       rv7.SaveAssortmentSaveButton();
	       
	       Thread.sleep(5000);
	       //clik on previous button
		//   rv7.prev_Assortment();
	       Thread.sleep(5000);
	       
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	
	
	
	}
}
