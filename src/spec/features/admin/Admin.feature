@admin1
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
    Then je verifie le nom Admin ajoute "<nameAdmin1>"
      Examples: 
      | namemployer |  password | confirmPassword| nameAdmin1|
      | Alice Duval  | achraf1234| Achraf1234 | Alice Duval |
      #| mariem   | aliali |aliali|
    
    
    @admin1 @must
   Scenario Outline: Creation jobAdmin - OrangeHRM
  When je clique sur le module Admin 
	When je clique sur le module Adminjob 
	When je clique sur le bouton Add job 
	And je saisie job title "<title>" description "<description>" et notes "<notes>" 
   # And je importe le fichier job specification avec le chemin suivant "<path1>"
   # And je clique sur le bouton ajouter 
    Examples: 
      |  title| description  |notes  |path1 |
      |test   |  test          |test   |src/test/resources/temp/im1.jpg|
    