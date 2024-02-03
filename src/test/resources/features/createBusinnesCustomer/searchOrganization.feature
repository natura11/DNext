@VFALFT-22203
Feature:New Business Customer-Search Organization

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given  User should see the "customer/create-enterprise-customer" on Create Business Customer page
    Given  User should see the "New Business Customer" header on screen on Create Business Customer page

  @regression @smoke @first
  Scenario:As a user,I want to search customer by using existing NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with existing "L12345678M" nıpt number on Search Organization page
    And    User clicks the Search button on Search Organization page
    Then   One "This organization cannot have more than one customer connected to it" is displayed on the screen on Search Organization page

  Scenario:As a user,I want to search customer by using invalid format  NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with invalid format  "NIPT numbers" on Search Organization page
    Then   User sees "warning message" under the NIPT field on Search Organization page
    And    User is not allowed to use the search button on Search Organization page

  Scenario:As a user,I want to search customer by using valid and non-existing  NIPT numbers on Search Organization Page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with valid and non-existing  "NIPT numbers" on Search Organization page
    And    User clicks the Search button on Search Organization page
    Then   User should see "New Customer" text  near the NIPT number on Search Organization page
    And    User is not available to use the Search buton on Search Organization page
    And    User clicks the Next button on Search Organization page
    Then   User should be on General Information page

   Scenario: As a user,I want to search customer by selecting Foreign Customer on Search Organization Page
     Given  User selects the Foreign Customer from the dropdown on Search Organization page
     When   User fills in the NIPT field with  "NIPT numbers" on Search Organization page
     And    User clicks the Search button on Search Organization page
     Then   User should see "New Customer" text  near the NIPT number on Search Organization page
     And    User is not available to use the Search buton on Search Organization page
     And    User clicks the Next button on Search Organization page
     Then   User should be on General Information page