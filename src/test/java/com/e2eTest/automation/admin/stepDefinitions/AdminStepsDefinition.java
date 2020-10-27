package com.e2eTest.automation.admin.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import com.e2eTest.automation.admin.pageObjects.AdminPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.When;

public class AdminStepsDefinition {

	public WebDriver driver;

	public AdminStepsDefinition() {
		driver = Setup.driver;
	}

	public AdminPage adminPage = new AdminPage(driver);

	@When("^je clique sur le module Admin$")
	public void jeCliqueSurLeModuleAdmin() throws Throwable {
		
		PageFactory.initElements(driver, AdminPage.class);
		adminPage.ClickModuleAdmin();

	}

	@When("^je clique sur le bouton Add$")
	public void jeCliqueSurLeBoutonAdd() throws Throwable {
		adminPage.ClickAddButton();

	}

	@When("^je saisie nom employee \"([^\"]*)\"$")
	public void jeSaisieNomEmployee(String nameEmployer) throws Throwable {
		adminPage.AddAdminName(nameEmployer);

	}

	@When("^je saisie mon mot de passe \"([^\"]*)\"$")
	public void jeSaisieMonMotDePasse(String password) throws Throwable {
		adminPage.AddAdminPassword(password);

	}

	@When("^je saisie confirme mot de passe \"([^\"]*)\"$")
	public void jeSaisieConfirmeMotDePasse(String confirmPassword) throws Throwable {
		adminPage.ConfirmAdminPassword(confirmPassword);

	}

	@When("^je clique sur le bouton Save$")
	public void jeCliqueSurLeBoutonSave() throws Throwable {
		adminPage.ClickOnSavaButton();

	}

}
