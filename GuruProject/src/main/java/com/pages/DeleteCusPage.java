package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteCusPage extends BasePage {

	public DeleteCusPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='cusid']")
	private WebElement customerid;
	
	@FindBy(name="AccSubmit")
	private WebElement submit;
	
	public void setcusid(String customerid) {
		this.customerid.sendKeys(customerid);
	}
	
		public void submitButton() {
			submit.click();
		}
		
		
	}
	


