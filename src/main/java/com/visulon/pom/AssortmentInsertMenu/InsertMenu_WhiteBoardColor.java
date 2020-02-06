package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;
import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_WhiteBoardColor 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='LiWhiteBordColor']//input[1]")
	private WebElement WhiteBoardColor;
	@FindBy(xpath="(//div[@class='selectColorOption']//input)[1]")
	private WebElement SingleColor;
	@FindBy(xpath="(//div[@class='selectColorOption']//input)[2]")
	private WebElement GradientColor;
	@FindBy(id="CustomAlertWindow_BtnOk")
	private WebElement OkButton;
	
	public InsertMenu_WhiteBoardColor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clikonWhiteBoardColor()
	{
		WhiteBoardColor.click();
	}
	
	public void clikonSingleColor()
	{
		SingleColor.click();
	}
	
	public void ClickonGradientColor()
	{
		GradientColor.click();
	}
	
	public void ClickonColor1(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	
	
	public void ClikonColor2(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	
	public void ClickonSubmit(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	
	public void ClikonOkButton()
	{
		
		OkButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
