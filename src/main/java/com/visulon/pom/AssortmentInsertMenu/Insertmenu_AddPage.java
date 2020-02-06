package com.visulon.pom.AssortmentInsertMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Insertmenu_AddPage 
{


    WebDriver driver;
    @FindBy(xpath="(//ul[@class='assortmentMenuTxtLnk']//li)[3]")
    private WebElement insert;
    @FindBy(id="ContentPlaceHolder1_addPagesOnAssortment")
    private WebElement add_page;
    
    @FindBy(linkText="Add Cover")
    private WebElement add_Cover;
    
    @FindBy(id="imgAddEditModule0")
    private WebElement available_Cover1;
    
    @FindBy(id="imgAddEditModule1")
    private WebElement available_Cover2;
         
    @FindBy(xpath="(//div[@class='alignContentCenter']//div)[1]")
    private WebElement apply_Cover_Button;
    
    @FindBy(xpath="(//div[text()='Cancel'])[3]")
    private WebElement cancel_Cover_Button;
    
    @FindBy(xpath="//li[@id='liStaticAddDivider']//a[1]")
    private WebElement add_Divider;
    	
    @FindBy(id="drpAddDividerOption")
    private WebElement addToPosition;
    
    @FindBy(xpath="//div[@class='modernCAvailImgSelected']//img[1]")
    private WebElement available_Divder;
    

    @FindBy(id="imgAddEditModule1")
    private WebElement available_Divder2;

    
    @FindBy(xpath="(//div[@class='alignContentCenter']//div)[4]")
    private WebElement apply_Divider_button;
    
    @FindBy(xpath="(//div[text()='Cancel'])[3]")
    private WebElement cancel_Divider_button;

    public Insertmenu_AddPage (WebDriver driver) {
         
         
         PageFactory.initElements(driver, this);
         this.driver= driver;
         
         
    }
    //click on insert
    public void clickoninsert()
    {
    	insert.click();
    }
    
    //Click on add_page
    public void ClickOnAddPage()
    {
         
         WebdriverActions.mouseAction(driver,add_page);
        
         }
    
    // click on add cover
    public void ClickOnAddCover()
    {
         add_Cover.click();
         
    }
    
    // click on available cover
    public void Available_cover()
    {
         available_Cover1.click();
         
    }
    
    
    // click on apply button
    public void ClickOnApplyButton()
    {
         apply_Cover_Button.click();
         
         
    }
    
    // click on cancel button
    
    public void ClickOnCancelButton()
    {
         cancel_Cover_Button.click();
         
         
    }
    
   
    
 // click on divider
    public void ClickADDDivider()
    {
    	add_page.click();
    		add_Divider.click();	
    	   
         
    }
    
    // click on available divider
    public void ClickOnAvaiableDivider()
    {
         available_Divder.click();
         
         
    }
    
    // click on apply button
    public void ClickOnApplyAvaiableDivider()
    {
         apply_Divider_button.click();
         
         
    }
    
    // click on cancel button
    public void ClickOnCancelAvaiableDivider()
    {
    cancel_Divider_button.click();

    }
}
