package com.visulon.pom.Attributes;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_Attribute_ManageAttributes 
{

	WebDriver driver;
	@FindBy(xpath="//li[@id='liSetAttr_User']//input[1]")
	private WebElement manage_attributes;
	
	
	@FindBy(xpath="(//input[@type='checkbox'])")
	private WebElement Select_attributes;
	
	@FindBy(xpath="(//input[@type='image'])[1]")
	private WebElement add_attributes_button;
	
	@FindBy(xpath="(//img[@type='button'])[1]")
	private WebElement moveUp_button;
	
	@FindBy(xpath="(//img[@type='button'])[2]")
	private WebElement moveDown_button;
	
	@FindBy(xpath="(//input[@type='image'])[2]")
	private WebElement remove_Single_attributes;
	
	@FindBy(xpath="(//input[@type='image'])[3]")
	private WebElement remove_All_attributes;

	
	@FindBy(linkText="Apply Changes")
	private WebElement applyChanges;
	
	@FindBy(linkText="Cancel")
	private WebElement cancel;

	
	@FindBy(xpath="//span[text()='Current Whiteboard']")
	private WebElement current_whiteboard;
	
	@FindBy(xpath="//span[text()='Assortment']")
	private WebElement assortment;
	
	@FindBy(xpath="//span[text()='New Products']")
	private WebElement new_products;
	
	@FindAll({@FindBy(xpath="(//input[@type='checkbox'])")})
	private List<WebElement>SelectAttributes;
	
	public Assortment_Attribute_ManageAttributes(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver= driver;
	}
	
	//Click on manage attribute
	public void manageAttribute()
	{
		
		manage_attributes.click();
		
		
	}
	
	// Select attributes
	public void select_Attributes(int x)
	
	{
		  driver.switchTo().frame("iFrameMultiPursope");
		  System.out.println(SelectAttributes.size());
	      
		    for(int i=0 ;i<x;i++)
		    {
		    	
		    	SelectAttributes.get(i).click();
		    }
		    
	}
	
	//Click on add attribute
	public void add_Attribute()
	{
		
		add_attributes_button.click();
		
	}
	
	
	
	//Click on apply changes
	public void apply_Changes()
	{
		
		applyChanges.click();
	}
	
	//Click on Assortment
	public void assortment()
	{
		assortment.click();
		
	}
}
