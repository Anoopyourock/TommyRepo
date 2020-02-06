package com.visulon.pom.TopandBottomMenus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class TopMenu 
{
     WebDriver driver;
	@FindBy(xpath = "//a[@id='btnRevHistory']//span[1]")
	private WebElement revision_history;

	@FindBy(xpath = "//span[@id='imgExportToExcelARH']")
	private WebElement revision_history_ExportToExcel;

	@FindBy(xpath = "//div[@class='modernPopup AssortmentRevisionHistoryWidth']//span[@class='modernPopupCloseIcon']")
	private WebElement revision_history_closeButton;

	@FindBy(xpath = "//a[@id='btnAsrtFullView']//span[1]")
	private WebElement full_view;

	@FindBy(xpath = "//div[@class='divFullScreenBtn divFullScreenBtnOpenAssortment']")
	private WebElement open_Assortment;

	// ifrmopenassortment

	@FindBy(xpath = "//li[@id='liMyDocuments']//a[1]")
	private WebElement My_assortment;

	@FindBy(xpath = "//li[@id='liGlobalStandardWorkbooks']//a[1]")
	private WebElement Global_assortment;

	@FindBy(xpath = "//ul[@id='ultabmodule']//span[1]")
	private WebElement Search;

	@FindBy(xpath = "(//div[@class='DivSearchTbl']//select)[1]")
	private WebElement Search_DocumentName;

	@FindBy(xpath = "(//input[@class='txtSearchKey'])[1]")
	private WebElement Search_ByName;

	@FindBy(xpath = "(//div[@class='DivSearchTbl']//input)[2]")
	private WebElement Search_search;

	@FindBy(xpath = "(//div[@class='DivSearchTbl']//input)[3]")
	private WebElement Search_reset;

	@FindBy(xpath = "//span[@title='Filter']")
	private WebElement filter;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement filter_CreatedByMe;

	@FindBy(xpath = "//input[@checked='checked']")
	private WebElement filter_Sharing_private;

	@FindBy(xpath = "(//input[@name='rbfiltershareing'])[2]")
	private WebElement filter_Sharing_team;

	@FindBy(xpath = "//input[@value='Spring']")
	private WebElement filter_Season_Spring;

	@FindBy(xpath = "//input[@value='Summer']")
	private WebElement filter_Season_Summer;

	@FindBy(xpath = "//input[@value='Fall']")
	private WebElement filter_Season_Fall;

	@FindBy(xpath = "//input[@value='Holiday']")
	private WebElement filter_Season_Holiday;

	@FindBy(xpath = "//input[@value='C+C']")
	private WebElement filter_milestones_c_c;;

	@FindBy(xpath = "//input[@value='Color Palletes']")
	private WebElement filter_milestones_color_Palletes;

	@FindBy(xpath = "//input[@value='Sketch Review']")
	private WebElement filter_milestones_sketch_Review;

	@FindBy(xpath = "//input[@value='CFT Sketch Review']")
	private WebElement filter_milestones_CFT_Sketch_Review;

	@FindBy(xpath = "//input[@value='CFT Sketch Review Showback']")
	private WebElement filter_milestones_CFT_Sketch_Review_showback;

	@FindBy(xpath = "//input[@value='Proto Review']")
	private WebElement filter_milestone_proto_Review;

	@FindBy(xpath = "//input[@value='CFT Proto Showback']")
	private WebElement filter_milestone_CFT_Proto_showback;

	@FindBy(xpath = "//input[@value='Buy Review FINAL']")
	private WebElement filter_milestone_buy_Review_FINAL;

	@FindBy(xpath = "(//input[@name='txtfilterprodcount'])[1]")
	private WebElement filter_Product_Count_Greater_than;

	@FindBy(xpath = "(//input[@name='txtfilterprodcount'])[2]")
	private WebElement filter_Product_Count_Less_than;

	@FindBy(xpath = "(//input[@name='txtfilterwhitboardcount'])[1]")
	private WebElement filter_whiteboard_Count_Greater_than;

	@FindBy(xpath = "(//input[@name='txtfilterwhitboardcount'])[2]")
	private WebElement filter_whiteboard_Count_Less_than;

	@FindBy(xpath = "//input[@value='Apply']")
	private WebElement filter_Apply;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement filter_Cancel;

	@FindBy(xpath = "//div[@id='divOpenAssortmentOuter']//div[@class='closePopup']")
	private WebElement open_Assortment_close;

	@FindBy(xpath = "(//div[@class='fullScreenBar']//div)[4]")
	private WebElement save_customer_assortment;

	@FindBy(xpath = "(//select[@class='input userColorDrop'])[2]")
	private WebElement create_Assortment_customer;

	@FindBy(xpath = "(//label[text()=' Selected Products ']/following::input)[3]")
	private WebElement create_Assortment_createButton;

	@FindBy(xpath = "(//input[@class='clsCustomAlertBtn btnCommonTow'])[1]")
	private WebElement No_Product_found_OkButton;

	@FindBy(xpath = "//span[text()=' Create assortment for ']/following-sibling::div[1]")
	private WebElement create_Assortment_closeButton;

	@FindBy(xpath = "(//div[@class='fullScreenBar']//div)[5]")
	private WebElement Add_picture;

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement select_Picture;

	@FindBy(xpath = "(//input[@value='Add'])[1]")
	private WebElement add_Button;

	@FindBy(xpath = "(//input[@type='submit'])[5]")
	private WebElement close_Button;

	@FindBy(xpath = "//div[@class='divFullScreenBtn divFullScreenBtnLogo']")
	private WebElement logos;

	@FindBy(xpath = "//span[@class='titleOfIcons']//img[1]")
	private WebElement other_arrow_button;

	@FindBy(xpath = "//div[@id='btnCreateWaterfall_FullView']/following-sibling::div[1]")
	private WebElement apply_standard_Themes;

	@FindBy(id = "btnShowHideAttrBox_FullView")
	private WebElement hide_Attribute;

	@FindBy(xpath = "//div[@class='divFullScreenBtn divFullScreenBtnAddCustomer']")
	private WebElement add_customer;

	@FindBy(xpath = "(//input[@name='radioAddCustomerToProducts'])[1]")
	private WebElement addTo_AllProduct;

	@FindBy(xpath = "(//input[@name='radioAddCustomerToProducts'])[2]")
	private WebElement addTo_SelectedProduct;

	@FindBy(xpath = "(//select[@class='input userColorDrop'])[1]")
	private WebElement select_customer;

	@FindBy(xpath = "(//table[@class='selectCustomer']//input)[3]")
	private WebElement add_button;

	@FindBy(xpath = "//input[@value='Remove']")
	private WebElement remove_Button;

	@FindBy(xpath = "//span[text()=' Select Customer ']/following-sibling::div[1]")
	private WebElement Select_Customer_close_button;

	@FindBy(id = "btnMarquee_FullView")
	private WebElement marquee;

	@FindBy(xpath = "(//a[@title='Fit to Screen.'])[1]")
	private WebElement fitToScreen;

	@FindBy(xpath = "(//a[@title='Reset Zoom'])[1]")
	private WebElement fitToWidth;

	@FindBy(xpath = "(//table[@id='Table2']//img)[1]")
	private WebElement firstPage;

	@FindBy(xpath = "(//table[@id='Table2']//img)[2]")
	private WebElement PrevPage;

	@FindBy(xpath = "(//table[@id='Table2']//img)[3]")
	private WebElement NextPage;

	@FindBy(xpath = "(//table[@id='Table2']//img)[4]")
	private WebElement LastPage;

	@FindBy(xpath = "//div[text()='Close']")
	private WebElement Close;
	
	
	@FindBy(xpath = "//a[@value='home']//span[1]")
	private WebElement home;

	
	public TopMenu(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	// Click on revision history

	public void Revision_History() {

		revision_history.click();
	}

	// Click on revision history export to excel

	public void Revision_History_ExportToExcel() {

		revision_history_ExportToExcel.click();
	}

	// Click on revision history close button

	public void Revision_History_CloseButton() {

		revision_history_closeButton.click();
	}
	
	public void Full_View()
	{
		
		full_view.click();
	}
	
	
	//Click on open assortment
		public void open_assortment()
		{
			open_Assortment.click();
			
		}
		
		
		public void global_assortment()
		{
			driver.switchTo().frame("ifrmopenassortment");
			Global_assortment.click();
			
		}
		
		public void Close_Button(String imagepath) throws SikuliException
		{
			WebdriverActions.Sikuliactions1(driver, imagepath);
			driver.switchTo().defaultContent();
		}
		
		// Click on save Customer assortment
		public void save_assortment() {
			save_customer_assortment.click();

		}

		// Click on create assortment

		public void create_AssortmentForCustomer(int option) {

			WebdriverActions.selectOptionInListbox(create_Assortment_customer, option);
		}

		// click on create button
		public void create_AssortmentforCustomer() {
			create_Assortment_createButton.click();

		}

		public void no_product_found() {

			No_Product_found_OkButton.click();

		}

		public void create_Assortment_closeButton() {
			create_Assortment_closeButton.click();

		}

		// Pictures

		public void ClickOnPictures() {

			Add_picture.click();
		}

		public void ClickonChooseFiles()
		{
			select_Picture.click();
		}
		
		// Addpicture Popup
		 public void EnterFilepath(String imagepath,String path) throws SikuliException  
		    {
		    	WebdriverActions.Sikuliactions(driver, imagepath, path);
		    	
		    }
		
		 public void clickonopenimage(String imagepath) throws SikuliException
		    {
		    	WebdriverActions.Sikuliactions1(driver, imagepath);
		    	
		    }
		 
		 //cickonadd button
		 public void ClikonAddButton()
		 {
			 add_Button.click();
		 }
		 
		// Close
		public void close_Button() {

			close_Button.click();
		}

		// Click on Logo
		public void ClickOnLogo() {

			logos.click();
		}

		// Select Logo

		public void selectLogo(String imagepath) throws SikuliException {
		

			WebdriverActions.Sikuliactions1(driver, imagepath);
		}

		// Click on arrow button
		public void ClickOnArrowButton() {
			other_arrow_button.click();

		}

		// Click on apply standard theme
		public void apply_Standard_Themes() {
			apply_standard_Themes.click();

		}

		// Click on hide attributes
		public void hide_Attributes() {
			hide_Attribute.click();

		}

		// Click On add to customer
		public void ClickOnCustomer() {

			add_customer.click();

		}

		// Click on all product
		public void SelectAllProduct() {
			addTo_AllProduct.click();

		}

		// Click on selectProduct
		public void SelectProduct() {
			addTo_SelectedProduct.click();

		}

		// Click on customer
		public void SelectCustomer(int option) {
			WebdriverActions.selectOptionInListbox(select_customer, option);

		}

		// Clcik on add button
		public void addButton() {
			add_button.click();

		}

		// Click on remove button
		public void removeButton() {
			remove_Button.click();

		}

		// Click on close button
		public void closeButton(String imagepath) throws SikuliException {
			WebdriverActions.Sikuliactions1(driver, imagepath);
			
			
		}

		// Click on marquee

		public void ClickOnMarquee() {

			marquee.click();
		}

		public void FitToScreen() {

			fitToScreen.click();
		}

		public void FitToWidth() {

			fitToWidth.click();
		}

		public void Navigation_firstpage() {

			firstPage.click();
		}

		public void Navigation_prevpage() {

			PrevPage.click();
		}

		public void Navigation_nextpage() {

			NextPage.click();
		}

		public void Navigation_lastpage() {

			LastPage.click();
		}

		public void Close() {
			Close.click();

		}
		
		// Click on Home button
		public void home() {
			home.click();
		}	
}
