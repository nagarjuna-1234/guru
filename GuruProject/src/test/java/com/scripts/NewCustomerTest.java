package com.scripts;

import static org.testng.Assert.assertEquals;

//import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.NewCustomerPage;

public class NewCustomerTest extends BaseTest {
	@Test
	public void testAddewCustomer() {
		LoginPage lp = new LoginPage(driver);

		lp.setUsername("mngr181783");
		lp.setPwd("EvupujE");
		lp.clickLoginButton();

		HomePage hp=new HomePage(driver);
		hp.addNewCustomer();
		
		NewCustomerPage n = new NewCustomerPage(driver);
		n.setCustomername("TRagarjuna");
		n.setGeneral("male");
		n.setDOB("7/5/1995");
		n.setAddress("btm");
		n.setCity("banglore");
		n.setState("AP");
		n.setPin("517213");
		n.setMoblilenum("9581484814");
		n.setEmail("naergbtech219@gmail.com");
		n.setPassword("8142061866");
		n.clicksubmitButton();
		driver.switchTo().alert().accept();

		String eMsg = "Customer Registered Successfully!!!";
		String oMsg = n.getCustAddedMsg();
		assertEquals(eMsg, oMsg);

	}
}
