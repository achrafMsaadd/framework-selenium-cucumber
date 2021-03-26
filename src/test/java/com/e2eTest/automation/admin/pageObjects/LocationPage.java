package com.e2eTest.automation.admin.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.util.Setup;

public class LocationPage {
	WebDriver driver;

	public LocationPage(WebDriver driver) {
		driver = Setup.driver;
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String adminMenu = "menu_admin_viewAdminModule";
	final static String adminOrganisationMenu = "menu_admin_Organization";
	final static String adminLocationMenu = "menu_admin_viewLocations";
	final static String titlelocation = "//h1[@id='searchLocationHeading']";
	final static String buttonAdd = "btnAdd";
	final static String titleAddLocation = "//h1[@id='locationHeading']";
    final static String nameField="//input[@id='location_name']";
    final static String tel="//input[@id='location_phone']";
    
	public void ClickOnMenuLocation() {

		
		driver.findElement(By.id(adminMenu)).click();
		driver.findElement(By.id(adminOrganisationMenu)).click();
		driver.findElement(By.id(adminLocationMenu)).click();

	}

	public String getTitleofMenulocation() {

		String title = driver.findElement(By.xpath(titlelocation)).getText();

		return title;

	}

	public void clickOnaddLocation() {

		
		
		
		
		
		driver.findElement(By.id(buttonAdd)).click();
	}

	public String getTitleOfmenuAddLocation() {

		String titleAddMenu = driver.findElement(By.xpath(titleAddLocation)).getText();
		return titleAddMenu;
	}
 public void fillData(String nameUser , String telphoneNumber) {
	 
	 driver.findElement(By.xpath(nameField)).sendKeys(nameUser);
	 driver.findElement(By.xpath(tel)).sendKeys(telphoneNumber);
	 Select country= new Select(driver.findElement(By.id("location_country")));
	 country.selectByVisibleText("Tunisia");
	 
 }
 
 public void addLocation () throws InterruptedException {
	 
	 driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	 Thread.sleep(30);
 }
	
	
	
	
}