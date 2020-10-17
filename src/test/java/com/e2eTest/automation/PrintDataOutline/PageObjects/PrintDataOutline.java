package com.e2eTest.automation.PrintDataOutline.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrintDataOutline {
WebDriver driver;
	
	public PrintDataOutline(WebDriver driver) {
		this.driver= driver ;
		PageFactory.initElements(driver, this);
	}

	final static String FULL_NAME_ID = "userName";
	final static String EMAIL_ID = "userEmail";
	/* @FindBy */
	@FindBy(how = How.ID, using = FULL_NAME_ID)
	public static WebElement Name;
	@FindBy(how = How.ID, using = EMAIL_ID)
	public static WebElement email;
	/* Methode */

	public static  void sendUserName(String fullName) {
		Name.sendKeys(fullName);
	}
	
	public static  void sendEmail(String emailAddress) {
		email.sendKeys(emailAddress);
	}
	
}
