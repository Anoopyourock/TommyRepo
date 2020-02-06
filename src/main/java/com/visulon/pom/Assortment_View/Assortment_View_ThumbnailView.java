package com.visulon.pom.Assortment_View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Assortment_View_ThumbnailView 
{
	
	WebDriver driver;
    
	@FindBy(xpath="//li[@id='liThumbnailView']//input[1]")
	private WebElement Thumbnail_view;
	
	@FindBy(xpath="(//label[@class='themeRadio']//input)[5]")
	private WebElement move_whiteboard;
	
	@FindBy(xpath="//input[@value='moveproducts']")
	private WebElement move_products;
	
	
	@FindBy(xpath="(//input[@value='Apply'])[2]")
	private WebElement apply_button;

	public Assortment_View_ThumbnailView(WebDriver driver) 
	{
		
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Click on thumbnail view
	public void ThumnailView()
	{
		Thumbnail_view.click();
		
	}
	
	// click on move whiteboard
	public void move_Whiteboard()
	{
		move_whiteboard.click();
		
	}
	
	// click on move product
		public void move_Product()
		{
			move_products.click();
			
		}

	public void apply_button()
	{
		
		apply_button.click();
		
	}
	
	
	
	public void applyOk_button(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
		
	}
	
	
	
}
