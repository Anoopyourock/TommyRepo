package com.visulon.pom.Assortment_View;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Assortment_View_FlipPreview 
{
	WebDriver driver;

	@FindBy(xpath="//li[@id='liAssortmentPreview']//input[1]")
	private WebElement flippreview;
	
	@FindBy(xpath="//img[@alt='Home']")
	private WebElement home_button;
	
	
	@FindBy(xpath="//a[@class='btn btn-default']")
	private WebElement back_button;
	
	@FindBy(xpath="(//img[@id='img2'])[1]")
	private WebElement print_button;
	
	
	@FindBy(xpath="//img[@title='Share Assortment']")
	private WebElement share_button;
	
	
	@FindBy(xpath="(//select[@class='dropBox'])[1]")
	private WebElement share_GroupName;
	
	
	@FindBy(id="ddlSelectEmailId")
	private WebElement share__SelectEmailID;
	
	@FindBy(xpath="//textarea[@rows='2']")
	private WebElement share_EmailIds;
	
	
	@FindBy(linkText="Send Email")
	private WebElement share_sendEmail;
	
	
	@FindBy(xpath="//input[@title='Export to PDF']")
	private WebElement ExportToPDF;
	
	@FindBy(xpath="(//input[@type='image'])[2]")
	private WebElement thumbnails;
	
	
	@FindBy(xpath="//img[@title='Presentation View']")
	private WebElement thumbnails_PresentationView;
	
	@FindBy(xpath="//div[@id='divProductImageBtn']//img[1]")
	private WebElement thumbnails_PresentationView_ViewProductImages;
	
	@FindBy(xpath="//div[@id='divProductInfoBtn']//img[1]")
	private WebElement thumbnails_PresentationView_ViewProductInfo;
	
	@FindBy(xpath="//div[@title='Close']//span[1]")
	private WebElement thumbnails_PresentationView_CloseButton;
	
	@FindBy(xpath="//img[@title='Flip Preview']")
	private WebElement thumbnails_FlipPreview;
	
	@FindBy(xpath="(//a[@title='Export to PDF'])[1]")
	private WebElement catalouge_ExportToPDF;
	
	@FindBy(xpath="//td[@class='workbookNextPageBtnTd']//img[1]")
	private WebElement catalouge_RightButton;
	
	
	@FindBy(xpath="//td[@class='workbookPrevPageBtnTd']//img[1]")
	private WebElement catalouge_LeftButton;


	public Assortment_View_FlipPreview(WebDriver driver) 
	{
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	// click on flip preview
	public void FlipPreview()
	{
		
		flippreview.click();
	}
			
	//Click on share button
	public void shareIcon(int option,String value,String imagepath) throws InterruptedException, SikuliException
	{
		share_button.click();
		Thread.sleep(3000);
		WebdriverActions.selectOptionInListbox(share_GroupName, option);
		Thread.sleep(3000);
		share_EmailIds.sendKeys(value);
		Thread.sleep(3000);
		share_sendEmail.click();
		Thread.sleep(3000);
		WebdriverActions.Sikuliactions1(driver, imagepath);
		Thread.sleep(3000);
		
	}
	// Click on ExportToPDF
	
	public void ExportToPDF()
	{
		ExportToPDF.click();
		
	}
	
	// Click on ThumbnailView
	
	public void ThumbnailView()
	{
		
		thumbnails.click();
		
		
	}
	// Click on Thumbnail_Presentation View
	
		public void ThumbnailView_PresentationView()
		{
			
		thumbnails_PresentationView.click();
	    thumbnails_PresentationView_ViewProductImages.click();
		thumbnails_PresentationView_ViewProductInfo.click();
		thumbnails_PresentationView_CloseButton.click();
			
		}
		
		// Click on Thumbnail_Flip preview
		
		public void ThumbnailView_FlipPreview()
		{
			
			thumbnails_FlipPreview.click();
			
			
		}
		
		
		
		
		// Click on catalouge_ExportToPDF
		
		public void catalouge_ExportToPDF()
		{
			
			catalouge_ExportToPDF.click();
			
			
		}
		
		
		
		// Click on catalouge_Right button
		
		public void catalouge_RightButton()
		{
			
			catalouge_RightButton.click();
			
			
		}
		
		
		// Click on catalouge_Left button
		
				public void catalouge_LeftButton()
				{
					
				catalouge_LeftButton.click();
					
					
				}
		
		
		
		// Click on Flip preview _Back_button
		
		public void Flip_preview_Back_button()
		{
			
			back_button.click();
			
			
		}
		
		
}
