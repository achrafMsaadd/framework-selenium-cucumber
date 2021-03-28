@Time
Feature: Time-Report
  En tant que administrateur je veux visualiser un rapport 
  
  Background:
   Given Je ouvre l application orangeHRM
    When Je saisie le nom de l'utilisateur "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then redirection vers la page home
    
    
    @viewreportproject 
   Scenario:  -OrangeHRM
   Given je ouvre le menu time report 
   When je sectionne le projet 
   And je selectionne la date 
   And je coche le bouton 
   And je clique sur visualiser 
   Then redirection vers la page de visualisation 
   
   