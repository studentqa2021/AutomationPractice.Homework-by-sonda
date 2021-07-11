package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactoryAutomation.AutomationPageFactory;
import com.utility.BaseConfig;
import com.utility.Highlight;
import com.utility.Screenshot;

public class Automation {
	//WebDriver driver=new ChromeDriver();
	public  AutomationPageFactory baseLogin(WebDriver driver) {
	
	AutomationPageFactory obj= new AutomationPageFactory(driver);
	Highlight .getColor(driver, obj.getSigninbtn());;
	Screenshot.getScreenShot(driver, "Before signin Homepage");
	obj.getSigninbtn().click();
	Screenshot.getScreenShot(driver, "After signin Homepage");
	Highlight.getColor(driver, obj.getEmail());
	obj.getEmail().sendKeys(BaseConfig .getConfigValue("Email"));
	Highlight .getColor(driver, obj.getPasswd());
	obj.getPasswd().sendKeys(BaseConfig .getConfigValue("Passwd"));
	Screenshot.getScreenShot(driver, "Before Login ");
	obj.getLogin().click();
	Screenshot.getScreenShot(driver, "After Login");
    Highlight .getColor(driver, obj.getSignout());
	//signout
	boolean loginStatus = false;
	try {
		loginStatus = obj.getSignout().isDisplayed();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//java condition
	if(loginStatus) {
		System.out.println("Login passed");
	}else {
		System.out.println("Login failed");
	}
	
	//Screenshot.getScreenShot(driver, "After signin Homepage");
	//driver.quit();
	
	
	
	return obj;
	
}
}