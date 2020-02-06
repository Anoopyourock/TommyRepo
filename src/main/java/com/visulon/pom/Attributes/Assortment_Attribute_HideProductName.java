package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_Attribute_HideProductName 
{

	@FindBy(xpath="(//input[@type='button'])[3]")
	private WebElement hide_Product_name;

	public Assortment_Attribute_HideProductName(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void hide_product_name()
	{
		
		hide_Product_name.click();
		
	}
}
