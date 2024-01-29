Feature: Authorization Definition on UI


  Scenario: (Positive Scenario) As a user ,I want to log in to the page by using valid credentials.
    Given I have opened the "Customer Management" application
    When I enter a value "elvis.abazi" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
    Then I should be seeing that the "Customer Search" page is opened
    When I have log out into the system.
    Then I should be seeing that the "Sign in to your account" page is opened for Login Page



  Scenario: (Negative Scenario) As a user ,I want to log in to the page by using invalid credentials.
    Given I have opened the "Customer Management" application
    When I enter a value "" in the UserName field
    And  I enter a value "" in the Password field
    And  I click the login button for Login Page
    Then I should be seeing the message "Invalid username or password." for Login Page