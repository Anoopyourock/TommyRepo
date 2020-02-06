package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class ToolsMenu_Clear_Delete_Copy 
{

	WebDriver driver;
	
	@FindBy(linkText="Clear")
	private WebElement clear;
	
	
	@FindBy(linkText="Delete")
	private WebElement delete;
	
	
	
	@FindBy(linkText="Copy")
	private WebElement copy;



	public ToolsMenu_Clear_Delete_Copy(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	//Click On clear button
	
	public void ClickOnClear(String imagepath) throws SikuliException
	{
		clear.click();
		WebdriverActions.Sikuliactions1(driver, imagepath);
		
	}
	
	// Click on delete button
	
	public void ClickOnDelete(String imagepath) throws SikuliException
	{
	    delete.click();
		WebdriverActions.Sikuliactions1(driver, imagepath);
		
	}
	// Click on  copy button
	
		public void ClickOnCopy(String imagepath) throws SikuliException
		{
			
			copy.click();
			WebdriverActions.Sikuliactions1(driver, imagepath);
		}
		
		
	
	
}
