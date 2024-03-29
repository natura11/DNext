@VFALFT-23462 @regression @invoiceAccountForIndividual
Feature:New Individual Customer-Invoice Account

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User clicks the Invoice Account button for Individual
    Given User is on the Individual Invoice Account page

  @continueWithoutAddingInvoiceAccountForIndividualInvoice
  Scenario: As a user I want to continue without adding any Account on Invoice Account Page
    Given User is on the Individual Invoice Account page
    And   User clicks Next button on Individual Invoice Account page
    Then  User is on the Individual Invoice Account page
    Then  User sees the Ebill Email is required on Individual Invoice Account page
    Then  User sees the Ebill Mobile Number is required on Individual Invoice Account page

  @backToPreviousPageWithoutInvoiceAccountForIndividualInvoice
  Scenario: As a user I want to go previous page without adding any Account on Invoice Account Page
    Given User is on the Individual Invoice Account page
    And   User clicks Back button on Individual Invoice Account page
    Then  User is on the Individual Contact Information page

  @selectionOptionFromCurrencyDropForIndividualInvoice
  Scenario: As a user I want to select one option from Currency dropdown
    Given User should see the Currency dropdown on Individual Invoice Account page
    When  User clicks Currency dropdown on Individual Invoice Account page
    And   User should ensure each options in Currency dropdown are selectable on Individual Invoice Account page
    Then  User should selects any option in the Currency dropdown on Individual Invoice Account page

  @writingDescriptionForIndividualInvoice
  Scenario: As a user I want to enter description into description field
    Given User should see the Description textbox on Individual Invoice Account page
    And   User clicks Description Field on Individual Invoice Account page
    Then  User enters a value "Individual Test Description 123" in the Description textbox on Individual Invoice Account page

  @selectionOptionFromPaymentMethodDropForIndividualInvoice
  Scenario: As a user I want to select Cash and Direct Debit options from Payment Method dropdown
    Given User should see the Payment Method dropdown on Individual Invoice Account page
    When User clicks Payment Method dropdown on Individual Invoice Account page
    And  User should ensure each options in Payment Method dropdown are selectable on Individual Invoice Account page
    And  User should select "Cash" option in the Payment Method dropdown on Individual Invoice Account page
    Then User should not see the Bank Name and Bank Account No fields on Individual Invoice Account page
    When User clicks Payment Method dropdown on Individual Invoice Account page
    And  User should select "Direct Debit" option in the Payment Method dropdown on Individual Invoice Account page
    Then User should see the Bank Name and Bank Account No fields on Individual Invoice Account page
    Then User should see the Owner textbox on Individual Invoice Account Page
    When User clicks Bank Name dropdown on Individual Invoice Account page
    Then User should selects any option in the Bank Name dropdown on Individual Invoice Account page
    When User clicks Bank Account No textbox on Individual Invoice Account page
    Then User enters a value "1234567887654321" Bank Account No textbox on Individual Invoice Account page
    When User clicks Owner textbox on Individual Invoice Account page
    Then User enters a value "MECNUN CINAR" Owner textbox on Individual Invoice Account page
    When User clicks Payment Method dropdown on Individual Invoice Account page
    And  User should select "Cash" option in the Payment Method dropdown on Individual Invoice Account page
    Then User should not see the Bank Name and Bank Account No fields on Individual Invoice Account page
    Then User should not see the Owner textbox on Individual Invoice Account Page

  @writingInvalidAndValidEmailForEBillForIndividualInvoice
  Scenario: As a user I want to enter invalid and valid characters based email into email field
    Given User should see the E-Bill email textbox on Individual Invoice Account page
    When  User clicks email field on Individual Invoice Account page
    And   User enters invalid emails "abcgmailcom" on Individual Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Individual Invoice Account page
    Then  User should see that background is red for the email field on Individual Invoice Account page
    And   User enters invalid emails "emails@com" on Individual Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Individual Invoice Account page
    Then  User should see that background is red for the email field on Individual Invoice Account page
    And   User enters invalid emails "emails@123.c " on Individual Invoice Account Page
    Then  User should see "Email must be like xxxxx@xxx.com !" message under email field on Individual Invoice Account page
    Then  User should see that background is red for the email field on Individual Invoice Account page
    Given User enters valid "abc123@gmail.com" in to the email field on Individual Invoice Account page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Individual Invoice Account page
    Then  User should see that background is not red for the email field on Individual Invoice Account Page

  @fillInvalidPhoneNumberWithAlbaniaCountryForIndividualInvoice
  Scenario: As a user I want to enter invalid numbers on Invoice Account Page
    Given User should see Country Code dropdown on Individual Invoice Account Page
    Then  User should see the E-Bill mobile number textbox on Individual Invoice Account page
    Then  User should see the Country dropdown is disabled on Individual Invoice Account page
    And   User clicks mobile phone number field on Individual Invoice Account page
    And   User enters invalid "61234567" phone numbers on Individual Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Individual Invoice Account page
    And   User enters invalid "512345678 " phone numbers on Individual Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Individual Invoice Account page
    And   User enters invalid "41234567" phone numbers on Individual Invoice Account page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Individual Invoice Account page

  @fillValidPhoneNumberWithAlbaniaCountryForIndividualInvoice
  Scenario: As a user I want to enter valid numbers on Individual Invoice Account Page
    Given User should see Country Code dropdown on Individual Invoice Account Page
    Then  User should see the E-Bill mobile number textbox on Individual Invoice Account page
    Then  User should see the Country dropdown is disabled on Individual Invoice Account page
    When  User clicks mobile phone number field on Individual Invoice Account page
    And   User enters valid "628641593" into the phone number field on Individual Invoice Account page
    Then  User should not see the warning message on phone field on Individual Invoice Account page