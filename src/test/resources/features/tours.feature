Feature: Tours
  Scenario: Add a Wish in WishList
    Given I go My Profile section in Tours page
    When I fill the form of search
    |location|egypt     |
    |date    |19/09/2019|
    |guests  |2 guests  |
    |tourtype|public    |
    Then The message filter Search should appear in the page
    When Add a tourist package to the wish list
    And I go WishList in Account page
    Then Verify that the tourist package was added correctly