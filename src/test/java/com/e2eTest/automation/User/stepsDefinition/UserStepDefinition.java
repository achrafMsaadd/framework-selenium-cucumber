package com.e2eTest.automation.User.stepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.AthentificationParam.pageObjects.AuthentificationParamPage;
import com.e2eTest.automation.User.pageObjects.UserPage;
import com.e2eTest.automation.authentification.pageObjects.AuthentificationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class UserStepDefinition {
public WebDriver driver ;

public UserPage userPage = new UserPage(driver);

public UserStepDefinition () {
	
	driver=Setup.driver;
}

@When("^je clique sur le module PIM$")
public void jeCliqueSurLeModulePIM() throws Throwable {
	
	
	PageFactory.initElements(driver, UserPage.class);

    userPage.clickPim();
   
}

@And("^je clique sur le module addEmployee$")
public void jeCliqueSurLeBoutonAddEmployee() throws Throwable {
	
   
   userPage.clickAddUser();
 
}

//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

@And("^je saisie nom de nouveau employeur \"([^\"]*)\"$")
public void jeSaisieNomDeNouveauEmployeur(String nameEmployer) throws Throwable {
	
    userPage.sendFullName(nameEmployer);
   
}

@And("^je saisie le prenom de employeur \"([^\"]*)\"$")
public void jeSaisieLePrenomDeEmployeur(String last_name) throws Throwable {
	PageFactory.initElements(driver, UserPage.class);
	
    userPage.sendLastName(last_name);
   
}

@And("^je saisie identifiant de employeur  \"([^\"]*)\"$")
public void jeSaisieIdentifiantDeEmployeur(String id) throws Throwable {
  userPage.sendIdentifiant(id);
}

@When("^je sauvgarde le nouveau employeur$")
public void jeSouvgardeLeNouveauEmployeur() throws Throwable {
    userPage.clickSavebtn();
   
}





}
