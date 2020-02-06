package com.visulon.pom.ArrangeMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Arrange_Align 
{
	WebDriver driver;
	@FindBy(xpath="(//span[text()='Left'])[1]")
	private WebElement Movetoleft;
	@FindBy(xpath="(//span[text()='Center'])[1]")
	private WebElement MovetoCenter;
	@FindBy(xpath="(//span[text()='Right'])[1]")
	private WebElement MovetoRight;
	@FindBy(xpath="(//span[text()='Top'])[1]")
	private WebElement MovetoTop;
	@FindBy(xpath="(//span[text()='Middle'])[1]")
	private WebElement MovetoMiddle;
	@FindBy(xpath="(//span[text()='Bottom'])[1]")
	private WebElement MovetoBottom;
	@FindBy(xpath="//span[text()='Align']")
	private WebElement cilckonalign;
	@FindBy(xpath="(//span[text()='Left'])[2]")
	private WebElement Alignleft;
	@FindBy(xpath="//li[text()[normalize-space()='Center']]")
	private WebElement AlignCentre;
	@FindBy(xpath="//li[text()[normalize-space()='Right']]")
	private WebElement Alignright;
	@FindBy(xpath="//li[text()[normalize-space()='Top']]")
	private WebElement AlignTop;
	@FindBy(xpath="//li[text()[normalize-space()='Middle']]")
	private WebElement AlignMiddle;
	@FindBy(xpath="//li[text()[normalize-space()='Bottom']]")
	private WebElement AlignBottom;
	
	
	public Arrange_Align(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	//Move to left
	public void MovetoLeft()
	{
		Movetoleft.click();
	}
	//Move to center
	public void MoveToCenter()
	{
		MovetoCenter.click();
	}
	
	//Move to Right
	public void MoveToRight()
	{
		MovetoRight.click();
	}
	
	//Move to Top
	public void MoveToTop()
	{
		MovetoTop.click();
	}
	//Move to Middle
	public void MoveToMiddle()
	{
		MovetoMiddle.click();
	}
	
	//Move to Bottom
	public void MoveToBottom()
	{
		MovetoBottom.click();
	}
	
	//Click on align 
	//
	public void ClickonAlign()
	{
		WebdriverActions.mouseAction(driver, cilckonalign);
		AlignBottom.click();
		AlignCentre.click();
		Alignleft.click();
		AlignMiddle.click();
		Alignright.click();
		AlignTop.click();
		
		
	}
	
	
	
	
	
	
	
	
}
