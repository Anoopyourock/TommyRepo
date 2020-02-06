package com.visulon.pom.AssortmentPlaceHolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceHolder_ClickonPlaceholder 
{

	@FindBy(xpath="//li[text()='Placeholder']")
	private WebElement Placeholder;
	
	public PlaceHolder_ClickonPlaceholder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonPlaceHolder()
	{
		Placeholder.click();
	}
	
	
	
}
