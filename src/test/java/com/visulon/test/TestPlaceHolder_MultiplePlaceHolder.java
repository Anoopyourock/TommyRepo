package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_ClickonPlaceholder;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_MultiplePlaceHolder;

public class TestPlaceHolder_MultiplePlaceHolder extends BaseTest
{

	@Test
	public void testPlaceHolder_MultiplePlaceHolder() throws InterruptedException, SikuliException
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
	
	
	}
	
	
}
