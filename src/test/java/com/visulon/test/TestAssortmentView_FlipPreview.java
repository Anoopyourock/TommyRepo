package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.Assortment_View.Assortment_ViewMenu;
import com.visulon.pom.Assortment_View.Assortment_View_FlipPreview;


public class TestAssortmentView_FlipPreview extends BaseTest
{
	@Test
	public void testAssortmentView_FlipPreview() throws InterruptedException, SikuliException
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
		//click  on view
		
		Assortment_ViewMenu rv5=new Assortment_ViewMenu(driver);
	     rv5.View();
	     Thread.sleep(5000);
	     
	     Assortment_View_FlipPreview rv6= new Assortment_View_FlipPreview(driver);
	     Thread.sleep(3000);
	     rv6.FlipPreview();
	     Thread.sleep(3000);
	     rv6.shareIcon(1,"anoopsingh@visulon.com","../Tommy/SikuliImages/ok.PNG");
	     Thread.sleep(3000);
	     rv6.ExportToPDF();
	     Thread.sleep(3000);
	     rv6.ThumbnailView();
	     Thread.sleep(3000);
	     rv6.ThumbnailView_PresentationView();
	     Thread.sleep(3000);
	     rv6.ThumbnailView_FlipPreview();
	     Thread.sleep(5000);
	     
	     rv6.catalouge_RightButton();
	     Thread.sleep(3000);
	     rv6.catalouge_LeftButton();
	     Thread.sleep(3000);
	     rv6.Flip_preview_Back_button();
	     
	     Thread.sleep(5000);
		
	   
		
		
		
		
		
		
		
		
		
		
	}
}
