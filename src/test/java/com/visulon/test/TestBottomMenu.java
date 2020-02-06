package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.TopandBottomMenus.BottomMenu;

public class TestBottomMenu extends BaseTest
{

	@Test
	public void testBottomMenu() throws InterruptedException
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
		BottomMenu rv5 = new BottomMenu(driver);
		rv5.presentation_mode();
		 Thread.sleep(3000);
		 rv5.presentation_mode_view_ProductImages();
		 Thread.sleep(3000);
		 rv5.presentation_mode_view_Page();
		 Thread.sleep(3000);
		 rv5.presentation_mode_view_ProductInfo();
		 Thread.sleep(3000);
		 rv5.presentation_mode_SliderImage_nextButton();
		 Thread.sleep(3000);
		 rv5.presentation_mode_SliderImage_prevButton();
		 Thread.sleep(3000);
		 rv5.presentation_mode_view_OriginalImage();
		 Thread.sleep(3000);
		 rv5.zoom_in();
		 Thread.sleep(3000);
		 rv5.zoom_out();
		 Thread.sleep(3000);
		 rv5.FItTOScreen();
		 Thread.sleep(3000);
		 rv5.product_OriginalImages();
		 Thread.sleep(3000);
		 rv5.Change_Background();
		 Thread.sleep(3000);
		 rv5.product_DownloadImages();
		 Thread.sleep(3000);
		 rv5.product_name_closeButton();
		 Thread.sleep(3000);
		 rv5.presentation_mode_view_Page();
		 Thread.sleep(3000);
		 rv5.page_nextButton();
		 Thread.sleep(3000);
		 rv5.page_prevButton();
		 Thread.sleep(3000);
		 rv5.product_Display_CloseButton();
		 
		 rv5.Last_Actions();
		 Thread.sleep(3000);
		 rv5.Last_Actions();
		 Thread.sleep(3000);
	     rv5.Product_statistics();
	     Thread.sleep(3000);
	     rv5.Product_statistics_assortmentProduct();
	     Thread.sleep(3000);
	     rv5.Product_statistics_closeButton();
	     
	     //product analytics
	     Thread.sleep(5000);
	     rv5.Product_Analytics();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Pie_Chart();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Pie_Chart_Select_category(1);
	     Thread.sleep(5000);
	     rv5.Product_Analytics_closeButton();
	     Thread.sleep(5000);
	     rv5.Product_Analytics();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Bar_Chart();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Pie_Chart_Select_category(1);
	     Thread.sleep(5000);
	     rv5.Product_Analytics_closeButton();
	     Thread.sleep(5000);
	     rv5.Product_Analytics();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Table_format();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Table_format_ExportToExcel();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_Table_format_ExportToPDF();
	     Thread.sleep(5000);
	     rv5.Product_Analytics_closeButton();
	     Thread.sleep(5000);
	     rv5.Show_hide_topPanel();
	     Thread.sleep(5000);
	     rv5.Show_hide_leftPanel();
	     Thread.sleep(5000);
	     rv5.FitToScreen();
	     Thread.sleep(5000);
	     rv5.FitToWidth();
	     Thread.sleep(5000);
	     rv5.minbeds(4);
	     Thread.sleep(5000);
	     rv5.Slider_Bar();
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
