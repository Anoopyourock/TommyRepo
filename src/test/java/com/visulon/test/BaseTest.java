package com.visulon.test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.visulon.generics.AutoConstant;
import com.visulon.generics.PropertyFileHandle;
import com.visulon.generics.ScreenShot;

public class BaseTest implements AutoConstant
{
	
		WebDriver driver;
		@Parameters("browsername")
		@BeforeClass
		public void preConditions(String browsername)
		{
			if(browsername.equals("firefox"))
			{FirefoxProfile fp=new FirefoxProfile();
			fp.setAcceptUntrustedCertificates(true);
				System.setProperty(firefoxproperty,firefoxexepath);
				driver=new FirefoxDriver();
				
			}
			else if(browsername.equals("chrome"))
			{	
				ChromeOptions cp = new ChromeOptions();
				cp.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
				cp.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				System.setProperty(chromeproperty, chromeexepath);
				driver=new ChromeDriver(cp);
			}
			else
			{
				System.setProperty(edgeproperty, edgepath);
				driver=new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.get(PropertyFileHandle.getPropertyvalue("url"));
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@AfterMethod(alwaysRun=true)
		public void testMethodResult(ITestResult result)
		{
			int status = result.getStatus();
			String imagename = result.getName();
			if(status==2)
			{
				ScreenShot.takeScreenShot(driver, imagename);
			}
		}
		@AfterClass
		public void postCondition() throws InterruptedException
		{
			Thread.sleep(5000);
			driver.close();
		}
		

	}


