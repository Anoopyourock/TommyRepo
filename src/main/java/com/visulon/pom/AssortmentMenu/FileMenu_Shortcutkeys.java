package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileMenu_Shortcutkeys 
{
	@FindBy(xpath="//li[@id='lnkShortcut']//input[1]")
	private WebElement clickonShortcutKeys;
	@FindBy(xpath="//div[@class='modernPopupClose']")
	private WebElement cancel;
	
	public FileMenu_Shortcutkeys(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonshortcut()
	{
		clickonShortcutKeys.click();
	}
	public void cancel()
	{
		cancel.click();
	}
	
}
