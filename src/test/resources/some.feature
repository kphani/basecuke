@reg
Feature: Belly

  Scenario: a few cukes
    Given I am on the Google page
    Then I am on yahoo page
    And click on basket link
    
    
    @sri
    Scenario:currys login test

   Given I am on main home page
    When  I enter selenium1986@gmail.com and selenium1986
    And   I click on sign in button
    Then  I should login successfully

  @goud 
  Scenario Outline:Currys Login tesT

    Given I am on currys home page
    When I enter <username> and <password>
    And I click on sign in button
    Then I should be in currys login page

  Examples:
    | username | password |
    |selenium1986@gmail.com | selenium1986|
    |selenium@gmail.com | selenium1986|
    |selenium1986@gmail.com | selenium198|
    |selenium198@gmail.com | selenium198|
    
    
