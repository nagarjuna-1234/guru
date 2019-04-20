package com.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.EditCusPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.NewCustomerPage;

public class EditCusTest extends BaseTest {
	@Test
	public void testAddewCustomer() {
		LoginPage lp = new LoginPage(driver);

		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp = new HomePage(driver);
		hp.editCusClick();

		EditCusPage ePage = new EditCusPage(driver);

		ePage.enterCustomerID("21252");
		ePage.clicksubmitButton();
		ePage.editCustomerMsg();

		NewCustomerPage nPage = new NewCustomerPage(driver);
		// nPage.setCustomername("nagarjuna NG");

		nPage.setAddress("btm layout 2nd");
		nPage.setState("KARAna");
		nPage.setPin("560029");
		nPage.clicksubmitButton();

		String eMsg = " Customer details updated Successfully!!!";
		String oMsg = nPage.getCustAddedMsg();
		assertEquals(eMsg, oMsg);

	}
}
