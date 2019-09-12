Feature: Account
  Background: Login
    Given I go the "login" page
    When I fill the form with "email" and "password"
    Then The Message "Hi, Demo User" is Display on Account Page

  Scenario: Update address
    Given I go My Profile section in Account page
    When I fill the form with new address in Acconut page
      |address1|Address test1 #123|
      |address2|Adrress test2 #456|
      |city    |Cochabamba        |
      |state   |Cochabamba        |
      |zip     |00000             |
    Then The Message "Profile Updated Successfully." is Display.