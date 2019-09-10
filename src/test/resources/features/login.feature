Feature: Login
  Scenario: Login as registered user
    Given I go the login page
    When I fill the form with "email" and "password"
    Then My Account should appear in the title of the page

#  Scenario: Verify that personal information be can update
#    Given I go the "My-Account" page
#    When I fill the form with "old password" and "new password"
#
#  Scenario: Verify that new address be can adding
#    Given I go the "My-Addresses" page
#    When I press "add new address" button
#    And I fill the form with new addresses