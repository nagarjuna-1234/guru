package com.scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.DeleteAccPage;
import com.pages.HomePage;
import com.pages.LoginPage;

@Test
public class DeleteAccTest extends BaseTest {
	public void deleteaccTest() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp = new HomePage(driver);
		hp.deleteAccount();

		DeleteAccPage m = new DeleteAccPage(driver);
		m.setaccNumber("58095");
		m.submitButton();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		String obMsg = alert.getText();

		String eMsg = "Account does not exist";
		Assert.assertEquals(eMsg, obMsg);
		alert.accept();

	}
}
