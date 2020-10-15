package com.e2eTest.automation.authentification.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDefinition extends CommonMethods  {
	
    public WebDriver driver ;
    private AuthentificationPage authentificationpage = new AuthentificationPage(driver) ;
    public CommonMethods commonMethods= new CommonMethods();
    public AuthentificationStepDefinition() {
    	//driver ligne 16 houwa driver mte3 setup sychro entre les drivers //
    	driver= Setup.driver;
    }
	@Given("^Je ouvre l application orangeHRM$")
	public void jeOuvreLApplicationOrangeHRM() throws Throwable {
		commonMethods.readFromConfigFile();
        logger.info("Je ouvre l application orangeHRM");
        
	}

	@When("^Je saisie userName$")
	public void jeSaisieUserName() throws Throwable {
		//Initiate Elements  
		PageFactory.initElements(driver, AuthentificationPage.class);
		authentificationpage.sendUserName();
		 logger.info("Je saisie userName");
	}

	@When("^Je saisie le mot de passe$")
	public void jeSaisieLeMotDePasse() throws Throwable {
		authentificationpage.sendUserPassword();
		logger.info("Je saisie le mot de passe");
	}

	@When("^Je clique sur le bouton login$")
	public void jeCliqueSurLeBoutonLogin() throws Throwable {
		authentificationpage.clickLoginButton();
		logger.info("Je clique sur le bouton login");

	}

	@Then("^redirection vers la page home$")
	public void redirectionVersLaPageHome() throws Throwable {
		String welcome = authentificationpage.welcome.getText();
		Assert.assertTrue(welcome.contains("Welcome"));

	}

}
