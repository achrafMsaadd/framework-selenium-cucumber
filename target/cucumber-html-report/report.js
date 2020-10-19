$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("authentificationParam/AuthentificationParam.feature");
formatter.feature({
  "line": 2,
  "name": "Authentication -param -OrangeHRM",
  "description": "As a user i want to authenticate",
  "id": "authentication--param--orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 8630976800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom de l\u0027utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "redirection vers la page home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3409867400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    }
  ],
  "location": "AuthentifcationParamStepDefinition.jeSaisieLeNomDeLUtilisateur(String)"
});
formatter.result({
  "duration": 61676800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentifcationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 56830700,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 3891884800,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 32734000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Clique - Buzz",
  "description": "",
  "id": "authentication--param--orangehrm;clique---buzz",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Je clique sur le module Buzz",
  "keyword": "When "
});
formatter.match({
  "location": "AuthentifcationParamStepDefinition.jeCliqueSurLeModuleBuzz()"
});
formatter.result({
  "duration": 3937056800,
  "status": "passed"
});
formatter.after({
  "duration": 1385018300,
  "status": "passed"
});
formatter.before({
  "duration": 8189412600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "Je ouvre l application orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le nom de l\u0027utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "redirection vers la page home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3141966600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 35
    }
  ],
  "location": "AuthentifcationParamStepDefinition.jeSaisieLeNomDeLUtilisateur(String)"
});
formatter.result({
  "duration": 58412300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 27
    }
  ],
  "location": "AuthentifcationParamStepDefinition.jeSaisieLeMotDePasse(String)"
});
formatter.result({
  "duration": 69645100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 4308574100,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 29040600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Clique - Temps",
  "description": "",
  "id": "authentication--param--orangehrm;clique---temps",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Je clique sur le module Temps",
  "keyword": "When "
});
formatter.match({
  "location": "AuthentifcationParamStepDefinition.jeCliqueSurLeModuleTemps()"
});
formatter.result({
  "duration": 1320021000,
  "status": "passed"
});
formatter.after({
  "duration": 1299513100,
  "status": "passed"
});
});