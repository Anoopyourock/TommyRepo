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
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_AddWhiteBoard;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_BackGroundTheme;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_FormattedNote;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Logo;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Pictures;

import com.visulon.pom.AssortmentInsertMenu.Insertmenu_AddPage;

public class TestInsertMenu_Logo extends BaseTest
{
	@Test
	public void testInsertMenu_Logo() throws InterruptedException, SikuliException
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
			rv6.AssortmentName("t137");
			rv6.Select_Milestones(2);
			rv6.Select_Privacy();
			rv6.GroupBy(3);
			rv6.SortBy(2);
			rv6.Global_Assortment();
			rv6.create_Assortment();
			Thread.sleep(5000);
		//InsertMenu
			Insertmenu_AddPage rv7 =new Insertmenu_AddPage(driver);
			rv7.ClickOnAddPage();
			rv7.ClickOnAddCover();
			rv7.Available_cover();
			rv7.ClickOnApplyButton();
			Thread.sleep(3000);
			
		// click on add whiteBoard
			InsertMenu_AddWhiteBoard rv8= new InsertMenu_AddWhiteBoard(driver);
			rv8.ClickOnAddWhiteBoard();
			rv8.ClickOnWhiteBoard1();
			rv8.ClickOnPrevPage();
			rv8.ClickOnPrevPage();
		//click on formatted note
			Thread.sleep(3000);
			InsertMenu_FormattedNote rv9= new InsertMenu_FormattedNote(driver);
			rv9.ClickOnFormattedNote();
			rv9.FormattedNotePopup("Hello", "../Tommy/SikuliImages/Screenshot.png");
		//click on Add picture
			Thread.sleep(3000);
			InsertMenu_Pictures rv10 =new InsertMenu_Pictures(driver);
			rv10.ClickOnPictures();
			rv10.clickonchoosefile();
			rv10.EnterFilepath("../Tommy/SikuliImages/ChooseFilename.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
			rv10.clickonopenimage("../Tommy/SikuliImages/clickonopen.PNG");
			rv10.clickonAddButton();
			Thread.sleep(12000);
	
	    //click on Themes
			InsertMenu_BackGroundTheme rv11=new InsertMenu_BackGroundTheme(driver);
			rv11.ClickOnForwardPage();
			Thread.sleep(3000);
			rv11.ClickOnThemes();
			rv11.ClickOnAllPages();
			rv11.ClickOnWhiteColorThemes();
			Thread.sleep(3000);
			rv11.ClickOnCustomThemes();
			Thread.sleep(3000);
			rv11.ClickOnGreyColorThemes();
			Thread.sleep(5000);
	        
		//click on Logo
			InsertMenu_Logo rv12 = new InsertMenu_Logo(driver);
		     
		     rv12.ClickOnLogo();
		     rv12.selectLogo("../Tommy/SikuliImages/cartars_logo.png");

			
		
	}

}
