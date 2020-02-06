package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisulonLoginPage 
{
	@FindBy(name="txtUserName")
	private WebElement username;
	@FindBy(name="txtPassword")
	private WebElement password;
	@FindBy(id="chkRememberMe")
	private WebElement checkbox;
	@FindBy(id="LinkButton1")
	private WebElement loginbutton;
	@FindBy(className="img-responsive")
	private WebElement TradeMark;
	@FindBy (linkText="Forgot your password?")
	private WebElement ForgotPassword;
	@FindBy(id="btnPrev")
	private WebElement PreviousImage;
	@FindBy(id="btnNext")
	private WebElement NextImage;
	
	
	public VisulonLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setCredentials(String un,String pass)
	{
		username.sendKeys(un);
		password.sendKeys(pass);
		
	}

	
	public void ClickOnLoginButton()
	{
		loginbutton.click();
	}
	
	public void ClikonForgotPassword()
	{
		ForgotPassword.click();
	}
	public void ClickonRememberMe()
	{
		checkbox.click();
	}
	public void clikonpreviousImage()
	{
		PreviousImage.click();
	}
	
	public void clickonNextImage()
	{
		NextImage.click();
	}
	
	public void ClikonVisulonTradeMark()
	{
		TradeMark.click();
	}
	

}
