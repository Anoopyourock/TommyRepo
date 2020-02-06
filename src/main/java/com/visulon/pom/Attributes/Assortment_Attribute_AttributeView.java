package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_Attribute_AttributeView 
{

	 WebDriver driver;
	@FindBy(xpath="//li[@id='liSetOfAttributeViews']//input[1]")
	private WebElement attribute_views;
	
	@FindBy(xpath="//div[@id='divAttrsetNumber_18']//div[1]")
	private WebElement Select_Attribute_View_Template;
	
	
	
	@FindBy(xpath="(//span[@class='AttributeViewClose'])[1]")
	private WebElement Select_Attribute_View_Template_Delete_button;
	
	@FindBy(linkText="Apply Changes")
	private WebElement attribute_views_applyChanges;
	
	@FindBy(linkText="Cancel")
	private WebElement attribute_views_cancel_button;
	
	
	@FindBy(xpath="//span[text()='Current Whiteboard']")
	private WebElement applyChanges_current_whiteboard;
	
	
	@FindBy(xpath="//a[@value='AllWB']")
	private WebElement applyChanges_current_Assortment;
	
	@FindBy(xpath="//span[text()='New Products']")
	private WebElement applyChanges_current_NewProducts;

	public Assortment_Attribute_AttributeView(WebDriver driver) 
	
	{
		
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//Click on attribute views
	public void AttributeViews()
	{
		
		attribute_views.click();
	}
	
	//Click on attribute views template
		public void AttributeViews_Template()
		{
			 driver.switchTo().frame("iFrameMultiPursope");
			
			Select_Attribute_View_Template.click();
		}
	
		//Click on attribute views apply changes
		public void AttributeViews_applyChanges()
		{
			
			attribute_views_applyChanges.click();
		}
		
		
		//Click on attribute views_cancel
		public void AttributeViews_cancel()
		{
			
			attribute_views_cancel_button.click();
		}
		
		
		
		//Click on applychanges current whiteboard
		public void ApplyChanges_currentWhiteboard()
		{
			
			applyChanges_current_whiteboard.click();
		}
		
		//Click on applychanges Assortment
				public void ApplyChanges_Assortment()
				{
					
					applyChanges_current_Assortment.click();
				}
				
				
				
				//Click on applychanges new products
				public void ApplyChanges_NewProducts()
				{
					
					applyChanges_current_NewProducts.click();
				}
}
