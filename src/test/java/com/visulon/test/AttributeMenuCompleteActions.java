package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.Attributes.Assortment_AttributeMenu;
import com.visulon.pom.Attributes.Assortment_Attribute_AddHangTag;
import com.visulon.pom.Attributes.Assortment_Attribute_AttributeView;
import com.visulon.pom.Attributes.Assortment_Attribute_EditBuyGrid;
import com.visulon.pom.Attributes.Assortment_Attribute_ManageAttributes;
import com.visulon.pom.Attributes.Assortment_Attributes_Formatted;
import com.visulon.pom.Attributes.Assortment_Attributes_UserDefined;

public class AttributeMenuCompleteActions extends BaseTest
{

	@Test
	public void attributeMenuCompleteActions() throws InterruptedException, SikuliException
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
		//click  on Attribute
		Assortment_AttributeMenu rv5= new Assortment_AttributeMenu(driver);
		rv5.Attribute();
		//click on mnagae Attributes
	
		Thread.sleep(5000);
		Assortment_Attribute_ManageAttributes rv7= new Assortment_Attribute_ManageAttributes(driver);
	    Thread.sleep(3000);
	    rv7.manageAttribute();
	    Thread.sleep(3000);
	    rv7.select_Attributes(1);
	    Thread.sleep(3000);
	    rv7.add_Attribute();
	    Thread.sleep(3000);
	    rv7.apply_Changes();
	    Thread.sleep(3000);
	    rv7.assortment();
	    
	    Thread.sleep(5000);
	  //click on formatted Attributes
	  		Assortment_Attributes_Formatted rv6 = new Assortment_Attributes_Formatted(driver);

	  	     rv6.Format_AttributeBox();
	  	     // Box theme
	  	     Thread.sleep(5000);
	  	     rv6.Select_Box_Theme();
	  	     Thread.sleep(3000);
	  	     //text/font
	  	     rv6.Text_font();
	  	     Thread.sleep(3000);
	  	     rv6.Text_font_fontColor("../Tommy/SikuliImages/Font_color.PNG");
	  	     
	  	     rv6.Text_font_fontColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Text_font_FontFamily(6);
	  	     rv6.Text_font_FontSize(4);
	  	     rv6.Text_font_FontSize_Bold();
	  	     rv6.Text_font_FontSize_Italic();
	  	     rv6.Text_font_FontSize_Underline();
	  	     rv6.Text_font_TextAlign_Left();
	  	     rv6.Text_font_TextAlign_Center();
	  	     rv6.Text_font_TextAlign_Right();
	  	     rv6.Text_font_ChangeCase(1);
	  	     rv6.Text_font_Remove_LineSpacing();
	  	     
	  	     Thread.sleep(3000);
	  	     // Box Border
	  	     
	  	     rv6.Box_Border();
	  	     Thread.sleep(5000);
	  	     rv6.Box_Border_BorderColor("../Tommy/SikuliImages/Font_color.PNG");
	  	     rv6.Box_Border_BorderColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Border_BorderWidth(3);
	  	     rv6.Box_Border_BorderType(3);
	  	     rv6.Box_Border_BorderRadius(3);
	  	     
	  	     // Box Shadow
	  	     Thread.sleep(3000);
	  	     rv6.Box_Shadow();
	  	     Thread.sleep(5000);
	  	     rv6.Box_Shadow_ShadowColor("../Tommy/SikuliImages/Font_color.PNG");
	  	     rv6.Box_Shadow_BorderColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Shadow_HorizontalShadow("4");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Shadow_VerticalShadow("4");
	  	 
	  	  //   rv6.Box_Shadow_ShadowBlur("5");
	  	     
	  	     // Box Background
	  	     Thread.sleep(3000);
	  	     rv6.Box_Background();
	  	     rv6.Box_Background_Background_SolidFill();
	  	     Thread.sleep(5000);
	  	     rv6.Box_Background_color("../Tommy/SikuliImages/Background_color.PNG");
	  	     rv6.Box_Background_Color_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Background_Transparecy("0.8");
	  	     
