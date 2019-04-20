package com.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.BasePage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class LogoutTest extends BaseTest {
	@Test
	public void testLogout() {
		 logger=extent.createTest("testLogout");
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp = new HomePage(driver);
		hp.logout();
		driver.switchTo().alert().accept();

		String eTitle = "Guru99 Bank Home Page";
		String oTitle = lp.getPageTitle();
		Assert.assertEquals(eTitle, oTitle);

	}
}
