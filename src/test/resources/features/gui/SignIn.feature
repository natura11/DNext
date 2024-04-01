@smoke @regression @bothNegativeAndPositiveSignIn
Feature: Authorization Definition on UI

  Background:
    Given I have opened the "Customer Management" application

  @signInPositive
  Scenario: (Positive Scenario) As a user ,I want to sign in to the page by using valid credentials.
    When I enter a value "gerta.vathi" in the Username or email field on Sign In page
    And  I enter a value "1234" in the Password field on Sign In page
    And  I click the Sign in button on Sign In page
    Then I should be seeing that the "gerta.vathi" is shown on opened home page
    When I have log out into the system on the home page.
    Then I should be seeing that the "Sign in to your account" header on Sign In page

  @signInNegative
  Scenario: (Negative Scenario) As a user ,I want to sign in to the page by using invalid credentials.
    When I enter a value "afad" in the Username or email field on Sign In page
    And  I enter a value "asdfa" in the Password field on Sign In page
    And  I click the Sign in button on Sign In page
    Then I should be seeing the message "Invalid username or password." on Sign In page