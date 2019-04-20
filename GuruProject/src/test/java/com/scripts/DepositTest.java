package com.scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.DepositPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class DepositTest extends BaseTest {
	@Test
	public void deposit() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		
		HomePage hp = new HomePage(driver);
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(hp.getDepositElement()));
		hp.depositClick();
		DepositPage dp = new DepositPage(driver);
		dp.setaccNum("58106");
		dp.setamount("1000");
		dp.setdescription("nag");
		dp.submitButton();

		wait.until(ExpectedConditions.visibilityOf(dp.getDepositElement()));
		
		String exe = "Transaction details of Deposit for Account 58106";
		String obs = dp.getDepositSuccessfulMsg();
		Assert.assertEquals(obs,exe);
	}

}
