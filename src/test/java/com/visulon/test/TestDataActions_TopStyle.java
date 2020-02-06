package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentData.Actions.Data_Action_Top10Style;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_Menu;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_RecapView;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_ClickonPlaceholder;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_MultiplePlaceHolder;

public class TestDataActions_TopStyle extends BaseTest
{
	@Test
	public void testDataActions_TopStyle() throws SikuliException, InterruptedException
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
	rv3.EnterQuicksearchtext("hats");
	// click on search button
	rv3.clickonquicksearchbutton();
	Thread.sleep(8000);
	// click on sort button
	rv3.clickSortButton();
	// Sort by Style
	rv3.sortbyStyle();
	Thread.sleep(6000);
	// select how many product you want to search
	rv3.selectproducts(10);
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
	//clickonplaceholder
	PlaceHolder_ClickonPlaceholder rv6= new PlaceHolder_ClickonPlaceholder(driver);
	rv6.clickonPlaceHolder();
	//Clickon Add paceholder
	Thread.sleep(3000);
	PlaceHolder_MultiplePlaceHolder rv7= new PlaceHolder_MultiplePlaceHolder(driver);
	//click on multiple placeholder
	rv7.clickonMultiplePlaceHolder();
	//click on add file
	Thread.sleep(2000);
	rv7.clikonAddFile("../Tommy/SikuliImages/AddFiles.PNG");
	//address of first image
	Thread.sleep(2000);
	rv7.Addressoffile("../Tommy/SikuliImages/Choose_FileName.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\ddc5748dbf6ff10b09880ee86eebe50e.jpg");
	//click on open
	Thread.sleep(2000);
	rv7.clickonOpen("../Tommy/SikuliImages/Open.PNG");
	//click on second image
	Thread.sleep(2000);
	rv7.clikonAddFile("../Tommy/SikuliImages/ADDSecondfile.PNG");
	//address of second image
	Thread.sleep(2000);
	rv7.Addressoffile("../Tommy/SikuliImages/Choose_FileName.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
	//click on open
	Thread.sleep(2000);
	rv7.clickonOpen("../Tommy/SikuliImages/Open.PNG");
	//start upload
	Thread.sleep(2000);
	rv7.ClickStartUpload("../Tommy/SikuliImages/StartUpload.PNG");
	Thread.sleep(5000);
	//click on continue
	rv3.Clickoncontinue();
	Thread.sleep(5000);
	//Click on show PlaceHolder Name
	rv7.ClickonShowplaceholderName();
	Thread.sleep(5000);
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
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
