package com.LeadForensic.com.leadForensic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {
	LoadProp loadprop = new LoadProp();
	
	//to click on element
    public static void clickOnElement(By by) {
    	driver.findElement(by).click();
    	}    
    //to click on Mulitple elements
    public static void clickOnElements(By by) {
    	Boolean isPresent = driver.findElements(by).size()>0;
    	if(isPresent == true) {
    		isPresent.toString();
    	}
    	}
    // to clear and enter text
    public static void clearAndEnterText(By by, String text) {
    	driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
        }
    // to enter text
    public static void enterText(By by, String text) {
    	driver.findElement(by).sendKeys(text);
    	}
    // to get text from element
    public static String getTextFromElement(By by) {
    	return driver.findElement(by).getText();
    	}   
    
   //get text from given location
    public static String getTextElement(By by) { 
    	driver.findElement(by).isDisplayed();
        return driver.findElement(by).getText();
        }    
    
    // to wait and click
    public static void waitAndClick(By by,int time) { 
    	WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
        }
    public static void javascriptexecutor (By by) {
		WebElement elements = driver.findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", elements);
    	}
    
    // to selecct from droplist by visible text
    public static void selectByVisibleText(By by, String name) {
    	new Select(driver.findElement(by)).selectByVisibleText(name);
    	}
    public void mouseHoverOnElement (By by) {
    	WebElement element = driver.findElement(by);
    	Actions act = new Actions(driver);
    	act.click(element);
    	act.build().perform();
    }
    

}
