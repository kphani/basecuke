@my
Feature: my test

#  Scenario: login test
#
#    Given I m on main page
#    When  i click on account link
#    When enter selenium1986@gmail.com and selenium1986
#    And I click signin button
#    Then I should log in successfully

#@glass
#
#Scenario : glasses link
#
#Given I m logged in user
#When I click on glasses link
#And I click on desiner link
#Then page with desiner names should dispaly
#When  I click hugo boss page image
#Then popular hugo boss glasses page should load

  @sports
  Scenario:sportsdirect login test
    Given I m on sports direct page
    When  I click on sign in button
    When I click on new customer  continue button
    And user entered below details to register as new user
      | email                  | confEmail | title | firstName | lastName | dob      | mobile    | doorName | streetName     | city   | postCode | pwd          | cPwd         | validationMsg |
      | selenium1986@gmail.com |           | Mr    | vas       | sri      | 05/06/80 | 984806030 | 89       | altmore avenue | london | e6 2bx   | selenium1986 | selenium1986 |               |
      | selenium1986@gmail.com | sds          | Mr    | vas       | sri      | 05/06/80 | 984806030 | 89       | altmore avenue | london | e6 2bx   | selenium1986 | selenium1986 |               |
#    Then I should successfully register






