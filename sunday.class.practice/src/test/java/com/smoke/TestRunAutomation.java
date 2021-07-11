package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.Automation;
import com.generic.DriverManager;
import com.pageFactoryAutomation.AutomationPageFactory;

public class TestRunAutomation {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		driver = new DriverManager().getDriver();
	}

	@Test
	public void loginTest() {
		//java+selenium
		AutomationPageFactory obj = new Automation().baseLogin(driver);
		if (obj.getSignout().isDisplayed()) {

			Assert.assertTrue(obj.getSignout().isDisplayed(), "Login passed");

		} else {
			Assert.assertTrue(obj.getSignout().isDisplayed(), "Login failed");
		}

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}

}
