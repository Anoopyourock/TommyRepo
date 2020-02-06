package com.visulon.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class SearchHierarchy 
{
	WebDriver driver;
	  @FindBy(id="imgSearch")
	  private WebElement search_hierarchy;
	  
	  
	  @FindBy(linkText="ACCESSORIES")
	  private WebElement access;
	  
	  @FindBy(xpath="(//a[@class='SecondLevelClick'])[1]")
	  private WebElement boys;
	  
	  @FindBy(xpath="(//a[@class='ThirdLevelClick'])[1]")
	  private WebElement hats;
	  	  
	  @FindBy(xpath="(//a[@class='ThirdLevelClick2'])[1]")
	  private WebElement colorfamily;
	  
	  @FindBy(xpath="(//a[@class='FourthLevelClick'])[3]")
	  private WebElement redcolor;
	  
	  @FindBy(id="ContentPlaceHolder1_txtSearch")
	  private WebElement Quick_Search;
	  
	  @FindBy(id="ContentPlaceHolder1_btnSearch")
	  private WebElement Quick_Search_Button;

	  
	  
	  
	  public SearchHierarchy(WebDriver driver) 
	  {
		
		PageFactory.initElements(driver, this);
		this.driver= driver;
	  }
	 
	// Search Hierarchy
	  public void ClickoOnSearchHierarchy()
	  {
		  search_hierarchy.click();
		  
	  }
	  
	  public void accessories()
	  {
		access.click();
	  }
	  
	  public void Boys()
	  {
		  
		 boys.click();
		  
	  }
	  
	  public void Hats()
	  {
		  hats.click();
		  WebdriverActions.mouse1Action(driver,hats);
	  }
	  
	  public void Color_Family()
	  {
		  
		colorfamily.click();
		  
	  }
	  
	  public void Red_color()
	  {
		  redcolor.click();
		  WebdriverActions.mouse1Action(driver,redcolor);
	  }
	  // Quick search
	  public void quickSearch(String value)
	  {
		  
		  Quick_Search.sendKeys(value);
	  }
	
	  //Quick search button
	  public void ClickOnQuickSearchButton()
	  {
		 
		  Quick_Search_Button.click();
		  
	  }
}
