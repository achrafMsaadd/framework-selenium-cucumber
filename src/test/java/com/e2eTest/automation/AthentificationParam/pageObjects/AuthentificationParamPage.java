package com.e2eTest.automation.AthentificationParam.pageObjects;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.How;
	import org.openqa.selenium.support.PageFactory;

	public class AuthentificationParamPage {

		WebDriver driver;

		public AuthentificationParamPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		final static String USERNAME_ID = "txtUsername";
		final static String PASSWORD_ID = "txtPassword";
		final static String MODULE_BUZZ_ID = "menu_buzz_viewBuzz";
		final static String MODULE_TIME_ID = "menu_time_viewTimeModule";

		/* @FindBy */
		@FindBy(how = How.ID, using = USERNAME_ID)
		public static WebElement userName;
		@FindBy(how = How.ID, using = PASSWORD_ID)
		public static WebElement password;
		@FindBy(how = How.ID, using = MODULE_BUZZ_ID)
		public static WebElement buzz;
		@FindBy(how = How.ID, using = MODULE_TIME_ID)
		public static WebElement time;

		/* Methods */
		public void sendUserName(String name) {
			userName.sendKeys(name);
		}

		public void sendPassword(String pwd) {
			password.sendKeys(pwd);
		}

		public void clickModuleBuzz() {
			buzz.click();
		}

		public void clickModuleTime() {
			time.click();
		}
	}


