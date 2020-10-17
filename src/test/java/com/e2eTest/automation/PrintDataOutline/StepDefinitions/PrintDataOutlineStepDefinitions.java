package com.e2eTest.automation.PrintDataOutline.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.PrintDataOutline.PageObjects.PrintDataOutline;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class PrintDataOutlineStepDefinitions {
	
	public WebDriver driver ;
    private PrintDataOutline printDataOutline = new PrintDataOutline(driver);
    public CommonMethods commonMethods= new CommonMethods();
	 public PrintDataOutlineStepDefinitions() {
	    	//driver ligne 16 houwa driver mte3 setup sychro entre les drivers //
	    	driver= Setup.driver;
	 }

	@Given("^I open application text box$")
	public void iOpenApplicationTextBox() throws Throwable {
		driver.get("https://demoqa.com/text-box");
       // logger.info("Je ouvre l application orangeHRM");
	    
	}

	@When("^I want to print full name \"([^\"]*)\"$")
	public void iWantToPrintFullName(String fullName) throws Throwable {
		PageFactory.initElements(driver, PrintDataOutline.class);
		PrintDataOutline.sendUserName(fullName);
	}

	@When("^I want to print email \"([^\"]*)\"$")
	public void iWantToPrintEmail(String emailAddress) throws Throwable {
		
		PrintDataOutline.sendEmail(emailAddress);
	   
	}
}
