Feature:New Business Customer-  General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with existing "L12345678M" nıpt number on Search Organization page
    And    User clicks the Next button on Search Organization page
    Then I should be seeing "General Information" tab for Corporate Customer

  Scenario: Test General Information for Customer Basic Information Creation
    Given   I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page

