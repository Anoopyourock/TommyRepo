package com.visulon.pom.AssortmentMenu;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebElementsActions;
import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_Open 

				
{
	WebDriver driver;
@FindBy(xpath="//li[text()='File']")
private WebElement File;
@FindBy(id="ContentPlaceHolder1_lnkOpenAssortment")
private WebElement open;
@FindBy(linkText="My Assortments")
private WebElement MyAssortment;
@FindBy(linkText="Global Standard Assortments")
private WebElement GlobalAssortment;
@FindBy(xpath="//span[@title='Search']")
private WebElement clickonSearch1;
@FindBy(xpath="(//input[@class='txtSearchKey'])[1]")
private WebElement Enterdocumentname;
@FindBy(xpath="(//select[@class='searchByChange'])[1]")
private WebElement Searchbytype;
@FindBy(xpath="(//input[@class='searchBtn'])[1]")
private WebElement SearchButton;
@FindBy(xpath="(//td[@align='left']//div)[1]")
private WebElement firstsercheddocument;
@FindBy(xpath="(//input[@class='showAllBtn'])[1]")
private WebElement ResetButton;
@FindBy(xpath="//span[@title='Filter']")
private WebElement FilterButton;
@FindBy(id="chkfilterCretedby")
private WebElement createdbyme;
@FindBy(id="rdbSharingPrivateFilter")
private WebElement Sharingprivate;
@FindBy(id="rdbSharingTeamFilter")
private WebElement SharingTeam;

@FindBy(xpath="(//a[@class='SetCursor'])[1]")
private WebElement clickonfirstMyassortment;
@FindBy(xpath="(//tr[@class='rowOne']//a)[5]")
private WebElement clickonfirstglobalassortment;
@FindBy(xpath="(//div[@class='closePopup'])[2]")
private WebElement cancel;
@FindBy(xpath="(//input[@type='image'])[2]")
private WebElement save;

 	public FileMenu_Open(WebDriver driver)
 	{
 		PageFactory.initElements(driver, this);
 		this.driver=driver;
 	}

 	public void clickonfileMenu()
 	{
 		File.click();
 	}
 	public void clickonopenicon()
 	{
 		open.click();
 		
 	}
 	public void switchfr(int x)
 	{
 		WebElementsActions.handleFrame(driver, x);
 		
 	}
 	
 		
 	
 	public void clickonfirstmyassortment()
 	{
 		clickonfirstMyassortment.click();
 	}
 	public void clickonGloalassortment()
 	{
 		GlobalAssortment.click();
 	}
 	public void clickonfirstGlobalAssortment()
 	{
 		clickonfirstglobalassortment.click();
 	}
 	public void clickonsearchicon()
 	{
 		clickonSearch1.click();
 	}
 	public void selectdocumentsearchBy(int option)
 	{
 		WebdriverActions.selectOptionInListbox(Searchbytype, option);
 	}
 	public void enterdocumentname(String Name)
 	{
 		Enterdocumentname.sendKeys(Name);
 	}
 	public void clickonsearchbutton()
 	{
 		SearchButton.click();
 	}
 	public void clickonreset()
 	{
 		ResetButton.click();
 	}
 	public void clickoncancelbutton()
 	{
 	cancel.click();	
 	}
 	public void clickonsave()
 	{
 	save.click();	
 	}






}

