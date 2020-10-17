@tag
Feature: Authentication -param -OrangeHRM
 As a user i want to authenticate 
Background:
Given Je ouvre l application orangeHRM
    When Je saisie le nom de l'utilisateur   "Admin"
    And  Je saisie le mot de passe "admin123"
    And Je clique sur le bouton login
    Then redirection vers la page home
  
   @buzz
   Scenario: Clique - Buzz
    
    When Je clique sur le module  Buzz
    
    @temps
    Scenario: Clique - Temps
    
    When Je clique sur le module Temps