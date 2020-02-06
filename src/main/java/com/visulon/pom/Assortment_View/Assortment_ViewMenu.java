package com.visulon.pom.Assortment_View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_ViewMenu 
{
	@FindBy(xpath="//li[text()='View']")
	private WebElement view;

	public Assortment_ViewMenu(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	//Click on View button
	public void View()
	{
		view.click();
		
	}
	
}
