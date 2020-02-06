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
import com.visulon.pom.Assortment_View.Assortment_View_ProductCollection;
import com.visulon.pom.Assortment_View.Assortment_View_Rollover;
import com.visulon.pom.Assortment_View.Assortment_View_SliderPreview;
import com.visulon.pom.Assortment_View.Assortment_View_ThumbnailView;

public class ViewMenuCompleteActions extends BaseTest
{

	
	@Test
	public void viewMenuCompleteActions() throws InterruptedException, SikuliException
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
		
		Assortment_ViewMenu rv6=new Assortment_ViewMenu(driver);
	     rv6.View();
	     Thread.sleep(5000);
	     
	     Assortment_View_FlipPreview rv5= new Assortment_View_FlipPreview(driver);
	     Thread.sleep(3000);
	     rv5.FlipPreview();
	     Thread.sleep(3000);
	     rv5.shareIcon(1,"anoopsingh@visulon.com","../Tommy/SikuliImages/ok.PNG");
	     Thread.sleep(3000);
	     rv5.ExportToPDF();
	     Thread.sleep(3000);
	     rv5.ThumbnailView();
	     Thread.sleep(3000);
	     rv5.ThumbnailView_PresentationView();
	     Thread.sleep(3000);
	     rv5.ThumbnailView_FlipPreview();
	     Thread.sleep(5000);
	     
	     rv5.catalouge_RightButton();
	     Thread.sleep(3000);
	     rv5.catalouge_LeftButton();
	     Thread.sleep(3000);
	     rv5.Flip_preview_Back_button();
	     
	     Thread.sleep(5000);
	     //click on Slider Preview
	     Assortment_View_SliderPreview rv7 = new Assortment_View_SliderPreview(driver);
	     
		    rv7.SliderPreview();
		    Thread.sleep(3000);
		    rv7.SliderPreview_PresentationView();
		    Thread.sleep(3000);
		    rv7.SliderPreview_Back_button();
		    
		    Thread.sleep(5000);
		
		
	     Assortment_View_ThumbnailView rv8= new Assortment_View_ThumbnailView(driver);
	     rv8.ThumnailView();
		 Thread.sleep(3000);
		 rv8.apply_button();
		 Thread.sleep(3000);
		 rv8.applyOk_button("../Tommy/SikuliImages/ok.PNG");
		    
		   Thread.sleep(5000);
	     
		   Assortment_View_ProductCollection rv9= new Assortment_View_ProductCollection(driver);
		     
		   rv9.productCollection();
		   //click on Edit Filter
		   rv9.EditFilter();
		   //clik on images
		   rv9.withimages();
		   //clik on without images
		   rv9.withoutimages();
		   //click on apply
	       rv9.apply();
	      Thread.sleep(3000);
	      //clik on group and sort
	       rv9.groupAndSort();
	       //clik on groupBy
	       rv9.groupBy(0);
	       // click on sortby
	       rv9.firstSortBy(0);
	       //clik on Second sortby
	       rv9.SecondSortBy(0);
	     //clik on third sortby	
	       rv9.ThirdSortBy(0);
	     //clik on Fourth sortby
	       rv9.ForthSortBy(0);
	     //clik on apply button
	       rv9.Group_sortapplyButton();
	       Thread.sleep(3000);
	       //clik on list view
	       rv9.ListView();
	       Thread.sleep(3000);
	       //clik on top 10 view
	       rv9.Top10View();
	       Thread.sleep(3000);
	       //clik on top 10
	       rv9.Top10(1);
	       Thread.sleep(3000);
	       //clik on style
	       rv9.style(1);
	       Thread.sleep(3000);
	       rv9.retail(1);
	       Thread.sleep(3000);
	       //clik on export excel
	       rv9.Top10ExportToExcel();
	       Thread.sleep(3000);
	       //click on close button
	       rv9.Top10Closebutton();
	       Thread.sleep(3000);
	       //clik on create Assortment 
	       rv9.createAsssortment();
	       //provide  assortment name
	       rv9.SaveAssortmentName();
	       //clik on save button
	       rv9.SaveAssortmentSaveButton();
	       //clik on previous button
	       Thread.sleep(10000);
	       rv9.prev_Assortment();
	       Thread.sleep(5000);
	       
	       Assortment_View_Rollover rv10 =new Assortment_View_Rollover(driver);
		     rv10.RolloverZoom();
		     //move on image
		     
		    rv10.rollover_Image("../Tommy/SikuliImages/rollover.PNG");
		     Thread.sleep(5000);
		     
	
	
	
	
	
	
	
	
	
	
	
	
	}}
