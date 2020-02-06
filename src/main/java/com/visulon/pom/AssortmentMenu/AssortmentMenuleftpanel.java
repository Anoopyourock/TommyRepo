package com.visulon.pom.AssortmentMenu;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebElementsActions;
import com.visulon.commonseleniumactions.WebdriverActions;

public class AssortmentMenuleftpanel 
{
	
	WebDriver driver;
	@FindBy(id="showHideLeftPanel")
	private WebElement leftpanel;
	@FindBy(linkText="Product Search")
	private WebElement ProductSearch;
	@FindBy(linkText="File Import")
	private WebElement FileImport;
	@FindBy(id="imgSearch")
	private WebElement Hierarchysearch;
	@FindBy(id="ContentPlaceHolder1_txtSearch")
	private WebElement QuickSearch;
	@FindBy(id="ContentPlaceHolder1_btnSearch")
	private WebElement Quicksearchbutton;
	@FindBy(xpath="(//div[@class='showMultipleProductsPopUp']//div)[2]")
	private WebElement Sort;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[1]")
	private WebElement Style;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[2]")
	private WebElement StyleName;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[3]")
	private WebElement ColorName;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[4]")
	private WebElement ColorFamily;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[5]")
	private WebElement Gender;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[6]")
	private WebElement CADoorGroup;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[7]")
	private WebElement USdoorGroup;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[8]")
	private WebElement Fixture;
	@FindBy(xpath="(//a[@href='javascript:void(0)'])[9]")
	private WebElement Zone;
	@FindBy(id="btnSelectAllProduts")
	private WebElement SelectAll;
	@FindBy(xpath="//input[@value='Select Multiple']")
	private WebElement SelectMultiple;
	@FindBy(id="btnShowProductfilter_MultiSelect")
	private WebElement Filter;
	@FindBy(id="btnOk_MultiplePro")
	private WebElement Continue;
	@FindBy(id="btnCancel_MultiplePro")
	private WebElement Cancel;
	@FindAll({@FindBy(xpath="//input[@class='chkProductImage']")})
	private List<WebElement> countoftotalproducts;
	@FindBy(className="assSortImg")
	private WebElement Sortsearchproducts;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_885']")
	private WebElement SortsearchproductbyStyle;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_886']")
	private WebElement SortsearchproductbyStyleName;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_887']")
	private WebElement Sortsearchproductbycolorname;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_888']")
	private WebElement SortsearchproductbyColorfamily;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_889']")
	private WebElement SortsearchproductbyGender;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_890']")
	private WebElement SortsearchproductbyCADoorGroup;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_891']")
	private WebElement SortsearchproductbyUSDoorGroup;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_892']")
	private WebElement SortsearchproductbyFixtures;
	@FindBy(xpath="//div[@id='ContentPlaceHolder1_pnlSortSearch']//li[@id='ContentPlaceHolder1_liSS_893']")
	private WebElement SortsearchproductbyZone;
	@FindBy(id="btnShowProductFilterDiv")
	private WebElement Filtersearchproduct;
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[1]")
	private WebElement Filtersearchproductwithimage;
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[2]")
	private WebElement Filtersearchproductwithoutimage;
	@FindBy(xpath="(//span[@class='clearFilter'])[2]")
	private WebElement Productsimageclear;
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[3]")
	private WebElement FilterbyCAunitsgreaterthanzero;
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[4]")
	private WebElement FilterbyUSunitsgreaterthanzero;
	@FindBy(xpath="(//span[@class='filterChk__indicator'])[5]")
	private WebElement FilterwithhangtagWicking;
	@FindBy(xpath="//input[@id='FltrChk_d3']/following-sibling::span[1]")
	private WebElement FilterwithhangtagSustainable;
	//input[@id='FltrChk_d4']/following-sibling::span[1]
	@FindBy(xpath="//input[@id='FltrChk_d4']/following-sibling::span[1]")
	private WebElement FilterwithhangtagDownFill;
	@FindBy(xpath="//input[@id='FltrChk_d5']/following-sibling::span[1]")
	private WebElement FilterwithhangtagWaterResistance;
	@FindBy(xpath="//input[@id='FltrChk_d6']/following-sibling::span[1]")
	private WebElement FilterwithhangtagFlex;
	@FindBy(xpath="//input[@id='FltrChk_d7']/following-sibling::span[1]")
	private WebElement FilterwithhangtagWeatherrated;
	@FindBy(xpath="//input[@id='FltrChk_d8']/following-sibling::span[1]")
	private WebElement FilterwithhangtagPrimaloft;
	@FindBy(xpath="//input[@id='FltrChk_d9']/following-sibling::span[1]")
	private WebElement FilterwithhangtagRecycledFiber;
	@FindBy(xpath="(//input[@value='Apply'])[1]")
	private WebElement Filterapply;
	@FindBy(xpath="//span[text()='Clear All']")
	private WebElement Filterclearall;
	@FindBy(xpath="//span[@class='filterSectionClear']/following-sibling::div[1]")
	private WebElement Filtercancel;
	@FindBy(id="ContentPlaceHolder1_mediumSIzeBtnIconId")
	private WebElement SelectMediumsize;
	@FindBy(id="ContentPlaceHolder1_largSIzeBtnIconId")
	private WebElement SelectLongsize;
	@FindBy(id="ContentPlaceHolder1_XlargSIzeBtnIconId")
	private WebElement SelectXLsize;
	@FindBy(id="btnLeftWhiteboardPanel")
	private WebElement WhiteBoards;
	@FindBy(xpath="(//div[@class='LeftThumbDiveWraperDiv'])[]")
	private WebElement navigateWhiteBoards;
	@FindBy(xpath="//div[@id='ThumbnailViewClose']//span[1]")
	private WebElement closeWhiteBoards;
	
