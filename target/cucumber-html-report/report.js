$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin/Admin.feature");
formatter.feature({
  "line": 2,
  "name": "Admin - OrangeHRM",
  "description": "En tant que utilisateur je souhaite verifier le module Admin",
  "id": "admin---orangehrm",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@admin"
    }
  ]
});
formatter.scenarioOutline({
  "line": 11,
  "name": "Creation Admin - OrangeHRM",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 10,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "je clique sur le module Admin",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "je clique sur le bouton Add",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "je saisie nom employee \"\u003cnamemployer\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je saisie mon mot de passe \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je saisie confirme mot de passe \"\u003cconfirmPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "je clique sur le bouton Save",
  "keyword": "When "
});
formatter.examples({
  "comments": [
    {
      "line": 18,
      "value": "# Then je verifie le nom Admin ajoute"
    }
  ],
  "line": 19,
  "name": "",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm;",
  "rows": [
    {
      "cells": [
        "nameEmployer",
        "password",
        "confirmPassword"
      ],
      "line": 20,
      "id": "admin---orangehrm;creation-admin---orangehrm;;1"
    },
    {
      "cells": [
        "Alice Duval",
        "alice1234",
        "alice1234"
      ],
      "line": 21,
      "id": "admin---orangehrm;creation-admin---orangehrm;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8533068200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Je ouvre l application orangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Je saisie le nom de l\u0027utilisateur \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Je saisie le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Je clique sur le bouton login",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "redirection vers la page home",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 5579483600,
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
  "duration": 59503100,
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
  "duration": 50660900,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.jeCliqueSurLeBoutonLogin()"
});
formatter.result({
  "duration": 3257383700,
  "status": "passed"
});
formatter.match({
  "location": "AuthentificationStepDefinition.redirectionVersLaPageHome()"
});
formatter.result({
  "duration": 3078017700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Creation Admin - OrangeHRM",
  "description": "",
  "id": "admin---orangehrm;creation-admin---orangehrm;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@admin"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "je clique sur le module Admin",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "je clique sur le bouton Add",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "je saisie nom employee \"\u003cnamemployer\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "je saisie mon mot de passe \"alice1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "je saisie confirme mot de passe \"alice1234\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "je clique sur le bouton Save",
  "keyword": "When "
});
formatter.match({
  "location": "AdminStepsDefinition.jeCliqueSurLeModuleAdmin()"
});
formatter.result({
  "duration": 1740870200,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepsDefinition.jeCliqueSurLeBoutonAdd()"
});
formatter.result({
  "duration": 2021432800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cnamemployer\u003e",
      "offset": 24
    }
  ],
  "location": "AdminStepsDefinition.jeSaisieNomEmployee(String)"
});
formatter.result({
  "duration": 94706900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alice1234",
      "offset": 28
    }
  ],
  "location": "AdminStepsDefinition.jeSaisieMonMotDePasse(String)"
});
formatter.result({
  "duration": 79862800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "alice1234",
      "offset": 33
    }
  ],
  "location": "AdminStepsDefinition.jeSaisieConfirmeMotDePasse(String)"
});
formatter.result({
  "duration": 58425800,
  "status": "passed"
});
formatter.match({
  "location": "AdminStepsDefinition.jeCliqueSurLeBoutonSave()"
});
formatter.result({
  "duration": 44234500,
  "status": "passed"
});
formatter.after({
  "duration": 1540186300,
  "status": "passed"
});
});