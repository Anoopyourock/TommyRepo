package com.visulon.pom.AssortmentData.Actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Actions_CustomTemplateLibrary 
{
	WebDriver driver;

	@FindBy(xpath="//li[@id='liAssortmentUserTheme']//input[1]")
	private WebElement CustomTemplateLibrary;
	@FindBy(xpath="(//input[@value='current'])[1]")
	private WebElement Currentpage;
	@FindBy(xpath="(//input[@value='all'])[2]")
	private WebElement AllPages;
	@FindBy(xpath="(//div[text()='Apply'])[3]")
	private WebElement Apply;
	@FindBy(xpath="(//div[text()='Cancel'])[1]")
	private WebElement Cancel;
	@FindBy(xpath="//div[@id='divSelectTemplateTitle']//select[1]")
	private WebElement SelectTemplate;
	@FindAll({@FindBy(xpath="(//div[@class='hdn6'])")})
	private List<WebElement> Selettemplatenumber;
	@FindBy(xpath="(//div[@id='divforbackgroundcolor0'])[3]")
	private WebElement SelectTemplate5;
	
	public Data_Actions_CustomTemplateLibrary(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void ClickonCustomeTemplateLibrary()
	{
		WebdriverActions.mouseAction(driver, CustomTemplateLibrary);
		CustomTemplateLibrary.click();
	}
	
	public void ClickonCurrentPage()
	{
		Currentpage.click();
	}
	
	public void ClickonAllPages()
	{
		AllPages.click();
	}
	public void clikonApply()
	{
		Apply.click();
	}
	public void ClickonCancelButton()
	{
		Cancel.click();
	}
	
	public void SelectTemplatesCategory(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectTemplate, option);
	}
	public void SelectTemplates() 
	{
		int Size = Selettemplatenumber.size();
		System.out.println(Size);
	
		for (int i=4;i<=12;i++)
		{
			Selettemplatenumber.get(i).click();
			
			
		}
			
	}
		public void SelectTmplate5()
		{
			SelectTemplate5.click();
		}
		}
	

