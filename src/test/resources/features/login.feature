Feature: Login
  Scenario:Sign In with valid credential
    Given I go the login page
    When I fill the form with email and password
    Then The message Hi, Demo User should appear in the page
    