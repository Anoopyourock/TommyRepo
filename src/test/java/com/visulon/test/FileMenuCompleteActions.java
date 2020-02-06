package com.visulon.test;

import org.sikuli.script.SikuliException;
import org.testng.annotations.Test;

import com.visulon.generics.Excelsheet;
import com.visulon.pom.CreateAssortment;
import com.visulon.pom.VisulonLoginPage;
import com.visulon.pom.AssortmentMenu.AssortmentMenuleftpanel;
import com.visulon.pom.AssortmentMenu.FileMenu_ChangeMilestone;
import com.visulon.pom.AssortmentMenu.FileMenu_Copyoverseason;
import com.visulon.pom.AssortmentMenu.FileMenu_Exit;
import com.visulon.pom.AssortmentMenu.FileMenu_Lock_unlock;
import com.visulon.pom.AssortmentMenu.FileMenu_MergeAssortment;
import com.visulon.pom.AssortmentMenu.FileMenu_Open;
import com.visulon.pom.AssortmentMenu.FileMenu_Save_As;
import com.visulon.pom.AssortmentMenu.FileMenu_SearchHistory;
import com.visulon.pom.AssortmentMenu.FileMenu_Share;
import com.visulon.pom.AssortmentMenu.FileMenu_SharewithTeam;
import com.visulon.pom.AssortmentMenu.FileMenu_Shortcutkeys;

public class FileMenuCompleteActions extends BaseTest
{

	@Test
	public void fileMenuCompleteActions() throws InterruptedException, SikuliException
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
		FileMenu_Copyoverseason rv14 =new FileMenu_Copyoverseason(driver);
		rv14.clickonCopyoverseason();
		Thread.sleep(3000);
		rv14.enterAssortmenttext("xyaqwertt");
		Thread.sleep(3000);
		rv14.selectSeason(1);
		Thread.sleep(3000);
		rv14.SelectProductSeason(1);
		Thread.sleep(3000);
		rv14.clickoncopy();
	FileMenu_ChangeMilestone rv6 = new FileMenu_ChangeMilestone(driver);
		// click on change milestone
			rv6.clickonchangemilestone();
			//select milestone
			rv6.SelectMilestone(4);
			//keep copy of current assortment
			rv6.keepcopy();
			//click on apply
			rv6.clickonApplyimage("../Tommy/SikuliImages/Apply.PNG");
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
			FileMenu_Exit rv13= new FileMenu_Exit(driver);
			//clik on exit
			rv13.clickonExit();
			Thread.sleep(3000);
			rv13.clikonSave();
			Thread.sleep(5000);
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
}