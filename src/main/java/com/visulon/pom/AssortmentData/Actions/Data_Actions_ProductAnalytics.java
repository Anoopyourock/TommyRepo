package com.visulon.pom.AssortmentData.Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.visulon.commonseleniumactions.WebdriverActions;

public class Data_Actions_ProductAnalytics 
{
	WebDriver driver;
		@FindBy(xpath="//span[text()='Product analytics']")
		private WebElement ProductAnalytics;
		@FindBy(xpath="(//span[text()='Table'])[2]")
		private WebElement table;
		@FindBy(xpath="//span[text()='Bar chart']")
		private WebElement BarChart;
		@FindBy(xpath="//span[text()='Pie chart']")
		private WebElement PieChart;
		@FindBy(linkText="Table Format")
		private WebElement TableFormat1;
		@FindBy(linkText="Bar Chart")
		private WebElement Barchart1;
		@FindBy(linkText="Pie Chart")
		private WebElement PieChart1;
		
		
		public Data_Actions_ProductAnalytics(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			this.driver=driver;
		}
		
		
		public void ClickonProductAnalytics()
		{
			WebdriverActions.mouseAction(driver, ProductAnalytics);
		}
		public void ClickonTable()
		{
			WebdriverActions.mouseAction(driver, table);
			table.click();
		}
		public void ClickonBarChart()
		{
			WebdriverActions.mouseAction(driver, BarChart);
			BarChart.click();
		}
		public void ClickonPieChart()
		{
			WebdriverActions.mouseAction(driver, PieChart);
			PieChart.click();
		}
		
		public void ClickonTableLink()
		{
			TableFormat1.click();
		}
		public void ClickonBarchart1Link()
		{
			Barchart1.click();
		}
		public void ClickonPiechart1Link()
		{
			PieChart1.click();;
		}
		
		
		
		
		
		
		
		
		
		
		
}
