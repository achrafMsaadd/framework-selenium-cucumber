package com.e2eTest.automation.userOrange.StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.userOrange.pageObjects.CrudUserOrangePage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CrudUserOrangeStepDefintion {
	public WebDriver driver ;
	CrudUserOrangePage crudUserOrangePage= new CrudUserOrangePage(driver);
	public CrudUserOrangeStepDefintion () {
		driver = Setup.driver;
	}
	
	@Given("^Je clique sur le menu admin$")
	public void jeCliqueSurLeMenuAdmin() throws Throwable {
		crudUserOrangePage.ClickOnAdminButton();
	   
	}

	
	
	
	@Given("^Je clique sur ajouter un utilisateur$")
	public void jeCliqueSurAjouterUnUtilisateur() throws Throwable {
		crudUserOrangePage.ClickOnAdduser();

	}

	@When("^Je saisie le nom de l'employeur \"([^\"]*)\"$")
	public void jeSaisieLeNonDeLEmployeur(String NameEmployer) throws Throwable {
		crudUserOrangePage.SendNameOfEmployer(NameEmployer);
		

	}
	
	@When("^J'ajoute le nom de l'utilisateur \"([^\"]*)\"$")
	public void jAjouteLeNomDeLUtilisateur(String Username) throws Throwable {
		crudUserOrangePage.SendNameOfUser(Username);
	}

	@When("^Je saisie le mot de passe de l'utilisateur \"([^\"]*)\"$")
	public void jeSaisieLeMotDePasseDeLUtilisateur(String Password) throws Throwable {
		crudUserOrangePage.SendPassword(Password);
	}

	@When("^Je clique sur le bouton ajouter utilisateur$")
	public void jeCliqueSurLeBoutonAjouterUtilisateur() throws Throwable {
	    
		crudUserOrangePage.AddUser();
	
	}


	

	@When("^Je confirme le mot de passe \"([^\"]*)\"$")
	public void jeConfirmeLeMotDePasse(String ConfirmPassword) throws Throwable {
		crudUserOrangePage.ConfirmPassword(ConfirmPassword);
		
	}

	
	@Given("^Je clique sur le menu job title$")
	public void jeCliqueSurLeMenuJobTitle() throws Throwable {
		
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 crudUserOrangePage.clickOnJobMenu();
		 
	}

	
	@When("^Je saisie le titre de job \"([^\"]*)\"$")
	public void jeSaisieLeTitreDeJob(String title) throws Throwable {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		crudUserOrangePage.sendTitleJob(title);
	    
	}

	
	
}
