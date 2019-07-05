package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 WebDriver driver;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "uid")
	@CacheLookup
	 WebElement txtusername;

	@FindBy(name = "password")
	@CacheLookup
    WebElement txtpwd;

	@FindBy(name = "btnLogin")
	@CacheLookup
    WebElement clickLogin;
	
	@FindBy(xpath="/html[1]/body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	WebElement lnkLogout;

	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
	}

	public void setPassword(String pword) {
		txtpwd.sendKeys(pword);
	}

	public void submitBtn(){
		clickLogin.click();
	}

	public void clickLogout() {
	   lnkLogout.click();
		
	}

}


