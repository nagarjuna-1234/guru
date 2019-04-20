package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditCusPage extends BasePage {

	public EditCusPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "accountno")
	private WebElement customerid;

	@FindBy(name = "AccSubmit")
	private WebElement submitButton;

	@FindBy(name = "res")
	private WebElement resetButton;

	@FindBy(xpath = "//p[.='Edit Customer Form']")
	private WebElement editcusMsg;
	


	public void enterCustomerID(String custID) {
		customerid.sendKeys(custID);
	}

	public void clicksubmitButton() {
		submitButton.click();
	}
	
	public String editCustomerMsg() {
		return editcusMsg.getText();
		
	}
}
