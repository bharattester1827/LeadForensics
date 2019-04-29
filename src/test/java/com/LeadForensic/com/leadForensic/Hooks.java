package com.LeadForensic.com.leadForensic;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Hooks extends BasePage {

	BrowserSetUp browsersetup = new BrowserSetUp();
	LoadProp loadprop = new LoadProp();
	
	@BeforeMethod
	public void openBrowser()
    {
        // so it will open browser which mention in testdataconfig file.
        browsersetup.selectBrowser();
        driver.get(loadprop.getproperty("url"));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);        
    }
	
	@AfterMethod
    public void closeBrowser () {
		
            //driver.close();
        
	}
	
	
	
}
