package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_Share 
{
	@FindBy(id="ContentPlaceHolder1_ImgByEmail")
	private WebElement clickonshare;
	@FindBy(xpath="(//select[@class='dropdown'])[1]")
	private WebElement SelectGroupname;
	@FindBy(xpath="(//select[@class='dropdown'])[2]")
	private WebElement SelectEmailID;
	@FindBy(id="ContentPlaceHolder1_txtShareByEmail")
	private WebElement EnteremailID;
	@FindBy(xpath="//span[text()='Send Email']")
	private WebElement sendemail;
	@FindBy(xpath="//div[@class='iconPopup iconBlockShare']/following-sibling::div[1]")
	private WebElement cancel;
	@FindBy(id="CustomAlertWindow_BtnOk")
	private WebElement ClikonOkbutton;
	
	public FileMenu_Share(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonshareonemail()
	{
		clickonshare.click();
	}
	public void SelectGroupname(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectGroupname, option);
	}
	public void SelectEmailID(int option)
	{
		WebdriverActions.selectOptionInListbox(SelectEmailID, option);
	}
	public void EntermailID(String Text)
	{
		EnteremailID.sendKeys(Text);
	}
	public void SendEmail()
	{
		sendemail.click();
	}
	public void cancel()
	{
		cancel.click();
	}
	public void ClikonOkButton()
	{
		ClikonOkbutton.click();
	}
	
}
