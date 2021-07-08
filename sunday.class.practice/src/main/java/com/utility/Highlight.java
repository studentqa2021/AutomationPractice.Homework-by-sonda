package com.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlight {
public static void getColor(WebDriver driver,WebElement element){
	JavascriptExecutor obj = (JavascriptExecutor)driver;
	   obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: teal; border: 2px solid black;");
}
}
