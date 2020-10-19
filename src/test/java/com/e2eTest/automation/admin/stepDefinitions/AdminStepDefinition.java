package com.e2eTest.automation.admin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.AthentificationParam.pageObjects.AuthentificationParamPage;
import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminStepDefinition {
	public WebDriver driver;

	public AdminStepDefinition() {
		driver = Setup.driver;
	}

	@When("^je clique sur le module Admin$")
	public void jeCliqueSurLeModuleAdmin() throws Throwable {
		PageFactory.initElements(driver, AuthentificationPage.class);
		PageFactory.initElements(driver, AuthentificationParamPage.class);

	}

	@When("^je clique sur le bouton Add$")
	public void jeCliqueSurLeBoutonAdd() throws Throwable {

	}

	@When("^je saisie nom employee \"([^\"]*)\"$")
	public void jeSaisieNomEmployee(String arg1) throws Throwable {

	}

	@When("^je saisie le mot de passe \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasse(String arg1) throws Throwable {

	}

	@When("^je saisie confirme mot de passe \"([^\"]*)\"$")
	public void jeSaisieConfirmeMotDePasse(String arg1) throws Throwable {

	}

	@When("^je clique sur le bouton Save$")
	public void jeCliqueSurLeBoutonSave() throws Throwable {

	}

	@Then("^je verifie le nom Admin ajouté$")
	public void jeVerifieLeNomAdminAjoute() throws Throwable {

	}
}
