package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.TopandBottomMenus.TopMenu;

public class TestTopMenu extends BaseTest
{
	@Test
	public void testTopMenu() throws InterruptedException, SikuliException
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
		rv3.EnterQuicksearchtext("RED");
		// click on search button
		rv3.clickonquicksearchbutton();
		Thread.sleep(8000);
		// click on sort button
		rv3.ClickonFilter();
		// Sort by Style
		rv3.SearchProductwithimages();
		Thread.sleep(2000);
		rv3.clickonApply();
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
		
		
		
		 TopMenu rv5 = new TopMenu(driver);
	     rv5.Revision_History();
	     Thread.sleep(5000);
	     rv5.Revision_History_ExportToExcel();
	     Thread.sleep(5000);
	     rv5.Revision_History_CloseButton();
	     Thread.sleep(5000);
	     rv5.Full_View();
	     Thread.sleep(5000);
		 rv5.open_assortment();
		 Thread.sleep(3000);
		 rv5.global_assortment();
		 Thread.sleep(3000);
		 rv5.Close_Button("..//Tommy/SikuliImages/ClickonCancelicon.PNG");
		 Thread.sleep(3000);
		 rv5.save_assortment();
		 Thread.sleep(3000);
		 rv5.create_AssortmentForCustomer(1);
		 Thread.sleep(3000);
		 rv5.create_AssortmentforCustomer();
		 Thread.sleep(3000);
		 rv5.no_product_found();
		 rv5.create_Assortment_closeButton();
		 Thread.sleep(3000);
		 rv5.ClickOnPictures();
		 Thread.sleep(3000);
		 rv5.ClickonChooseFiles();
		 Thread.sleep(3000);
		 rv5.clickonopenimage("../Tommy/SikuliImages/ClikonPictureicon.PNG");
		 rv5.EnterFilepath("../Tommy/SikuliImages/ChooseFilename.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
		 rv5.clickonopenimage("../Tommy/SikuliImages/clickonopen.PNG");
		 Thread.sleep(3000);
		 rv5.ClikonAddButton();
		 Thread.sleep(3000);
		 rv5.ClickOnLogo();
		 Thread.sleep(3000);
		 rv5.selectLogo("..//Tommy/SikuliImages/Tommy_logo.PNG");
		 Thread.sleep(3000);
		rv5.apply_Standard_Themes();
		Thread.sleep(3000);
		rv5.hide_Attributes();
		Thread.sleep(5000);
		rv5.ClickOnCustomer();
		Thread.sleep(5000);
		rv5.SelectAllProduct();
		Thread.sleep(5000);
		rv5.SelectCustomer(1);
		Thread.sleep(5000);
		rv5.addButton();
		Thread.sleep(5000);
		rv5.closeButton("../Tommy/SikuliImages/ClickonCancelicon.PNG");
		Thread.sleep(5000);
		rv5.ClickOnMarquee();
		Thread.sleep(5000);
		rv5.FitToScreen();
		rv5.FitToWidth();
		Thread.sleep(5000);
		rv5.Navigation_firstpage();
		Thread.sleep(5000);
		rv5.Navigation_lastpage();
		Thread.sleep(5000);
		rv5.Navigation_prevpage();
		Thread.sleep(5000);
		rv5.Navigation_nextpage();
		Thread.sleep(5000);
		rv5.Close();
		
		Thread.sleep(5000);
		rv5.home();
		
		
	}
	
}
