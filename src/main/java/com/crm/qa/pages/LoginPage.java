package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	//Object Repository
	@FindBy(name="username")
	WebElement userName;

	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[contains(text(),'signup']")
	WebElement signupBtn;

	@FindBy(xpath="//img[contains(@class,'img-responsive']")
	WebElement crmLogo;

	//Initializing the page objects
	public LoginPage() throws Exception
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String username, String pwd)
	{
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginBtn.click();
		return new HomePage();
	}
}
