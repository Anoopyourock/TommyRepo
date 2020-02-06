package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_Pictures 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liassortPictureIcon']//input[1]")
	private WebElement pictures;
	
    @FindBy(id="ContentPlaceHolder1_uploadPicLibrary")
	private WebElement choosefile;
	
    @FindBy(xpath="(//input[@value='Add'])[1]")
    private WebElement add_Button;
    
    @FindBy(xpath="(//input[@type='submit'])[5]")
    private WebElement close_Button;

	public InsertMenu_Pictures(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
    
    //Pictures
	
    public void ClickOnPictures()
    {
    	
    	pictures.click();
    }
    //choose file
    public void clickonchoosefile()
    {
    	choosefile.click();
    }
   
    //Addpicture Popup
    public void EnterFilepath(String imagepath,String path) throws SikuliException  
    {
    	WebdriverActions.Sikuliactions(driver, imagepath, path);
    	
    }
    //enter the file name
    public void clickonopenimage(String imagepath) throws SikuliException
    {
    	WebdriverActions.Sikuliactions1(driver, imagepath);
    	
    }
    	
    public void clickonAddButton()
    {
    	
	 	 add_Button.click();
    }
    
    // Close
    public void close_Button()
    {
    	
    	close_Button.click();
    }

}
