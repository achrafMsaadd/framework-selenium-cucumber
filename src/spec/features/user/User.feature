@user
Feature: Add a new user
  I want to use this feature for adding a new user via application orangehr

  Background: 
    Given Je ouvre l application orangeHRM
    When Je saisie le nom de l'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then redirection vers la page home

  @user
  Scenario Outline: Creation User - OrangeHRM
    When je clique sur le module PIM
    And je clique sur le module addEmployee
   # And je saisie nom de nouveau employeur "<nameEmployer>"
    And je saisie le prenom de employeur "<lastname>"
    And je saisie identifiant de employeur  "<id>"
    When je sauvgarde le nouveau employeur

    Examples: 
      | nameEmployer | lastname   | id    |
      | testorange   | testorange | 14236 |
      | root         | root       | 24583 |
