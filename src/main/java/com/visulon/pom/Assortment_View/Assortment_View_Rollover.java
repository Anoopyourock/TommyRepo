package com.visulon.pom.Assortment_View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Assortment_View_Rollover 
{

	WebDriver driver; 
	
	@FindBy(xpath="//li[@id='liRollOverZoom']//input[1]")
	private WebElement rollover_zoom;

	public Assortment_View_Rollover(WebDriver driver) 
	{
	
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	//Click on roll over zoom
      public void RolloverZoom()
      {
    	  
    	  rollover_zoom.click();
    	  
      }
	
      //Click on roll over images
	public void rollover_Image(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions2(driver, imagepath);
		
	}
	
	
	
}
