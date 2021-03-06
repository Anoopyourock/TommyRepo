package com.visulon.test;

import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;

import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.Attributes.Assortment_AttributeMenu;
import com.visulon.pom.Attributes.Assortment_Attributes_UserDefined;

public class TestAssortment_Attribute_UserDefined extends BaseTest
{
@Test
	public void testAssortment_Attribute_UserDefined() throws InterruptedException
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
	
	Assortment_Attributes_UserDefined rv6 =new Assortment_Attributes_UserDefined(driver);
    rv6.User_defined_Attributes();
    Thread.sleep(3000);
    rv6.applyOn_AllProducts();
    Thread.sleep(3000);
    rv6.BigIdea();
    Thread.sleep(3000);
    
    rv6.EarlyBuy();
    Thread.sleep(3000);
    rv6.KeyLooks();
    Thread.sleep(3000);
    rv6.Marketing();
    Thread.sleep(3000);
    rv6.ChangeRequest();
    Thread.sleep(3000);
    rv6.LateAdds();
    Thread.sleep(3000);
    rv6.Proto();
    
    
    Thread.sleep(5000);
    
    
	
	
	
	
	
	
	
	
	
	
	}

}
