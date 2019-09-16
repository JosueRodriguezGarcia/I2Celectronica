Feature: Account
  Background: Login
    Given I go the login page
    When I fill the form with email and password
    Then The message Hi, Demo User should appear in the page

  Scenario: Update address
    Given I go My Profile section in Account page
    When I fill the form with new address in account page
      |address1|Address test1 #123|
      |address2|Address test2 #456|
      |city    |Cochabamba        |
      |state   |Cochabamba        |
      |zip     |00000             |
#      |country |Bolivia           |
    Then The Message Profile Updated Successfully. is Display.
