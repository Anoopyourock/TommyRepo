package com.visulon.pom;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class CreateAssortment 
{
	WebDriver driver;
	@FindBy(id="btnNewAssortment")
	private WebElement NewAssortment;
	@FindBy(id="txtDocumentName")
	private WebElement DocumentName;
	@FindBy(id="ddlFiscalYear_CreatePopup")
	private WebElement Fiscalyear;
	@FindBy(xpath="//div[text()='Summer']")
	private WebElement Season;
	@FindBy(id="ddlASrtMilestones")
	private WebElement Milestone;
	@FindBy(id="personal")
	private WebElement Private;
	@FindBy(id="ddlPageSize")
	private WebElement PageSize;
	@FindBy(id="Page_Landscape")
	private WebElement Landscape;
	@FindBy(id="chkIsStandard")
	private WebElement GlobalAssortment;
	@FindBy(id="radio_WithoutProducts")
	private WebElement WhiteBoardProducts;
	@FindBy(id="chkIsWithAttrBox")
	private WebElement WithAttributeBox;
	@FindBy(id="radio_AttrBoxDefaultTheme")
	private WebElement AttributeBoxdefaulttheme;
	@FindBy(id="rbCreateWithCoverDivider")
	private WebElement withcoveranddivider;
	@FindBy(id="rbCreateWithCover")
	private WebElement withcover;
	@FindBy(id="rbCreateWithoutCoverDivider")
	private WebElement withoutcoverandDivider;
	@FindBy(id="btnCreateDocument")
	private WebElement create;
	
	public CreateAssortment(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonAssortment()
	{
		NewAssortment.click();
	}
	public void documentname()
	{
	DocumentName.sendKeys(RandomStringUtils.randomAlphabetic(5));
	}
	
	public void selectFiscalyear(int option)
	{
		WebdriverActions.selectOptionInListbox(Fiscalyear, option);
	}
	
	public void clickSeason()
	{
		Season.click();
	}
	public void selectMilestone(int option)
	{
		WebdriverActions.selectOptionInListbox(Milestone, option);
	}
	public void selectprivacy()
	{
		Private.click();
	}
	
	public void Selectpagesize(int option)
	{
		WebdriverActions.selectOptionInListbox(PageSize, option);
	}
	public void Selectpageorientation()
	{
		Landscape.click();
	}
	
	public void clickonassortmenttype()
	{
		GlobalAssortment.click();
	}
	public void Selectwhiteboardproduct()
	{
		WhiteBoardProducts.click();
	}
	public void SelectwithAttributebox()
	{
		WithAttributeBox.click();
	}
	public void SelectAssortmenttype1()
	{
		withcoveranddivider.click();
	}
	public void SelectAssortmenttype2()
	{
		withcover.click();
	}
	public void SelectAssortmenttype3()
	{
		withoutcoverandDivider.click();
	}
	public void create()
	{
		create.click();
	}
}
