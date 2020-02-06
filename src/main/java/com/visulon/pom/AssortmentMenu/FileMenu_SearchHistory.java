package com.visulon.pom.AssortmentMenu;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_SearchHistory 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='libtnHistory']//input[1]")
	private WebElement SearchHistory;
	@FindAll({@FindBy(xpath="//tbody/tr/td[3]")})
	private List<WebElement> totalproducts ;
	@FindBy(xpath="//span[text()='Product Search History']/following-sibling::div[1]")
	private WebElement cancel;
	
	public FileMenu_SearchHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickonSearchHistory()
	{
		SearchHistory.click();
	}
	public void totalproductsSearched()
	{
		int size = totalproducts.size();
		System.out.println(size);
		//for(int i=0;i<1;i++)
		//{
			//totalproducts.get(i).click();
		//}
		
	}
	public void clickonCancel()
	{
		cancel.click();
		
	}
	
	public void Clikoncancelicon(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
}
