@littlewood
Feature: Littlewood Testing

  Scenario: Register with littlewood application

    Given I m using littlewoods website
    When I click on my account link
    When I click on join button
    Then I enter following details to register
   ##hen I get following<validation> message
      | title | firstName | lastName | day | month | year | contact     | mobileNumber | emailAdress            | confirmEmailAdress     | password     | confirmPassword | homeAdress | postcode | validation                                     |
      | Mr    | selenium  | selenium | 05  | June  | 1980 | 07710107616 | 07710107616  | selenium1986@gmail.com | selenium1986@gmail.com | selenium1986 | selenium1986    | 89         | e62bx    | This email address has already been registered |

