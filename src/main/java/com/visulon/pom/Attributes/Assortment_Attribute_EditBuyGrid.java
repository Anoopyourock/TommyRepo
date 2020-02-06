	package com.visulon.pom.Attributes;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	
	import com.visulon.commonseleniumactions.WebdriverActions;
	
	public class Assortment_Attribute_EditBuyGrid 
	{
	
	    WebDriver driver;
	    
		@FindBy(xpath="(//li[@id='liBuyGridAttribute']//input)[1]")
		private WebElement edit_BuyGrid;
		
		
		@FindBy(xpath="(//input[@checked='checked'])[2]")
		private WebElement buy_info_US;
		
		
		@FindBy(xpath="(//input[@type='checkbox'])[4]")
		private WebElement buy_info_CA;
		
		
		@FindBy(xpath="(//input[@type='checkbox'])[5]")
		private WebElement SelectAttribute_air;
		
		
		@FindBy(xpath="//input[@value='Door']")
		private WebElement SelectAttribute_door;
		
		
		@FindBy(xpath="//input[@value='GBB']")
		private WebElement SelectAttribute_Gbb;
		
		
		@FindBy(xpath="//input[@value='Floor']")
		private WebElement SelectAttribute_floor;
		
		
		@FindBy(xpath="//input[@value='WH LDP']")
		private WebElement SelectAttribute_WH_LDP;
		
		
		@FindBy(xpath="//input[@value='LDP']")
		private WebElement SelectAttribute_LDP;
		
		
		@FindBy(xpath="//input[@value='AUPD']")
		private WebElement SelectAttribute_AUPD;
		
		
		@FindBy(xpath="//input[@value='INDC']")
		private WebElement SelectAttribute_INDC;
		
		
		@FindBy(xpath="//input[@value='Status']")
		private WebElement SelectAttribute_status;
		
		
		@FindBy(xpath="//input[@value='WH Units']")
		private WebElement SelectAttribute_WH_units;
		
		@FindBy(xpath="//input[@value='IMU%']")
		private WebElement SelectAttribute_IMU;
		
		
		@FindBy(xpath="//input[@value='Units']")
		private WebElement SelectAttribute_Units;
		
		
		@FindBy(xpath="//input[@value='Units']")
		private WebElement SelectAttribute_MSRP;
		
		
		@FindBy(xpath="//input[@value='WH Cost']")
		private WebElement SelectAttribute_WH_Cost;
		
		@FindBy(xpath="//button[text()='Apply']")
		private WebElement apply_Button;
		
		
		@FindBy(xpath="//a[@id='liFinishBreif']/following-sibling::a[1]")
		private WebElement Qty_Buy_table;
	
	
		public Assortment_Attribute_EditBuyGrid(WebDriver driver) 
		{
			
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		
		//Click on Edit buy grid
		public void EditBuyGrid()
		{
			
			WebdriverActions.mouseAction(driver, edit_BuyGrid);
			edit_BuyGrid.click();
		}
		
		//Click on Edit buy grid _ Buy info US
	    public void EditBuyGrid_BuyInfo_US()
	   {
				
		  buy_info_US.click();
		}
			
	    
	  //Click on Edit buy grid _ But Info CA
	    public void EditBuyGrid_BuyInfo_CA()
	   {
				
		  buy_info_CA.click();
		}
			
		
		//Click on Edit buy grid _ status
	    public void EditBuyGrid_Status()
	   {
				
		SelectAttribute_status.click();
		}
			
			
		//Click on Edit buy grid _ Units
		public void EditBuyGrid_Units()
		{
						
		SelectAttribute_Units.click();
		}
					
		//Click on Edit buy grid _ apply button
			public void EditBuyGrid_ApplyButton()
			{
							
			apply_Button.click();
			}	
		  			
				     //Click on Qty buy Table
		public void QtyBuyTable()
		{
						
		Qty_Buy_table.click();
		}	
		
		
	}
