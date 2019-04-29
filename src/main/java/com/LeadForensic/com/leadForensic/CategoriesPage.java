package com.LeadForensic.com.leadForensic;

import org.openqa.selenium.By;

import junit.framework.Assert;

public class CategoriesPage extends Utils {

			private By _categoriestitle = By.xpath("//div[@class='page-header-bg']/div/table/tbody/tr/td[1]/h1");
			String categories = "                                     Categories                                ";
			
			public void categoriesTitleHeader () {
				getTextElement(_categoriestitle);
				getTextFromElement(_categoriestitle);
				
				//Assert.assertEquals(_categoriestitle, categories);
			}
}
