package com.opencard.qa.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencard.qa.Utility.AppConstants;
import com.opencard.qa.base.BaseTest;

public class LoginPageTest extends BaseTest {
	@Test
	public  void LoginTest()
	{
		Assert.assertEquals( loginpage.IsTitle(), AppConstants.LOGIN_PAGE_TITLE);
	}

}
