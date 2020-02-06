package com.visulon.pom.AssortmentMenu;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_MergeAssortment 
{
	@FindBy(xpath="//li[@id='liMergeAssortment']//input[1]")
	private WebElement clickonmergeassortment;
	@FindBy(xpath="//input[@value='MYA']")
	private WebElement clickonMyAssortment;
	@FindBy(xpath="//input[@value='GSA']")
	private WebElement clickonglobalassortment;
	@FindBy(xpath="//div[@class='tableOption']//select[1]")
	private WebElement clickonsort;
	@FindBy(xpath="//div[@class='tableOption']//span[1]")
	private WebElement clickonsearchicon;
	@FindBy(xpath="//input[@placeholder='Document Name']")
	private WebElement enterdocumentname;
	@FindBy(xpath="//input[@value='Search']")
	private WebElement clickonsearchbutton;
	@FindBy(xpath="//input[@value='Show All']")
	private WebElement clickonshowall;
	@FindBy(xpath="//span[text()='Merge Assortment With']/following-sibling::div[1]")
	private WebElement clickoncancel;
	@FindBy(xpath="(//td[@class='regularDoc ForDocumentName']//div)[1]")
	private WebElement SelectMYassortmenttomerged;
	@FindBy(xpath="(//td[@class='standardDoc ForDocumentName']//div)[1]")
	private WebElement SelectGlobalassortmenttomerged;
	@FindAll({@FindBy(xpath="(//label[@class='customChkBx']//span)")})
	private List<WebElement> totalnoofwhitwboard;
	@FindBy(xpath="(//span[@class='checkmark'])[1]")
	private WebElement SelectAll;
	@FindBy(xpath="//button[@class='smlbtn']")
	private WebElement Back;
	@FindBy(xpath="(//button[@class='btnCommonTow'])[3]")
	private WebElement Merge;
	@FindBy(xpath="//span[@id='popUpHeaderTitle_MA']/following-sibling::div[1]")
	private WebElement cancel;
	
	public FileMenu_MergeAssortment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmergeassortment()
	{
		clickonmergeassortment.click();
	}
	public void clickonmyassortment()
	{
		clickonMyAssortment.click();
	}
	
	public void clickonglobalassortment()
	{
		clickonglobalassortment.click();
	}
	public void clickonSortby(int option)
	{
		WebdriverActions.selectOptionInListbox(clickonsort, option);
		clickonsort.click();
	}
	public void clickonSearchIcon()
	{
		clickonsearchicon.click();
	}
	public void EnterDocumentName(String Text)
	{
		enterdocumentname.sendKeys(Text);
	}
	public void clickonSearchButton()
	{
		clickonsearchbutton.click();
	}
	public void clickonshowall()
	{
		clickonshowall.click();
	}
	public void clickoncancel()
	{
		clickoncancel.click();
	}
	public void clickonmyfirstassortment()
	{
		SelectMYassortmenttomerged.click();
	}
	public void clickonmyfirstglobalassortment()
	{
		SelectGlobalassortmenttomerged.click();
	}
	
	public void SelectWhiteBoard()
	{
		int size = totalnoofwhitwboard.size();
		System.out.println("Total numer of whiteboard: "+size);
		for(int i=0;i<size; i++)
		{
			totalnoofwhitwboard.get(i).click();
		}
	}
	public void SelectAll()
	{
		SelectAll.click();
	}
	public void cancel() 
	{
		cancel.click();
	}
	public void Merge()
	{
		Merge.click();
	}
	public void Back()
	{
		Back.click();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
