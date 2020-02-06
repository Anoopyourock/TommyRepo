package com.visulon.generics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.visulon.generics.AutoConstant;

public class ScreenShot 
{

	public static void takeScreenShot(WebDriver driver,String imagename)
	{
		Date d=new Date();
		SimpleDateFormat s=new SimpleDateFormat("dd_MM_YYYY");
		String date = s.format(d);
		TakesScreenshot s1=(TakesScreenshot)driver;
		File src = s1.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstant.screenshotpath+imagename+date+".png");
		try 
		{
			FileUtils.copyFile(src, dest);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
