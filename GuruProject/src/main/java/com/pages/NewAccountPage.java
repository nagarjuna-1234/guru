package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewAccountPage extends BasePage {

	public NewAccountPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@FindBy(name = "cusid")
	private WebElement cusid;

	@FindBy(xpath = "//select[@name='selaccount']")
	private WebElement acctype;

	@FindBy(xpath = "//input[@name='inideposit']")
	private WebElement initialdeposit;

	@FindBy(xpath = "//input[@name='button2']")
	private WebElement submit;

	@FindBy(xpath = "//p[.='Account Generated Successfully!!!']")
	private WebElement newAccountsuccessfulMsg;

	public String getNewAccountsussfulMsg() {
		return newAccountsuccessfulMsg.getText();

	}

	public void setCusid(String cusid) {
		this.cusid.sendKeys(cusid);
	}

	public void setAcctype(String accountType) {
		Select sel=new Select(acctype);
		sel.selectByValue(accountType);
	}

	public void setInitialdeposit(String initialdeposit) {
		this.initialdeposit.sendKeys(initialdeposit);
	}

	public void clicksubmitButton() {
		submit.click();
	}
}
