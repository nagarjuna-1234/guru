package com.scripts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.generic.BaseTest;
import com.pages.LoginPage;

public class LoginTest extends BaseTest {
    @Test
	public void testLogin() {
    	 logger=extent.createTest("testLogin");
    	LoginPage lp=new LoginPage(driver);
    	
    	lp.setUsername("mngr18178");
    	lp.setPwd("EvupujE");
    	lp.clickLoginButton();
    	
        driver.switchTo().alert().accept();
    	String eTitle="Guru99 Bank Manager HomePage";
    	String oTitle=lp.getPageTitle();
    	Assert.assertEquals(eTitle, oTitle);
    
    	
		
	}

}
