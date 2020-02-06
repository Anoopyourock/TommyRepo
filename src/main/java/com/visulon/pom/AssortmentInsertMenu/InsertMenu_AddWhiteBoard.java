package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_AddWhiteBoard 
{
	WebDriver driver;
	@FindBy(id="ContentPlaceHolder1_ImageButton32")
	private WebElement add_Whiteboard;
	
	@FindBy(xpath="//li[text()[normalize-space()='1 Whiteboard']]")
	private WebElement whiteboard1;
	
	@FindBy(xpath="//li[text()[normalize-space()='2 Whiteboards']]")
	private WebElement whiteboard2;
	
	@FindBy(xpath="//li[text()[normalize-space()='3 Whiteboards']]")
	private WebElement whiteboard3;
	
	@FindBy(xpath="//li[text()[normalize-space()='4 Whiteboards']]")
	private WebElement whiteboard4;
	
	@FindBy(xpath="//li[text()[normalize-space()='5 Whiteboards']]")
	private WebElement whiteboard5;

	@FindBy(xpath="(//table[@id='assortmnetNavigationTbl']//img)[2]")
	private WebElement prev_page;
	 
	@FindBy(xpath="(//table[@id='assortmnetNavigationTbl']//img)[3]")
	    private WebElement forward_page;
	
	public InsertMenu_AddWhiteBoard(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		this.driver=driver;
	}
   
	
	//Add whiteboard
	
	public void ClickOnAddWhiteBoard()
	{
		
		WebdriverActions.mouse1Action(driver, add_Whiteboard);
		
	}
	
	
	// whiteboard1
	public void ClickOnWhiteBoard1()
	{
		whiteboard1.click();
		
	}
	
	// whiteboard2
	
	public void ClickOnWhiteBoard2()
	{
		whiteboard2.click();
		
	}
	// whiteboard3
	public void ClickOnWhiteBoard3()
	{
		whiteboard3.click();
		
	}
	
	// whiteboard4
	public void ClickOnWhiteBoard4()
	{
		
		whiteboard4.click();
	}
	
	// whiteboard5
	public void ClickOnWhiteBoard5()
	{
		whiteboard5.click();
		
	}
	
	// prev_page
	public void ClickOnPrevPage()
	{
		
		prev_page.click();
		}
	
	public void ClickOnForwardPage()
	{
		
		forward_page.click();
	}
}
