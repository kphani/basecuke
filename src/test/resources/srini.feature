@regis
Feature: hollandandbarrett testing

  Scenario: regiserting in to hollandandbarrett application

    Given I m on hollandandbarrett home page
    When  I click on register button
    Then  I submit following details to register


      | first    | last     | email                    | confirmemail             | password     | confirmpassword | validationMessag                                                  |
      | selenium | srinivas | vasu.yadav1986@gmail.com | vasu.yadav1986@gmail.com | selenium1986 | selenium1986    | Please enter another email address,entered address already exists |

  @myfirst

  Scenario: Checking the account status
    Given I m on mainpage of holland site
    When  I click on myaccount link
    Then  I submit vasu.yadav1986@gmail.com and selenium1986 detail
    Then  I see <myaccount> details
    And   when i click logout link it should logout







