package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Actions_ProductStats 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liProductStatatics']")
	private WebElement ProductStats;
	@FindBy(xpath="//input[@value='currentpage']")
	private WebElement CurrentPageProducts;
	
	@FindBy(xpath="//input[@value='assortment']")
	private WebElement AssortmentProducts;
	
	public Data_Actions_ProductStats(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	public void ClickonProductStats()
	{
	
	WebdriverActions.mouseAction(driver, ProductStats);
	ProductStats.click();
	}
	
	public void clickoncurrentPageProducts()
	{
		CurrentPageProducts.click();
	}
	public void clickonAssprtmentProducts()
	{
		AssortmentProducts.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
