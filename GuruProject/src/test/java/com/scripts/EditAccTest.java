package com.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.EditAccountPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.NewAccountPage;

public class EditAccTest extends BaseTest {
	@Test
	public void editTest() {

		LoginPage lp = new LoginPage(driver);

		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp = new HomePage(driver);
		hp.EditAccountClick();

		EditAccountPage epage = new EditAccountPage(driver);
		epage.setAccountNum1("58106");
		epage.submitButton();

		
		epage.setAcctype("Current");
		epage.submitButton();

		String exMsg = "Account details updated Successfully!!!";
		String obMsg = epage.getEditAccSuccessfulMsg();
		assertEquals(exMsg, obMsg);
	}
}
