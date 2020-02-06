package com.visulon.pom.TopandBottomMenus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class MiddleMenu {

	WebDriver driver;

	@FindBy(xpath = "//a[@alt='Save Assortment']")
	private WebElement save;

	@FindBy(xpath = "(//div[@id='DIVwhiteBoardTopButtonsID']//a)[2]")
	private WebElement Save_CustomTemplate;

	@FindBy(xpath = "(//input[@class='inputBox'])[2]")
	private WebElement saveAs_CustomTemplate_StyleName;

	@FindBy(xpath = "(//input[@value='Save'])[2]")
	private WebElement saveAs_CustomTemplate_SaveButton;

	@FindBy(xpath = "//div[@class='clsCustomAlertBtnDiv']//input[1]")
	private WebElement saveAs_CustomTemplate_Ok_Button;

	@FindBy(xpath = "//a[@alt='Change whiteboard color']")
	private WebElement change_WhiteboardColor;

	@FindBy(xpath = "//input[@value='RdbSingleColor']")
	private WebElement Single_Color;

	// idFrameColorPicker

	@FindBy(xpath = "//area[@alt='#FF33CC']")
	private WebElement Select_Single_color;

	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement Single_Color_Submit;

	@FindBy(xpath = "//input[@value='RdbGradiant']")
	private WebElement gradient;

	@FindBy(xpath = "(//area[@alt='#FFCCFF'])[1]")
	private WebElement Select_gradient_Color1;

	@FindBy(xpath = "(//area[@alt='#3366FF'])[2]")
	private WebElement Select_gradient_Color2;

	@FindBy(xpath = "//input[@type='button']")
	private WebElement gradient_Submit;

	@FindBy(xpath = "//a[@alt='Show/Hide Header Footer']")
	private WebElement Show_hide_header_footer;

	@FindBy(xpath = "//a[@id='liFinishBreif']/following-sibling::a[1]")
	private WebElement Add_buy_qty_table;

	@FindBy(xpath = "//a[@id='liAddQtyBuyTable']/following-sibling::a[1]")
	private WebElement Show_hide_attribute_Stickers;

	@FindBy(xpath = "//span[@class='WbSearchBtn']")
	private WebElement Search;

	@FindBy(xpath = "(//input[@type='search'])[2]")
	private WebElement Search_text;

	@FindBy(xpath = "//span[@id='spnWBSearchFindBtn']")
	private WebElement search_product;


	@FindBy(xpath = "(//a[@id='liSwimLane']//span)[1]")
	private WebElement add_remove_swimlanes;

	@FindBy(xpath = "(//span[text()='3'])[4]")
	private WebElement vertical_swimlanes;

	@FindBy(xpath = "(//span[@class='lblRadioDigitLabel lblRadioDigitLabelFas'])[1]")
	private WebElement vertical_swimlanes_deleteButton;

	@FindBy(xpath = "(//span[text()='4'])[5]")
	private WebElement horizontal_swimlanes;

	@FindBy(xpath = "(//span[@class='lblRadioDigitLabel lblRadioDigitLabelFas'])[2]")
	private WebElement horizontal_swimlanes_deleteButton;

	@FindBy(xpath = "//span[text()='Apply']")
	private WebElement applyButton;

	public MiddleMenu(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	// Click on save assortment

	public void save_Assortment() {

		save.click();
	}

	// Click on save custom template
	public void save_CustomTemplate() {

		Save_CustomTemplate.click();
	}

	// Click on saveAs custom template style name
	public void saveAs_CustomTemplate_StyleName(String value) {

		saveAs_CustomTemplate_StyleName.sendKeys(value);
	}

	// Click on saveAs custom template save button
	public void saveAs_CustomTemplate_SaveButton() {

		saveAs_CustomTemplate_SaveButton.click();
	}

	public void savAs_CustomTemplate_OkButton() {

		saveAs_CustomTemplate_Ok_Button.click();
	}

	// Click on change current whiteboard color
	public void Change_Whiteboard_Color() {
		change_WhiteboardColor.click();

	}

	// Click on Single color
	public void Single_Color() {
		Single_Color.click();

	}

	// Click on select single color
	public void Select_singlecolor() {
		driver.switchTo().frame("idFrameColorPicker");

		Select_Single_color.click();

	}

	// Click on Single color Submit button
	public void Single_color_submit() throws SikuliException 
	{
		
		WebdriverActions.Sikuliactions2(driver, "../Tommy/SikuliImages/SubmitButton.PNG");
	}

	// Click on Gradient color
	public void Gradient_Color() {
		gradient.click();

	}

	// Click on select Gradient color1
	public void Select_Gradietcolor1() {

		driver.switchTo().frame("idFrameGradiant");

		Select_gradient_Color1.click();

	}

	// Click on select Gradient color2
	public void Select_Gradietcolor2() {

		Select_gradient_Color2.click();

	}

	// Click on gradient submit button
	public void Gradient_color_submit() {
		driver.switchTo().frame("idFrameGradiant");
		gradient_Submit.click();
		driver.switchTo().defaultContent();
	}

	// Click on show hide header/footer
	public void show_hide_Header_Footer() {
		Show_hide_header_footer.click();

	}

	// Click on add_buy_qty_table
	public void add_buy_qty_table() {
		Add_buy_qty_table.click();

	}

	// Click on show hide _attribute sticker
	public void show_hide_Attribute_stickers() {
		Show_hide_attribute_Stickers.click();

	}

	// Click on search button
	public void Search() {
		Search.click();

	}

	// Click on Search text
	public void Search_text(String value) {

		Search_text.sendKeys(value);

	}

	// Click on search product button
	public void search_product() {

		search_product.click();
	}

	// Click on add and remove swim lanes
		public void Add_Remove_SwimLanes() {

			add_remove_swimlanes.click();

		}

		// Click on vertical swim lanes
		public void vertical_SwimLanes() {

			vertical_swimlanes.click();

		}

		// Click on horizontal swim lanes
		public void horizontal_SwimLanes() {

			horizontal_swimlanes.click();

		}
		
		
		public void apply_button()
		{
			
			
			applyButton.click();
		}

}
