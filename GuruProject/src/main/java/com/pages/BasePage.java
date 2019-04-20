package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
	public WebDriver driver;

	public BasePage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

}
