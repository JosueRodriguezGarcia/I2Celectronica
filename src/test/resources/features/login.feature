Feature: Login
  Scenario:Sign In with valid credential
    Given I go the "login" page
    When I fill the form with "email" and "password"
    Then Greeting the user should appear in the page

#  Scenario: Login as registered user
#    Given I go the "acount" page
#
#  Scenario: Login as registered user
#    Given I go the "about" page