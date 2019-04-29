package com.LeadForensic.com.leadForensic;

import org.openqa.selenium.By;

public class LoginPage extends Utils {

			private By _username = By.id("UserName");
			private By _password = By.id("Password");
			private By _loginbtn = By.id("btnSubmit");
			
			
			
			public void userName () {
				enterText(_username , loadprop.getproperty("Username"));
			}
			public void password () {
				enterText(_password , loadprop.getproperty("Password"));
			}
			public void loginbtn () {
				clickOnElement(_loginbtn);
			}
}
