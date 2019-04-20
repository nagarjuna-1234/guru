package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;

import okhttp3.Address;

public class HomePage extends BasePage {

	public HomePage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[.='Log out']")
	private WebElement logoutButton;

	public void logout() {
		logoutButton.click();
	}

	@FindBy(xpath = "//a[.='New Customer']")
	private WebElement newCustomer;

	public void addNewCustomer() {
		newCustomer.click();
	}

	@FindBy(xpath = "//a[.='Edit Account']")
	private WebElement editcus;

	public void editCusClick() {
		editcus.click();
	}

	@FindBy(xpath = "//a[.='New Account']")
	private WebElement newaccount;

	public void newAccountClick() {
		newaccount.click();
	}

	@FindBy(xpath = "//a[.='Edit Account']")
	private WebElement editacc;

	public void EditAccountClick() {
		editacc.click();

	}

	@FindBy(xpath = "//a[.='Delete Customer']")
	private WebElement deletecus;

	public void deleteCusAccount() {
		deletecus.click();
	}
	// driver.switchTo().alert().accept();

	@FindBy(xpath = "//a[.='Delete Account']")
	private WebElement deleteaccount;

	public void deleteAccount() {
		// TODO Auto-generated method stub
		deleteaccount.click();
	}

	@FindBy(xpath = "//a[.='Deposit']")
	private WebElement deposit;

	public void depositClick() {
		deposit.click();
	}

	public WebElement getDepositElement() {
		return deposit;
	}
}
