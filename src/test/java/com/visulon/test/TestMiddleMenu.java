package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.TopandBottomMenus.MiddleMenu;

public class TestMiddleMenu extends BaseTest {
	@Test
	public void testMiddleMenu() throws InterruptedException, SikuliException {
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

		MiddleMenu rv5 = new MiddleMenu(driver);
		Thread.sleep(5000);
		rv5.save_Assortment();
		Thread.sleep(5000);

		rv5.save_CustomTemplate();
		Thread.sleep(5000);

		rv5.saveAs_CustomTemplate_StyleName("452");
		Thread.sleep(5000);
		rv5.saveAs_CustomTemplate_SaveButton();
		Thread.sleep(5000);
		rv5.savAs_CustomTemplate_OkButton();
		Thread.sleep(5000);

		rv5.Change_Whiteboard_Color();
		
     
		
		//rv5.Change_Whiteboard_Color();
		Thread.sleep(5000);
		rv5.Gradient_Color();
		Thread.sleep(5000);

		rv5.Gradient_color_submit();
		Thread.sleep(5000);
		rv5.show_hide_Header_Footer();
		Thread.sleep(5000);
		rv5.add_buy_qty_table();
		Thread.sleep(5000);
		rv5.show_hide_Attribute_stickers();
		Thread.sleep(5000);
		rv5.show_hide_Attribute_stickers();
		Thread.sleep(5000);

		rv5.Add_Remove_SwimLanes();
		Thread.sleep(5000);
		rv5.vertical_SwimLanes();
		Thread.sleep(5000);
		rv5.apply_button();
		Thread.sleep(5000);
		rv5.Add_Remove_SwimLanes();
		Thread.sleep(5000);
		rv5.horizontal_SwimLanes();
		Thread.sleep(5000);
		rv5.apply_button();
		Thread.sleep(5000);
		
		rv5.Search();
		Thread.sleep(5000);
		rv5.Search_text("PVC");
		Thread.sleep(5000);
		rv5.search_product();

	}

}
