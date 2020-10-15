$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentification/Authentification.feature");
formatter.feature({
  "line": 2,
  "name": "Autentification - orangeHRM",
  "description": "En tant que utilisateur je souhaite m autentifier",
  "id": "autentification---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@connexion"
    }
  ]
});
formatter.before({
  "duration": 8963249000,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 5,
      "value": "#user storie"
    }
  ],
  "line": 7,
  "name": "Autentification - orangeHRM",
  "description": "",
  "id": "autentification---orangehrm;autentification---orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@cnx"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Je ouvre l application orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Je saisie userName",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Je saisie le mot de passe",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "redirection vers la page home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 4265651500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieUserName()"
});
formatter.result({
  "duration": 66514000,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeSaisieLeMotDePasse()"
});
formatter.result({
  "duration": 62398500,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 5040098400,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 31135600,
  "status": "passed"
});
formatter.after({
  "duration": 1517047400,
  "status": "passed"
});
});