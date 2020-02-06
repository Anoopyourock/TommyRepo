package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product 
{
	WebDriver driver;
	
	@FindBy(xpath = "(//img[@name='imgObj'])[3]")
	private WebElement SKU;
	
	@FindBy(className="whitePageBorder")
	private WebElement ClickonwhiteBoard;
	
	@FindBy(id = "imgContextMenu")
	private WebElement contextMenuElement;
	
	public Product(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonSKU()
	{
		SKU.click();
	}
	
	public void ContextMenu()
	{
		contextMenuElement.click();
	}
	public void clickonwhiteboard()
	{
		ClickonwhiteBoard.click();
	}
	
	
}
