Feature: Authorization Definition on UI
  Background:
    Given I have opened the "Customer Management" application
   @loginPositive
  Scenario: (Positive Scenario) As a user ,I want to log in to the page by using valid credentials.
    When I enter a value "elvis.abazi" in the Username or email field
    And  I enter a value "1234" in the Password field
    And  I click the Sign in button for Sign in  Page
    Then I should be seeing that the "search sign" is shown on opened page
    When I have log out into the system.
    Then I should be seeing that the "Sign in to your account" page is opened for Login Page


   @loginNegative
  Scenario: (Negative Scenario) As a user ,I want to log in to the page by using invalid credentials.
    When I enter a value "afad" in the Username or email field
    And  I enter a value "asdfa" in the Password field
    And  I click the login button on Login Page
    Then I should be seeing the message "Invalid username or password." for Login Page
     Then I navigate the page: ""