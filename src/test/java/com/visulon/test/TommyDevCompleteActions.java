package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.ArrangeMenu.Arrange_Align;
import com.visulon.pom.ArrangeMenu.Arrange_Grid_Ruler;
import com.visulon.pom.ArrangeMenu.Arrange_Header_Footer;
import com.visulon.pom.ArrangeMenu.Arrange_SelectAll;
import com.visulon.pom.AssortmentData.Actions.Data_Action_RevisionHistory;
import com.visulon.pom.AssortmentData.Actions.Data_Action_Top10Style;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_CustomTemplateLibrary;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_Menu;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_ProductAnalytics;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_ProductStats;
import com.visulon.pom.AssortmentData.Actions.Data_Actions_RecapView;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_AddWhiteBoard;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_AlternateImage;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_BackGroundTheme;
//import com.visulon.pom.AssortmentInsertMenu.InsertMenu_FillColors;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Fixtures;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_FormattedNote;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Logo;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_Pictures;
import com.visulon.pom.AssortmentInsertMenu.InsertMenu_WhiteBoardColor;
import com.visulon.pom.AssortmentInsertMenu.Insertmenu_AddPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_ChangeMilestone;
import com.visulon.pom.AssortmentMenu.FileMenu_Exit;
//import com.visulon.pom.AssortmentMenu.FileMenu_Copyoverseason;
import com.visulon.pom.AssortmentMenu.FileMenu_Lock_unlock;
import com.visulon.pom.AssortmentMenu.FileMenu_MergeAssortment;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentMenu.FileMenu_Save_As;
import com.visulon.pom.AssortmentMenu.FileMenu_SearchHistory;
import com.visulon.pom.AssortmentMenu.FileMenu_Share;
import com.visulon.pom.AssortmentMenu.FileMenu_SharewithTeam;
import com.visulon.pom.AssortmentMenu.FileMenu_Shortcutkeys;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_AddPlaceholder;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_AddQuick_PlaceHolder;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_ClickonPlaceholder;
import com.visulon.pom.AssortmentPlaceHolder.PlaceHolder_MultiplePlaceHolder;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Add_Customer;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_AssortmentFilter;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Clear_Delete_Copy;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Customer_Assortment;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Marquee;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_Snap_to_Grid;
import com.visulon.pom.AssortmentToolsMenu.ToolsMenu_clickonTools;
import com.visulon.pom.Assortment_Export.Export_Menu;
import com.visulon.pom.Assortment_View.Assortment_ViewMenu;
import com.visulon.pom.Assortment_View.Assortment_View_FlipPreview;
import com.visulon.pom.Assortment_View.Assortment_View_ProductCollection;
//import com.visulon.pom.Assortment_View.Assortment_View_Rollover;
import com.visulon.pom.Assortment_View.Assortment_View_SliderPreview;
import com.visulon.pom.Assortment_View.Assortment_View_ThumbnailView;
import com.visulon.pom.Attributes.Assortment_AttributeMenu;
import com.visulon.pom.Attributes.Assortment_Attribute_AddHangTag;
import com.visulon.pom.Attributes.Assortment_Attribute_AttributeView;
import com.visulon.pom.Attributes.Assortment_Attribute_EditBuyGrid;
import com.visulon.pom.Attributes.Assortment_Attribute_ManageAttributes;
import com.visulon.pom.Attributes.Assortment_Attributes_Formatted;
import com.visulon.pom.Attributes.Assortment_Attributes_UserDefined;

public class TommyDevCompleteActions extends BaseTest
{

	
	@Test
	public void tommyDevCompleteActions() throws InterruptedException, SikuliException
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
		rv2.selectFiscalyear(0);
		//rv2.clickSeason();
		//select milestone
		rv2.selectMilestone(1);
		//select privacy
		rv2.selectprivacy();
		//select assortment type global or local
		//rv2.clickonassortmenttype();
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
		rv3.EnterQuicksearchtext("0");
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
		//rv3.clickonleftpanel();
		FileMenu_Open rv4= new FileMenu_Open(driver);
		// click on file Menu
		rv4.clickonfileMenu();
		//click on save
		rv4.clickonsave();
		//click on left panel
		Thread.sleep(2000);
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
		//rv5.SaveasGlobalassrtment();
		//click on save as assortment button
		rv5.clickonsaveassortment();
		Thread.sleep(5000);
		/*FileMenu_Copyoverseason rv14 =new FileMenu_Copyoverseason(driver);
		rv14.clickonCopyoverseason();
		Thread.sleep(3000);
		rv14.enterAssortmenttext("xaqwert");
		Thread.sleep(3000);
		rv14.selectSeason(1);
		Thread.sleep(3000);
		rv14.SelectProductSeason(1);
		Thread.sleep(3000);
		rv14.clickoncopy();*/
	FileMenu_ChangeMilestone rv6 = new FileMenu_ChangeMilestone(driver);
		// click on change milestone
			rv6.clickonchangemilestone();
			//select milestone
			rv6.SelectMilestone(4);
			//keep copy of current assortment
			//rv6.keepcopy();
			//click on apply
			rv6.clickonApplyimage("../TommyHilfiger/SikuliImages/Applynew.PNG");
			FileMenu_SearchHistory rv7= new FileMenu_SearchHistory(driver);
			//click on search history
			rv7.clickonSearchHistory();
			//total searches
			Thread.sleep(3000);
			rv7.totalproductsSearched();
			Thread.sleep(3000);
			//click on cancel button
			rv7.Clikoncancelicon("../Tommy/SikuliImages/ClickonCancelicon.PNG");
			
