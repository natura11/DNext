@VFALFT-22209 @regression @otherInformation
Feature:New Business Customer-Other Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    ##giriş
    When  User fills in the NIPT field with valid and non-existing  "R12985637T" on Search Organization page
    Then  User clicks the Search button on Search Organization page
    And   User clicks the Next button on Search Organization page
    Given User clicks Industry dropdown on general information page
    Then  User should selects any option in the Industry dropdown on general information page
    Given User should see the Name box on the general information page on general information page
    And   User clicks Name Field on general information page
    Then  User enters a value "KARMA" consisting of letters and special characters in the name box on general information page
    Given User clicks Segment dropdown on general information page
    And   User should ensure each options in Segment dropdown are selectable on general information page
    Then  User should selects any options in the Segment dropdown on general information page
    Given User enters valid "karma@gmail.com" in to the email field on general information page
    Then  User should see "." and "@" and "karma@gmail.com" inside of email structure on general information page
    Given User clicks Communication Method dropdown on general information page
    And   User should ensure each options in Communication Method dropdown ara selectable on general information page
    Then  User should selects SMS option in the Tax Exempt dropdown on general information page
    And   User clicks mobile phone numbers field on general information page
    And   User enters mobile valid phone number "698933127" on general information page
    Given User clicks Issuing Date field and user selects "15/12/2023" from calendar on general information page
    And   User adds a "document.jpg" of which format is image on general information page
    And   User should see the name of "document.jpg" added jpg document on the screen on general information page
    Then  User clicks the Next button on general information page
    And   User clicks on the Identification Number field on Admin Information Page
    When  User enters one non existing valid "A19898589T" ID number into the Identification Number field on Admin Information page
    And   User clicks the search icon in Identification Number field on Admin Information page
    And   User  clicks the First Name field and enters the  first name as "Kemal" into the First Name field on Admin Information Page
    And   User  clicks the Last Name field and enters the  first name as "Sunal" into the First Name field on Admin Information Page
    Given User enters valid "karma@gmail.com" in to the email field on  Admin Information Page
    Then  User should see "." and "@" and "karma@gmail.com" inside of email structure on Admin Information Page
    Given User Male option from gender on Admin Information Page
    And   User selects of valid birth date as "15/05/2000" on Admin Information Page
    And   User selects Berat as place of birth on Admin Information Page
    And   User adds "623456789" the Mobile Phone  Number into the Mobile Phone Number on Admin Information Page
    And   User add the "document.jpg" and should see the name of file on the screen on Admin Information Page
    And   User clicks next Button on Admin Information Page
    And   User clicks next Button on Contact Information Page
#    And   User selects Berat as City on Address Information Page
#    And   User clicks next Button on Address Information Page
#    Given User enters valid "ADR1" in to the Address Line 1 field on Address Information Page

  @smoke @checkFields
  Scenario: As a user I want to Check the Company name, Organization Number and Industry fields
    Given  User should see the "Other Information" header on General Information  page