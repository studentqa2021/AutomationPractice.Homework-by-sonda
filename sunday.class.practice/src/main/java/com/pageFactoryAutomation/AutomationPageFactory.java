package com.pageFactoryAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPageFactory {
	public AutomationPageFactory (WebDriver driver){
		PageFactory.initElements(driver, this);	
	}
@FindBy(xpath = "//*[contains (text(),'Sign in')]")
private WebElement signinbtn;


@FindBy(xpath="(//*[contains(@id,'email')])[2]")
private WebElement email;


@FindBy(xpath="//*[contains(@id,'passwd')]")
private WebElement passwd;

@FindBy(xpath="//*[contains(@class,'icon-lock left')]")
private WebElement login;

@FindBy(xpath="(//*[contains(text(),'Sign out')])[1]")
private WebElement signout;



public WebElement getSigninbtn() {
	return signinbtn;
}

public WebElement getEmail() {
	return email;
}

public WebElement getPasswd() {
	return passwd;
}

public WebElement getLogin() {
	return login;
}
public WebElement getSignout() {
	return signout;
}
}
