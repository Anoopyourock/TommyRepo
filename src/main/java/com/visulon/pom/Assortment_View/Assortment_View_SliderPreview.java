package com.visulon.pom.Assortment_View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assortment_View_SliderPreview 
{

	@FindBy(xpath="//li[@id='liSliderPreview']//input[1]")
	private WebElement slider_preview;
	
	@FindBy(xpath="//img[@title='Presentation View']")
	private WebElement  slider_preview_PresentationView;
	
	@FindBy(xpath="//div[@id='divProductImageBtn']//img[1]")
	private WebElement  slider_preview_PresentationView_ViewProductImages;
	
	@FindBy(xpath="//div[@id='divProductInfoBtn']//img[1]")
	private WebElement  slider_preview_PresentationView_ViewProductInfo;
	
	@FindBy(xpath="//div[@title='Close']//span[1]")
	private WebElement  slider_preview_PresentationView_CloseButton;
	
	@FindBy(xpath="//img[@title='Flip Preview']")
	private WebElement  slider_preview_FlipPreview;
	
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement slider_preview_back_button;


	public Assortment_View_SliderPreview(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Click on Slider Preview
	public void SliderPreview()
	{
		slider_preview.click();
	}
	
     	// Click on SliderPreview_Presentation View
	
			public void SliderPreview_PresentationView()
			{
				
	     	slider_preview_PresentationView.click();
	    	slider_preview_PresentationView_ViewProductImages.click();
	    	slider_preview_PresentationView_ViewProductInfo.click();
	    	slider_preview_PresentationView_CloseButton.click();
				
			}
	
			// Click on Slider preview _Back_button
			
			public void SliderPreview_Back_button()
			{
				
				slider_preview_back_button.click();
				
				
			}
}

