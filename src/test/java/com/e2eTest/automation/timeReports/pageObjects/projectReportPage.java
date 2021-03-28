package com.e2eTest.automation.timeReports.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2eTest.automation.util.Setup;

public class projectReportPage {
	WebDriver driver ;
	
	public projectReportPage(WebDriver driver ) {
		driver = Setup.driver;
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	final static String timeMenu="menu_time_viewTimeModule";
	final static String reportMenu="menu_time_Reports";
	final static String reportProjectMenu="menu_time_displayProjectReportCriteria";
	final static String titleProjectReportMenu="//h1[@id='reportToHeading']";
	final static String selectBtnProject="time_project_name";
	final static String datefromrange="//input[@id='project_date_range_from_date']";
	final static String dateToRange="//input[@id='project_date_range_to_date']";
	final static String onlyApprovedTimeSheets="//input[@id='only_include_approved_timesheets']";
	final static String viewBtn="//input[@id='viewbutton']";
	
	public void goTOMenuProjectReport() throws InterruptedException {
		
		driver.findElement(By.id(timeMenu)).click();
		driver.findElement(By.id(reportMenu)).click();
		driver.findElement(By.id(reportProjectMenu)).click();
		Thread.sleep(3000);
	}
	public String getTilteOfMenu() {
		String title=driver.findElement(By.xpath(titleProjectReportMenu)).getText();
		return title ;
	}
	public void selectProject () throws InterruptedException {
		Select project =new Select(driver.findElement(By.id(selectBtnProject)));
		project.selectByValue("3");
		Thread.sleep(3000);
	}
	
	public void selectDate() throws InterruptedException {
		driver.findElement(By.xpath(datefromrange)).clear();
		driver.findElement(By.xpath(dateToRange)).clear();
		driver.findElement(By.xpath(datefromrange)).sendKeys("2020-03-15");
		driver.findElement(By.xpath(dateToRange)).sendKeys("2021-03-21");
		Thread.sleep(3000);
	}
	public void clickOnApprovedTimeSheetBtn() {
		driver.findElement(By.xpath(onlyApprovedTimeSheets)).click();
	}
    
	public void ClickOnViewProject() throws InterruptedException {
		
		driver.findElement(By.xpath(viewBtn)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Implementation')]")).click();
		Thread.sleep(3000);
	
	}
	public String getTitleOfPageProjectDetails() {
		String title =driver.findElement(By.xpath("//h1[contains(text(),'Project Activity Details Report')]")).getText();
		return title ;
		
	}
	
}
