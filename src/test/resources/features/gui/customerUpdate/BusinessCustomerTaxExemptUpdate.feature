@VFALFT-18887 @updateTaxExempt
Feature: Update Tax Exempt - Business Customer
  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given User clicks select search Type field on Customer360 search page
    And   User selects Customer Id options on Customer360 search page
    And   User fills in enter Customer Id field with valid "F64580791" id on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name of id on Customer360 search page

    Scenario:As a user I want to update Tax Exempt - Business Customer with using CustomerId
      When User clicks General button on Customer360 search page
      And User clicks the three dots on Customer Information page
      And User clicks the Edit button on Customer Information page
      And User clicks the Tax Exempt dropdown button on Customer Information page
      And User clicks the NO option from the dropdown on Customer Information page
      And User clicks the Save button on Customer Information page
      Then User should see the "Organization updated successfully!" pop up warning message on Customer Information page



