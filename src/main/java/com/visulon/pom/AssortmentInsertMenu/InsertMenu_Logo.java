package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_Logo {

	
		
		WebDriver driver;
	    @FindBy(xpath="//li[@id='Li5']//input[1]")
		private WebElement logos;
		
		
	    @FindBy(xpath="//span[@class='titleOfIcons']//img[1]")
	    private WebElement other_arrow_button;


		public InsertMenu_Logo(WebDriver driver) 
		{
			
			
			
			PageFactory.initElements(driver, this);
			this.driver=driver;
			
		}
		
	    
		
		// Click on Logo
	    public void ClickOnLogo()
	    {
	    	
	    	logos.click();
	    }
	    
	    // Select Logo
	    
	    public void selectLogo(String imagepath) throws SikuliException
	    {
	    	
	    	WebdriverActions.Sikuliactions1(driver, imagepath);
	    }
		
	    
	    //Click on arrow button
		public void ClickOnArrowButton()
		{
			other_arrow_button.click();
			
		}







}