	public AssortmentMenuleftpanel(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	//click on left panel
	public void clickonleftpanel()
	{
		leftpanel.click();
	}
	//click on product search
	public void clickonProductsearch()
	{
		ProductSearch.click();
	}
	//click on file import
	public void clickonfileimport()
	{
		FileImport.click();
	}
	//click on search Hierarchy
	public void clickonHierarchysearch()
	{
		Hierarchysearch.click();
	}
	//enter quick search text
	public void EnterQuicksearchtext(String text)
	{
		QuickSearch.sendKeys(text);
	}
	//click on quick search button
	public void clickonquicksearchbutton()
	{
		Quicksearchbutton.click();
		
	}
	
	
	//Quick search products opens
	//Quick search products sort
		public void clickSortButton()
		{
			WebdriverActions.mouseAction(driver, Sort);
		}
		public void sortbyStyle()
		{
			Style.click();
		}
		public void sortbyStyleName()
		{
			StyleName.click();
		}
		public void sortbycolorName()
		{
			ColorName.click();
		}
		public void sortbycolorfamily()
		{
			ColorFamily.click();
		}
		public void sortbyGender()
		{
			Gender.click();
		}
		public void sortbyCAdoorgroup()
		{
			CADoorGroup.click();
		}
		public void sortbyUSdoorgroup()
		{
			USdoorGroup.click();
		}
		public void sortbyFixtures()
		{
			Fixture.click();
		}
		public void sortbyzone()
		{
			Zone.click();
		}
		
	//select all product
	public void SelectAllproduct()
	{
		SelectAll.click();
		WebElementsActions.handleAlert(driver);
	}
	//select multiple product
	public void SelectMultiple()
	{
		SelectMultiple.click();
	}
	//click on filter in quick search products
	public void ClickonFilter()
	{
		Filter.click();
	}
	//quick seqarch filters
	public void SearchProductwithimages()
	{
		Filtersearchproductwithimage.click();
	}
	public void SearchProductwithoutimages()
	{
		Filtersearchproductwithoutimage.click();
	}
	public void SearchProductwithCAUnits()
	{
		FilterbyCAunitsgreaterthanzero.click();
	}
	public void SearchProductwithUSUnits()
	{
		FilterbyUSunitsgreaterthanzero.click();
	}
	public void HangtagwithWicking()
	{
		FilterwithhangtagWicking.click();
	}
	public void HangtagwithSustainable()
	{
		FilterwithhangtagSustainable.click();
	}
	public void HangtagwithDownFill()
	{
		FilterwithhangtagDownFill.click();
	}
	public void HangtagwithWaterResistance()
	{
		FilterwithhangtagWaterResistance.click();
	}
	public void HangtagwithFlex()
	{
		FilterwithhangtagFlex.click();
	}
	public void HangtagwithWetherRated()
	{
		FilterwithhangtagWeatherrated.click();
	}
	public void HangtagwithPrimaLoft()
	{
		FilterwithhangtagPrimaloft.click();
	}
	public void HangtagwithRecycled()
	{
		FilterwithhangtagRecycledFiber.click();
	}
	//filter clear all option
	public void Clickonclearall()
	{
		Filterclearall.click();
	}
	//filter click apply 
	public void clickonApply()
	{
		Filterapply.click();
	}
	//click on cancel in filter
	public void clickoncancel()
	{
		Filtercancel.click();
	}
	//click on clear on filter
	public void Clickonclear()
	{
		Productsimageclear.click();
	}
	//click on continue in quick search
	public void Clickoncontinue()
	{
		Continue.click();
	}
	//click on cancel in quick search
	public void Cancel()
	{
		Cancel.click();
	}
	
	
	
	
	//Search Products sorting in left panel
		public void clickSortsearchButton()
		{
			WebdriverActions.mouseAction(driver, Sortsearchproducts);
		}
		public void sortsearchbyStyle()
		{
			SortsearchproductbyStyle.click();
		}
		public void sortsearchbyStyleName()
		{
			SortsearchproductbyStyleName.click();
		}
		public void sortsearchbycolorName()
		{
			Sortsearchproductbycolorname.click();
		}
		public void sortsearchbycolorfamily()
		{
			SortsearchproductbyColorfamily.click();
		}
		public void sortsearchbyGender()
		{
			SortsearchproductbyGender.click();
		}
		public void sortsearchbyCAdoorgroup()
		{
			SortsearchproductbyCADoorGroup.click();
		}
		public void sortsearchbyUSdoorgroup()
		{
			SortsearchproductbyUSDoorGroup.click();
		}
		public void sortsearchbyFixtures()
		{
			SortsearchproductbyFixtures.click();
		}
		public void sortsearchbyzone()
		{
			SortsearchproductbyZone.click();
		}
	
	//Size of products in search box in left panel
		public void clickonmediumsize()
		{
			SelectMediumsize.click();
		}
		public void clickonLargesize()
		{
			SelectLongsize.click();
		}
		public void clickonExtraLargesize()
		{
			SelectXLsize.click();
		}
	//search products
		public void selectproducts(int x)
		{
			System.out.println(countoftotalproducts.size());
			for (int i=0;i<=x;i++)
			{
				countoftotalproducts.get(i).click();
			}
			
		}
		
	
}
