package com.LeadForensic.com.leadForensic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetUp extends BasePage {
	
	LoadProp loadprop = new LoadProp();
	String browser = loadprop.getproperty("Browser");

public void selectBrowser(){
        
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src\\test\\java\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src\\test\\java\\BrowserDriver\\MicrosoftWebDriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\java\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }else{System.out.print("Wrong Browser");
        }
    }
	
	
}
