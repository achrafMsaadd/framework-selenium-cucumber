package com.e2eTest.automation.timeReports.stepsDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.timeReports.pageObjects.projectReportPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProjectreportStepDefintion {
	
	WebDriver driver;
	projectReportPage projectReportPage=new projectReportPage(driver);
	public ProjectreportStepDefintion ()  {
		driver=Setup.driver;
	}
	@Given("^je ouvre le menu time report$")
	public void jeOuvreLeMenuTimeReport() throws Throwable {
	    projectReportPage.goTOMenuProjectReport();
	    String expectedTitle ="Project Report";
	  String  actualTitle =projectReportPage.getTilteOfMenu();
	  System.out.println("the title of menus is :" +actualTitle);
	  Assert.assertEquals(expectedTitle, actualTitle);
	  
	    
	}

	@When("^je sectionne le projet$")
	public void jeSectionneLeProjet() throws Throwable {
	   projectReportPage.selectProject(); 
	}

	@When("^je selectionne la date$")
	public void jeSelectionneLaDate() throws Throwable {
	    projectReportPage.selectDate();
	}

	@When("^je coche le bouton$")
	public void jeCocheLeBouton() throws Throwable {
	   projectReportPage.clickOnApprovedTimeSheetBtn();
	}

	@When("^je clique sur visualiser$")
	public void jeCliqueSurVisualiser() throws Throwable {
	  projectReportPage.ClickOnViewProject();
	}

	@Then("^redirection vers la page de visualisation$")
	public void redirectionVersLaPageDeVisualisation() throws Throwable {
	 String actuelTitle=projectReportPage.getTitleOfPageProjectDetails();
	 String expectedTitle="Project Activity Details Report";
	 Assert.assertEquals(expectedTitle, actuelTitle);
	}
	
	

}
