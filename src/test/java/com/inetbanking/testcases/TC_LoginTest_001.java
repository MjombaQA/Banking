package com.inetbanking.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobjects.LoginPage;



public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws IOException{
		//driver.get(readconfig.getApplicationURL());
		logger.info("URL is opened");
		  
		LoginPage lp = new LoginPage(driver);
	    lp.setUserName(username);
	    logger.info("enter username");
	    
	    lp.setPassword(password);
	    logger.info("enter password");
	    
	    lp.submitBtn();
	    
	    if(driver.getTitle().equals("123Guru99 Bank Manager HomePage"))
	    
        {
	    	Assert.assertTrue(true);
	    }
		
        else
        {
        	

			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
        	
        }
		
		

	}

}
