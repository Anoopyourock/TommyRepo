package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class InsertMenu_BackGroundTheme 
{

	WebDriver driver;
    @FindBy(xpath="//li[@id='libackgroundimage']//input[1]")
	private WebElement themes;
	
    @FindBy(xpath="//div[@class='clsThemeColors']//div[1]")
	private WebElement custom_Themes;
    
    
    @FindBy(xpath="(//img[@class='clsWBackimage'])[2]")
    private WebElement custom_Themes_1;
	
    @FindBy(xpath="(//div[@class='clsThemeColors']//div)[5]")
    private WebElement white_color_Themes;
	
    @FindBy(xpath="(//div[@class='ClsImage']//img)[1]")
    private WebElement white_color_Themes_1;
    
    @FindBy(xpath="//div[@id='bgThmeBtnWhite']/following-sibling::div[1]")
	private WebElement grey_Color_Themes;
	
    @FindBy(xpath="(//div[@class='ClsImage']//img)[1]")
    private WebElement grey_Color_Themes_1;
    
    @FindBy(xpath="(//input[@value='current'])[2]")
    private WebElement current_page;
    
    @FindBy(xpath="(//input[@value='all'])[3]")
    private WebElement all_Pages;
    
    @FindBy(xpath="(//div[text()='Apply'])[4]")
    private WebElement apply;
    
    @FindBy(xpath="(//div[text()='Remove'])[2]")
    private WebElement remove_themes;

    
    @FindBy(xpath="(//table[@id='assortmnetNavigationTbl']//img)[3]")
    private WebElement forward_page;
    
	public InsertMenu_BackGroundTheme(WebDriver driver) 
	 {
		
		PageFactory.initElements(driver, this);
		this.driver= driver;
		
	}
    
	
	public void ClickOnForwardPage()
	{
		
		forward_page.click();
	}
	
	//click on Themes
	
	public void ClickOnThemes()
	{
		WebdriverActions.mouseAction(driver,themes);
		themes.click();
		
	}
    
	
	// click on Custom Themes1
	
   public void ClickOnCustomThemes()
   {
	   custom_Themes.click();
	   custom_Themes_1.click();
		
   }
    
   
   //click on WhiteColorThemes
    public void ClickOnWhiteColorThemes()
    {
    	white_color_Themes.click();
    	white_color_Themes_1.click();
    	
    }
    
    //click on GreyColorThemes
    public void ClickOnGreyColorThemes()
    {
        grey_Color_Themes.click();
        grey_Color_Themes_1.click();
    	
    }
    
    // click on Current page
    
    public void ClickOnCurrentPages()
    {
    	current_page.click();
    }
    
    //click on All pages
    public void ClickOnAllPages()
    {
    	all_Pages.click();
    }
    
    //click on remove Themes
    public void ClickOnRemoveTheme()
    {
    	
    	remove_themes.click();
    }
	public void ClickonApply()
	{
		apply.click();
	}
	

}
