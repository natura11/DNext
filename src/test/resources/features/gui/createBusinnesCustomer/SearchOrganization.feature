@VFALFT-22203  @regression @searchOrganization
Feature:New Business Customer-Search Organization

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given  User should see the "customer/create-enterprise-customer" on Create Business Customer page
    Given User should see the "New Business Customer" header on screen on Create Customer page

  @smoke @existingNiptNumberForBusinessSearch
  Scenario:As a user,I want to search customer by using existing NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with existing "L12345678M" nıpt number on Search Organization page
    And    User clicks the Search button on Search Organization page
    Then   One "This organization cannot have more than one customer connected to it" is displayed on the screen on Search Organization page

  @smoke @invalidNiptNumberForBusinessSearch
  Scenario:As a user,I want to search customer by using invalid format  NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with invalid format  "O1254A4555" on Search Organization page
    Then   User sees "NIPT number must have first and last character string e.g A12345678B" under the NIPT field on Search Organization page
    And    User is not allowed to use the search button on Search Organization page

  @smoke @validNonExistingNiptNumberForBusinessSearch
  Scenario:As a user,I want to search customer by using valid and non-existing  NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with valid and non-existing  "R12985637T" on Search Organization page
    And    User clicks the Search button on Search Organization page
    And    User is not allowed to use the search button on Search Organization page
    And    User clicks the Next button on Search Organization page
    Then   User should see the "General Information" tab is opened

  @smoke @selectForeignCustomerForBusinessSearch
  Scenario: As a user,I want to search customer by selecting Foreign Customer on Search Organization Page
    Given  User selects the Foreign Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with  NIPT numbers on Search Organization page
    And    User clicks the Search button on Search Organization page
    And    User checks the NIPT is usable or not on Search Business page
    And    User clicks the Next button on Search Organization page
    Then   User should see the "General Information" tab is opened