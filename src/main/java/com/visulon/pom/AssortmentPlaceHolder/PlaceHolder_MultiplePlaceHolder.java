package com.visulon.pom.AssortmentPlaceHolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class PlaceHolder_MultiplePlaceHolder 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liAddMultiplePlaceholder']//input[1]")
	private WebElement MultiplePlaceHolder;
	@FindBy(xpath="(//input[@type='button'])[4]")
	private WebElement ShowPlaceholderName;
	@FindBy(xpath="//span[text()='Add Multiple Placeholders']/following-sibling::div[1]")
	private WebElement Cancel;
	
	public PlaceHolder_MultiplePlaceHolder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickonMultiplePlaceHolder()
	{
		WebdriverActions.mouseAction(driver, MultiplePlaceHolder);
		MultiplePlaceHolder.click();
	}
	public void ClickonShowplaceholderName()
	{
		WebdriverActions.mouseAction(driver, ShowPlaceholderName);
		ShowPlaceholderName.click();
	}
	public void clikonAddFile(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	public void Addressoffile(String imagepath,String value ) throws SikuliException
	{
		WebdriverActions.Sikuliactions(driver, imagepath, value);
	}
	public void clickonOpen(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	
	}
	
	public void AddSecondFile(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	public void ClickStartUpload(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	public void clickoncancel()
	{
		Cancel.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
