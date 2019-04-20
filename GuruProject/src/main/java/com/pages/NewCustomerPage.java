package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import okhttp3.Address;

public class NewCustomerPage extends BasePage {

	public NewCustomerPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(name = "name")
	private WebElement customername;
	
	@FindBy(name = "rad1")
	private WebElement general;

	@FindBy(id = "dob")
	private WebElement dob;

	@FindBy(name = "addr")
	private WebElement address;

	@FindBy(name = "city")
	private WebElement city;

	@FindBy(name = "state")
	private WebElement state;

	@FindBy(name = "pinno")
	private WebElement pin;

	@FindBy(name = "telephoneno")
	private WebElement moblilenum;

	@FindBy(name = "emailid")
	private WebElement email;

	@FindBy(name = "password")
	private WebElement password;

	@FindBy(name = "sub")
	private WebElement submit;	
	
	@FindBy(xpath="//p[.='Customer Registered Successfully!!!']")
	private WebElement custAddedSuccessMsg;

	
	@FindBy(xpath="//p[.='Customer details updated Successfully!!!']")
	private WebElement custEditSuccessMsg;
	
	public String getCustAddedMsg() {
		return custAddedSuccessMsg.getTagName();
	}
	
	public String getCustEditedMsg() {
		return custEditSuccessMsg.getTagName();
	}
	public void setCustomername(String customername) {
		this.customername.sendKeys(customername);
	}

	public void setGeneral(String general) {
		this.general.click();
	}

	public void setDOB(String dOB) {
		this.dob.sendKeys(dOB);
	}

	public void setAddress(String address) {
		this.address.sendKeys(address);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}

	public void setPin(String pin) {
		this.pin.sendKeys(pin);
	}

	public void setMoblilenum(String moblilenum) {
		this.moblilenum.sendKeys(moblilenum);
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clicksubmitButton() {
	submit.click();
	}

	
}
