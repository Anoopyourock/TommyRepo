package com.visulon.pom.AssortmentToolsMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ToolsMenu_Snap_to_Grid 
{
	
	 @FindBy(xpath="//li[@id='liSnapOnGrid']//input[1]")
	 private WebElement snapToGrid;

	 public ToolsMenu_Snap_to_Grid(WebDriver driver) 
	 {
		PageFactory.initElements(driver, this);
	 }
	 
	
	 // Click on SnapToGrid
	 public void ClickOnSnapToGrid()
	 {
		 snapToGrid.click();
		 
	 }
	
	
	

}
