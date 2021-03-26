@admin
Feature: Admin-organisation-locationMenu
  En tant que administrateur je veux ajouter une location 
  Background:
   Given Je ouvre l application orangeHRM
    When Je saisie le nom de l'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then redirection vers la page home
  @testlocation 
   Scenario Outline: Creation Location -OrangeHRM
    When je clique sur le module organisation 
    #And je clique sur le menu location 
    And je clique sur ajouter location 
    And je saisie le nom <"achraf123"> le pays  et le numéro de telphone <"0603020501">
   And je enregistre la location 
      Examples: 
      | nameUser |  telephoneNumber | 
      | achraf123   | 0603020501| 