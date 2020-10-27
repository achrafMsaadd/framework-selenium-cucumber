package com.e2eTest.automation.admin.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	WebDriver driver;

	public AdminPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/* identify web element used in this page */
	final static String MODULE_ADMIN_ID = "menu_admin_viewAdminModule";
	final static String BUTTON_ID = "btnAdd";
	final static String ADMIN_NAME = "systemUser_employeeName_empName";
	final static String ADMIN_PASSWORD = "systemUser_password";
	final static String ADMIN_CONFIRM_PASSWORD = "systemUser_confirmPassword";
	final static String BUTTON_SAVE_ID = "btnSave";

	/* @FindBy */
	@FindBy(how = How.ID, using = MODULE_ADMIN_ID)
	public static WebElement moduleAdmin;
	@FindBy(how = How.ID, using = BUTTON_ID)
	public static WebElement addButton;
	@FindBy(how = How.ID, using = ADMIN_NAME)
	public static WebElement AdminName;
	@FindBy(how = How.ID, using = ADMIN_PASSWORD)
	public static WebElement Admin_Pwd;
	@FindBy(how = How.ID, using = ADMIN_CONFIRM_PASSWORD)
	public static WebElement Admin_Confirm_Password;
	@FindBy(how = How.ID, using = BUTTON_SAVE_ID)
	public static WebElement Save_Button;

	
	public void ClickModuleAdmin() {

		moduleAdmin.click();
	}
	
	
	
	public void ClickAddButton() {
		addButton.click();
		
	}
	
	
	public void AddAdminName(String adminName) {
		AdminName.sendKeys(adminName);
	}

	public void AddAdminPassword(String password) {

		Admin_Pwd.sendKeys(password);
	}

	public void ConfirmAdminPassword(String confirmPassword) {

		Admin_Confirm_Password.sendKeys(confirmPassword);

	}
	
	public void ClickOnSavaButton() {
		
		Save_Button.click();
	}
 
}
