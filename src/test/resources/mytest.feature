
@my
Feature: my test

Scenario: login test

Given I m on main page
When  i click on account link
When enter selenium1986@gmail.com and selenium1986
And I click signin button
Then I should log in successfully

@glass

Scenario : glasses link

Given I m logged in user
When I click on glasses link
And I click on desiner link
Then page with desiner names should dispaly
When  I click hugo boss page image
Then popular hugo boss glasses page should load

@sports

Scenario : sportsdirect login test

Given I m on sportsdirect page
When  I click on sign in button
When I click on new customer  continue button
And enter my selenium1986@gmail.com
And retype my selenium1986@gmail.com
And select Mr from dropdownlist
And enter my srini 
And enter my vas
And enter my 05/06/1980
And enter my 89
And enter my altmore avenue
And enter my east ham
And enter my e62bx
And enter my 9848603090
And enter my selenium1986
And confirm enter my selenium1986
Then I click on register button
Then I should successfully register






