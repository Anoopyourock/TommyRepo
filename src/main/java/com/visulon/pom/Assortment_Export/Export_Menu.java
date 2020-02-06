package com.visulon.pom.Assortment_Export;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Export_Menu 
{

WebDriver driver;
	
	@FindBy(xpath="//li[text()='Export']")
	private WebElement export;

	
	@FindBy(xpath="//li[@id='liAssortmentPDFExport']//input[1]")
	private WebElement PDF;
	
	
	@FindBy(xpath="//li[@id='liAssortmentPPTExport']//input[1]")
	private WebElement PPT;
	
	@FindBy(xpath="//li[@id='liAssortmentXLSExport']//input[1]")
	private WebElement Excel;
	
	@FindBy(xpath="(//div[@class='SATContent']//input)[1]")
	private WebElement Excel_SelectAllAttribute;
	
	@FindBy(xpath="((//input[@checked='checked'])[1]")
	private WebElement Excel_IncludeThumbnails;
	
	@FindBy(xpath="(//span[@class='SATContentCheckDiv']//input)[2]")
	private WebElement Excel_IncludeProductImages;
	
	@FindBy(xpath="//div[@class='SATFooter']//a[1]")
	private WebElement Excel_ExportToExcel;
	
	@FindBy(xpath="//li[@id='liExportImages']//input[1]")
	private WebElement exportImages;
	
	@FindBy(xpath="//li[@id='liForAssortment']//a[1]")
	private WebElement exportImages_fromFullAssortment;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk1000by1000']")
	private WebElement exportImages_fromFullAssortment_1000;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk500by500']")
	private WebElement exportImages_fromFullAssortment_500;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk400by400']")
	private WebElement exportImages_fromFullAssortment_400;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk210by210']")
	private WebElement exportImages_fromFullAssortment_210;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk140by140']")
	private WebElement exportImages_fromFullAssortment_140;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk70by70']")
	private WebElement exportImages_fromFullAssortment_70;
	
	
	@FindBy(xpath="//li[@id='liForThisPage']//a[1]")
	private WebElement exportImages_fromThisPage;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk1000by1000cp']")
	private WebElement exportImages_fromThisPage_1000;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk500by500cp']")
	private WebElement exportImages_fromThisPage_500;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk400by400cp']")
	private WebElement exportImages_fromThisPage_400;
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk210by210cp']")
	private WebElement exportImages_fromThisPage_210;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk140by140cp']")
	private WebElement exportImages_fromThisPage_140;
	
	
	@FindBy(xpath="//a[@id='ContentPlaceHolder1_lnk70by70cp']")
	private WebElement exportImages_fromThisPage_70;
	
	
	
	
	public Export_Menu(WebDriver driver) 
	{
	
		
		PageFactory.initElements(driver, this);
		
		this.driver=driver;
		
	}
	
   //Click on export menu
	public void exportMenu()
	{
		export.click();
		
	}
	
	
	//Click on Pdf menu
		public void exportPDF()
		{
			
			PDF.click();
		}
		
		//Click on export PPT
		public void exportPPT()
		{
			
			PPT.click();
			
		}
		
		//  Click on export Excel
		public void exportExcel()
		{
			
			Excel.click();
		}
		
		
		
		public void DesignExcelReport_IncludeProductsImages()
		{
			Excel_IncludeProductImages.click();
			Excel_ExportToExcel.click();
			
		}
		
		//Click on  export images
		public void exportImages()
		{
			
			WebdriverActions.mouseAction(driver, exportImages);
			
		}
		
		//Click on export images_full assortment 500*500
	
		public void exportImages_fromFullAssortment()
		{
			
			WebdriverActions.mouseAction(driver,exportImages_fromFullAssortment );
			exportImages_fromFullAssortment_500.click();
		}
		
		
		//Click on export images_full this page 500*500
		
			public void exportImages_fromThisPage()
			{
				
				WebdriverActions.mouse1Action(driver,exportImages_fromThisPage );
				exportImages_fromThisPage_500.click();
			}
			




      

}
