package com.scripts;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.generic.BaseTest;
import com.generic.ExcelDataReading;
import com.pages.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test
	public void testInvalidLogin() {
		//logger = extent.createTest("testInvalidLogin");
		SoftAssert sa = new SoftAssert();
		LoginPage lp = new LoginPage(driver);

		int rc = ExcelDataReading.getRowCount(INPUT_PATH, "invalidLogin");
		System.out.println("count:"+rc);
		for (int i = 1; i <= rc; i++) {
			String username = ExcelDataReading.getCellValue(INPUT_PATH, "invalidLogin", i, 0);
			String pwd = ExcelDataReading.getCellValue(INPUT_PATH, "invalidLogin", i, 1);
			lp.setUsername(username);
			lp.setPwd(pwd);
			lp.clickLoginButton();
			Alert alerts = driver.switchTo().alert();
			alerts.accept();
			String obsmsg = alerts.getText();
			String expmsg = "User or Password is not valid";
			sa.assertEquals(obsmsg, expmsg);
			sa.assertAll();
			

		}

	}

}
