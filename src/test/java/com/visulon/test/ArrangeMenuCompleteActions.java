package com.visulon.test;
import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.ArrangeMenu.Arrange_Align;
import com.visulon.pom.ArrangeMenu.Arrange_Grid_Ruler;
import com.visulon.pom.ArrangeMenu.Arrange_Header_Footer;
import com.visulon.pom.ArrangeMenu.Arrange_SelectAll;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;

public class ArrangeMenuCompleteActions extends BaseTest
{

	
	@Test
	public void arrangeMenuCompleteActions() throws InterruptedException, SikuliException {
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
		Thread.sleep(3000);		
		Arrange_Grid_Ruler	rv7=new Arrange_Grid_Ruler(driver);
		// clic on gridline
		rv7.Clickongridline();
		//click on Ruler
		rv7.ClickonRuler();
		Thread.sleep(3000);
		Arrange_Header_Footer	rv8=new Arrange_Header_Footer(driver);
		// click on header and footer
		rv8.clickonHeaderandFooter();
		Thread.sleep(3000);
		//select preset theme
		rv8.presetThemes3();
		//click on apply
		rv8.ClickOnApply();
		Thread.sleep(3000);	

	}}
