@VFALFT-22208 @regression @invoiceAccount
Feature:New Business Customer-General Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Invoice Account button
    Given User is on the Invoice Account page

  @selectionOptionFromCurrencyDrop
  Scenario: As a user I want to select one option from Currency dropdown
    Given User should see the Currency dropdown on Invoice Account page
    When  User clicks Currency dropdown on Invoice Account page
    And   User should ensure each options in Currency dropdown are selectable on Invoice Account page
    Then  User should selects any option in the Currency dropdown on Invoice Account page

  @writingDescription
  Scenario: As a user I want to enter description into description field
    Given User should see the Description textbox on Invoice Account page
    And   User clicks Description Field on Invoice Account page
    Then  User enters a value "Business Test Description 123" in the Description textbox on Invoice Account page

  @selectionOptionFromPaymentMethodDrop
  Scenario: As a user I want to select Cash option from Payment Method dropdown
    Given User should see the Payment Method dropdown on Invoice Account page
    When User clicks Payment Method dropdown on Invoice Account page
    And User should ensure each options in Payment Method dropdown are selectable on Invoice Account page
    And  User should select "Cash" option in the Payment Method dropdown on Invoice Account page
    Then User should not see the Bank Name and Bank Account No fields
    When User clicks Payment Method dropdown on Invoice Account page
    And  User should select "Direct Debit" option in the Payment Method dropdown on Invoice Account page
    Then User should see the Bank Name and Bank Account No fields
    When User clicks Bank Name dropdown on Invoice Account page
    Then User should selects any option in the Bank Name dropdown on Invoice Account page
    When User clicks Bank Account No textbox on Invoice Account page
    Then User enters a value "1234567887654321" Bank Account No textbox on Invoice Account page
    When User clicks Payment Method dropdown on Invoice Account page
    And  User should select "Cash" option in the Payment Method dropdown on Invoice Account page
    Then User should not see the Bank Name and Bank Account No fields

  @writingInvalidAndValidEmail
  Scenario Outline: As a user I want to enter invalid and valid characters based email into email field
    Given User should see the E-Bill email textbox on Invoice Account page
    When User clicks email field on Invoice Account page
    And   User enters invalid emails "<emails>" and should see "Email must be like xxxxx@xxx.com !" under mobile phone number field on Invoice Account page
    Given User enters valid "abc123@gmail.com" in to the email field on Invoice Account page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Invoice Account page

    Examples:
      | emails       |
      | abcgmailcom  |
      | emails@com   |
      | emails@123.c |

  @selectOptionCountryDropAlbania
  Scenario Outline: As a user I want to select one option from Country dropdown with Albania number and numbers except Albanian numbers
    Given User should see the E-Bill mobile number textbox on Invoice Account page
    When  User clicks Country Code dropdown on Invoice Account page
    Then  User should selects +355 option from country code dropdown on Invoice Account page
    And   User clicks E-Bill mobile number field on Invoice Account page
    And   User enters invalid "<invalidMobile>" phone numbers and should see "Phone number must be like 6XXXXXXXX !" under mobile phone number field on Invoice Account page
    Given User clicks Country Code dropdown on Invoice Account page
    Then  User should selects +213 option from country code dropdown except Albania and clicks mobile phone numbers field on Invoice Account page
    And   User leaves blank mobile phone number field and should see "Phone number is required !" warning message on phone field on Invoice Account page
    And   User enters mobile phone number "12346678910" with other country code except Albania on Invoice Account page
    When  User clicks Country Code dropdown on Invoice Account page
    Then  User should selects +355 option from country code dropdown on Invoice Account page
    And User enters valid "612345678" into the phone number field on Invoice Account page
    Then  User should not see "Phone number must be like 6XXXXXXXX !" under mobile phone number field on Invoice Account page

    Examples:
      | invalidMobile |
      | 61234567      |
      | 512345678     |
      | 41234567      |





