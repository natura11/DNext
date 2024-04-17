@ @regression @individualBillingAddress
Feature: Individual Billing Address Updating

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given User clicks select search Type field on Customer360 search page
    And   User selects Customer name options on Customer360 search page
    And   User fills in enter Customer name field with valid "KEMAL SUNAL"  on Customer360 search page
    And   User clicks Search Button on Customer360 search page
    And   User selects opened name on Customer360 search page
    And   User should  clicks Address button on Customer360 search page
    And   User clicks on the three dots near the DEFAULT_BILLING_ADDRESS on Customer360 search page
    And   User clicks Edit Button on DEFAULT_BILLING_ADDRESS Customer360 search page

  Scenario:As a user I want to update  Billing Address with using Customer Name
    When  User rewrite Address Line1 as "ROSE STREET"  on Customer360 search page
    And   User rewrite Address Line2 as "MAIN SQUARE" on Customer360 search page
    And   User cleans the field of post code on Customer360 search page
    And   User update Post Code by entering new one on Customer360 search page
    And   User clicks Save Button on Customer360 search page
    Then  User should see this  "Address updated successfully!" pop up message top of screen on Customer360 search page

  Scenario:As a user I want to update  Billing Address with using Customer Name
    When  User rewrite Address Line1 as "COTTON STREET"  on Customer360 search page
    And   User rewrite Address Line2 as "CENTRAL SQUARE" on Customer360 search page
    And   User cleans the field of post code on Customer360 search page
    And   User rewrites Post Code as "1919" on Customer360 search page
    And   User clicks the cancel button on Address page
    Then  User should see Address Line one as "ROSE STREET" on Address page
    Then  User should see Address Line two as "MAIN SQUARE" on Address page
    Then  User should see City  as BERAT on Address page