package com.visulon.pom.ArrangeMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arrange_SelectAll 
{
	@FindBy(xpath="//li[text()='Arrange']")
	private WebElement Arrange;
	@FindBy(xpath="//li[@id='liCtrlPressSelection']//input[1]")
	private WebElement SelectMultiple;
	@FindBy(xpath="//li[@id='li3']//input[1]")
	private WebElement SelectAll;
	@FindBy(xpath="(//img[@name='imgObj'])[3]")
	private WebElement SelectFirstImage;
	@FindBy(className="whitePageBorder")
	private WebElement ClickonwhiteBoard;
	
	public Arrange_SelectAll(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void ClickonArrange()
	{
		Arrange.click();
	}
	
	public void SelectAll()
	{
		SelectAll.click();
	}
	
	public void SelectMultiple()
	{
		SelectMultiple.click();
	}
	
	public void SelectFirstImage()
	{
		SelectFirstImage.click();
	}
	
	public void ClickonWhiteBoard()
	{
		ClickonwhiteBoard.click();
	}
	
	
	
}
