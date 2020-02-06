package com.visulon.pom.AssortmentMenu;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileMenu_Save_As 
{
@FindBy(xpath="(//input[@type='image'])[3]")
private WebElement Saveasbutton;
@FindBy(id="txtAssortmentNameForSaveAs")
private WebElement Asortmentname;
@FindBy(id="ContentPlaceHolder1_rdbPrivate")
private WebElement PrivacyPrivate;
@FindBy(id="ContentPlaceHolder1_rdbPublic")
private WebElement PrivacyTeam;
@FindBy(id="chkIsSaveAsStandardAssortment")
private WebElement globalassortment;
@FindBy(id="btnSaveAsAssortment")
private WebElement SaveAssortment;
@FindBy(xpath="(//span[@class='modernPopupCloseIcon'])[3]")
private WebElement cancel;


 public FileMenu_Save_As(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }

 public void clickonsaveasbutton()
 {
	 Saveasbutton.click();
 }
public void EnterAssortmentname()
{
	Asortmentname.click();
	Asortmentname.clear();
	Asortmentname.sendKeys(RandomStringUtils.randomAlphabetic(6));
}
public void Selectprivacyasprivate()
{
	PrivacyPrivate.click();
}
public void SelectprivacyasTeam()
{
	PrivacyTeam.click();
}
public void SaveasGlobalassrtment()
{
	globalassortment.click();
}
public void clickonsaveassortment()
{
	SaveAssortment.click();
}

public void clickoncancelbutton()
{
	cancel.click();
}



}
