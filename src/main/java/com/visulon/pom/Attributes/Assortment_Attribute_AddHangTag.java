package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_Attribute_AddHangTag 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liAddHangTag']//input[1]")
	private WebElement add_hang_Tag;
	
	@FindBy(xpath="(//input[@value='selectedproducts'])[2]")
    private WebElement AddHangTag_SelectedProducts;
    
	
	@FindBy(xpath="(//span[text()='Selected Products']/following::input)[1]")
    private WebElement AddHangTag_AllProducts;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_wicking;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_flex;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_sustainable;
	
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_weather_rated;
	
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_downfill;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_primeloft;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_water_resistent;
	
	@FindBy(xpath="(//input[@name='chkAddHangTag'])[1]")
	private WebElement AddHangTag_recycled_fiber;
	
	@FindBy(xpath="(//span[text()='Save'])[3]")
	private WebElement save;

	public Assortment_Attribute_AddHangTag(WebDriver driver) 
	{
	
		PageFactory.initElements(driver, this);
		
	}
	
	//Click on add hang tag
	public void Add_Hang_Tag()
	{
		add_hang_Tag.click();
		
	}
	
	
	//Click on add hang tag _selected product
		public void Add_Hang_Tag_SelectedProducts()
		{
			
			AddHangTag_SelectedProducts.click();
			
		}
	
	
		//Click on add hang tag_ All products
		public void Add_Hang_Tag_AllProducts()
		{
			AddHangTag_AllProducts.click();
			
		}
		
		//Click on add hang tag_wicking
				public void Add_Hang_Tag_Wicking()
				{
					AddHangTag_wicking.click();
					
				}
				
				
				//Click on add hang tag_flex
				public void Add_Hang_Tag_Flex()
				{
					AddHangTag_flex.click();
					
				}
				
				
				//Click on add hang tag_sustainable
				public void Add_Hang_Tag_sustainable()
				{
					AddHangTag_sustainable.click();
					
				}
				
				
				//Click on add hang tag_Downfill
				public void Add_Hang_Tag_Downfill()
				{
					AddHangTag_downfill.click();
					
				}
				
				
				//Click on add hang tag_water resistant
				public void Add_Hang_Tag_Water_Resistant()
				{
					AddHangTag_water_resistent.click();
					
				}
				
				
				//Click on add hang tag_weather Rated
				public void Add_Hang_Tag_Weather_rated()
				{
			         AddHangTag_weather_rated.click();
					
				}
				
				
				//Click on add hang tag prime loft
				public void Add_Hang_Tag_PrimeLOft()
				{
					AddHangTag_primeloft.click();
					
				}
				
				
				//Click on add hang tag Recycled fiber
				public void Add_Hang_Tag_Recycled_Fiber()
				{
					AddHangTag_recycled_fiber.click();
					
				}
	
				//Click on add hang tag save
				public void Add_Hang_Tag_save()
				{
		      	save.click();
					
				}
}
