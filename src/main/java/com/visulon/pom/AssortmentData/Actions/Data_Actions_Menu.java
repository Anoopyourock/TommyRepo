package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Actions_Menu 
{
	WebDriver driver;
	@FindBy(xpath="//li[text()='Data/Actions']")
	private WebElement DataActions;
	
	public Data_Actions_Menu(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonData_Actions()
	{
		WebdriverActions.mouseAction(driver, DataActions);
		DataActions.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
