package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_FillColors 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liColorPickerTake']//input[1]")
	private WebElement fill_product_color;
	
	
	@FindBy(xpath="//area[@alt='#FF99CC']")
	private WebElement choose_color;

	@FindBy(xpath="(//img[@class='movable ui-draggable'])[3]")
	private WebElement Target_Image;
	

	public InsertMenu_FillColors(WebDriver driver) 
	{
		
	PageFactory.initElements(driver, this);
	this.driver= driver;
	
	}
	
	
	//Click On Fill product color
	public void ClickOnFillProductColor()
	{
		WebdriverActions.mouseAction(driver, fill_product_color);
		
	}
	
	//Choose color
	
	public void chooseColor()
	{
		driver.switchTo().frame(0);
		choose_color.click();
	
		
	}
	
	// fill color in particular product
	
	public void FillColorInProduct()
	{
		driver.switchTo().defaultContent();
		WebdriverActions.mouseAction(driver, Target_Image);
		Target_Image.click();
	}
			
	
	

}
