@connexion
Feature: Autentification - orangeHRM
  En tant que utilisateur je souhaite m autentifier

  #user storie
  @cnx
  Scenario: Autentification - orangeHRM
    Given Je ouvre l application orangeHRM
    When Je saisie userName
    And Je saisie le mot de passe
    And Je clique sur le bouton login
    Then redirection vers la page home
