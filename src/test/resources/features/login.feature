@login
Feature: Login

  @smoke
  Scenario: Login successfully
    Given I open Login Page
    When I fill the username with "tomsmith"
    And I fill the password with "SuperSecretPassword!"
    And I click on Login
    Then I see "You logged into a secure area!" message

  Scenario: Login with invalid user
    Given I open Login Page
    When I fill the username with "invalid"
    And I fill the password with "SuperSecretPassword!"
    And I click on Login
    Then I see "Your username is invalid!" message