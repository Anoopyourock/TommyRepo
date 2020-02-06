package com.visulon.pom.AssortmentMenu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.SikuliException;

import com.visulon.commonseleniumactions.WebdriverActions;

public class FileMenu_ChangeMilestone
{
	WebDriver driver;
@FindBy(xpath="(//input[@type='image'])[5]")
private WebElement changemilestoneclick;
@FindBy(xpath="(//select[@class='dropdown'])[3]")
private WebElement SelectMilestone;
@FindBy(id="chkChangeMilStone")
private WebElement keepcopy;



	public FileMenu_ChangeMilestone(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

public void clickonchangemilestone()
{
	changemilestoneclick.click();
}
public void SelectMilestone(int option)
{
	WebdriverActions.selectOptionInListbox(SelectMilestone, option);
}


public void keepcopy()
{
	keepcopy.click();
}

public void clickonApply()
{
	
}
public void clickonApplyimage(String imagepath) throws SikuliException
{
	WebdriverActions.Sikuliactions1(driver, imagepath);
}

public void clickontommyApply(String imagepath) throws SikuliException
{
	WebdriverActions.Sikuliactions1(driver, imagepath);
}


}
