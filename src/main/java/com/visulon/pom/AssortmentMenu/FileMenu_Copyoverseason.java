package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_Copyoverseason
{
	WebDriver driver;
	@FindBy(xpath="(//input[@type='image'])[4]")
	private WebElement Copyoverseason;
	
	@FindBy(xpath="(//input[@class='inputBox'])[5]")
	private WebElement AssortmentName;
	@FindBy(xpath="(//select[@class='dropdown'])[4]")
	private WebElement SelectSeason;
	@FindBy(xpath="(//select[@class='dropdown'])[5]")
	private WebElement ProductSeason;
	@FindBy(xpath="//div[text()='Copy']")
	private WebElement Copy;
	
	public FileMenu_Copyoverseason(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonCopyoverseason()
	{
		WebdriverActions.mouseAction(driver,Copyoverseason );
		Copyoverseason.click();
	}
	
	public void enterAssortmenttext(String text)
	{
		AssortmentName.sendKeys(text);
	}
	
	public void selectSeason(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectSeason, option);
	}
	
	public void SelectProductSeason(int option)
	{
		WebdriverActions.selectOptionInListbox(ProductSeason, option);
	}
	
	public void clickoncopy()
	{
		Copy.click();
	}
	
	
	
	
	
	
	
	
	
	
}
