package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DeleteAccPage extends BasePage {

	public DeleteAccPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}
    @FindBy(name="accountno")
    private WebElement accNum;
	
@FindBy(name="AccSubmit")
private WebElement submit;

public void setaccNumber(String accnum) {
	this.accNum.sendKeys(accnum);
}
	public void submitButton() {
		submit.click();
	}
	
}



	
	

