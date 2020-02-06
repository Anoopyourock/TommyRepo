package com.visulon.pom.ArrangeMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arrange_Grid_Ruler
{
	@FindBy(xpath="//div[text()=' Ruler']")
	private WebElement ClickonRuler;
	@FindBy(xpath="//div[text()=' Gridline']")
	private WebElement clickongridline;
	
	public Arrange_Grid_Ruler(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickonRuler()
	{
		ClickonRuler.click();
	}
	
	public void Clickongridline()
	{
		clickongridline.click();
	}
	
}
