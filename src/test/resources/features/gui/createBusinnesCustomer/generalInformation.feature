@VFALFT-22204 @regression
Feature:New Business Customer-General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given  User selects the Albanian Customer from the dropdown on Search Organization page
    When   User fills in the NIPT field with existing "L12345678M" nıpt number on Search Organization page
    And    User clicks the Next button on Search Organization page
    Then   User should see the "General Information" header on General Information  page

  Scenario: As a user I want to enter name into name field
    Given User should see the "Name" box on the general information page
    And   User clicks Name Field
    Then  User enters a value ",,,Fer-rai.." consisting of letters and special characters(".",",","-")  in the name box

  Scenario: As a user I want to select one option from Industry dropdown
    Then  User enters a value ",,,Fer-rai.." consisting of letters and special characters(".",",","-")  in the name box
    Given User clicks "Industry" dropdown
    And   User should ensure each options in industry dropdown ara selectable
    Then  User should selects "Finance & Insurance" option in the Industry dropdown

  Scenario: As a user I want to select one option from Segment dropdown
    Given User clicks "Segment" dropdown
    And   User should ensure each options in Segment dropdown ara selectable
    Then  User should selects " Corporate " option in the Segment dropdown

  Scenario: As a user I want to select one option from Tax Exempt dropdown
    Given User clicks "Tax Exempt" dropdown
    And   User should ensure each options in Tax Exempt dropdown ara selectable
    Then  User should selects " YES " option in the Tax Exempt dropdown

  Scenario: As a user I want to enter invalid character based email into email field
    Given User clicks email field
    And   User enters emails
      | email1 | abcgmail.com |
      | email2 | abc@gmailcom |
      | email3 | abcgmail320  |
    Then user should see background is red as a warning

  Scenario: As a user I want to enter valid character based email into email field
    Given User clears invalid email from email field
    And   User enters valid "abc123@gmail.com" in to the email field
    And   User should see "." and "@" and "com" inside of email structure

  Scenario: As a user I want to select one option from Tax Exempt dropdown
    Given User clicks "Communication Method" dropdown
    And   User should ensure each options in Communication Method dropdown ara selectable
    Then  User should selects " SMS " option in the Tax Exempt dropdown

  Scenario: As a user I want to select one option from Country dropdown with Albania number
    Given User clicks "Country Code" dropdown
    Then  User should selects " +355 " option from country code dropdown
    And   User clicks mobile phone numbers field
    And   User enters mobile phone numbers
      | MobilePhonenumber1 | 61234567  |
      | MobilePhonenumber2 | 512345678 |
      | MobilePhonenumber3 | 41234567  |
    Then User should see "Phone number must be like 6XXXXXXXX !" under mobile phone number field

  Scenario: As a user I want to select one option from Country dropdown with other numbers except Albanian numbers
    Given User clicks "Country Code" dropdown
    Then  User should selects " +213 " option from country code dropdown
    And   User clicks mobile phone numbers field
    And   User enters any number into the mobile phone number field
    Then  User should see "Phone number is required !" warning message on phone field
    And   User enters mobile phone number "12346678910" with other country code except Albania

  Scenario: As a user I want to fill in the Issuing date field
    Given User clicks "Issuing Date" field
    Then  User should see only last 3 months dates which should be enabled and selectable
    And   User selects "07022024" from calendar

  Scenario: As a user I want to add file which could be different format than pdf or image and bigger than 5MB
    Given User should see this "You have to add Extract QKR document!" warning message near to add button
    Given User clicks the "Add" button
    And   User adds a document of which format is doctype
    Then  User should see "Only image and pdf files are accepted!" warning message on top of  the screen for unmatched format
    Given User clicks the "Add" button
    And   User adds a document of which format is pdf with bigger 5MB
    Then  User should see "File size can not be bigger than 5 MB!" warning message on the top of the screen for bigger MegaByte

  Scenario: As a user I want to add only one file which could be pdf and image format with smaller than 5MB
    Given User should see this "You have to add Extract QKR document!" warning message near to add button
    Given User clicks the "Add" button
    And   User adds a document of which format is image
    And   User should see the name of added image document on the screen
    And   User deletes added image document
    Given User clicks the "Add" button
    And   User adds a document of which format is pdf
    And   User should see the name of added pdf document on the screen
    Then  User clicks next Button on general information page




