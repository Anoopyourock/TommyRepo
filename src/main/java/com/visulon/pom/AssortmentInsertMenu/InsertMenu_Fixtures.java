package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_Fixtures 
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liFixtureLibrary']//input[1]")
	private WebElement fixture_library;
	
	@FindBy(xpath="(//div[@class='FixtureLibThumb']//img)[1]")
	private WebElement Select_fixture_library_Images1;
	
	
	@FindBy(xpath="(//div[@class='FixtureLibThumb']//img)[2]")
	private WebElement Select_fixture_library_Images2;
	
	
	

	public InsertMenu_Fixtures(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	//Click on Fixture library
	
	public void ClickOnFixtureLibrary()
	{
		
		fixture_library.click();
	}
	
	//Select first fixture image
	
	public void SelectfixtureImages1()
	{
		
		Select_fixture_library_Images1.click();
		
	}
	
	//Select Last fixture Image
	
	public void SelectfixtureImages2()
	{
		
		Select_fixture_library_Images2.click();
		
	}
	
	// Close Fixture library Popup
	
	public void CloseFixtureImagesPopup() throws SikuliException
	{
		
		WebdriverActions.Sikuliactions1(driver, "../Tommy/SikuliImages/ClickonCancelicon.PNG");
		
	}
	


}
