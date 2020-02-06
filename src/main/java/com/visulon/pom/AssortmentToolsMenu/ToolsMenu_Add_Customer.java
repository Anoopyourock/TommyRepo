package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class ToolsMenu_Add_Customer
{

	WebDriver driver;
	@FindBy(xpath="//li[@id='liAddCutomerToProducts']//input[1]")
	private WebElement add_customer;
	
	@FindBy(xpath="(//input[@value='all'])[1]")
	private WebElement addTo_AllProduct;

	
	@FindBy(xpath="(//input[@value='selected'])[2]")
	private WebElement addTo_SelectedProduct;
	
	
	@FindBy(xpath="//table[@class='selectCustomer']//select[1]")
	private WebElement select_customer;
	
	
	@FindBy(xpath="(//label[text()=' Selected Products ']/following::input)[1]")
	private WebElement add_button;
	
	@FindBy(xpath="//input[@value='Remove']")
	private WebElement remove_Button;

	
	
	
	public ToolsMenu_Add_Customer(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	// Click On add to customer
    public void ClickOnCustomer()
    {
	  
    	add_customer.click();
	  
    }
	
    // Click on all product
    public void SelectAllProduct()
    {
    	addTo_AllProduct.click();
    	
    }
    
    //Click on selectProduct
    public void SelectProduct()
    {
    	addTo_SelectedProduct.click();
    	
    }
	
    //Click on customer
    public void SelectCustomer(int option)
    {
    	WebdriverActions.selectOptionInListbox(select_customer, option);
    	
    }
    
    //Clcik on add button
    public void addButton()
    {
    	add_button.click();
    	
    }
    
    //Click on remove button
    public void removeButton()
    {
    	remove_Button.click();
    	
    }
    
    //Click on close button
    public void closeButton() throws SikuliException
    {
    	WebdriverActions.Sikuliactions1(driver,"../Tommy/SikuliImages/ClickonCancelicon.PNG");
    	
    }

	
	
	
	
}
