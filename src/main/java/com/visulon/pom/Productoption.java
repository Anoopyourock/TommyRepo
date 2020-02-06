package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productoption 
{
	WebDriver driver;

	@FindBy(id ="ContentPlaceHolder1_ImgShowHideProximityLock")
	private WebElement proximityLock;


	
	@FindBy(xpath = "(//img[@class='movable ui-draggable'])[3]")
	private WebElement SKU;


	@FindBy(id = "spnAddAlternateImage_IFS")
	private WebElement alternateImgElement;



	@FindBy(id = "imgContextMenu")
	private WebElement contextMenuElement;

	@FindBy(xpath = "//div[@id='DivOnlyMulti']/div/ul/li[15]")
	private WebElement MovetoWhiteboard;


	@FindBy(xpath = "(//div[@id='Page2'])[2]")
	private WebElement select_whiteboardElement;


	@FindBy(id = "divforbackgroundcolor0")
	private WebElement whiteboardTargetElement;

	public Productoption(WebDriver driver) 
	{

	PageFactory.initElements(driver, this);	
	this.driver=driver;

	}


	//Click on Proximity Lock

	//@Step("Verify click on Proximity Lock")
	public void proximitylock()
	{
	proximityLock.click();

	}

	//Click on SKU
	//@Step("Verify Click on SKU")
	public void ClickonSKU()
	{
	SKU.click();
	}

	// Click on Alternate Image

	//@Step("Verify click on Alternate Img ")
	public void AlternateImg()
	{
	alternateImgElement.click();

	}
	public void Cilckonwhiteboard()
	{
		whiteboardTargetElement.click();
	}
	//Click onContext Menu

	//@Step("Verify click on Context Menu")
	public void ClickOnContextMenu()
	{

	contextMenuElement.click();
	}

	//Click on Move to whiteboard
	//@Step("Verify clcik on ")
	public void ClickOnMoveToWhiteboard()
	{
	MovetoWhiteboard.click();

	}

	//Click on Select White board

	//@Step("Verify on Select whiteboard ")
	public void selectWhiteboard()
	{

	select_whiteboardElement.click();
	}




	//@Step(" Verify Drag & Drop SKU")
	public void Drag_Drop_SKU(int x, int y) 


	{

	
	}
}
