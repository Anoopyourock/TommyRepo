package com.visulon.pom.AssortmentPlaceHolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class PlaceHolder_AddQuick_PlaceHolder 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liAddQuickPlaceholder']//input[1]")
	private WebElement AddQuickPlaceHolder;
	
	
	public PlaceHolder_AddQuick_PlaceHolder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickonQuickPlaceholder()
	{
		WebdriverActions.mouseAction(driver, AddQuickPlaceHolder);
		AddQuickPlaceHolder.click();
	}
	
	
}
