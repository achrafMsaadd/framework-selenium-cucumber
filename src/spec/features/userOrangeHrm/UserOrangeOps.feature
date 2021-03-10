@userops 
Feature: Add a new user 
	I want to use this feature for adding a new user via application orangehr


Background: 
	Given Je ouvre l application orangeHRM 
	When Je saisie le nom de l'utilisateur "Admin"
	And Je saisie le mot de passe "admin123" 
	And Je clique sur le bouton login 
	Then redirection vers la page home 
	
@userops1 
Scenario Outline: Creation User - OrangeHRM 
   Given Je clique sur le menu admin 
   Given Je clique sur ajouter un utilisateur
   When  Je saisie le nom de l'employeur "<NameEmployer>" 
   And   J'ajoute le nom de l'utilisateur "<Username>"
   And Je saisie le mot de passe de l'utilisateur "<Password>" 
   And  Je confirme le mot de passe "<ConfirmPassword>" 
   And Je clique sur le bouton ajouter utilisateur 
#    
	Examples: 
	| NameEmployer | Username   | Password   | ConfirmPassword |
	|  Alice Duval | Admin22222  |test0000002    |    test0000002     |

 
@userops @test02
Scenario Outline: Creation User - OrangeHRM 

Given Je clique sur le menu job title 
#When  je redirige vers la page add job 
When  Je saisie le titre de job "<title>"
Examples: 
	| title | 
    |testjob|