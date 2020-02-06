package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileMenu_Exit 
{
	@FindBy(id="ContentPlaceHolder1_ImageButton7")
	private WebElement Exit;
	@FindBy(linkText="Save")
	private WebElement Save;
	@FindBy(xpath="//span[contains(text(),'Don't Save')]")
	private WebElement DontSave;

	@FindBy(linkText="Cancel")
	private WebElement Cancel;
	
	
	public FileMenu_Exit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonExit()
	{
		Exit.click();
	}
	
	public void clikonSave()
	{
		Save.click();
	}
	public void clikonDontSave()
	{
		DontSave.click();
	}

	public void ClickonCancel()
	{
		Cancel.click();
	}
}

