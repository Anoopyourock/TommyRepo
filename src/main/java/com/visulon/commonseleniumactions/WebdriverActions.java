package com.visulon.commonseleniumactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class WebdriverActions 
{
	public static void openApp(WebDriver driver,String url)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	public static void selectOptionInListbox(WebElement element,int option)
	{
		Select s=new Select(element);
		s.selectByIndex(option);
	}
	
	public static void mouseAction(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public static void mouse1Action(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public static void mouse3Action(WebDriver driver,WebElement element) throws InterruptedException
    {
   	  
           Actions moveSlider = new Actions(driver);
   	       Action action = moveSlider.dragAndDropBy(element, 10, 0).build();
   	       action.perform();
   	       Thread.sleep(5000);
      	   Action action1 = moveSlider.dragAndDropBy(element, -70, 0).build();
   	       action1.perform();
    }
	public static void Sikuliactions(WebDriver driver,String imagepath,String value) throws SikuliException
	{
		Pattern p = new Pattern(imagepath);
		Screen s =new Screen();
		s.type(p,value);
		
		
		
	}
	public static void Sikuliactions2(WebDriver driver,String imagepath) throws SikuliException
    {
    Pattern p = new Pattern(imagepath);
    Screen s =new Screen();
         
     s.hover(p);

    }
	public static void Sikuliactions1(WebDriver driver,String imagepath) throws SikuliException
	{
		Pattern p = new Pattern(imagepath);
		Screen s =new Screen();
		s.click(p);
		
		
	}
	
	
	
	public static void tearDown(WebDriver driver)
	{
		driver.close();
	}

}

