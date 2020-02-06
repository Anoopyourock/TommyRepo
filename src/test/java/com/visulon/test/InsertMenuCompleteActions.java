package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_AddWhiteBoard;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_AlternateImage;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_BackGroundTheme;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_FillColors;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Fixtures;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_FormattedNote;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Logo;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Pictures;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_WhiteBoardColor;
import com.visulon.pom.AssortmentInsertMenu.Insertmenu_AddPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_ChangeMilestone;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;

public class InsertMenuCompleteActions extends BaseTest {
	@Test
	public void insertMenuCompleteActions() throws InterruptedException, SikuliException {
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
		// InsertMenu
		Insertmenu_AddPage rv7 = new Insertmenu_AddPage(driver);
		rv7.clickoninsert();
		rv7.ClickOnAddPage();
		rv7.ClickOnAddCover();
		rv7.Available_cover();
		FileMenu_ChangeMilestone rv6 = new FileMenu_ChangeMilestone(driver);
		Thread.sleep(3000);
		rv6.clickonApplyimage("../Tommy/SikuliImages/Applyicon.PNG");
		Thread.sleep(5000);
		// click on add whiteBoard
		InsertMenu_AddWhiteBoard rv8 = new InsertMenu_AddWhiteBoard(driver);
		rv8.ClickOnAddWhiteBoard();
		rv8.ClickOnWhiteBoard1();
		rv8.ClickOnPrevPage();
		rv8.ClickOnPrevPage();
		// click on formatted note
		Thread.sleep(3000);
		InsertMenu_FormattedNote rv9 = new InsertMenu_FormattedNote(driver);
		rv9.ClickOnFormattedNote();
		rv9.FormattedNotePopup("Hello", "../Tommy/SikuliImages/Screenshot.png");
		// click on Add picture
		Thread.sleep(3000);
		InsertMenu_Pictures rv10 = new InsertMenu_Pictures(driver);
		rv10.ClickOnPictures();
		rv10.clickonchoosefile();
		rv10.EnterFilepath("../Tommy/SikuliImages/ChooseFilename.PNG",
				"C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
		rv10.clickonopenimage("../Tommy/SikuliImages/clickonopen.PNG");
		rv10.clickonAddButton();
		Thread.sleep(3000);
		//clik on whiteBoardColor
		
		InsertMenu_WhiteBoardColor rv11 = new InsertMenu_WhiteBoardColor(driver);
		rv11.clikonWhiteBoardColor();
		Thread.sleep(3000);
		rv11.ClikonOkButton();
		Thread.sleep(3000);
		// click on Logo
		InsertMenu_Logo rv12 = new InsertMenu_Logo(driver);

		rv12.ClickOnLogo();
		rv12.selectLogo("../Tommy/SikuliImages/Tommy_logo.PNG");
		// click on Fixture Library
		Thread.sleep(3000);
		InsertMenu_Fixtures rv13 = new InsertMenu_Fixtures(driver);
		rv13.ClickOnFixtureLibrary();
		rv13.SelectfixtureImages1();
		rv13.SelectfixtureImages2();
		rv13.CloseFixtureImagesPopup();
		rv8.ClickOnForwardPage();
		Thread.sleep(4000);
		// fill colors in product
		InsertMenu_FillColors rv14 = new InsertMenu_FillColors(driver);
		rv14.ClickOnFillProductColor();
		Thread.sleep(2000);
		rv14.chooseColor();
		Thread.sleep(2000);
		rv14.FillColorInProduct();
		Thread.sleep(3000);
		//click on Background Images
		InsertMenu_BackGroundTheme rv15= new InsertMenu_BackGroundTheme(driver);
		rv15.ClickOnForwardPage();
		Thread.sleep(3000);
		rv15.ClickOnThemes();
		rv15.ClickOnAllPages();
		rv15.ClickOnWhiteColorThemes();
		Thread.sleep(3000);
		rv15.ClickOnCustomThemes();
		Thread.sleep(3000);
		rv15.ClickOnGreyColorThemes();
		Thread.sleep(5000);
        rv15.ClickonApply();
				
        Thread.sleep(3000);
		// Alternate Images

		InsertMenu_AlternateImage rv16 = new InsertMenu_AlternateImage(driver);
		rv16.ClickOnAlternateImages();
		Thread.sleep(3000);
		rv16.ClickOnAlternateImagesBackImages();
		Thread.sleep(3000);
		rv16.ClickOnInsertForCurrentWhiteboard();
		Thread.sleep(3000);
		rv16.ClickOnApplyButton();
		Thread.sleep(5000);

	}
}
