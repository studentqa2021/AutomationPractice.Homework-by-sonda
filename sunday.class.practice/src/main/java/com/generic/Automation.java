package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageFactoryAutomation.AutomationPageFactory;
import com.utility.BaseConfig;
import com.utility.Highlight;
import com.utility.Screenshot;

public class Automation {
	public static void baseLogin() {
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to(BaseConfig .getConfigValue("URL"));
	driver.manage().window().maximize();
	AutomationPageFactory obj= new AutomationPageFactory(driver);
	Highlight .getColor(driver, obj.getSigninbtn());
	Screenshot.getScreenShot(driver, "Before signin Homepage");
	obj.getSigninbtn().click();
	Screenshot.getScreenShot(driver, "After signin Homepage");
	Highlight .getColor(driver, obj.getEmail());
	obj.getEmail().sendKeys(BaseConfig .getConfigValue("Email"));
	Highlight .getColor(driver, obj.getPasswd());
	obj.getPasswd().sendKeys(BaseConfig .getConfigValue("Passwd"));
	Screenshot.getScreenShot(driver, "Before Login ");
	obj.getLogin().click();
	Screenshot.getScreenShot(driver, "After Login");
	Highlight .getColor(driver, obj.getSignout());
	obj.getSignout().click();
	Screenshot.getScreenShot(driver, "After signin Homepage");
	//driver.quit();
	
	//driver.findElement(By.xpath("//*[contains (text(),'Sign in')]"));
	
	
	
}
}