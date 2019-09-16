Feature: Login
  @logout
  Scenario:Sign In with valid credential
    Given I go the login page
    When I fill the form with email.user and password.user
    Then The message Hi, Demo User should appear in the page

  Scenario: Login as administrator with valid credential
    Given I go the login administrator page
    When  I fill the form with email.admin and password.admin
#    Then The name SUPER ADMIN should appear in the page