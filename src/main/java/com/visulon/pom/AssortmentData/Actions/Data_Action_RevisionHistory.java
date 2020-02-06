package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Action_RevisionHistory 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liRevisionHistory']//input[1]")
	private WebElement RevisionHistory;
	
	@FindBy(xpath="//span[@class='modernPopupCloseIcon']")
	private WebElement Cancel;
	

	@FindBy(xpath="//span[@class='revHistoryOption']//span[1]")
	private WebElement ExportToExcel;

	public Data_Action_RevisionHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	public void clickonRevisionHistory()
	{
		WebdriverActions.mouseAction(driver, RevisionHistory);
		RevisionHistory.click();
	}
	
	public void ExportToExcel()
	{
		ExportToExcel.click();
	}
	
	public void Cancel()
	{
		Cancel.click();
	}

	public void CloseDownload(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);	
		
		
	}


}
