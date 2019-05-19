@currency
Feature: As a user I should be able to select  any given currency on homepage and see the Featured Products according to the selected currency.
  Scenario: User should be able to select the Euro currency.
    Given user is on the homepage
    When user selects the Euro Currency from dropdown
    Then user should be able to see the Featured Products in Euro.

  Scenario: User should be able to select the Dollar Currency
    Given user is on the homepage
    When user selects Dollar Currency from dropdown
    Then user should be able to see the Featured Products in Dollar.
