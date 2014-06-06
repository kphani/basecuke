@reg
Feature: Belly

  Scenario: a few cukes
    Given I am on the Google page
    Then I am on yahoo page
    And click on basket link


  @sri
  Scenario:currys login test

    Given I am on main home page
    When  I type my credentials as selenium1986@gmail.com and selenium1986
    And   I click login button
    Then  I should login successfully

  @goud
  Scenario Outline:Currys Login tesT

    Given I am on currys home page
    When I enter <username> and <password>
    And I click on sign in button
    Then I should be in currys login page

  Examples:
    | username               | password     |
    | selenium1986@gmail.com | selenium1986 |
    | selenium@gmail.com     | selenium1986 |
    | selenium1986@gmail.com | selenium198  |
    | selenium198@gmail.com  | selenium198  |



  #CLINTON REGISTERING

  @clinton

  Scenario: register with clintoncards application

    Given I m on clinton application home page
    When  I click register button
    And   I submit following valid details to sign in
      | firstname | lastname | email                  | password     | confirmpassword |
      | seleni    | srini    | selenium1986@gmail.com | selenium1986 | selenium1986    |
      | sri       | vasu     | ssss                   | ssss         | jjjjj           |


  @srinilogging

  Scenario Outline: Logging in to clinton application with different set of data

    Given I m register customer of clinton website
    When  I click on sign in button on main page
    Then  I submit valid <userDetails> and <passwordDetails>
    Then  I should get message <validationMessage>
    Then  I have to get <usernameValidationMess>
    Then  I need to get <passwordValidaionMess>


  Examples:

    | userDetails            | passwordDetails | validationMessage    | usernameValidationMess                                             | passwordValidaionMess                                                         |
    | selenium1986@gmail.com | selenium1986    | Hello, seleni srini! |                                                                    |                                                                               |
    | selenium1986@gmail.com | sele            |                      |                                                                    | Please enter 6 or more characters. Leading or trailing spaces will be ignored |
    | selenium               | selenium1986    |                      | Please enter a valid email address. For example johndoe@domain.com |                                                                               |
    | seleni                 | sele            |                      | Please enter a valid email address. For example johndoe@domain.com | Please enter 6 or more characters. Leading or trailing spaces will be ignored |


  @sricorrectdetailslogging

  Scenario: logging with sri details in to clinton application

    Given  srinivas accessing clinton main page
    When  srini click on sign button
    When   sri submit valid selenium1986@gmail.com and selenium1986
    Then  my details should dispaly on page

  @BasketAdding

  Scenario: Adding to the basket and checking the items added

    Given srinivasa using clintion homepage
    When  srinivasa hoover on login button
    When  srinivasa submit selenium1986@gmail.com and selenium1986
    When  srinivasa click on gift link
    Then  gifts page should display
    When  srinivasa click on gift for homes link
    And   srinivasa click on item
    And   srinivas verify the itemdetails
    And   select the quantity 2
    And   click addtobasket button and checkout
    And   successfully add to basket message should display

  @sametestwithexamples

  Scenario Outline: checkout test
    Given user is on homepage
    When  user click on login button on homepage
    Then  user submit valid <username> and <password>
    And   user click on <links> below to perform actions on application
    And   user click on the  product <item>
    And   user select <quantity> and add item to basket
    And   checkout and verify the same <product> item added to basket
  Examples:
    | username               | password     | links     | item                                         | quantity | product                                      |
    | selenium1986@gmail.com | selenium1986 | GiftCards | TY Beanies - Hello Kitty Rainbow - Small     | 2        | TY Beanies - Hello Kitty Rainbow - Small     |
    | selenium1986@gmail.com | selenium1986 | Cards     | Just Wink Purple Flower Congratulations Card | 5        | Just Wink Purple Flower Congratulations Card |