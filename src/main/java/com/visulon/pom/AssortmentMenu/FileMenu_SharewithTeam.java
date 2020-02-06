package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_SharewithTeam 
{
	@FindBy(xpath="//li[@id='LiShare']//input[1]")
	private WebElement clickonsharebutton;
	@FindBy(xpath="//span[@id='SpnTeamSharePopupTitle']/following-sibling::div[1]")
	private WebElement cancel;
	@FindBy(xpath="(//select[@class='simpleDropdown'])[1]")
	private WebElement SelectGroup;
	@FindBy(id="chkSelectAll")
	private WebElement selectall;
	@FindBy(id="btnSelectTeam")
	private WebElement createTeam;
	
	public FileMenu_SharewithTeam(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonsharewithteam()
	{
		clickonsharebutton.click();
	}
	public void selectgroup(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectGroup,  option);
		
	}
	public void clickoncancel()
	{
		cancel.click();
	}
	public void Selectallmember()
	{
		selectall.click();
	}
	public void ClickonCreateButton()
	{
		createTeam.click();
	}
	
}
