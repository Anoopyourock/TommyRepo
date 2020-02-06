package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_AttributeMenu 
{

	@FindBy(xpath="//li[text()='Attributes']")
	private WebElement attributes;

	public Assortment_AttributeMenu(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
	
	}
	
	//Click on attribute button
	public void Attribute()
	{
		attributes.click();
		
	}
	
}
