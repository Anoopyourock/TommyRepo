package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Action_Top10Style 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liShowTop10_SKUorStyle']//input[1]")
	private WebElement Top10Style;
	@FindBy(xpath="(//select[@class='simpleDropdown'])[2]")
	private WebElement SelectTopStyle;
	@FindBy(xpath="(//select[@class='simpleDropdown'])[3]")
	private WebElement SelectStyle;
	@FindBy(xpath="(//select[@class='simpleDropdown'])[4]")
	private WebElement Department;
	@FindBy(xpath="(//input[@class='recapExport'])[2]")
	private WebElement ExporttoExcel;
	@FindBy(xpath="//span[@class='modernPopupCloseIcon']")
	private WebElement Cancel;
	
	public Data_Action_Top10Style(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void ClickonTop10Style()
	{
		WebdriverActions.mouseAction(driver, Top10Style);
		Top10Style.click();
		
	}
	public void SelectTopStyle(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectTopStyle, option);
	}
	
	public void SelectStyle()
	{
		WebdriverActions.selectOptionInListbox(SelectStyle, 1);
	}
	
	public void SelectDepartment(int option)
	{
		WebdriverActions.selectOptionInListbox(Department, option);
	}
	
	public void ExporttoExcel()
	{
		ExporttoExcel.click();
	}
	
	public void ClickonCancel()
	{
		Cancel.click();
	}
	
		
	
}
