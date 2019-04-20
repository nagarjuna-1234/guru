package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver d) {
		super(d);

	}
		
	@FindBy(name="uid")		
	private WebElement username;
		
	@FindBy(name="password")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	private WebElement loginButton;
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}

	public void setPwd(String pd) {
		pwd.sendKeys(pd);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
	public String getPageTitle() {
	  return driver.getTitle();
	
	}
	

	
	
	
	
	
		
		
		
		
		
	}
