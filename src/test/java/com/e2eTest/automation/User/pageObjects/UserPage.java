package com.e2eTest.automation.User.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

public class UserPage {

	WebDriver driver;

	public UserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/* identify web element used in this page */
	final static String MODULE_PIM_ID = "menu_pim_viewPimModule";
	final static String ADD_BTN_ID = "btnAdd";
	final static String FULL_NAME_ID = "firstName";
	final static String LAST_NAME_ID = "lastName";
	final static String IDENTIFIANT_ID = "employeeId";
	final static String SAVE_BTN_ID = "btnSave";

	/* @FindBy */
	@FindBy(how = How.ID, using = MODULE_PIM_ID)
	public static WebElement modulePim;
	@FindBy(how = How.ID, using = ADD_BTN_ID)
	public static WebElement addBtn;
	@FindBy(how = How.ID, using = FULL_NAME_ID)
	public static WebElement fullName;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement last_Name;
	@FindBy(how = How.ID, using = SAVE_BTN_ID)
	public static WebElement saveBtn;
	@FindBy(how = How.ID, using = IDENTIFIANT_ID)
	public static WebElement identifiantUser;

	
	public void clickPim() {
		modulePim.click();
	}

	public void clickAddUser()  {
	
		addBtn.click();
		
	}

	public void sendFullName(String first_name) {
		fullName.sendKeys(first_name);
	}

	public void sendLastName(String last_name) {
		last_Name.sendKeys(last_name);
	}

	public void sendIdentifiant(String identifiant)  {
		identifiantUser.sendKeys(identifiant);
	
	}

	public void clickSavebtn() {
		saveBtn.click();
	}
	
	
	

}
