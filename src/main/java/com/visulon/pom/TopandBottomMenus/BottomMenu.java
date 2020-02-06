package com.visulon.pom.TopandBottomMenus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class BottomMenu {

	WebDriver driver;
	@FindBy(xpath = "(//div[@class='viewTypeBtns']//a)[1]")
	private WebElement presentation_mode;

	@FindBy(xpath = "//div[@id='divProductImageBtn']//img[1]")
	private WebElement view_productImages;

	@FindBy(xpath = "//div[@id='divProductPageBtn']//img[1]")
	private WebElement view_page;

	@FindBy(xpath = "//div[@id='divProductInfoBtn']//img[1]")
	private WebElement view_productInfo;

	@FindBy(xpath = "//div[@id='preZoomMainDiv']/following-sibling::div[1]")
	private WebElement Slider_nextButton;

	@FindBy(xpath = "//div[@class='btnOptionPreMode']/following-sibling::div[1]")
	private WebElement Slider_prevButton;

	@FindBy(xpath = "(//span[@class='btnFullView'])[1]")
	private WebElement view_originalImage;

	@FindBy(xpath = "(//div[@class='FVPBtnDiv']//div)[4]")
	private WebElement fit_To_screen;

	@FindBy(xpath = "(//div[@class='FVPBtnDiv']//div)[5]")
	private WebElement product_originalImages;

	@FindBy(xpath = "//div[@id='divfullimg17']/following-sibling::div[1]")
	private WebElement Change_BackgroundColor;

	@FindBy(xpath = "//div[@id='divBtn_DownloadBlueIImage']//a[1]")
	private WebElement Download_CurrentImage;

	@FindBy(xpath = "(//div[@class='closePopup'])[5]")
	private WebElement productname_closePopup;

	@FindBy(xpath = "//div[@class='divPagePreviewNxt']//img[1]")
	private WebElement page_nextButton;

	@FindBy(xpath = "//div[@class='divPagePreviewPre']//img[1]")
	private WebElement page_PrevButton;

	@FindBy(xpath = "//div[@id='divProductPopUpClose']//span[1]")
	private WebElement product_display_CloseButton;

	@FindBy(xpath = "(//div[@class='FVPBtnDiv']//div)[2]")
	private WebElement Zoom_in;

	@FindBy(xpath = "(//div[@class='FVPBtnDiv']//div)[3]")
	private WebElement zoom_out;

	@FindBy(xpath = "(//div[@class='viewTypeBtns']//a)[2]")
	private WebElement last_actions;

	@FindBy(xpath = "(//div[@class='viewTypeBtns']//a)[3]")
	private WebElement product_statistics;

	@FindBy(xpath = "(//label[@class='addCustomerToRadio']//input)[3]")
	private WebElement currentPage_product;

	@FindBy(xpath = "(//label[text()=' Current Page Products ']/following::input)[1]")
	private WebElement assortment_products;

	@FindBy(xpath = "//div[@id='divPopupProductStatistics']//span[@class='modernPopupCloseIcon']")
	private WebElement product_statistics_closeButton;

	@FindBy(xpath = "//div[@id='aShowAssortmentAnalytics']//button[1]")
	private WebElement product_analytics;

	@FindBy(xpath = "(//div[@class='drpAna-content']//a)[3]")
	private WebElement product_analytics_pie_chart;

	@FindBy(xpath = "(//div[@class='drpAna-content']//a)[2]")
	private WebElement product_analytics_bar_chart;

	@FindBy(xpath= "//div[@class='drpAna-content']//a[1]")
	private WebElement product_analytics_table_format;

	@FindBy(xpath = "//img[@alt='Export to Excel']")
	private WebElement product_analytics_table_format_exportToExcel;

	@FindBy(xpath = "//img[@alternatetext='Export to PDF']")
	private WebElement product_analytics_table_format_exportToPDF;

	@FindBy(xpath = "(//select[@class='input dropdownMain'])[2]")
	private WebElement product_analytics_select_category;

	@FindBy(xpath = "//div[@id='divPopupAssortmentAnalytics']//div[@class='closePopup']")
	private WebElement product_analytics_close_button;

	
	@FindBy(id = "aShowHideTopMenu")
	private WebElement Show_Hide_TopPanel;

	@FindBy(id = "aShowHideLeftMenu")
	private WebElement Show_Hide_LeftPanel;

	@FindBy(id = "aFitEBToScreen")
	private WebElement FitToScreen;

	@FindBy(id = "aFitEBToScreenWidthWise")
	private WebElement FitToWidth;

	@FindBy(xpath = "//div[@class='sliderPercent']//select[1]")
	private WebElement minbeds;

	@FindBy(xpath = "//div[@id='slider-range-max']//div[1]")
	private WebElement Slider_Bar;
	public BottomMenu(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	// Click on presentation mode

	public void presentation_mode() {

		presentation_mode.click();
	}

	// Click on presentation mode_view product images

	public void presentation_mode_view_ProductImages() {

		view_productImages.click();
	}

	// Click on presentation mode _view page

	public void presentation_mode_view_Page() {

		view_page.click();
	}

	// Click on presentation mode _view product info

	public void presentation_mode_view_ProductInfo() {

		view_productInfo.click();
	}

	// Click on presentation mode Slider nextbutton

	public void presentation_mode_SliderImage_nextButton() {

		Slider_nextButton.click();
	}

	// Click on presentation mode Slider prevbutton

	public void presentation_mode_SliderImage_prevButton() {

		Slider_prevButton.click();
	}

	// Click on presentation mode view original iamges

	public void presentation_mode_view_OriginalImage() {

		view_originalImage.click();
	}

	// Zoom in

	public void zoom_in() {

		Zoom_in.click();
		;

	}
	// To zoom out 3 times

	public void zoom_out() {

		zoom_out.click();
		;
	}

	// Click on fit to screen
	public void FItTOScreen() {

		fit_To_screen.click();
	}

	// Click on product name view original images
	public void product_OriginalImages() {

		product_originalImages.click();
	}

	// Click on product name change background color
	public void Change_Background() {

		Change_BackgroundColor.click();
	}

	// Click on product name download images
	public void product_DownloadImages() {

		Download_CurrentImage.click();
	}

	// Click on product name close button
	public void product_name_closeButton() {

		productname_closePopup.click();
	}

	// Click on page next button
	public void page_nextButton() {

		page_nextButton.click();
	}

	// Click on page prev button
	public void page_prevButton() {

		page_PrevButton.click();
	}

	// Click on product display close popup button
	public void product_Display_CloseButton() {

		product_display_CloseButton.click();
	}

	// Click on last actions
	public void Last_Actions() {
		last_actions.click();

	}

	// click on product statistics

	public void Product_statistics() {
		product_statistics.click();

	}

	// click on product statistics Assortment product

	public void Product_statistics_assortmentProduct() {
		assortment_products.click();

	}

	// click on product statistics close button

	public void Product_statistics_closeButton() {
		product_statistics_closeButton.click();

	}

	// click on Product analytics
	public void Product_Analytics() {
		WebdriverActions.mouseAction(driver, product_analytics);

	}

	// click on Product analytics_pie Chart
	public void Product_Analytics_Pie_Chart() 
	{
		WebdriverActions.mouseAction(driver, product_analytics_pie_chart);
		product_analytics_pie_chart.click();

	}

	// click on Product analytics_pie Chart_select_category
	public void Product_Analytics_Pie_Chart_Select_category(int option) {
		WebdriverActions.selectOptionInListbox(product_analytics_select_category, option);

	}

	// click on Product analytics_bar Chart
	public void Product_Analytics_Bar_Chart() {
		
		WebdriverActions.mouseAction(driver, product_analytics_bar_chart);
		product_analytics_bar_chart.click();

	}

	// click on Product analytics_table format
	public void Product_Analytics_Table_format() {
		WebdriverActions.mouseAction(driver, product_analytics_table_format);
		product_analytics_table_format.click();

	}

	// click on Product analytics_table format_ExportToExcel
	public void Product_Analytics_Table_format_ExportToExcel() {
		product_analytics_table_format_exportToExcel.click();

	}

	// click on Product analytics_table format_ExportToPDF
	public void Product_Analytics_Table_format_ExportToPDF() {
		product_analytics_table_format_exportToPDF.click();

	}

	// click on Product analytics close Button
	public void Product_Analytics_closeButton() {
		product_analytics_close_button.click();

	}

	
	// Click on show/hide top panel
		public void Show_hide_topPanel() {

			Show_Hide_TopPanel.click();
		}

		// Click on show/hide Left panel
		public void Show_hide_leftPanel() {

			Show_Hide_LeftPanel.click();
		}

		// Click on fit to screen
		public void FitToScreen() {

			FitToScreen.click();
		}

		// Click on fit to width
		public void FitToWidth() {

			FitToWidth.click();
		}
		
		
		//Click on minbeds
		public void minbeds(int option)
		{
			WebdriverActions.selectOptionInListbox(minbeds, option);
			
		}
		
		//Click on sliderbar
	    public void Slider_Bar() throws InterruptedException
	    {
	    	WebdriverActions.mouse3Action(driver, Slider_Bar);
	    	
	    }

}
