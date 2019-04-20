package com.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.NewAccountPage;

public class NewAccountTest extends BaseTest {
	@Test
	public void testnewaccount() {
		LoginPage lp = new LoginPage(driver);

		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp = new HomePage(driver);
		hp.newAccountClick();

		NewAccountPage npage = new NewAccountPage(driver);
		npage.setCusid("21252");
		npage.setAcctype("saving");
		npage.setInitialdeposit("4000");
		npage.clicksubmitButton();

		String eMsg = "Account Generated Successfully!!!";
		String oMsg = npage.getNewAccountsussfulMsg();
		assertEquals(eMsg, oMsg);
	}
}
