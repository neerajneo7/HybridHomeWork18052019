@register
Feature: As a user I should be able to register on the given website after filling in all compulsory fields on the registration form.

  Scenario: User should be able to navigate to home page and click on register to see the registration form.
    Given user is on the homepage
    When user clicks on the register button
    Then user should be able to see the registration form successfully.

  Scenario: As a user I should then be able to register after filling in all compulsory fields on the registration form
    Given user is on the register page
    When user enters all the fields
    Then user should be able to register successfully
    And should see a message “Your registration completed”.
