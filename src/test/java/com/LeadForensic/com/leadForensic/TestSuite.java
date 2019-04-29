package com.LeadForensic.com.leadForensic;

import org.testng.annotations.Test;

public class TestSuite extends Hooks  {

	LoginPage loginpage = new LoginPage();
	HomePage homepage = new HomePage();
	CategoriesPage categoriespage = new CategoriesPage();
	
	
	

	@Test
	public void verificationCategoriesText() {
		loginpage.userName();
		loginpage.password();
		loginpage.loginbtn();
		homepage.reportsTabsHeader();
		homepage.cateogoriesLink();
		categoriespage.categoriesTitleHeader();
		
	}
}