	  	     // Box Title
	  	     Thread.sleep(3000);
	  	     rv6.Box_Title();
	  	     Thread.sleep(5000);
	  	     rv6.Box_Title_BackColor("../Tommy/SikuliImages/BackTitle_Color.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Title_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(5000);
	  	     rv6.Box_Title_FontColor("../Tommy/SikuliImages/BackTitle_Font_color.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Title_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Box_Title_FontFamily(6);
	  	     rv6.Box_Title_FontSize(4);
	  	     rv6.Box_Title_FontSize_Bold();
	  	     rv6.Box_Title_FontSize_Italic();
	  	     rv6.Box_Title_FontSize_UnderLine();
	  	     rv6.Box_Title_TextAlign_Left();
	  	     rv6.Box_Title_TextAlign_Center();
	  	     rv6.Box_Title_TextAlign_Right();
	  	     rv6.Box_Title_ChangeCase(1);
	  	     rv6.Box_Title_borderBottom();
	  	     
	  	     //Rows(odd)
	  	     Thread.sleep(3000);
	  	     rv6.Rows_odd();
	  	     Thread.sleep(5000);
	  	     rv6.Rows_odd_BackColor("../Tommy/SikuliImages/Row(odd)BackColor.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Rows_odd_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Rows_odd_FontColor("../Tommy/SikuliImages/Row(odd)FontColor.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Rows_odd_BckColor_Ok_Button("../Tommy/SikuliImages/FontColor_Ok.PNG");
	  	     Thread.sleep(3000);
	  	     rv6.Rows_odd_FontFamily(6);
	  	     rv6.Rows_odd_FontSize(4);
	  	     rv6.Rows_odd_FontSize_Bold();
	  	     rv6.Rows_odd_FontSize_Italic();
	  	     rv6.Rows_odd_FontSize_UnderLine();
	  	     rv6.Rows_odd_TextAlign_Left();
	  	     rv6.Rows_odd_TextAlign_Center();
	  	     rv6.Rows_odd_TextAlign_Right();
	  	     rv6.Rows_odd_ChangeCase(1);
	  	     rv6.Rows_odd_borderBottom();
	  	     
	  	     
	  	     //Rows(even)
	  	     Thread.sleep(3000);
	  	     rv6.Rows_even();
	  	  
	  	     Thread.sleep(3000);
	  	     rv6.Rows_even_FontFamily(6);
	  	     rv6.Rows_even_FontSize(4);
	  	     rv6.Rows_even_FontSize_Bold();
	  	     rv6.Rows_even_FontSize_Italic();
	  	     rv6.Rows_even_FontSize_UnderLine();
	  	     rv6.Rows_even_TextAlign_Left();
	  	     rv6.Rows_even_TextAlign_Center();
	  	     rv6.Rows_even_TextAlign_Right();
	  	     rv6.Rows_even_ChangeCase(1);
	  	     rv6.Rows_even_borderBottom();
	  	     Thread.sleep(3000);
	  	     
	  	     
	  	     rv6.apply_Changes();
	  	     
	  	     Thread.sleep(5000);
		
	  	   Assortment_Attributes_UserDefined rv8 =new Assortment_Attributes_UserDefined(driver);
	  	    rv8.User_defined_Attributes();
	  	    Thread.sleep(3000);
	  	    rv8.applyOn_AllProducts();
	  	    Thread.sleep(3000);
	  	    rv8.BigIdea();
	  	    Thread.sleep(3000);
	  	    
	  	    rv8.EarlyBuy();
	  	    Thread.sleep(3000);
	  	    rv8.KeyLooks();
	  	    Thread.sleep(3000);
	  	    rv8.Marketing();
	  	    Thread.sleep(3000);
	  	    rv8.ChangeRequest();
	  	    Thread.sleep(3000);
	  	    rv8.LateAdds();
	  	    Thread.sleep(3000);
	  	    rv8.Proto();
	  	    
	  	    
	  	    Thread.sleep(5000);
	  	    
	  	//click on hang tag
			Assortment_Attribute_AddHangTag rv9= new Assortment_Attribute_AddHangTag(driver);
			
			rv9.Add_Hang_Tag();
		     Thread.sleep(3000);
		     rv9.Add_Hang_Tag_AllProducts();
		     Thread.sleep(3000);
		     rv9.Add_Hang_Tag_PrimeLOft();
		     Thread.sleep(3000);
		     rv9.Add_Hang_Tag_sustainable();
		     Thread.sleep(3000);
		     rv9.Add_Hang_Tag_save();
		     
		     Thread.sleep(5000);
			
			
		     Assortment_Attribute_AttributeView rv10= new Assortment_Attribute_AttributeView(driver);
		 	
		 	rv10.AttributeViews();
		     rv10.AttributeViews_Template();
		     Thread.sleep(3000);
		     rv10.AttributeViews_applyChanges();
		     Thread.sleep(3000);
		     rv10.ApplyChanges_Assortment();
		     
		     Thread.sleep(5000);
		
		   //click on edit buy grid
		 	Assortment_Attribute_EditBuyGrid rv11 = new Assortment_Attribute_EditBuyGrid(driver);
		 	rv11.EditBuyGrid();
		     Thread.sleep(3000);
		     rv11.EditBuyGrid_BuyInfo_CA();
		    // rv55.EditBuyGrid_BuyInfo_US();
		     Thread.sleep(3000);
		     rv11.EditBuyGrid_Status();
		     Thread.sleep(3000);
		     rv11.EditBuyGrid_Units();
		     Thread.sleep(3000);
		     rv11.EditBuyGrid_ApplyButton();
		     Thread.sleep(3000);
		     rv11.QtyBuyTable();
		     Thread.sleep(3000);
		 	
		 	
		
		
		
		
		
		
		
		
		
		
	}
}
