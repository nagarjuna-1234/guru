package com.scripts;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.DeleteCusPage;
import com.pages.HomePage;
import com.pages.LoginPage;

public class DeleteCustomerTest extends BaseTest {
	@Test
	public void deleteCusTest() {
		LoginPage lp = new LoginPage(driver);
		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();
		
		
		HomePage hp=new HomePage(driver);
		hp.deleteCusAccount();
		
		
		DeleteCusPage dpage=new DeleteCusPage(driver);
		dpage.setcusid("55730");
		dpage.submitButton();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().accept();
		String obMsg = alert.getText();

		String eMsg = "Customer does not exist!!";
		Assert.assertEquals(eMsg, obMsg);
		alert.accept();
	}
	}
	


