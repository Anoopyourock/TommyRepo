package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTocart 
{
	@FindBy(id="txtCartPopupSearch")
	private WebElement searchcartproduct;
	
	@FindBy(id="btnImgSearchProductCart")
	private WebElement searchcartproduct_button;
	
	
	@FindBy(className="cartProductClose")
	private WebElement cartClose_button;
	
	
	@FindBy(linkText="Unselect")
	private WebElement Unselect_product;
	
	@FindBy(xpath="//div[@title='Remove Selected Products from Category']//a[1]")
	private WebElement remove;
	
	@FindBy(linkText="Remove All")
	private WebElement removeall;
	
	@FindBy(xpath="(//img[@class='wbCartPrdct'])[1]")
	private WebElement ClickonCartProduct;
	
	@FindBy(xpath="(//input[@type='submit'])[4]")
	private WebElement saveAsAssortment;

	public AddTocart(WebDriver driver)
	
	{
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	public void SearchTextCart(String value)
	{
		
		searchcartproduct.sendKeys(value);
	}
	
	public void SerachTextCartButton()
	{
		
	  searchcartproduct_button.click();
		
		
	}
	public void unselectProduct()
	{
	
		Unselect_product.click();
		
	}
	public void removeProduct()
	{
		remove.click();
		
	}
	public void removeall()
	{
		
		removeall.click();
	}
	public void clickOnCartProduct()
	{
		
		ClickonCartProduct.click();
		
	}
	public void SaveasAssortment()
	{
		saveAsAssortment.click();
		
	}
	
}
