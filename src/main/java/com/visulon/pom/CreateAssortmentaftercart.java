package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class CreateAssortmentaftercart 
{
WebDriver driver;
	
	@FindBy(id="txtDocumentName")
	private WebElement assortmentName;
	
	@FindBy(id="ContentPlaceHolder1_ddlASrtMilestones")
	private WebElement milestones;
	
	@FindBy(id="personal")
	private WebElement privacy;
	
	@FindBy(id="ContentPlaceHolder1_ddlGroupByASrt")
	private WebElement groupby;
	
	@FindBy(id="ContentPlaceHolder1_ddlSortByAsrt")
	private WebElement sortby;

	@FindBy(id="chkIsStandard")
	private WebElement globalAssortment;
	
	@FindBy(id="btnCreateDocument")
	private WebElement Createassortment;

	public CreateAssortmentaftercart(WebDriver driver) 
	
	{
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
		
	}
	
	
	public void AssortmentName(String assort_Name)
	{
		assortmentName.sendKeys(assort_Name);
		
	}
	
	
	public void Select_Milestones(int options)
	{
		WebdriverActions.selectOptionInListbox(milestones,options);
		
	}
	
	public void Select_Privacy()
	{
		
		privacy.click();
	}
	
	public void GroupBy(int options)
	{
		
		WebdriverActions.selectOptionInListbox(groupby,options);
	}
	
	public void SortBy(int options)
	{
		
		WebdriverActions.selectOptionInListbox(sortby,options);
	}
	
	public void Global_Assortment()
	{
		globalAssortment.click();
		
	}
			
	
	public void create_Assortment()
	{
		Createassortment.click();
		
	}
}
