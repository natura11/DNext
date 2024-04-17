@VFALFT-22208 @regression @BusinessCustomer
Feature:New Business Customer-Invoice Account

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Invoice Account button
    Given User should see the "Invoice Account" tab is opened

  @continueWithoutAddingInvoiceAccountForBusinessInvoice
  Scenario: As a user I want to continue without adding any Account on Invoice Account Page
    Given User should see the "Invoice Account" tab is opened
    And   User clicks Next button on Invoice Account page
    Then  User should see the "Invoice Account" tab is opened
    Then  User sees the Ebill Email is required on Invoice Account page
    Then  User sees the Ebill Mobile Number is required on Invoice Account page

  @backToPreviousPageWithoutInvoiceAccountForBusinessInvoice
  Scenario: As a user I want to go previous page without adding any Account on Invoice Account Page
    Given User should see the "Invoice Account" tab is opened
    And   User clicks Back button on Invoice Account page
    Then  User should see the "Address Information" tab is opened

  @selectionOptionFromCurrencyDropdownAndDescriptionForBusinessInvoice
  Scenario: As a user I want to select one option from Currency dropdown
    Given User should see the Currency dropdown on Invoice Account page
    When  User clicks Currency dropdown on Invoice Account page
    And   User should ensure each options in Currency dropdown are selectable on Invoice Account page
    Then  User should selects any option in the Currency dropdown on Invoice Account page
    Given User should see the Description textbox on Invoice Account page
    And   User clicks Description Field on Invoice Account page
    Then  User enters a value "Business Test Description 123" in the Description textbox on Invoice Account page

  @selectionOptionFromPaymentMethodDropForBusinessInvoice
  Scenario: As a user I want to select Cash and Direct Debit options from Payment Method dropdown
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

  @writingInvalidAndValidEmailForEBillForBusinessInvoice
  Scenario: As a user I want to enter invalid and valid characters based email into email field
    Given User should see the E-Bill email textbox on Invoice Account page
    When  User clicks email field on Invoice Account page
    And   User enters invalid emails "abcgmailcom" on Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Invoice Account page
    Then  User should see that background is red for the email field on Invoice Account page
    And   User enters invalid emails "emails@com" on Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Invoice Account page
    Then  User should see that background is red for the email field on Invoice Account page
    And   User enters invalid emails "emails@123.c " on Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Invoice Account page
    Then  User should see that background is red for the email field on Invoice Account page
    Given User enters valid "abc123@gmail.com" in to the email field on Invoice Account page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Invoice Account page
    Then  User should see that background is not red for the email field on Invoice Account Page

  @fillPhoneNumberWithDifferentCountryForBusinessInvoice
  Scenario: As a user I want to select different country and numbers except Albanian numbers on Invoice Account Page
    Given User should see Country Code dropdown on Invoice Account Page
    Given User should see the E-Bill mobile number textbox on Invoice Account page
    When  User clicks Country Code dropdown on Invoice Account page
    Then  User should ensure each options in Country Code dropdown are selectable on Invoice Account page
    When  User selects "+1" option in the Country Code dropdown on Invoice Account page
    And   User clicks mobile phone number field on Invoice Account page
    And   User leaves blank mobile phone number field on Invoice Account page
    Then  User should see "Phone number is required !" message under mobile phone number field on Invoice Account page
    And   User enters mobile phone number "12346678910" with other country code except Albania on Invoice Account page
    Then  User should not see the warning message on phone field on Invoice Account page

  @fillInvalidPhoneNumberWithAlbaniaCountryForBusinessInvoice
  Scenario: As a user I want to select Albania and enter invalid numbers on Invoice Account Page
    Given User should see Country Code dropdown on Invoice Account Page
    Then  User should see the E-Bill mobile number textbox on Invoice Account page
    When  User clicks Country Code dropdown on Invoice Account page
    When  User selects "+355" option in the Country Code dropdown on Invoice Account page
    And   User clicks mobile phone number field on Invoice Account page
    And   User enters invalid "61234567" phone numbers on Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Invoice Account page
    And   User enters invalid "512345678 " phone numbers on Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Invoice Account page
    And   User enters invalid "41234567" phone numbers on Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Invoice Account page
    And   User enters valid "628641593" into the phone number field on Invoice Account page
    Then  User should not see the warning message on phone field on Invoice Account page
