package com.visulon.commonseleniumactions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsActions 
{
	
		public static boolean verifyElementDisplay(WebElement element)
		{
			return element.isDisplayed();
		}
		public static void verifyAlertPopup(WebDriver driver,int timeout)
		{
			WebDriverWait wait=new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public static void handleAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		public static void handleFrame(WebDriver driver,int frame)
		{
			driver.switchTo().frame(frame);
		}

		
}
