package com.visulon.pom.Attributes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Assortment_Attributes_Formatted 
{
	
		
		WebDriver driver;
		
		@FindBy(xpath="//li[@id='liFormatAttrBox']//input[1]")
		private WebElement format_AttributeBox;
		
		@FindBy(xpath="//label[text()='Box Theme']")
		private WebElement box_Theme;
		
		@FindBy(xpath="(//article[@class='formatAttBoxDiv']//div)[3]")
		private WebElement Select_BoxTheme;
		
		@FindBy(xpath="//label[text()='Text/Font']")
		private WebElement text_font;
		
		@FindBy(xpath="(//input[@class='FTcolorBtn'])[1]")
		private WebElement text_font_fontColor;
		
		@FindBy(xpath="(//select[@class='input FTInputL'])[1]")
		private WebElement text_font_fontFamily;
		
		@FindBy(xpath="(//select[@class='input FTInputS'])[1]")
		private WebElement text_font_fontsize;
		
		@FindBy(xpath="(//span[@class='alignLeftFbox'])[1]")
		private WebElement text_font_textAlign_Left;
		
		@FindBy(xpath="(//span[@class='alignCenterFbox'])[1]")
		private WebElement text_font_textAlign_center;
		
		@FindBy(xpath="(//span[@class='alignRightFbox'])[1]")
		private WebElement text_font_textAlign_right;
		
		@FindBy(xpath="(//select[@class='input FTInputL'])[2]")
		private WebElement text_font_ChangeCase;
		
		@FindBy(xpath="(//div[@class='FTDIv']//input)[2]")
		private WebElement text_font_RemoveLineSpacing;
		
		@FindBy(xpath="(//span[@class='boldFBox'])[1]")
		private WebElement text_font_fontsizeBold;
		
		@FindBy(xpath="(//span[@class='italicFBox'])[1]")
		private WebElement text_font_fontsizeItalic;
		
		@FindBy(xpath="(//span[@class='underLFBox'])[1]")
		private WebElement text_font_fontsizeUnderline;
		
		@FindBy(xpath="//label[text()='Box Border']")
		private WebElement box_Border;
		
		@FindBy(xpath="(//input[@class='FTcolorBtn inputForTrans'])[1]")
		private WebElement box_Border_borderColor;
		
		@FindBy(xpath="(//select[@class='input FTInputL'])[3]")
		private WebElement box_Border_borderWidth;
		
		@FindBy(xpath="(//select[@class='input FTInputL'])[4]")
		private WebElement box_Border_borderType;
		
		@FindBy(xpath="(//select[@class='input FTInputL'])[5]")
		private WebElement box_Border_borderradius;
		
		@FindBy(xpath="//label[text()='Box Shadow']")
		private WebElement box_Shadow;

		@FindBy(xpath="(//div[@class='FTDIv']//input)[4]")
		private WebElement box_Shadow_shadowColor;
		
		
		@FindBy(xpath=("(//input[@class='input FTInputM'])[1]"))
		private WebElement box_Shadow_horizontalShadow;
		
		@FindBy(xpath="(//input[@class='input FTInputM'])[2]")
		private WebElement box_Shadow_verticalShadow;
		
		
		
		@FindBy(xpath=("//input[@class='input FTInputM'])[3]"))
		private WebElement box_Shadow_shadowBlur;
		
		
		
		
		@FindBy(xpath="//label[text()='Box Background']")
		private WebElement box_Background;
		
		@FindBy(xpath="//input[@value='nofill']")
		private WebElement box_Background_Nofill;
		
		@FindBy(xpath="//input[@value='solidfill']")
		private WebElement box_Background_Solidfill;
		
		@FindBy(xpath="(//input[@class='FTcolorBtn inputForTrans'])[3]")
		private WebElement box_Background_fillColor;
		
		@FindBy(xpath="(//input[@type='number'])[4]")
		private WebElement box_Background_transparency;
		
		@FindBy(xpath="//label[text()='Box Title']")
		private WebElement box_Title;
		
		
		@FindBy(id="attrBackColor_Header")
		private WebElement box_Title_BackColor;
		
		@FindBy(xpath="(//input[@class='FTcolorBtn'])[2]")
		private WebElement box_Title_FontColor;
		
		@FindBy(xpath="(//table[@id='tblTitleSec_Header']//select)[1]")
		private WebElement box_Title_FontFamily;
		
		@FindBy(xpath="(//select[@class='input FTInputS'])[2]")
		private WebElement box_Title_FontSize;
		
		@FindBy(xpath="(//span[@class='boldFBox'])[2]")
		private WebElement box_Title_FontSize_Bold;
		
		@FindBy(xpath="(//span[@class='italicFBox'])[2]")
		private WebElement box_Title_FontSize_Italic;
		
		@FindBy(xpath="(//span[@class='underLFBox'])[2]")
		private WebElement box_Title_FontSize_Underline;
		
		@FindBy(xpath="//ul[@id='TextAlign_Header']//li[1]")
		private WebElement box_Title_TextAlign_Left;
		
		@FindBy(xpath="(//span[@class='alignCenterFbox'])[2]")
		private WebElement box_Title_TextAlign_Center;
		
		@FindBy(xpath="(//span[@class='alignRightFbox'])[2]")
		private WebElement box_Title_TextAlign_Right;
		
		@FindBy(xpath="(//table[@id='tblTitleSec_Header']//select)[3]")
		private WebElement box_Title_ChangeCase;
		
		@FindBy(xpath="(//table[@id='tblTitleSec_Header']//input)[3]")
		private WebElement box_Title_BorderBottom;
		
		
		
		@FindBy(xpath="//label[text()='Rows (Odd)']")
		private WebElement rows_odd;
		
		
		@FindBy(xpath="(//label[text()='Rows (Odd)']/following::input)[1]")
		private WebElement rows_odd_BlackColor;
		
		@FindBy(xpath="(//input[@class='FTcolorBtn'])[3]")
		private WebElement rows_odd_FontColor;
		
		@FindBy(id="attrFontStyle_RowOdd")
		private WebElement rows_odd_FontFamily;
		
		@FindBy(xpath="(//select[@class='input FTInputS'])[3]")
		private WebElement rows_odd_FontSize;
		
		@FindBy(xpath="(//span[@class='boldFBox'])[3]")
		private WebElement rows_odd_FontSize_Bold;
		
		@FindBy(xpath="(//span[@class='italicFBox'])[3]")
		private WebElement rows_odd_FontSize_Italic;
		
		@FindBy(xpath="(//span[@class='underLFBox'])[3]")
		private WebElement rows_odd_FontSize_UnderLine;
		
		@FindBy(xpath="(//span[@class='alignLeftFbox'])[3]")
		private WebElement rows_odd_TextAlign_Left;
		
		@FindBy(xpath="(//span[@class='alignCenterFbox'])[3]")
		private WebElement rows_odd_TextAlign_Center;
		
		@FindBy(xpath="(//span[@class='alignRightFbox'])[3]")
		private WebElement rows_odd_TextAlign_Right;
		
		@FindBy(id="TextChangeCase_RowOdd")
		private WebElement rows_odd_ChangeCase;
		
		@FindBy(id="attrBorderBottom_RowOdd")
		private WebElement rows_odd_BorderBottom;
		
		@FindBy(xpath="//label[@for='radioRow_Even']")
		private WebElement rows_even;
		
		@FindBy(xpath="(//label[text()='Rows (Even)']/following::input)[1]")
		private WebElement rows_even_BackColor;
		
		@FindBy(xpath="(//label[text()='Rows (Even)']/following::input)[2]")
		private WebElement rows_even_FontColor;
		
		@FindBy(id="attrFontStyle_RowEven")
		private WebElement rows_even_FontFamily;
		
		@FindBy(xpath="(//select[@class='input FTInputS'])[4]")
		private WebElement rows_even_FontSize;
		
		@FindBy(id="attrFontBold_RowEven")
		private WebElement rows_even_FontSize_Bold;
		
		@FindBy(id="attrFontItalic_RowEven")
		private WebElement rows_even_FontSize_Italic;
		
		@FindBy(id="attrFontUnderline_RowEven")
		private WebElement rows_even_FontSize_UnderLine;
		
		@FindBy(xpath="(//span[@alignmode='left'])[4]")
		private WebElement rows_even_TextAlign_Left;
		
		@FindBy(xpath="(//span[@alignmode='center'])[4]")
		private WebElement rows_even_TextAlign_Center;
		
		@FindBy(xpath="(//span[@alignmode='right'])[4]")
		private WebElement rows_even_TextAlign_Right;
		
		@FindBy(id="TextChangeCase_RowEven")
		private WebElement rows_even_ChangeCase;
		
		@FindBy(xpath="(//label[text()='Rows (Even)']/following::input)[3]")
		private WebElement rows_even_BorderBottom;
		
		
		@FindBy(xpath="(//input[@value='Apply Changes'])[1]")
		private WebElement applyChanges;
		
		
		@FindBy(xpath="(//input[@value='Reset'])[1]")
		private WebElement reset;


		public Assortment_Attributes_Formatted(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		//Click on format Attribute Box
		public void Format_AttributeBox()
		{
			format_AttributeBox.click();
			
		}
		
		//Click on Box theme
		public void Box_theme()
		{
			
			box_Theme.click();
		}
		
		//Click on Select Box theme template
		public void Select_Box_Theme()
		{
			
			Select_BoxTheme.click();
			
		}
		
		
		//Click on Text/Font
		public void Text_font()
		{
			text_font.click();
			
		}
		
		
		//Click on Text/Font_ FontColor
			public void Text_font_fontColor(String imagepath) throws SikuliException
			{
				text_font_fontColor.click();
				WebdriverActions.Sikuliactions1(driver, imagepath);
				
			}
		   
			public void Text_font_fontColor_Ok_Button(String imagepath) throws SikuliException
			{
			    
				WebdriverActions.Sikuliactions1(driver, imagepath);
				
			}
			
		
			//Click on Text/Font_Font family
			public void Text_font_FontFamily(int option)
			{
				WebdriverActions.selectOptionInListbox(text_font_fontFamily, option);
				
			}
		
		
		
			//Click on Text/Font_Font size
			public void Text_font_FontSize(int option)
			{
				WebdriverActions.selectOptionInListbox(text_font_fontsize, option);
				
			}
			//Click on Text/Font_FontSize Bold
			public void Text_font_FontSize_Bold()
			{
				text_font_fontsizeBold.click();
				
			}
		
		
			//Click on Text/Font_FontSize Italic
			public void Text_font_FontSize_Italic()
			{
				text_font_fontsizeItalic.click();
				
			}
			//Click on Text/Font_FontSize Underline
			public void Text_font_FontSize_Underline()
			{
				text_font_fontsizeUnderline.click();
				
			}
		
			//Click on Text/Font_Text Align Left
			public void Text_font_TextAlign_Left()
			{
				text_font_textAlign_Left.click();
				
			}
		
		
			//Click on Text/Font_Text Align Center
			public void Text_font_TextAlign_Center()
			{
				text_font_textAlign_center.click();
				
			}
			//Click on Text/Font_ Text Align Right
			public void Text_font_TextAlign_Right()
			{
				text_font_textAlign_right.click();
				
			}
		
			//Click on Text/Font_change case
			public void Text_font_ChangeCase(int option)
			{
				WebdriverActions.selectOptionInListbox(text_font_ChangeCase, option);
				
			}
		
			//Click on Text/Font_Remove Line spacing
			public void Text_font_Remove_LineSpacing()
			{
				text_font_RemoveLineSpacing.click();
				
			}
			//Click on Box Border
			public void Box_Border()
			{
				box_Border.click();
				
			}
		
			//Click on Box Border_ border color
			
			public void Box_Border_BorderColor(String imagepath) throws SikuliException
			{
				box_Border_borderColor.click();
				WebdriverActions.Sikuliactions1(driver, imagepath);
				
			}
			
			public void Box_Border_BorderColor_Ok_Button(String imagepath) throws SikuliException
			{
			    
				WebdriverActions.Sikuliactions1(driver, imagepath);
				
			}
			//Click on Box Border_Border Width
			public void Box_Border_BorderWidth(int option)
			{
				WebdriverActions.selectOptionInListbox(box_Border_borderWidth, option);
				
			}
			
			//Click on Box Border_Border type
			public void Box_Border_BorderType(int option)
			{
				WebdriverActions.selectOptionInListbox(box_Border_borderType, option);
				
			}
			//Click on Box Border_ Border radius
			public void Box_Border_BorderRadius(int option)
			{
				WebdriverActions.selectOptionInListbox(box_Border_borderradius, option);
				
			}
			
			
			        //Click on Box Shadow
					public void Box_Shadow()
					{
						box_Shadow.click();
						
					}
					
			        //Click on Box Shadow_ Shadow color
							public void Box_Shadow_ShadowColor(String imagepath) throws SikuliException
							{
								box_Shadow_shadowColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							public void Box_Shadow_BorderColor_Ok_Button(String imagepath) throws SikuliException
							{
							    
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
					        //Click on Box Shadow_horizontal shadow
							public void Box_Shadow_HorizontalShadow(String value)
							{
								box_Shadow_horizontalShadow.clear();
								box_Shadow_horizontalShadow.sendKeys(value);
								
							}
							
					        //Click on Box Shadow_Vertical shadow
							public void Box_Shadow_VerticalShadow(String value)
							{
								box_Shadow_verticalShadow.clear();
								box_Shadow_verticalShadow.sendKeys(value);;
								
							}
							
					        //Click on Box Shadow_Shadow blur
							public void Box_Shadow_ShadowBlur(String value)
							{
								box_Shadow.sendKeys(value);
								
							}
							
							//Click on Box Background
							public void Box_Background()
							{
								box_Background.click();
								
							}
							
							//Click on Box Background_Background Color No fill
							public void Box_Background_BackgroundColor_NoFill()
							{
								box_Background_Nofill.click();
								
							}
							
							
							//Click on Box Background_Background color Solid fill
							public void Box_Background_Background_SolidFill()
							{
								box_Background_Solidfill.click();
								
							}
							
							
							//Click on Box Background_Background color 
							public void Box_Background_color(String imagepath) throws SikuliException
							{
								box_Background_fillColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							public void Box_Background_Color_Ok_Button(String imagepath) throws SikuliException
							{
							    
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							//Click on Box Background_Transparency
							public void Box_Background_Transparecy(String Value)
							{
								box_Background_transparency.sendKeys(Value);
								
							}
							
							
							

							//Click on Box Title
							public void Box_Title()
							{
								box_Title.click();
								
							}
							
							
							//Click on Box Title_BackColor
							public void Box_Title_BackColor(String imagepath) throws SikuliException
							{
								box_Title_BackColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							public void Box_Title_BckColor_Ok_Button(String imagepath) throws SikuliException
							{
							    
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							//Click on Box Title_FontColor
							public void Box_Title_FontColor(String imagepath) throws SikuliException
							{
								box_Title_FontColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							
							
							//Click on Box Title_FontFamily
							public void Box_Title_FontFamily(int option)
							{
								WebdriverActions.selectOptionInListbox(box_Title_FontFamily, option);
								
							}
							
							
							//Click on Box Title_FontSize
							public void Box_Title_FontSize(int option)
							{
								WebdriverActions.selectOptionInListbox(box_Title_FontSize, option);
								
							}
							
							
							//Click on Box Title_FontSize_Bold
							public void Box_Title_FontSize_Bold()
							{
								box_Title_FontSize_Bold.click();
								
							}
							
							
							//Click on Box Title_FontSize_Italic
							public void Box_Title_FontSize_Italic()
							{
								box_Title_FontSize_Italic.click();
								
							}
							
							
							//Click on Box Title_FontSize_UnderLine
							public void Box_Title_FontSize_UnderLine()
							{
								box_Title_FontSize_Underline.click();
								
							}
							
							
							//Click on Box Title_TextAlign left
							public void Box_Title_TextAlign_Left()
							{
								box_Title_TextAlign_Left.click();
								
							}
							
							
							//Click on Box Title_TextAlign Center
							public void Box_Title_TextAlign_Center()
							{
								box_Title_TextAlign_Center.click();
								
							}
							
							
							//Click on Box Title_TextAlign Right
							public void Box_Title_TextAlign_Right()
							{
								box_Title_TextAlign_Right.click();
								
							}
							
							
							//Click on Box Title_Change case
							public void Box_Title_ChangeCase(int option)
							{
								WebdriverActions.selectOptionInListbox(box_Title_ChangeCase, option);
								
							}
							
							
							//Click on Box Title_Border bottom
							public void Box_Title_borderBottom()
							{
								box_Title_BorderBottom.click();
								
							}
							
							
							//Click on Rows(odd) 
							public void Rows_odd()
							{
								rows_odd.click();
								
							}
							
							//Click on Rows(odd)_BackColor
							public void Rows_odd_BackColor(String imagepath) throws SikuliException
							{
								rows_odd_BlackColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							public void Rows_odd_BckColor_Ok_Button(String imagepath) throws SikuliException
							{
							    
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							//Click on Rows(odd)_FontColor
							public void Rows_odd_FontColor(String imagepath) throws SikuliException
							{
								rows_odd_FontColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							
							
							//Click on Rows(odd)_FontFamily
							public void Rows_odd_FontFamily(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_odd_FontFamily, option);
								
							}
							
							
							//Click on Rows(odd)_FontSize
							public void Rows_odd_FontSize(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_odd_FontSize, option);
								
							}
							
							
							//Click on Rows(odd)_FontSize_Bold
							public void Rows_odd_FontSize_Bold()
							{
								rows_odd_FontSize_Bold.click();
								
							}
							
							
							//Click on Rows(odd)_FontSize_Italic
							public void Rows_odd_FontSize_Italic()
							{
								rows_odd_FontSize_Italic.click();
								
							}
							
							
							//Click on Rows(odd)_FontSize_UnderLine
							public void Rows_odd_FontSize_UnderLine()
							{
								rows_odd_FontSize_UnderLine.click();
								
							}
							
							
							//Click on Rows(odd)_TextAlign left
							public void Rows_odd_TextAlign_Left()
							{
								rows_odd_TextAlign_Left.click();
								
							}
							
							
							//Click on Rows(odd)_TextAlign Center
							public void Rows_odd_TextAlign_Center()
							{
								rows_odd_TextAlign_Center.click();
								
							}
							
							
							//Click on Rows(odd)_TextAlign Right
							public void Rows_odd_TextAlign_Right()
							{
								rows_odd_TextAlign_Right.click();
								
							}
							
							
							//Click on Rows(odd)_Change case
							public void Rows_odd_ChangeCase(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_odd_ChangeCase, option);
								
							}
							
							
							//Click on Rows(odd)_Border bottom
							public void Rows_odd_borderBottom()
							{
								rows_odd_BorderBottom.click();
								
							}
							
							
							//Click on Rows(Even) 
							public void Rows_even()
							{
								rows_even.click();
								
							}
							
							//Click on Rows(Even) _BackColor
							public void Rows_even_BackColor(String imagepath) throws SikuliException
							{
								rows_even_BackColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							public void Rows_even_BckColor_Ok_Button(String imagepath) throws SikuliException
							{
							    
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							//Click on Rows(Even) _FontColor
							public void Rows_even_FontColor(String imagepath) throws SikuliException
							{
								rows_even_FontColor.click();
								WebdriverActions.Sikuliactions1(driver, imagepath);
								
							}
							
							
							
							//Click on Rows(Even) _FontFamily
							public void Rows_even_FontFamily(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_even_FontFamily, option);
								
							}
							
							
							//Click on Rows(Even) _FontSize
							public void Rows_even_FontSize(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_even_FontSize, option);
								
							}
							
							
							//Click on Rows(Even) _FontSize_Bold
							public void Rows_even_FontSize_Bold()
							{
								rows_even_FontSize_Bold.click();
								
							}
							
							
							//Click on Rows(Even) _FontSize_Italic
							public void Rows_even_FontSize_Italic()
							{
								rows_even_FontSize_Italic.click();
								
							}
							
							
							//Click on Rows(Even) _FontSize_UnderLine
							public void Rows_even_FontSize_UnderLine()
							{
								rows_even_FontSize_UnderLine.click();
								
							}
							
							
							//Click on Rows(Even) _TextAlign left
							public void Rows_even_TextAlign_Left()
							{
								rows_even_TextAlign_Left.click();
								
							}
							
							
							//Click on Rows(Even) _TextAlign Center
							public void Rows_even_TextAlign_Center()
							{
								rows_even_TextAlign_Center.click();
								
							}
							
							
							//Click on Rows(Even) _TextAlign Right
							public void Rows_even_TextAlign_Right()
							{
								rows_even_TextAlign_Right.click();
								
							}
							
							
							//Click on Rows(Even) _Change case
							public void Rows_even_ChangeCase(int option)
							{
								WebdriverActions.selectOptionInListbox(rows_even_ChangeCase, option);
								
							}
							
							
							//Click on Rows(Even) _Border bottom
							public void Rows_even_borderBottom()
							{
								rows_even_BorderBottom.click();
								
							}
							
							
							//Click on apply changes
							public void apply_Changes()
							{
								applyChanges.click();
								
							}
							
							

							//Click on reset
							public void reset()
							{
								reset.click();
								
							}
							
}
