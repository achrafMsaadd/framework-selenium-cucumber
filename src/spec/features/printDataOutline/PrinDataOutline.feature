@print_data
Feature: Print data - Text box
  As a user i want to print my data

  @print_data
  Scenario Outline: Print data - Text box
    Given I open application text box    
    When I want to print full name "<fullName>"  
    And I want to print email "<emailAddress>"   

    Examples: 
      | fullName |     emailAddress |
      | Achref   | achref@gmail.com |
      | mariem   | mariem@gmail.com |
