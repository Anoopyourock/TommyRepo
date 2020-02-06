package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_FormattedNote 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liFormatedNote']//input[1]")
	private WebElement formatted_note;
	
	@FindBy(xpath="(//input[@value='Continue'])[2]")
	private WebElement Continue;
	
    
	@FindBy(xpath="(//label[text()='RECYCLED FIBER']/following::input)[2]")
	private WebElement cancel;


	public InsertMenu_FormattedNote (WebDriver driver) 
	
   {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	// formatted Note
	public void ClickOnFormattedNote()
	{
		
		formatted_note.click();
		
	}
	
	// formatted popup
	public void FormattedNotePopup(String value,String imagepath ) throws SikuliException 
	{
		WebdriverActions.Sikuliactions(driver, imagepath, value);
		
		Continue.click();
		
	}
	
	//cancel
	public void ClickOnCancelButton()
	{
		cancel.click();
	}
}
