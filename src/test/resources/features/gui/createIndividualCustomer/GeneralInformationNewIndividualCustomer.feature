@VFALFT-18396 @regression @generalInformationForIndividualCustomer
Feature:New Individual Customer -General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    #Given I click General Information on new business customer page

    Scenario: As a user I want to enter numbers and special characters in to Firstname and Lastname fields
      #Given I want to enter
