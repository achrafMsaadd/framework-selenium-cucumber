@admin
Feature: Admin - OrangeHRM
  En tant que utilisateur je souhaite verifier le module Admin
  Background:
   Given Je ouvre l application orangeHRM
    When Je saisie le nom de l'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then redirection vers la page home
  @admin
   Scenario Outline: Creation Admin - OrangeHRM
    When je clique sur le module Admin
    When je clique sur le bouton Add
    When je saisie nom employee "<namemployer>"  
    When je saisie mon mot de passe "<password>"
    When je saisie confirme mot de passe "<confirmPassword>" 
    When je clique sur le bouton Save
   # Then je verifie le nom Admin ajoute
      Examples: 
      | nameEmployer |  password | confirmPassword|
      | Alice Duval  | alice1234| alice1234 |
      #| mariem   | aliali |aliali|
    