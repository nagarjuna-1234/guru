package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DepositPage extends BasePage {

	public DepositPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "accountno")
	private WebElement accnum;

	@FindBy(name = "ammount")
	private WebElement amot;

	@FindBy(name = "desc")
	private WebElement description;

	@FindBy(xpath = "//input[@name='AccSubmit']")
	private WebElement subnit;

	@FindBy(xpath = "//p[contains(.,'Transaction details of Deposit')]")
	private WebElement depositMsg;

	public String getDepositSuccessfulMsg() {
		// TODO Auto-generated method stub
		return depositMsg.getText();
	}

	public WebElement getDepositElement() {
		// TODO Auto-generated method stub
		return depositMsg;
	}

	
	public void setaccNum(String accnum) {
		this.accnum.sendKeys(accnum);
	}

	public void setamount(String amot) {
		this.amot.sendKeys(amot);
	}

	public void setdescription(String des) {
		this.description.sendKeys(des);
	}

	public void submitButton() {
		subnit.click();
	}

}
