package com.e2eTest.automation.AthentificationParam.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.AthentificationParam.pageObjects.AuthentificationParamPage;
import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.When;

public class AuthentifcationParamStepDefinition {

	public WebDriver driver;

	public AuthentificationParamPage authentificationParamPage = new AuthentificationParamPage(driver);
	public AuthentificationPage authentificationPage = new AuthentificationPage(driver);

	public AuthentifcationParamStepDefinition() {
		driver = Setup.driver;
	}

	@When("^Je saisie le nom de l'utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeNomDeLUtilisateur(String name) throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		PageFactory.initElements(driver, AuthentificationParamPage.class);
		authentificationParamPage.sendUserName(name);
	}

	@When("^Je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String pwd) throws Throwable {
		authentificationParamPage.sendPassword(pwd);
	}

	@When("^Je clique sur le module Buzz$")
	public void jeCliqueSurLeModuleBuzz() throws Throwable {
		authentificationParamPage.clickModuleBuzz();
	}

	@When("^Je clique sur le module Temps$")
	public void jeCliqueSurLeModuleTemps() throws Throwable {
		authentificationParamPage.clickModuleTime();
	}

}
