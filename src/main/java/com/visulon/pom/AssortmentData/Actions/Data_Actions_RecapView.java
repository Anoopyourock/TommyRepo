package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Actions_RecapView 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liRecapView']//input[1]")
	private WebElement RecapView;
	@FindBy(xpath="//select[@id='ddlAttrNamesRecapView']")
	private WebElement RecapBy;
	@FindBy(xpath="(//span[@class='recapBy']//select)[3]")
	private WebElement RecapBy1;
	@FindBy(xpath="//span[text()=' Show Target']")
	private WebElement ShowTarget;
	@FindBy(xpath="(//input[@class='recapExport'])[1]")
	private WebElement ExportToExcel;
	@FindBy(xpath="//span[@class='modernPopupCloseIcon']")
	private WebElement Cancel;
	public Data_Actions_RecapView(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;	
	}
	
	public void clickonRecapView()
	{
		WebdriverActions.mouseAction(driver, RecapView);
		RecapView.click();
	}
	
	public void SelectRecapBy(int option)
	{
		WebdriverActions.selectOptionInListbox(RecapBy, option);
	}
	
	public void SelectRecapBy1(int option)
	{
		WebdriverActions.selectOptionInListbox(RecapBy1, option);
	}
	
	public void clickonShowTarget()
	{
		ShowTarget.click();
	}
	public void ClickonExportExcel()
	{
		ExportToExcel.click();
	}
	public void ClickonCancel(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
