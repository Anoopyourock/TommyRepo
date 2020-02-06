package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsMenu_clickonTools 
{
	
	
	@FindBy(id="ContentPlaceHolder1_lnkTools")
	private WebElement tools;

	public ToolsMenu_clickonTools(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	
	}
		
	// Click on Tools menu
	public void ClickOnTool()
	{
		tools.click();
		
	}
	
	

}
