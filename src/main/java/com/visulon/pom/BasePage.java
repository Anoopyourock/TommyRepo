package com.visulon.pom;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;


public class BasePage 
{
	
	WebDriver driver;
	@FindBy(id="btnTop_Workbook")
	private WebElement Workbook;
	@FindBy(linkText="Assortment")
	private WebElement Assortment;
	@FindBy(linkText="Planogram")
	private WebElement Planogram;
	@FindBy(id="linkProductMaster")
	private WebElement ProductMaster;
	@FindBy(id="linkAdmin")
	private WebElement Administration;
	@FindBy(linkText="Home")
	private WebElement Home;
	@FindBy(id="linkstatsReports")
	private WebElement Stats_Reports;
	@FindBy(xpath="//div[@id=\"NavUserName\"]")
	private WebElement VisulonAdmin;
	@FindBy(linkText="Account Settings")
	private WebElement Accountsetting;
	@FindBy(linkText="Change Password")
	private WebElement Changepassword;
	@FindBy(className="themeBtn")
	private WebElement ChangeTheme;
	@FindBy(xpath="//div[@class='themeBtn']/div/span[1]")
	private WebElement Theme1;
	@FindBy(xpath="//div[@class='themeBtn']/div/span[2]")
	private WebElement Theme2;
	@FindBy(xpath="//div[@class='themeBtn']/div/span[3]")
	private WebElement Theme3;
	@FindBy(id="LogoutID")
	private WebElement Logout; 
	@FindBy(xpath="//div[@id='btnAssortmentNotification']")
	private WebElement AssortmentNotification;
	@FindBy(xpath="//div[@id='btnShowImportedAssortSheet']//span[1]")
	private WebElement ImportedSheets;
	@FindAll({@FindBy(xpath="//div[@class='ProductCommentsViewProductName']")})
	private List<WebElement>SelectAssortmentfromNotification;
	@FindBy(xpath="(//span[@class='modernPopupCloseIcon'])[3]")
	private WebElement Cancel;
	
	public BasePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonWorkbook()
	{
		Workbook.click();
	}
	public void clickonassortment()
	{
		Assortment.click();
	}
	public void clickonPlanogram()
	{
		Planogram.click();
	}
	public void clickonProductMaster()
	{
		ProductMaster.click();
	}
	
	public void clickonAdministration()
	{
		Administration.click();
	}
	public void clickonHome()
	{
		Home.click();
	}

	public void clickonStats_Reports()
	{
		Stats_Reports.click();
	}
	 public void HoverVisulonAdmin()
	 {
		 WebdriverActions.mouseAction(driver, VisulonAdmin);
	 }
	 public void clickonAccountsettings()
	 {
		 Accountsetting.click();
		 
	 }
	 public void clickonChangePassword()
	 {
		 Changepassword.click();
	 }
	 public void hoverchangetheme()
	 {
		 WebdriverActions.mouseAction(driver, ChangeTheme);
	 }
	 public void selecttheme1()
	 {
		 WebdriverActions.mouseAction(driver, Theme1);
		 Theme1.click();
	 }
	 public void selecttheme2()
	 {
		 WebdriverActions.mouseAction(driver, Theme2);
		 Theme2.click();
	 }
	 public void selecttheme3()
	 {
		 WebdriverActions.mouseAction(driver, Theme3);
		 Theme3.click();
	 }
	public void logout()
	{
		Logout.click();
	}
	
	public void ClickonAssortmentNotification()
	{
		AssortmentNotification.click();
	}
	
	public void ClickonImportedSheets()
	{
		ImportedSheets.click();
	}
	
	public void ClickonAssortment()
	{
		int size=SelectAssortmentfromNotification.size();
		System.out.println("Total assortment: "+size);
		for (int i=0;i<=5;i++)
		{
			SelectAssortmentfromNotification.get(i).click();
		}
	
		
	}
	public void ClickonCancel()
	{
		Cancel.click();
	}
	
	
	
	
	
	
	
	
	
}
