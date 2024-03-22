@VFALFT-23460 @regression @AddressInformationForIndividualCustomer
Feature: New Individual Customer - Address Information

  Background: As a user,I want to Create Individual Customer on New Individual Customer page
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User enters "E42879279Q" identification ID for ALBANIAN to the identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page
    And   User clicks next Button in Search Individual on Create Individual Customer page
    Given User clicks Segment dropdown on New Individual Customer page
    Then  User should selects any options in the Segment dropdown on New Individual Customer page
    Given User wants to enter "Roel" as firstname on New Individual Customer page
    And   User wants to enter "Purdy" as lastname into the lastname field on New Individual Customer page
    Given User enters valid "abc123@gmail.com" in to the email field on New Individual Customer page
    And   User selects of valid birth date as "15/05/2000" on New Individual Customer page
    Given User Male option from gender on New Individual Customer page
    And   User selects the country as Albania as country of birth on New Individual Customer page
    And   User selects Berat as place of birth on New Individual Customer page
    And   User clicks Citizenship dropdown on Create Individual Customer page
    And   User selects ALBANIAN citizenship from dropdown on Create Individual Customer page
    Then  User should selects SMS option in the Communication Method dropdown on New Individual Customer page
    And   User adds "623456789" the Mobile Phone Number into the Mobile Phone Number on New Individual Customer page

  Scenario: A scenario
    And   User clicks next Button in General Information on New Individual Customer page