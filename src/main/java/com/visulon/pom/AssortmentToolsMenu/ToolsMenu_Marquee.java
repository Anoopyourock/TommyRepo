package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsMenu_Marquee 
{

	@FindBy(xpath="//li[@id='liAssortmentMarkKey']//input[1]")
	private WebElement marquee;

	public ToolsMenu_Marquee(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	// Click on marquee
	
	public void ClickOnMarquee()
	{
		
		marquee.click();
	}


}
