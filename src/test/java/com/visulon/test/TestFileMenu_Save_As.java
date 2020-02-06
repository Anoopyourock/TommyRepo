package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_ChangeMilestone;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentMenu.FileMenu_Save_As;

public class TestFileMenu_Save_As extends BaseTest
{
	@Test
	public void testFileMenu_Save_As() throws InterruptedException
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
				//click on open icon
				rv4.clickonopenicon();
				Thread.sleep(5000);
				// click on cancel button
				rv4.clickoncancelbutton();
		FileMenu_Save_As rv5= new FileMenu_Save_As(driver);
			// click on save as button
			rv5.clickonsaveasbutton();
			Thread.sleep(5000);
			// enter assortment name
			rv5.EnterAssortmentname();
			// select privacy
			rv5.Selectprivacyasprivate();
			// save as global assortment 
			rv5.SaveasGlobalassrtment();
			//click on save as assortment button
			rv5.clickonsaveassortment();
			Thread.sleep(5000);
		FileMenu_ChangeMilestone rv6 = new FileMenu_ChangeMilestone(driver);
			// click on change milestone
				rv6.clickonchangemilestone();
				//select milestone
				rv6.SelectMilestone(1);
				//keep copy of current assortment
				rv6.keepcopy();
				//click on apply
				rv6.clickonApply();
		
		
		
		
		
		
		
		
}
}