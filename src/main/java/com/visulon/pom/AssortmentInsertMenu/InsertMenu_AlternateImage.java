package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_AlternateImage 
{
	WebDriver driver;
	
	@FindBy(xpath="(//li[@id='liAlternateImage']//input)[1]")
	private WebElement alternate_Images;
	
	@FindBy(xpath="(//label[@class='lableAlternateImageOption']//input)[1]")
	private WebElement alternate_SwatchImages_;
	
	@FindBy(xpath="(//label[@class='lableAlternateImageOption']//input)[2]")
	private WebElement alternate_BackImages;
	
	@FindBy(xpath="(//label[@class='lableAlternateImageOption']//input)[3]")
	private WebElement InsertFor_SelectedProduct;
	
	@FindBy(xpath="//input[@value='currentwhiteboard']")
	private WebElement InsertFor_CurrentWhieboardProducts;
	
	
	
	@FindBy(id="CustomAlertWindow_BtnOk")
	private WebElement no_product_selected_button;

	public InsertMenu_AlternateImage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
        this.driver=driver;
	}
	
	//Click on Alternate images
	public void ClickOnAlternateImages()
	{
		
		WebdriverActions.mouseAction(driver,alternate_Images );
		
	}
	
	
	
	//Click on Swatch radio button
	public void ClickOnAlternateImagesSwatchImages()
	{
		alternate_SwatchImages_.click();
		
	}
	
	
	//Click on back images radio button
	
	public void ClickOnAlternateImagesBackImages()
	{
		alternate_BackImages.click();
		
	}
	
	// Click on selected radio button
	
	public void ClickOnInsertForSelectProduct()
	{
		InsertFor_SelectedProduct.click();
		
	}
	
	
	//Click for current whiteboard radio button
	public void ClickOnInsertForCurrentWhiteboard()
	{
		InsertFor_CurrentWhieboardProducts.click();
		
	}
	
	
	
	//click on  no product selected Ok button
	public void No_Product_Selected()
	{
		
		no_product_selected_button.click();
	}
	
	//Click on apply
	public void ClickOnApplyButton() throws SikuliException
	{
		
		WebdriverActions.Sikuliactions1(driver, "../Tommy/SikuliImages/Applyicon.PNG");
	}
}
