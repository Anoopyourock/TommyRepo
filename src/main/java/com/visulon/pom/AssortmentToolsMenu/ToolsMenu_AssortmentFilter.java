package com.visulon.pom.AssortmentToolsMenu;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class ToolsMenu_AssortmentFilter
{
	
	@FindBy(xpath="//li[@id='liAssortmentFilter']//input[1]")
	private WebElement assortment_Filter;

	
    @FindBy(xpath="(//span[@class='filterChk__indicator'])[1]")
    private WebElement with_Images;
    
    @FindBy(xpath="(//span[@class='filterChk__indicator'])[2]")
    private WebElement without_Images;
    
    
    @FindBy(xpath="(//span[@class='filterChk__indicator'])[3]")
    private WebElement TTL_CA_Units;
    
    
    @FindBy(xpath="(//span[@class='filterChk__indicator'])[4]")
    private WebElement TTL_US_Units;
    
    
    @FindBy(xpath="(//span[@class='filterChk__indicator'])[5]")
    private WebElement wicking;
    
    @FindBy(xpath="//input[@id='FltrChk_d3']/following-sibling::span[1]")
    private WebElement sustainable ;
    
    @FindBy(xpath="//input[@id='FltrChk_d4']/following-sibling::span[1]")
    private WebElement downfill;
    
    @FindBy(xpath="//input[@id='FltrChk_d5']/following-sibling::span[1]")
    private WebElement waterresistent;
    
    @FindBy(xpath="//input[@id='FltrChk_d6']/following-sibling::span[1]")
    private WebElement flex;
    
    @FindBy(xpath="//input[@id='FltrChk_d7']/following-sibling::span[1]")
    private WebElement weatherrated;
    
    @FindBy(xpath="//input[@id='FltrChk_d8']/following-sibling::span[1]")
    private WebElement primaloft;
    
    @FindBy(xpath="//input[@id='FltrChk_d9']/following-sibling::span[1]")
    private WebElement recycledfiber;
    
    @FindBy(id="btnClearAllFilters")
    private WebElement clearAll;
    
    @FindBy(id="ContentPlaceHolder1_btnApplyFilters")
    private WebElement apply;
    
    @FindBy(xpath="(//div[@class='filterbtnsDivLeft']//div)[1]")
    private WebElement edit_filter;
    
    @FindBy(xpath="(//div[@class='dropdownFilterSort']//div)[1]")
    private WebElement group_sort;
    
    @FindBy(xpath="//table[@class='dropdown-contentFilterGroupTable']//select[1]")
    private WebElement groupBy;
    
    @FindBy(xpath="(//table[@class='dropdown-contentFilterSortTable']//select)[1]")
    private WebElement first_sortBy;
    
    
    @FindBy(xpath="(//table[@class='dropdown-contentFilterSortTable']//select)[2]")
    private WebElement second_sortBy;
    
    @FindBy(xpath="(//table[@class='dropdown-contentFilterSortTable']//select)[3]")
    private WebElement third_sortBy;
    
    @FindBy(xpath="(//table[@class='dropdown-contentFilterSortTable']//select)[4]")
    private WebElement forth_sortBy;
    
    @FindBy(xpath="(//div[@id='FilterProductPopup_SortDiv']//div)[3]")
    private WebElement group_sort_cancelButton;
    
    @FindBy(xpath="(//div[@id='FilterProductPopup_SortDiv']//div)[4]")
    private WebElement group_sort_applyButton;
    
    @FindBy(xpath="(//label[text()[normalize-space()='Move Products']]/following::input)[2]")
    private WebElement List_view;
    
    @FindBy(xpath="(//div[@class='filterbtnsDivLeft']//span)[2]")
    private WebElement recap_view;
    
    @FindBy(xpath="(//div[@class='filterbtnsDivLeft']//span)[3]")
    private WebElement top10view;
    
    
    @FindBy(xpath="(//span[@class='Top10_SKUorStyleDrops']//select)[1]")
    private WebElement top10;
    
    @FindBy(xpath="(//select[@class='simpleDropdown'])[3]")
    private WebElement top10Style;
    
    @FindBy(xpath="(//select[@class='simpleDropdown'])[4]")
    private WebElement Retail_wholesale;
    
    @FindBy(xpath="//div[@id='ShowTop10_SKUorStyle_Popup']//span[@class='modernPopupCloseIcon']")
    private WebElement top10Closebutton;
    
    @FindBy(xpath="(//input[@class='recapExport'])[2]")
    private WebElement top10_exportToexcel;
    
    @FindBy(xpath="(//input[@class='recapExport'])[3]")
    private WebElement exportToexcel;
    
    @FindBy(xpath="//div[text()='Create Assortment']")
    private WebElement create_assortment;
    
    @FindBy(id="txtName_SaveAsrtFromFilter")
    private WebElement save_assortment_name;
    
    
    @FindBy(xpath="(//input[@value='Save'])[4]")
    private WebElement save_assortment_saveButton;
    
    @FindBy(xpath="//div[@class='modernPopup saveAssortmentNew']//span[@class='modernPopupCloseIcon']")
    private WebElement  save_assortment_closeButton;
    
    
    @FindBy(xpath="//div[@class='clsCustomAlertBtnDiv']//input[1]")
    private WebElement No_product_to_create_product_collection;
    
    @FindBy(xpath="//div[@id='FilterProductPopup_MainDiv']//span[@class='modernPopupCloseIcon']")
    private WebElement product_collection_closeButton;
	
    
    
    public ToolsMenu_AssortmentFilter(WebDriver driver)
	{
    	PageFactory.initElements(driver, this);
	}

	
	//Click On Assortment filter 
	public void ClickOnAssortmentFilter()
	{
		
		assortment_Filter.click();
	}
	
	
	//Click on with image
	 public void withimages()
     {
           with_Images.click();
           
     }
     
	 //Click on without images
     public void withoutimages()
     {
           without_Images.click();
           
     }
     
     // Click on
     public void TTLCAUnits()
     {
           TTL_CA_Units.click();
           
     }
     
     
     public void TTLUSUnits()
     {
           
           TTL_US_Units.click();
     }
     public void wicking()
     {
           
       wicking.click();
     }
     
     public void Sustainable()
     {
           sustainable.click();
           
     }
     
     public void downfill()
     {
           
           downfill.click();
     }
     
     public void waterresistent()
     {
           
           waterresistent.click();
     }
     
     public void flex()
     {
           
           flex.click();
     }
     
     public void weatherrated()
     {
           
           weatherrated.click();
     }
     public void primaloft()
     {
           
           primaloft.click();
     }
     public void recyclerfiber()
     {
           recycledfiber.click();
           
     }
     
     public void clearall()
     {
           clearAll.click();
           
     }
     public void apply()
     {
           apply.click();
           
     }
	
      //Click on editfilter
     public void editFilter()
     {
        
    	 edit_filter.click();
           
           
     }
     
     //Click on Group&sort
     public void groupAndSort ()
     {
           group_sort.click();
           
     }
     
     //Click on  group By
     public void groupBy(int option)
     {
          
    	 WebdriverActions.selectOptionInListbox(groupBy, option);
           
     }
     //Click on first sort By
     public void firstSortBy(int option)
     {
      WebdriverActions.selectOptionInListbox(first_sortBy, option);
           
     }
     //Click on second sort By
     public void SecondSortBy(int option)
     {
    	  WebdriverActions.selectOptionInListbox(second_sortBy, option);
           
     }
     //Click on Third sort By
     public void ThirdSortBy(int option)
     {
    	 WebdriverActions.selectOptionInListbox(third_sortBy, option);
           
     }
     // Click on forth sort By
     
     public void ForthSortBy(int option)
     {
    	 WebdriverActions.selectOptionInListbox(forth_sortBy, option);
           
     }
     
     //click on group and sort apply button
     public void Group_sortapplyButton()
     {
           group_sort_applyButton.click();
           
     }
    //click on group and sort cancel button
     
     public void Group_sortCancelButton()
     {
           group_sort_cancelButton.click();
           
     }
     
     //Click on List view
     
     public void ListView()
     {
          List_view.click();
           
     }
     
     //Click on Recap view
     
     public void RecapView()
     {
           recap_view.click();
           
     }
     //Click on Top 10 view
     public void Top10View()
     {
           top10view.click();
           
     }
     
     //Click on Top10 list view
     public void Top10(int option)
     {
           WebdriverActions.selectOptionInListbox(top10, option);
           
     }
     //Select style
     public void style(int option)
     {
    	 WebdriverActions.selectOptionInListbox(top10Style, option);
           
     }
     // select retails
     public void retail(int option)
     {
    	 WebdriverActions.selectOptionInListbox(Retail_wholesale, option);
           
     }
     // Click on Top10 Style export to excel
     public void Top10ExportToExcel()
     {
           top10_exportToexcel.click();
           
     }
     // Click on Top10 close button
     public void Top10Closebutton()
     {
          top10Closebutton.click();
           
     }
     // click on product collection export to excel
     public void exportToexcel()
     {
           exportToexcel.click();
           
     }
     //Click on click on create assortment
     public void createAsssortment()
     {
           create_assortment.click();
           
     }
     
     //Click on save assortment name
     public void SaveAssortmentName()
     {
           save_assortment_name.sendKeys(RandomStringUtils.randomAlphabetic(5));
           
     }
     
     //Click on save assortment save button
     public void SaveAssortmentSaveButton()
     {
           save_assortment_saveButton.click();
           
     }
     
     //Click on save Assortment close button
     public void SaveAssortmentCloseButton()
     {
           save_assortment_closeButton.click();
           
     } 
     
     
     //Click on No product search Ok button
     public void NoProductSerachOkButton()
     {
           No_product_to_create_product_collection.click();
           
     } 
     
   //Click on No product collection close button
     public void productCollectionCloseButton()
     {
           product_collection_closeButton.click();
           
     } 
	
	
	
	
	

}
