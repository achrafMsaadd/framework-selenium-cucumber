package com.e2eTest.automation.userOrange.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.util.Setup;

public class CrudUserOrangePage {

	WebDriver driver;

	public CrudUserOrangePage(WebDriver driver) {
		driver = Setup.driver;
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String BTN_ADMIN_ID = "menu_admin_viewAdminModule";
	@FindBy(how = How.ID, using = BTN_ADMIN_ID)
	public static WebElement adminBtn;

	final static String BTN_ADD_USER = "btnAdd";
	@FindBy(how = How.NAME, using = BTN_ADD_USER)
	public static WebElement addBtn;

	final static String FIELD_EMPLOYER_NAME = "systemUser_employeeName_empName";
	@FindBy(how = How.ID, using = FIELD_EMPLOYER_NAME)
	public static WebElement employerName;

	final static String USER_NAME = "systemUser_userName";
	@FindBy(how = How.ID, using = USER_NAME)
	public static WebElement UserName;
	final static String PASSWORD = "systemUser_password";
	@FindBy(how = How.ID, using = PASSWORD)
	public static WebElement fieldPassword;
	final static String PASSWORD_CONFIRM = "systemUser_confirmPassword";
	@FindBy(how = How.ID, using = PASSWORD_CONFIRM)
	public static WebElement fieldConfirmPassword;

	final static String SAVE_BTN = "btnSave";
	@FindBy(how = How.ID, using = SAVE_BTN)
	public static WebElement saveUserBtn;

	final static String JOBMENU_BTN = "menu_admin_viewAdminModule";
	@FindBy(how = How.ID, using = JOBMENU_BTN)
	public static WebElement jobBtnMenu;

	
	final static String JOB_BTN = "menu_admin_Job";
	@FindBy(how = How.ID, using = JOB_BTN)
	public static WebElement jobBtn;

	final static String ADDJOB_BTN = "menu_admin_viewJobTitleList";
	@FindBy(how = How.ID, using = ADDJOB_BTN)
	public static WebElement addJobBtn;

	
	
	final static String TITLE_JOB ="jobTitle_jobTitle";
	final static String ADDJOBBTN="btnAdd";
	public void ClickOnAdminButton() {
		adminBtn.click();
	}

	public void ClickOnAdduser() {
		addBtn.click();
	}
	

	public void clickOnJobMenu() {

		driver.findElement(By.id((BTN_ADMIN_ID))).click();
		driver.findElement(By.id((JOB_BTN))).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id((ADDJOB_BTN))).click();
		driver.findElement(By.id(ADDJOBBTN)).click();;
	}

	public void clickOnAddJob() {
		addJobBtn.click();
	}

	
	
	
	
	
	
	public void SendNameOfUser(String user_name) {

		
		
		
		UserName.sendKeys(user_name);

		
		
		
		
		
	}

	public void SendNameOfEmployer(String employer_name) {

		employerName.sendKeys(employer_name);

	}

	public void SendPassword(String password) {

		fieldPassword.sendKeys(password);

	}

	public void ConfirmPassword(String confirm_password) {

		fieldConfirmPassword.sendKeys(confirm_password);
	}

	
	
	
	public void AddUser() {

		saveUserBtn.click();
	}

	
	public void sendTitleJob(String title ) {
		driver.findElement(By.id(TITLE_JOB)).sendKeys(title);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
