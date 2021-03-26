package com.e2eTest.automation.admin.stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.e2eTest.automation.admin.pageObjects.LocationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.When;

public class LocationStepsDefinition {

	WebDriver driver;
	LocationPage locationPage = new LocationPage(driver);

	public LocationStepsDefinition() {
		driver = Setup.driver;

	}

	@When("^je clique sur le module organisation$")
	public void jeCliqueSurLeModuleOrganisation() throws Throwable {
		locationPage.ClickOnMenuLocation();
		String actualTitle = locationPage.getTitleofMenulocation();
		System.out.println("the title of the page :" + actualTitle);
		String expectedTitle = "Locations";
		Assert.assertEquals(expectedTitle, actualTitle);

		
		
		
		
	}

	@When("^je clique sur le menu location$")
	public void jeCliqueSurLeMenuLocation() throws Throwable {

	}

	@When("^je clique sur ajouter location$")
	public void jeCliqueSurAjouterLocation() throws Throwable {
		locationPage.clickOnaddLocation();
		String actualTilte = locationPage.getTitleOfmenuAddLocation();
		System.out.println("the title of the page add location is :" + actualTilte);
		String expectedTitle = "Add Location";
		Assert.assertEquals(expectedTitle, actualTilte);
	}

	@When("^je saisie le nom <\"([^\"]*)\"> le pays  et le numéro de telphone <\"([^\"]*)\">$")
	public void jeSaisieLeNomLePaysEtLeNuméroDeTelphone(String arg1, String arg2) throws Throwable {
		locationPage.fillData(arg1, arg2);
	}

	@When("^je enregistre la location$")
	public void jeEnregistreLaLocation() throws Throwable {

		locationPage.addLocation();
		Thread.sleep(30000);
		String actualTitle = locationPage.getTitleofMenulocation();
		System.out.println("the title of the page :" + actualTitle);
		String expectedTitle = "Locations";
		Assert.assertEquals(expectedTitle, actualTitle);

		
	}

}
