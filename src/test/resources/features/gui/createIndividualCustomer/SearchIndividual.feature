@VFALFT-18395 @regression @searchIndividualForIndividualCustomer
Feature:New Individual Customer -Search Individual

  Background: As a user,I want to Create Individual Customer on New Individual Customer page
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page


  Scenario: As a user I want  to click Create Individual Customer
    Then  User should see the "New Individual Customer" header on screen on Create Individual Customer page

  Scenario: As a user I want to enter an-existing individual customer with identification ID
    Given User enters "AA050FC6046ECC1" existing identification ID in to identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page on Create Individual Customer page
    Then  User should see "Individual with this Identification Number already exist!" on Create Individual Customer page

  Scenario: As a user I want to enter identification numberID that doesn't valid for Albanian Customer ID
    Given User enters "AA050FC6046ECC1" existing identification ID in to identification number field on Create Individual Customer page
    And   User clicks search button on Create Individual Customer page on Create Individual Customer page
    And   User clicks next Button on on Create Individual Customer page
    And   User clicks Citizenship dropdown on Create Individual Customer page
    And   User selects ALBANIAN citizenship from dropdown on Create Individual Customer page
    Then  User should see that background is red

    Scenario: As a user I want to enter identification number that valid ALBANIAN customer number
      Given User enters "K12345678R" identification ID for ALBANIAN to the identification number field on Create Individual Customer page
      And   User clicks search button on Create Individual Customer page on Create Individual Customer page
      And   User clicks next Button on on Create Individual Customer page
      Then  User should see background is not red on Create Individual Customer page



