package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.ArrangeMenu.Arrange_Align;
import com.visulon.pom.ArrangeMenu.Arrange_SelectAll;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;

public class TestArrange_Align extends BaseTest
{
	@Test
	public void testArrange_Align() throws InterruptedException
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
	//click on left panel
	rv3.clickonleftpanel();
	//Click on product Search
	rv3.clickonProductsearch();
	//click on search Hierarchy
	rv3.clickonHierarchysearch();
	//enter text hats
	rv3.EnterQuicksearchtext("hats");
	//click on search Button
	rv3.clickonquicksearchbutton();
	Thread.sleep(8000);
	//click on sortby 
	rv3.clickSortButton();
	//select sortby with style
	rv3.sortbyStyle();
	Thread.sleep(6000);
	//rv3.SelectMultiple();
	rv3.selectproducts(10);
	//click on continue
	rv3.Clickoncontinue();
	Thread.sleep(4000);
	//click on left panel
	rv3.clickonleftpanel();
	FileMenu_Open rv4= new FileMenu_Open(driver);
	//click on file menu
	rv4.clickonfileMenu();
	//click on save
	rv4.clickonsave();
	//click on left panel
	rv3.clickonleftpanel();
	Thread.sleep(3000);
	Arrange_SelectAll rv5 =new Arrange_SelectAll(driver);
	//click on arrange
	rv5.ClickonArrange();
	// Select All
	rv5.SelectAll();
	Thread.sleep(3000);
	//click on whiteboard
	rv5.ClickonWhiteBoard();
	Thread.sleep(3000);
	//select multiple
	rv5.SelectMultiple();
	//select first image
	rv5.SelectFirstImage();
	Thread.sleep(3000);
	Arrange_Align	rv6= new Arrange_Align(driver);
	Thread.sleep(3000);
	// Align Bottom
	rv6.MoveToBottom();
	Thread.sleep(3000);
	//align to center
	rv6.MoveToCenter();
	Thread.sleep(3000);
	//Align on left
	rv6.MovetoLeft();
	Thread.sleep(3000);
	//Align on Middle
	rv6.MoveToMiddle();
	Thread.sleep(3000);
	//align to right
	rv6.MoveToRight();
	Thread.sleep(3000);
	//align to top
	rv6.MoveToTop();
	Thread.sleep(3000);
	//click on align
	rv6.ClickonAlign();
			
	
	
	
	
}
}