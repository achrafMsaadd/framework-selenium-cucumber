package com.e2eTest.automation.authentification.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthentificationPage {

	WebDriver driver;
	
	public AuthentificationPage(WebDriver driver) {
		this.driver= driver ;
		PageFactory.initElements(driver, this);
	}

	final static String USER_NAME_ID = "txtUsername";
	final static String USER_PASSWORD_ID = "txtPassword";
	final static String BUTTON_LOGIN_ID = "btnLogin";
	final static String WELCOME_ID = "welcome";

	/* @FindBy */
	@FindBy(how = How.ID, using = USER_NAME_ID)
	public static WebElement userName;
	@FindBy(how = How.ID, using = USER_PASSWORD_ID)
	public static WebElement userPassword;
	@FindBy(how = How.ID, using = BUTTON_LOGIN_ID)
	public static WebElement btnLogin;
	@FindBy(how = How.ID, using = WELCOME_ID)
	public static WebElement welcome;

	/* Methode */

	public  void sendUserName() {
		userName.sendKeys("Admin");
	}
	

	public  void sendUserPassword() {
		userPassword.sendKeys("admin123");

	}

	public  void clickLoginButton() {
		btnLogin.click();
	}


	public static void sendPassword(String pwd) {
		// TODO Auto-generated method stub
		
	}

}
