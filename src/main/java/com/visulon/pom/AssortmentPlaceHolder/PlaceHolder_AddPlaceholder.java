package com.visulon.pom.AssortmentPlaceHolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;
import com.visulon.commonseleniumactions.WebdriverActions;

public class PlaceHolder_AddPlaceholder
{
	WebDriver driver;
	@FindBy(xpath="//li[@id='liAddEditPlaceholder']//input[1]")
	private WebElement AddPlaceHolder;
	@FindBy(xpath="(//select[@class='AEPInput'])[1]")
	private WebElement BusinessWorkingGroup;
	@FindBy(xpath="(//select[@class='AEPInput'])[2]")
	private WebElement Gender;
	@FindBy(xpath="(//select[@class='AEPInput'])[3]")
	private WebElement Department;
	@FindBy(xpath="//input[@label='Company']")
	private WebElement Company;
	@FindBy(xpath="	//input[@label='US INDC']")
	private WebElement USINDC;
	@FindBy(xpath="(//input[@type='file'])[5]")
	private WebElement ChooseFile;
	@FindBy(xpath="chkPlaceHolderPreferences")
	private WebElement SaveAsUserPrefrence;
	@FindBy(xpath="(//div[text()='Save'])[1]")
	private WebElement Clickonsave;
	
	public PlaceHolder_AddPlaceholder(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
			
	public void clickonAddPlaceHolder()
	{
		WebdriverActions.mouseAction(driver, AddPlaceHolder);
		AddPlaceHolder.click();
	}
	
	public void SelectBusinessGroup(int option)
	{
		WebdriverActions.selectOptionInListbox(BusinessWorkingGroup, option);
	}
	
	public void SelectGender(int option)
	{
		WebdriverActions.selectOptionInListbox(Gender, option);
	}
	
	public void SelectDepartment(int option)
	{
		WebdriverActions.selectOptionInListbox(Department, option);
	}
	
	public void EnterComapnyName(String Text)
	{
		Company.clear();
		Company.sendKeys(Text);
	}
	
	public void EnterUSINDCName(String Text)
	{
		USINDC.sendKeys(Text);
	}
	
	public void clickonChooseImage()
	{
		ChooseFile.click();
	}
	public void ProductImage(String imagepath,String  value) throws SikuliException
	{
		WebdriverActions.Sikuliactions(driver, imagepath, value);
	}
	 
	public void ClickonOKButton(String imagepath) throws SikuliException
	{
		WebdriverActions.Sikuliactions1(driver, imagepath);
	}
	public void ClickOnsaveasUserPrefrence()
	{
		SaveAsUserPrefrence.click();
	}
	public void clickonSave()
	{
		Clickonsave.click();
	}
	
						
	
	
	
	
}
