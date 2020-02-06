package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class AddProduct 
{
	WebDriver driver;

	@FindBy(id="ContentPlaceHolder1_lBtnSelect")
	private WebElement select_all;
	
	@FindBy(id="ContentPlaceHolder1_lBtnSelectMultiple")
	private WebElement select_multiple; 
	
	@FindBy(id="spnfilterShowHideText")
	private WebElement show_filter;
	
	
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[1]")
	private WebElement with_Images;
	
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[2]")
	private WebElement without_Images;
	
	
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[3]")
	private WebElement TTL_CA_Units;
	
	
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[4]")
	private WebElement TTL_US_Units;
	
	
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[5]")
	private WebElement wicking;
	
	@FindBy(xpath="//input[@id='FltrChk_d3']/following-sibling::span[1]")
	private WebElement sustainable ;
	
	@FindBy(xpath="//input[@id='FltrChk_d4']/following-sibling::span[1]")
	private WebElement downfill;
	
	@FindBy(xpath="//input[@id='FltrChk_d5']/following-sibling::span[1]")
	private WebElement waterresistent;
	
	@FindBy(xpath="//input[@id='FltrChk_d6']/following-sibling::span[1]")
	private WebElement flex;
	
	@FindBy(xpath="//input[@id='FltrChk_d7']/following-sibling::span[1]")
	private WebElement weatherrated;
	
	@FindBy(xpath="//input[@id='FltrChk_d8']/following-sibling::span[1]")
	private WebElement primaloft;
	
	@FindBy(xpath="//input[@id='FltrChk_d9']/following-sibling::span[1]")
	private WebElement recycledfiber;
	
	@FindBy(id="btnClearAllFilters")
	private WebElement clearAll;
	
	@FindBy(id="ContentPlaceHolder1_btnApplyFilters")
	private WebElement apply;
	
	
	@FindBy(id="spnfilterShowHideText")
	private WebElement hide_filter;
	
	
	@FindBy(id="prodImg_1")
	private WebElement addProduct1;
	
	@FindBy(id="prodImg_4")
	private WebElement addproduct2;
	
	@FindBy(xpath="//table[@class='viewCartBtnBg']//td[1]")
	private WebElement addcart;


	public AddProduct(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
		
	}
	
	public void SelectAll()
	{
	select_all.click();
		
	}
	
	public void Selectmultiple()
	{
		
		select_multiple.click();
	}
	
	public void ShowFilter()
	{
		
		show_filter.click(); 
		
	}
	
	public void withimages()
	{
		with_Images.click();
		
	}
	
	public void withoutimages()
	{
		without_Images.click();
		
	}
	
	public void TTLCAUnits()
	{
		TTL_CA_Units.click();
		
	}
	
	
	public void TTLUSUnits()
	{
		
		TTL_US_Units.click();
	}
	public void wicking()
	{
		
	  wicking.click();
	}
	
	public void Sustainable()
	{
		sustainable.click();
		
	}
	
	public void downfill()
	{
		
		downfill.click();
	}
	
	public void waterresistent()
	{
		
		waterresistent.click();
	}
	
	public void flex()
	{
		
		flex.click();
	}
	
	public void weatherrated()
	{
		
		weatherrated.click();
	}
	public void primaloft()
	{
		
		primaloft.click();
	}
	public void recyclerfiber()
	{
		recycledfiber.click();
		
	}
	
	public void hidefliter()
	{
		
		hide_filter.click();
	}
	
	
	public void AddProduct1()
	{
		WebdriverActions.mouseAction(driver,addProduct1);
		addProduct1.click();
		
	}
	
	public void AddProduct2()
	{
		WebdriverActions.mouseAction(driver,addproduct2);
		addproduct2.click();
	}
	public void addcart()
	{
		addcart.click();
		
	}
	public void clearall()
	{
		clearAll.click();
		
	}
	public void apply()
	{
		apply.click();
		
	}
	

}
