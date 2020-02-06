package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Assortment_Attributes_UserDefined 
{

	WebDriver driver;
	@FindBy(xpath="(//input[@class='UDAttributesBtn'])[2]")
	private WebElement User_defined_attributes;
	
	
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement applyOn_Manual;
	
	
	@FindBy(xpath="(//input[@type='radio'])[2]")
	private WebElement applyOn_Selected_Products;
	
	@FindBy(xpath="(//input[@type='radio'])[3]")
	private WebElement applyOn_All_Products;
	
	@FindBy(xpath="(//span[text()='4'])[1]")
	private WebElement BigIdea;
	
	
	@FindBy(xpath="(//span[text()='1'])[2]")
	private WebElement earlyBuy;
	
	@FindBy(xpath="(//span[text()='2'])[3]")
	private WebElement keyLook;
	
	@FindBy(xpath="(//span[text()='Yes'])[1]")
	private WebElement marketing;
	
	@FindBy(xpath="(//span[text()='1'])[4]")
	private WebElement changeRequest;
	
	@FindBy(xpath="(//span[text()='Yes'])[2]")
	private WebElement lateAdds;
	
	@FindBy(xpath="(//span[text()='Yes'])[3]")
	private WebElement proto;

	public Assortment_Attributes_UserDefined(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	
	}

	
	//Click on user-defined attributes
	public void User_defined_Attributes()
	{
		WebdriverActions.mouseAction(driver,User_defined_attributes );
		
	}
	
	//Click on manual
	public void  applyOn_manual()
	{
		
		applyOn_Manual.click();
	}
		
	//Click on Selected products
		public void  applyOn_SelectedProducts()
		{
			
			applyOn_Selected_Products.click();
		}
	
	
		//Click on All Products
		public void  applyOn_AllProducts()
		{
			
			applyOn_All_Products.click();
		}
	
		//Click on Big Idea
				public void  BigIdea()
				{
					
					BigIdea.click();
				}
	
				//Click on Early Buy
				public void  EarlyBuy()
				{
					
					earlyBuy.click();
				}
	
				//Click on Key Looks
				public void  KeyLooks()
				{
					
					keyLook.click();
				}
				
				//Click on Marketing
				public void  Marketing()
				{
					
					marketing.click();
				}
				
				//Click on Change request
				public void  ChangeRequest()
				{
					
					changeRequest.click();
				}
				
				//Click on Late Adds
				public void  LateAdds()
				{
					
					lateAdds.click();
				}
				
				//Click on Proto
				public void  Proto()
				{
					
					proto.click();
				}
}
