package com.visulon.pom.ArrangeMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.visulon.commonseleniumactions.WebdriverActions;

public class Arrange_Header_Footer 
{
	@FindBy(id="ContentPlaceHolder1_liFormatHeaderFooterIcon")
	private WebElement clickonheaderfooter;
	@FindBy(xpath="//label[text()='Preset Themes']")
	private WebElement PresetThemes;
	@FindBy(xpath="//label[text()='Preset Headers']")
	private WebElement PresetHeaders;
	@FindBy(xpath="//label[text()='Preset Footers']")
	private WebElement PresetFooters;
	@FindBy(xpath="//label[text()='Customize Header']")
	private WebElement CustomizeHeaders;
	@FindBy(xpath="//label[text()='Customize Footer']")
	private WebElement CustomizeFooters;
	@FindBy(xpath="//div[@presettype='preset1']")
	private WebElement Preset1;
	@FindBy(xpath="//div[@presettype='preset2']")
	private WebElement Preset2;
	@FindBy(xpath="//div[@presettype='preset3']")
	private WebElement Preset3;
	@FindBy(xpath="//div[@presettype='preset4']")
	private WebElement Preset4;
	@FindBy(xpath="//div[@presettype='preset5']")
	private WebElement Preset5;
	@FindBy(xpath="//div[@presettype='preset6']")
	private WebElement Preset6;
	@FindBy(xpath="//div[@presettype='preset7']")
	private WebElement Preset7;
	@FindBy(xpath="//div[@presettype='preset8']")
	private WebElement Preset8;
	@FindBy(xpath="//div[@presettype='hpreset1']")
	private WebElement PresetHeader1;
	@FindBy(xpath="//div[@presettype='hpreset2']")
	private WebElement PresetHeader2;
	@FindBy(xpath="//div[@presettype='hpreset3']")
	private WebElement PresetHeader3;
	@FindBy(xpath="//div[@presettype='hpreset4']")
	private WebElement PresetHeader4;
	@FindBy(xpath="//div[@presettype='hpreset5']")
	private WebElement PresetHeader5;
	@FindBy(xpath="//div[@presettype='hpreset6']")
	private WebElement PresetHeader6;
	@FindBy(xpath="//div[@presettype='hpreset7']")
	private WebElement PresetHeader7;
	@FindBy(xpath="//div[@presettype='fpreset1']")
	private WebElement PresetFooter1;
	@FindBy(xpath="//div[@presettype='fpreset2']")
	private WebElement PresetFooter2;
	@FindBy(xpath="//div[@presettype='fpreset3']")
	private WebElement PresetFooter3;
	@FindBy(xpath="//div[@presettype='fpreset4']")
	private WebElement PresetFooter4;
	@FindBy(xpath="//div[@presettype='fpreset5']")
	private WebElement PresetFooter5;
	@FindBy(xpath="//div[@presettype='fpreset6']")
	private WebElement PresetFooter6;
	@FindBy(xpath="//div[@presettype='fpreset7']")
	private WebElement PresetFooter7;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[1]")
	private WebElement CustomizeHeaderLeft;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[2]")
	private WebElement CustomizeHeaderCentre;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[3]")
	private WebElement CustomizeHeaderRight;
	@FindBy(id="chkShowHideHeader_HF")
	private WebElement Showhideheader;
	@FindBy(id="chkShowHideFooter_HF")
	private WebElement ShowhideFooter;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[4]")
	private WebElement CustomizeFooterLeft;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[5]")
	private WebElement CustomizeFooterCentre;
	@FindBy(xpath="(//div[@class='HFTextSec']//select)[6]")
	private WebElement CustomizeFooterRight;
	@FindBy(xpath="(//input[@value='Reset'])[2]")
	private WebElement Reset;
	@FindBy(xpath="(//input[@value='Apply Changes'])[2]")
	private WebElement Apply;
	
	public Arrange_Header_Footer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickonHeaderandFooter()
	{
		clickonheaderfooter.click();
	}
	
	public void clickonpresetThemes()
	{
		PresetThemes.click();
	}
	
	public void ClickonPresetHeaders()
	{
		PresetHeaders.click();
	}
	
	public void ClickonPresetFooters()
	{
		PresetFooters.click();
	}
	
	
	
	public void ClickonCustomizeFooters()
	{
		CustomizeFooters.click();
	}
	
	public void presetThemes1()
	{
		Preset1.click();
	}
	public void presetThemes2()
	{
		Preset2.click();
	}
	public void presetThemes3()
	{
		Preset3.click();
	}
	public void presetThemes4()
	{
		Preset4.click();
	}
	public void presetThemes5()
	{
		Preset5.click();
	}
	public void presetThemes6()
	{
		Preset6.click();
	}
	public void presetThemes7()
	{
		Preset7.click();
	}
	public void presetThemes8()
	{
		Preset8.click();
	}
	
	public void PresetHeaders1()
	{
		PresetHeader1.click();
	}
	public void PresetHeaders2()
	{
		PresetHeader2.click();
	}
	public void PresetHeaders3()
	{
		PresetHeader3.click();
	}
	public void PresetHeaders4()
	{
		PresetHeader4.click();
	}
	public void PresetHeaders5()
	{
		PresetHeader5.click();
	}
	public void PresetHeaders6()
	{
		PresetHeader6.click();
	}
	public void PresetHeaders7()
	{
		PresetHeader7.click();
	}
	
	public void PresetFooters1()
	{
	PresetFooter1.click();
	}
	public void PresetFooters2()
	{
	PresetFooter2.click();
	}
	public void PresetFooters3()
	{
	PresetFooter3.click();
	}
	public void PresetFooters4()
	{
	PresetFooter4.click();
	}
	public void PresetFooters5()
	{
	PresetFooter5.click();
	}
	public void PresetFooters6()
	{
	PresetFooter6.click();
	}
	public void PresetFooters7()
	{
	PresetFooter7.click();
	}
	
	public void ClickonCustomizeHeaders()
	{
		CustomizeHeaders.click();
	}
	
	public void Clickonshowandhide()
	{
		Showhideheader.click();
	}
	
	public void HeaderLeftSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeHeaderLeft, option);
	}
	public void HeaderRightSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeHeaderRight, option);
	}
	public void HeaderCenterSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeHeaderCentre, option);
	}
	
	
	public void ClickonCustomizeFooterHeader()
	{
		CustomizeFooters.click();
	}
	
	public void ClickonshowandhideFooter()
	{
		ShowhideFooter.click();
	}
	
	public void FooterLeftSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeFooterLeft, option);
	}
	public void FooterRightSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeFooterRight, option);
	}
	public void FooterCenterSection(int option)
	{
		WebdriverActions.selectOptionInListbox(CustomizeFooterCentre, option);
	}
	
	public void ClickonReset()
	{
		Reset.click();
	}
	
	public void ClickOnApply()
	{
		Apply.click();
	}
	
	
}
