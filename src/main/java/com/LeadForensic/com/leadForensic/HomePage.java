package com.LeadForensic.com.leadForensic;

import org.openqa.selenium.By;



public class HomePage extends Utils {
	

			private By _reportstabs = By.xpath("//div[@class='header']/div[2]/ul/li[3]/span");
			private By _categoriesdrop = By.linkText("/Reporting/Categories");
			
			
			public void reportsTabsHeader () {
				waitAndClick(_reportstabs, 5);
			}
			public void mouseHoverOnReportTabs () {
				mouseHoverOnElement(_reportstabs);
			}
			public void cateogoriesLink () {
				selectByVisibleText(_categoriesdrop, loadprop.getproperty("categorieslink"));
			}
	
}
