package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditAccountPage extends BasePage {

	public EditAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	@FindBy(name = "accountno")
	private WebElement accno;

	@FindBy(xpath = "//select[@name='a_type']")
	private WebElement acctype;
	
	@FindBy(xpath = "//input[@name='AccSubmit']")
	private WebElement submitButton;

	@FindBy(xpath = "//p[.='Account details updated Successfully!!!']")
	private WebElement editAccsuccessfulMsg;

	public void setAcctype(String accountType) {
		Select sel=new Select(acctype);
		sel.selectByValue(accountType);
	}
	public String getEditAccSuccessfulMsg() {
		return editAccsuccessfulMsg.getText();
	}

	public void setAccountNum1(String accno) {
		this.accno.sendKeys(accno);
	}

	public void submitButton() {
		submitButton.click();
	}

}
