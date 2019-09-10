Feature: Login
  Scenario: Login as registered user
    Given I go the login page
    When I fill the form with "email" and "password"
    Then My Account should appear in the title of the page