			FileMenu_MergeAssortment rv8 =new FileMenu_MergeAssortment(driver);
			rv8.clickonmergeassortment();
			//click on my assortment
			Thread.sleep(2000);
			rv8.clickonmyassortment();
			//click on global assortment
			Thread.sleep(2000);
			rv8.clickonglobalassortment();
			//click on firstgloablasoortment
			Thread.sleep(2000);
			rv8.clickonmyfirstglobalassortment();
			Thread.sleep(5000);
			//select whiteboard
			rv8.SelectAll();
			//click on merge
			 rv8.Merge();
			 Thread.sleep(2000);
			//click on save
			rv4.clickonsave();
			Thread.sleep(3000);
			FileMenu_SharewithTeam rv9=new FileMenu_SharewithTeam(driver);
			rv9.clickonsharewithteam();
			//select the group
			rv9.selectgroup(1);
			//click on cancel
			rv9.clickoncancel();
			Thread.sleep(4000);
			FileMenu_Share rv10 =new FileMenu_Share(driver);
			//click on share by Email
			rv10.clickonshareonemail();
			//select groupname
			rv10.SelectGroupname(1);
			//select emailid
			rv10.SelectEmailID(0);
			//enter email id
			rv10.EntermailID("anoopsingh@visulon.com");
			//click on send email
			rv10.SendEmail();
			Thread.sleep(3000);
			rv10.ClikonOkButton();
			Thread.sleep(3000);
			FileMenu_Lock_unlock rv11= new FileMenu_Lock_unlock(driver);
			//clik on lock
			rv11.clickonlock();
			Thread.sleep(3000);
			//click on unlock
			rv11.clickonunlock();
			Thread.sleep(3000);
			FileMenu_Shortcutkeys rv12= new FileMenu_Shortcutkeys(driver);
			//clck on shortcut keys
			rv12.clickonshortcut();
			Thread.sleep(3000);
			rv7.Clikoncancelicon("../Tommy/SikuliImages/ClickonCancelicon.PNG");
			Thread.sleep(3000);
			Insertmenu_AddPage rv13 = new Insertmenu_AddPage(driver);
			rv13.clickoninsert();
			rv13.ClickOnAddPage();
			rv13.ClickOnAddCover();
			rv13.Available_cover();
			Thread.sleep(3000);
			rv6.clickonApplyimage("../Tommy/SikuliImages/Applyicon.PNG");
			Thread.sleep(5000);
			// click on add whiteBoard
			InsertMenu_AddWhiteBoard rv23 = new InsertMenu_AddWhiteBoard(driver);
			rv23.ClickOnAddWhiteBoard();
			rv23.ClickOnWhiteBoard1();
			rv23.ClickOnPrevPage();
			rv23.ClickOnPrevPage();
			// click on formatted note
			Thread.sleep(3000);
			InsertMenu_FormattedNote rv15 = new InsertMenu_FormattedNote(driver);
			rv15.ClickOnFormattedNote();
			rv15.FormattedNotePopup("Hello", "../Tommy/SikuliImages/Screenshot.png");
			// click on Add picture
			Thread.sleep(3000);
			InsertMenu_Pictures rv16 = new InsertMenu_Pictures(driver);
			rv16.ClickOnPictures();
			rv16.clickonchoosefile();
			rv16.EnterFilepath("../Tommy/SikuliImages/ChooseFilename.PNG",
					"C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
			rv16.clickonopenimage("../Tommy/SikuliImages/clickonopen.PNG");
			rv16.clickonAddButton();
			Thread.sleep(3000);
			//clik on whiteBoardColor
			
			InsertMenu_WhiteBoardColor rv17 = new InsertMenu_WhiteBoardColor(driver);
			rv17.clikonWhiteBoardColor();
			Thread.sleep(3000);
			rv17.ClikonOkButton();
			Thread.sleep(3000);
			// click on Logo
			InsertMenu_Logo rv18 = new InsertMenu_Logo(driver);

			rv18.ClickOnLogo();
			rv18.selectLogo("../Tommy/SikuliImages/Tommy_logo.PNG");
			// click on Fixture Library
			Thread.sleep(3000);
			InsertMenu_Fixtures rv19 = new InsertMenu_Fixtures(driver);
			rv19.ClickOnFixtureLibrary();
			Thread.sleep(3000);
			rv19.SelectfixtureImages1();
			Thread.sleep(3000);
			rv19.SelectfixtureImages2();
			Thread.sleep(3000);
			rv19.CloseFixtureImagesPopup();
			rv23.ClickOnForwardPage();
			Thread.sleep(4000);
			//fill colors in product
			/*InsertMenu_FillColors rv20 = new InsertMenu_FillColors(driver);
			
			rv20.ClickOnFillProductColor();
			Thread.sleep(2000);
			rv20.chooseColor();
			Thread.sleep(4000);
			rv20.FillColorInProduct();
			Thread.sleep(3000);*/
			//click on Background Images
			InsertMenu_BackGroundTheme rv21= new InsertMenu_BackGroundTheme(driver);
			//rv21.ClickOnForwardPage();
			//Thread.sleep(3000);
			rv21.ClickOnThemes();
			rv21.ClickOnAllPages();
			rv21.ClickOnWhiteColorThemes();
			Thread.sleep(3000);
			rv21.ClickOnCustomThemes();
			Thread.sleep(3000);
			rv21.ClickOnGreyColorThemes();
			Thread.sleep(5000);
	        rv21.ClickonApply();
					
	        Thread.sleep(3000);
			// Alternate Images

			InsertMenu_AlternateImage rv22 = new InsertMenu_AlternateImage(driver);
			rv22.ClickOnAlternateImages();
			Thread.sleep(3000);
			rv22.ClickOnAlternateImagesBackImages();
			Thread.sleep(3000);
			rv22.ClickOnInsertForCurrentWhiteboard();
			Thread.sleep(3000);
			rv22.ClickOnApplyButton();
			Thread.sleep(5000);
			
			Arrange_SelectAll rv24 =new Arrange_SelectAll(driver);
			//click on arrange
			rv24.ClickonArrange();
			// Select All
			rv24.SelectAll();
			Thread.sleep(3000);
			//click on whiteboard
			rv24.ClickonWhiteBoard();
			Thread.sleep(3000);
			//select multiple
			rv24.SelectMultiple();
			//select first image
			rv24.SelectFirstImage();
			Thread.sleep(3000);
			
			Arrange_Align	rv25= new Arrange_Align(driver);
			Thread.sleep(3000);
			// Align Bottom
			rv25.MoveToBottom();
			Thread.sleep(3000);
			//align to center
			rv25.MoveToCenter();
			Thread.sleep(3000);
			//Align on left
			rv25.MovetoLeft();
			Thread.sleep(3000);
			//Align on Middle
			rv25.MoveToMiddle();
			Thread.sleep(3000);
			//align to right
			rv25.MoveToRight();
			Thread.sleep(3000);
			//align to top
			rv25.MoveToTop();
			Thread.sleep(3000);
			//click on align
			rv25.ClickonAlign();
			Thread.sleep(3000);		
			Arrange_Grid_Ruler	rv26=new Arrange_Grid_Ruler(driver);
			// clic on gridline
			rv26.Clickongridline();
			Thread.sleep(3000);
			rv26.Clickongridline();
			Thread.sleep(3000);
			//click on Ruler
			rv26.ClickonRuler();
			Thread.sleep(3000);
			rv26.ClickonRuler();
			Thread.sleep(3000);
			Arrange_Header_Footer	rv27=new Arrange_Header_Footer(driver);
			// click on header and footer
			rv27.clickonHeaderandFooter();
			Thread.sleep(3000);
			//select preset theme
			rv27.presetThemes3();
			//click on apply
			rv27.ClickOnApply();
			Thread.sleep(3000);	
			//click on toolsMenu
			ToolsMenu_clickonTools rv28 =new ToolsMenu_clickonTools(driver) ;
		    rv28.ClickOnTool();
		    
		    //Click On Marquee
		    ToolsMenu_Marquee rv29 = new ToolsMenu_Marquee(driver);
		    rv29.ClickOnMarquee();
		    
		    //Click on copy, delete, clear
		    ToolsMenu_Clear_Delete_Copy rv30 = new ToolsMenu_Clear_Delete_Copy(driver);
		    Thread.sleep(3000);
		    rv30.ClickOnClear("../Tommy/SikuliImages/ok.PNG");
		    Thread.sleep(3000);
		    
		    rv30.ClickOnDelete("../Tommy/SikuliImages/ok.PNG");
		    Thread.sleep(3000);
		   // rv30.ClickOnCopy ("../Tommy/SikuliImages/ok.PNG");
		   // Thread.sleep(5000);
		    
		    //Click on SnapToGrid
		    ToolsMenu_Snap_to_Grid rv31= new ToolsMenu_Snap_to_Grid(driver);
		    rv31.ClickOnSnapToGrid();
		    Thread.sleep(3000);
		    
		    //CLick on AddToCustomer
		    
		    ToolsMenu_Add_Customer rv32 = new ToolsMenu_Add_Customer(driver);
		    rv32.ClickOnCustomer();
		    Thread.sleep(3000);
		    rv32.SelectAllProduct();
		    Thread.sleep(3000);
		    rv32.SelectCustomer(0);
		    Thread.sleep(3000);
		    rv32.addButton();
		    Thread.sleep(3000);
		    rv32.closeButton();
		    Thread.sleep(3000);
		    
		    //CLick on customerAssortment
		    ToolsMenu_Customer_Assortment rv33 = new ToolsMenu_Customer_Assortment(driver);
		    rv33.ClickOnCustomerAssortment();
		    rv32.closeButton();
		    Thread.sleep(3000);
		   	    
		    //Click on Assortment Filter
		    ToolsMenu_AssortmentFilter rv34= new ToolsMenu_AssortmentFilter(driver);
		    rv34.ClickOnAssortmentFilter();
		    rv34.withimages();
		    rv34.TTLCAUnits();
		    rv34.TTLUSUnits();
		    rv34.wicking();
		    rv34.primaloft();
		    rv34.apply();
		    Thread.sleep(3000);
		    rv34.editFilter();
		    Thread.sleep(3000);
		    rv34.withimages();
		    rv34.apply();
		    Thread.sleep(3000);
		    rv34.groupAndSort();
		    rv34.groupBy(0);
		    rv34.firstSortBy(0);
		    rv34.SecondSortBy(0);
		    rv34.ThirdSortBy(0);
		    rv34.ForthSortBy(0);
		    rv34.Group_sortapplyButton();
		    Thread.sleep(3000);
		    rv34.ListView();
		    Thread.sleep(3000);
		    rv34.Top10View();
		    rv34.Top10(0);
		    rv34.style(0);
		    rv34.retail(0);
		    Thread.sleep(3000);
		    rv34.Top10ExportToExcel();
		    Thread.sleep(3000);
		    rv34.Top10Closebutton();
		    Thread.sleep(3000);
		    rv34.createAsssortment();
		    rv34.SaveAssortmentName();
		    rv34.SaveAssortmentSaveButton();
		    rv34.NoProductSerachOkButton();
		    rv34.SaveAssortmentCloseButton();
		    Thread.sleep(3000);
		    rv34.productCollectionCloseButton();
			Thread.sleep(4000);
			Export_Menu rv35 = new Export_Menu(driver);
			rv35.exportMenu();
			Thread.sleep(3000);
			//click on pdf
			rv35.exportPDF();
			Thread.sleep(7000);
			//click on ppt
			rv35.exportPPT();
			Thread.sleep(7000);
			//click on excel
			rv35.exportExcel();
			Thread.sleep(5000);
			//include images
			rv35.DesignExcelReport_IncludeProductsImages();
			Thread.sleep(7000);
			//click on export images
			rv35.exportImages();
			Thread.sleep(5000);
			//click on ful assortment 
			rv35.exportImages_fromFullAssortment();
			Thread.sleep(5000);
			
			Assortment_ViewMenu rv36=new Assortment_ViewMenu(driver);
		     rv36.View();
		     Thread.sleep(5000);
		     
		     Assortment_View_FlipPreview rv37= new Assortment_View_FlipPreview(driver);
		     Thread.sleep(3000);
		     rv37.FlipPreview();
		     Thread.sleep(3000);
		     rv37.shareIcon(1,"anoopsingh@visulon.com","../Tommy/SikuliImages/ok.PNG");
		     Thread.sleep(3000);
		     rv37.ExportToPDF();
		     Thread.sleep(3000);
		     rv37.ThumbnailView();
		     Thread.sleep(3000);
		     rv37.ThumbnailView_PresentationView();
		     Thread.sleep(3000);
		     rv37.ThumbnailView_FlipPreview();
		     Thread.sleep(5000);
		     
		     rv37.catalouge_RightButton();
		     Thread.sleep(3000);
		     rv37.catalouge_LeftButton();
		     Thread.sleep(3000);
		     rv37.Flip_preview_Back_button();
		     
		     Thread.sleep(5000);
		     //click on Slider Preview
		     Assortment_View_SliderPreview rv38 = new Assortment_View_SliderPreview(driver);
		     
			    rv38.SliderPreview();
			    Thread.sleep(3000);
			    rv38.SliderPreview_PresentationView();
			    Thread.sleep(3000);
			    rv38.SliderPreview_Back_button();
			    
			    Thread.sleep(5000);
			
			
		     Assortment_View_ThumbnailView rv39= new Assortment_View_ThumbnailView(driver);
		     rv39.ThumnailView();
			 Thread.sleep(3000);
			 rv39.apply_button();
			 Thread.sleep(3000);
			 rv39.applyOk_button("../Tommy/SikuliImages/ok.PNG");
			    
			   Thread.sleep(5000);
		     
			   Assortment_View_ProductCollection rv40= new Assortment_View_ProductCollection(driver);
			     
			   rv40.productCollection();
			   //click on Edit Filter
			   rv40.EditFilter();
			   //clik on images
			   rv40.withimages();
			   //clik on without images
			   rv40.withoutimages();
			   //click on apply
		       rv40.apply();
		      Thread.sleep(3000);
		      //clik on group and sort
		       rv40.groupAndSort();
		       //clik on groupBy
		       rv40.groupBy(0);
		       // click on sortby
		       rv40.firstSortBy(0);
		       //clik on Second sortby
		       rv40.SecondSortBy(0);
		     //clik on third sortby	
		       rv40.ThirdSortBy(0);
		     //clik on Fourth sortby
		       rv40.ForthSortBy(0);
		     //clik on apply button
		       rv40.Group_sortapplyButton();
		       Thread.sleep(3000);
		       //clik on list view
		       rv40.ListView();
		       Thread.sleep(3000);
		       //clik on top 10 view
		       rv40.Top10View();
		       Thread.sleep(3000);
		       //clik on top 10
		       rv40.Top10(1);
		       Thread.sleep(3000);
		       //clik on style
		       rv40.style(1);
		       Thread.sleep(3000);
		       rv40.retail(1);
		       Thread.sleep(3000);
		       //clik on export excel
		       rv40.Top10ExportToExcel();
		       Thread.sleep(3000);
		       //click on close button
		       rv40.Top10Closebutton();
		       Thread.sleep(3000);
		       //clik on create Assortment 
		       rv40.createAsssortment();
		       //provide  assortment name
		       rv40.SaveAssortmentName();
		       //clik on save button
		       rv40.SaveAssortmentSaveButton();
		       //clik on previous button
		       Thread.sleep(10000);
		       rv40.prev_Assortment();
		       Thread.sleep(5000);
		       
		     /*  Assortment_View_Rollover rv41 =new Assortment_View_Rollover(driver);
			     rv41.RolloverZoom();
			     //move on image
			     
			    rv41.rollover_Image("../Tommy/SikuliImages/rollover.PNG");
			     
			     Thread.sleep(3000);*/
					//click  on Attribute
					Assortment_AttributeMenu rv42= new Assortment_AttributeMenu(driver);
					rv42.Attribute();
					//click on mnagae Attributes
				
					Thread.sleep(5000);
					Assortment_Attribute_ManageAttributes rv43= new Assortment_Attribute_ManageAttributes(driver);
				    Thread.sleep(3000);
				    rv43.manageAttribute();
				    Thread.sleep(3000);
				    rv43.select_Attributes(1);
				    Thread.sleep(3000);
				    rv43.add_Attribute();
				    Thread.sleep(3000);
				    rv43.apply_Changes();
				    Thread.sleep(3000);
				    rv43.assortment();
				    
				    Thread.sleep(5000);
				    rv23.ClickOnForwardPage();
				  //click on formatted Attributes
				  		Assortment_Attributes_Formatted rv44 = new Assortment_Attributes_Formatted(driver);

				  	     rv44.Format_AttributeBox();
				  	     // Box theme
				  	     Thread.sleep(5000);
				  	     rv44.Select_Box_Theme();
				  	     Thread.sleep(3000);
				  	     //text/font
				  	     rv44.Text_font();
				  	     Thread.sleep(3000);
				  	     rv44.Text_font_fontColor("../Tommy/SikuliImages/Font_color.PNG");
				  	     
				  	     rv44.Text_font_fontColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Text_font_FontFamily(6);
				  	     rv44.Text_font_FontSize(4);
				  	     rv44.Text_font_FontSize_Bold();
				  	     rv44.Text_font_FontSize_Italic();
				  	     rv44.Text_font_FontSize_Underline();
				  	     rv44.Text_font_TextAlign_Left();
				  	     rv44.Text_font_TextAlign_Center();
				  	     rv44.Text_font_TextAlign_Right();
				  	     rv44.Text_font_ChangeCase(1);
				  	     rv44.Text_font_Remove_LineSpacing();
				  	     
				  	     Thread.sleep(3000);
				  	     // Box Border
				  	     
				  	     rv44.Box_Border();
				  	     Thread.sleep(5000);
				  	     rv44.Box_Border_BorderColor("../Tommy/SikuliImages/Font_color.PNG");
				  	     rv44.Box_Border_BorderColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Border_BorderWidth(3);
				  	     rv44.Box_Border_BorderType(3);
				  	     rv44.Box_Border_BorderRadius(3);
				  	     
				  	     // Box Shadow
				  	     Thread.sleep(3000);
				  	     rv44.Box_Shadow();
				  	     Thread.sleep(5000);
				  	     rv44.Box_Shadow_ShadowColor("../Tommy/SikuliImages/Font_color.PNG");
				  	     rv44.Box_Shadow_BorderColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Shadow_HorizontalShadow("4");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Shadow_VerticalShadow("4");
				  	 
				  	  //   rv44.Box_Shadow_ShadowBlur("5");
				  	     
				  	     // Box Background
				  	     Thread.sleep(3000);
				  	     rv44.Box_Background();
				  	     rv44.Box_Background_Background_SolidFill();
				  	     Thread.sleep(5000);
				  	     rv44.Box_Background_color("../Tommy/SikuliImages/Background_color.PNG");
				  	     rv44.Box_Background_Color_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Background_Transparecy("0.8");
				  	     
				  	     // Box Title
				  	     Thread.sleep(3000);
				  	     rv44.Box_Title();
				  	     Thread.sleep(5000);
				  	     rv44.Box_Title_BackColor("../Tommy/SikuliImages/BackTitle_Color.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Title_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(5000);
				  	     rv44.Box_Title_FontColor("../Tommy/SikuliImages/BackTitle_Font_color.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Title_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Box_Title_FontFamily(6);
				  	     rv44.Box_Title_FontSize(4);
				  	     rv44.Box_Title_FontSize_Bold();
				  	     rv44.Box_Title_FontSize_Italic();
				  	     rv44.Box_Title_FontSize_UnderLine();
				  	     rv44.Box_Title_TextAlign_Left();
				  	     rv44.Box_Title_TextAlign_Center();
				  	     rv44.Box_Title_TextAlign_Right();
				  	     rv44.Box_Title_ChangeCase(1);
				  	     rv44.Box_Title_borderBottom();
				  	     
				  	     //Rows(odd)
				  	     Thread.sleep(3000);
				  	     rv44.Rows_odd();
				  	     Thread.sleep(5000);
				  	     rv44.Rows_odd_BackColor("../Tommy/SikuliImages/Row(odd)BackColor.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Rows_odd_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Rows_odd_FontColor("../Tommy/SikuliImages/Row(odd)FontColor.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Rows_odd_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
				  	     Thread.sleep(3000);
				  	     rv44.Rows_odd_FontFamily(6);
				  	     rv44.Rows_odd_FontSize(4);
				  	     rv44.Rows_odd_FontSize_Bold();
				  	     rv44.Rows_odd_FontSize_Italic();
				  	     rv44.Rows_odd_FontSize_UnderLine();
				  	     rv44.Rows_odd_TextAlign_Left();
				  	     rv44.Rows_odd_TextAlign_Center();
				  	     rv44.Rows_odd_TextAlign_Right();
				  	     rv44.Rows_odd_ChangeCase(1);
				  	     rv44.Rows_odd_borderBottom();
				  	     
				  	     
				  	     //Rows(even)
				  	     Thread.sleep(3000);
				  	     rv44.Rows_even();
				  	  
				  	     Thread.sleep(3000);
				  	     rv44.Rows_even_FontFamily(6);
				  	     rv44.Rows_even_FontSize(4);
				  	     rv44.Rows_even_FontSize_Bold();
				  	     rv44.Rows_even_FontSize_Italic();
				  	     rv44.Rows_even_FontSize_UnderLine();
				  	     rv44.Rows_even_TextAlign_Left();
				  	     rv44.Rows_even_TextAlign_Center();
				  	     rv44.Rows_even_TextAlign_Right();
				  	     rv44.Rows_even_ChangeCase(1);
				  	     rv44.Rows_even_borderBottom();
				  	     Thread.sleep(3000);
				  	     
				  	     
				  	     rv44.apply_Changes();
				  	     
				  	     Thread.sleep(5000);
					
				  	   Assortment_Attributes_UserDefined rv45 =new Assortment_Attributes_UserDefined(driver);
				  	    rv45.User_defined_Attributes();
				  	    Thread.sleep(3000);
				  	    rv45.applyOn_AllProducts();
				  	    Thread.sleep(3000);
				  	    rv45.BigIdea();
				  	    Thread.sleep(3000);
				  	    
				  	    rv45.EarlyBuy();
				  	    Thread.sleep(3000);
				  	    rv45.KeyLooks();
				  	    Thread.sleep(3000);
				  	    rv45.Marketing();
				  	    Thread.sleep(3000);
				  	    rv45.ChangeRequest();
				  	    Thread.sleep(3000);
				  	    rv45.LateAdds();
				  	    //Thread.sleep(3000);
				  	    //rv45.Proto();
				  	    
				  	    
				  	    Thread.sleep(5000);
				  	    
				  	//click on hang tag
						Assortment_Attribute_AddHangTag rv46= new Assortment_Attribute_AddHangTag(driver);
						
						rv46.Add_Hang_Tag();
					     Thread.sleep(3000);
					     rv46.Add_Hang_Tag_AllProducts();
					     Thread.sleep(3000);
					     rv46.Add_Hang_Tag_PrimeLOft();
					     Thread.sleep(3000);
					     rv46.Add_Hang_Tag_sustainable();
					     Thread.sleep(3000);
					     rv46.Add_Hang_Tag_save();
					     
					     Thread.sleep(5000);
						
						
					     Assortment_Attribute_AttributeView rv47= new Assortment_Attribute_AttributeView(driver);
					 	
					 	rv47.AttributeViews();
					     rv47.AttributeViews_Template();
					     Thread.sleep(3000);
					     rv47.AttributeViews_applyChanges();
					     Thread.sleep(3000);
					     rv47.ApplyChanges_Assortment();
					     
					     Thread.sleep(5000);
					
					   //click on edit buy grid
					 	Assortment_Attribute_EditBuyGrid rv48 = new Assortment_Attribute_EditBuyGrid(driver);
					 	rv48.EditBuyGrid();
					     Thread.sleep(3000);
					     rv48.EditBuyGrid_BuyInfo_CA();
					    // rv55.EditBuyGrid_BuyInfo_US();
					     Thread.sleep(3000);
					     rv48.EditBuyGrid_Status();
					     Thread.sleep(3000);
					     rv48.EditBuyGrid_Units();
					     Thread.sleep(3000);
					     rv48.EditBuyGrid_ApplyButton();
					     Thread.sleep(3000);
					     rv48.QtyBuyTable();
					     Thread.sleep(3000);
					     Thread.sleep(3000);
							//clik on placeholder
							PlaceHolder_ClickonPlaceholder rv49= new PlaceHolder_ClickonPlaceholder(driver);
							rv49.clickonPlaceHolder();
							//Clickon Add paceholder
							Thread.sleep(3000);
							PlaceHolder_AddPlaceholder rv50= new PlaceHolder_AddPlaceholder(driver);
							//click on add placeholder
							rv50.clickonAddPlaceHolder();
							//select businees working group
							Thread.sleep(3000);
							//rv7.SelectBusinessGroup(3);
							//select gender
							//Thread.sleep(3000);
							//rv7.SelectGender(1);
							//select Department
							//Thread.sleep(3000);
							//rv7.SelectDepartment(1);
							//Enter Company name
							//Thread.sleep(3000);
							//rv7.EnterComapnyName("Tommy");
							//clic on choose image
							//Thread.sleep(3000);
							rv50.clickonChooseImage();
							// Enter FileName
							Thread.sleep(3000);
							rv50.ProductImage("../Tommy/SikuliImages/Choose_FileName.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
							//click on Open Button
							rv50.ClickonOKButton("../Tommy/SikuliImages/Open.PNG");
							//click on Save Button
							Thread.sleep(3000);
							rv50.clickonSave();
							Thread.sleep(3000);
							
							PlaceHolder_AddQuick_PlaceHolder rv51 = new PlaceHolder_AddQuick_PlaceHolder(driver);
							//Click on quickplaceholder
							rv51.clickonQuickPlaceholder();
							PlaceHolder_MultiplePlaceHolder rv52= new PlaceHolder_MultiplePlaceHolder(driver);
							//click on multiple placeholder
							rv52.clickonMultiplePlaceHolder();
							//click on add file
							Thread.sleep(2000);
							rv52.clikonAddFile("../Tommy/SikuliImages/AddFiles.PNG");
							//address of first image
							Thread.sleep(2000);
							rv52.Addressoffile("../Tommy/SikuliImages/Choose_FileName.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\ddc5748dbf6ff10b09880ee86eebe50e.jpg");
							//click on open
							Thread.sleep(2000);
							rv52.clickonOpen("../Tommy/SikuliImages/Open.PNG");
							//click on second image
							Thread.sleep(2000);
							rv52.clikonAddFile("../Tommy/SikuliImages/ADDSecondfile.PNG");
							//address of second image
							Thread.sleep(2000);
							rv52.Addressoffile("../Tommy/SikuliImages/Choose_FileName.PNG", "C:\\Users\\rsoni\\OneDrive\\Pictures\\original.jpg");
							//click on open
							Thread.sleep(2000);
							rv52.clickonOpen("../Tommy/SikuliImages/Open.PNG");
							//start upload
							Thread.sleep(2000);
							rv52.ClickStartUpload("../Tommy/SikuliImages/StartUpload.PNG");
							Thread.sleep(5000);
							//click on continue
							rv3.Clickoncontinue();
							Thread.sleep(5000);
							//Click on show PlaceHolder Name
							rv52.ClickonShowplaceholderName();
							Thread.sleep(5000);
							//Click on DataActions
							Data_Actions_Menu rv53= new Data_Actions_Menu(driver);
							rv53.clickonData_Actions();
							//click on recap view
							Data_Actions_RecapView rv54 = new Data_Actions_RecapView(driver);
							rv54.clickonRecapView();
							//click on RecapBy 
							Thread.sleep(2000);
							rv54.SelectRecapBy(2);
							//click on recap by Retail/wholesale category
							Thread.sleep(2000);
							rv54.SelectRecapBy1(1);
							//clic on target
							Thread.sleep(2000);
							rv54.clickonShowTarget();
							Thread.sleep(2000);
							//click on export excel
							rv54.ClickonExportExcel();
							Thread.sleep(5000);
							//rv9.click on cancel
							rv54.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
							Thread.sleep(5000);
							driver.switchTo().defaultContent();
							//click on top10style
							Data_Action_Top10Style rv55= new Data_Action_Top10Style(driver);
							// Click on top 10 SKU/Style
							rv55.ClickonTop10Style();
							Thread.sleep(2000);
							//Select Style top10-20-50
							rv55.SelectTopStyle(2);
							Thread.sleep(2000);
							//Select style
							rv55.SelectStyle();
							Thread.sleep(2000);
							//Select department 
							rv55.SelectDepartment(1);
							Thread.sleep(2000);
							//click on export Excel
							rv55.ExporttoExcel();
							Thread.sleep(5000);
							//click on cancel
							rv54.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
							Thread.sleep(5000);
							
							//click on Revisiosn History
							
							Data_Action_RevisionHistory rv56= new Data_Action_RevisionHistory(driver);
							rv56.clickonRevisionHistory();
							//click on export excel
							rv56.ExportToExcel();
							//click on cancel
							rv54.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
							
							//click on custom Template Library
							Data_Actions_CustomTemplateLibrary rv57 = new Data_Actions_CustomTemplateLibrary(driver);
							
							rv57.ClickonCustomeTemplateLibrary();
							// click on current page
							//rv12.ClickonCurrentPage();
							//click on all pages
							Thread.sleep(2000);
							rv57.ClickonAllPages();
							//select Template category
							rv57.SelectTemplatesCategory(0);
							Thread.sleep(2000);
							//select templates 
							rv57.SelectTmplate5();
							Thread.sleep(2000);
							//click on Apply
							rv57.clikonApply();
									
						
							//click on Product Statistics
							Data_Actions_ProductStats rv58=new Data_Actions_ProductStats(driver);
								rv58.ClickonProductStats();
								Thread.sleep(5000);
							//click on current Page products
							rv58.clickoncurrentPageProducts();
							Thread.sleep(5000);
							//click on Assortment products
							rv58.clickonAssprtmentProducts();
									//click on cancel
							Thread.sleep(5000);
							rv54.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
							//clik on Product Anaylytics
							
							Data_Actions_ProductAnalytics rv59= new Data_Actions_ProductAnalytics(driver);
							rv59.ClickonProductAnalytics();
							
							//click on TableFormat
							Thread.sleep(3000);
							rv59.ClickonTable();
							// click on BarChart Link
							Thread.sleep(5000);
							rv59.ClickonBarchart1Link();
							//click on PieChart Link
							Thread.sleep(5000);
							rv59.ClickonPiechart1Link();
							Thread.sleep(5000);
							rv54.ClickonCancel("../Tommy/SikuliImages/ClickonCancelicon.PNG");
							Thread.sleep(3000);
							
							rv4.clickonfileMenu();
							FileMenu_Exit rv60 =new FileMenu_Exit(driver);
							rv60.clickonExit();
							rv60.clikonSave();
							
							
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}		
}
