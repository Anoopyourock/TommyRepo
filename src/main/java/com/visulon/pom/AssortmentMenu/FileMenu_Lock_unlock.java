package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileMenu_Lock_unlock 
{
	@FindBy(xpath="//span[@id='unlockIcon']//input[1]")
	private WebElement Lock;
	@FindBy(xpath="//span[@id='lockIcon']//input[1]")
	private WebElement unlock;
	
	public FileMenu_Lock_unlock(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlock()
	{
		Lock.click();
	}
	public void clickonunlock()
	{
		unlock.click();
	}
	
	
}
