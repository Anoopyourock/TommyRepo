package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class ToolsMenu_Customer_Assortment 

{


	WebDriver driver;
	@FindBy(xpath="//li[@id='liCustomerAssortment']//input[1]")
	private WebElement customer_Assortment;

	
	@FindBy(xpath="//table[@class='CustomAssortFor']//select[1]")
	private WebElement create_customer_Assortment;
	
	@FindBy(xpath="(//input[@value='Create'])[2]")
	private WebElement create_button;
	

	@FindBy(xpath="//div[@class='clsCustomAlertBtnDiv']//input[1]")
	private WebElement No_Product_Found_Ok_button;
	
	@FindBy(xpath="//span[text()=' Create Assortment for ']/following-sibling::div[1]")
	private WebElement create_assortment_close_button;
	
	
	@FindBy(xpath="(//span[@class='primaryOrange'])[1]")
	private WebElement prev_assortment;
	
	public ToolsMenu_Customer_Assortment(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	//Click on  customer assortment
	public void ClickOnCustomerAssortment()
	{
		customer_Assortment.click();
		
	}
	
	//Click on select customer assortment
	public void SelectCustomerAssortment(int option)
	{
		
		WebdriverActions.selectOptionInListbox(create_customer_Assortment, option);
		
	}
	
	//Click on create button
	public void ClickOnCreateButton()
	{
		
		create_button.click();
	}
	
	//Click on NoProductFound OK button
	
	public void ClickOnNoProductFoundButton()
	{
		
		No_Product_Found_Ok_button.click();
	}
	
	// Click on close button
	public void ClickOnCreateAssortmentCloseButton()
	{
		
		create_assortment_close_button.click();
	}
	
	//Click on previous assortment
	public void ClickOnPrev_Assortment() throws SikuliException
	{
		
		WebdriverActions.Sikuliactions1(driver, "../Tommy/SikuliImages/BackAssortment.PNG");
	}
	
	
	
	
	
}
