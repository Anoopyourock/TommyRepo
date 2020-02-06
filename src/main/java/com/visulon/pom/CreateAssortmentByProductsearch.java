package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class CreateAssortmentByProductsearch 
{
	WebDriver driver;
	@FindBy(id="btnProductSearch")
	private WebElement productsearch;
	@FindBy(xpath="(//select[@class='dropdown'])[1]")
	private WebElement FiscalYear;
	@FindBy(xpath="//div[text()='Summer']")
	private WebElement Season;
	@FindBy(id="btnCreateDocument")
	private WebElement proceed;
	
	
	public CreateAssortmentByProductsearch(WebDriver driver)
	{
		
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	
	
	public void clickonproductsearch()
	{
		productsearch.click();
	}
	public void selectfiscalyear(int options)
	{
		WebdriverActions.selectOptionInListbox(FiscalYear,options);
	}
	public void Selecttheseason()
	{
		Season.click();
	}
	public void clickonproceed()
	{
		proceed.click();
	}
	
}
