@VFALFT-22206 @regression @contactInformation
Feature:New Business Customer-Contact Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Contact Information button
    Given User is on the Contact Information page

  @continueWithoutAddingContact
  Scenario: As a user I want to continue without adding any Contact on Contact Information Page
    Given User is on the Contact Information page
    And   User clicks Next button on Contact Information Page
    Then  User is on the Address Information Page

  @backToPreviousPageWithoutAddingContact
  Scenario: As a user I want to go previous page without adding any Contact on Contact Information Page
    Given User is on the Contact Information page
    And   User clicks Back button on Contact Information Page
    Then  User should see the Admin Information Page

  @fillPhoneNumberWithDifferentCountry
  Scenario: As a user I want to select different country and numbers except Albanian numbers on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see Country Code dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    Given User clicks Country Code dropdown Contact Information Page
    Then  User should ensure each options in Country Code dropdown are selectable on Contact Information Page
    When  User selects "+1" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User leaves blank mobile phone number field on Contact Information page
    Then  User should see "Phone number is required !" warning message on phone field on Contact Information page
    And   User enters mobile phone number "12346678910" with other country code except Albania on Contact Information page
    Then  User should not see the warning message on phone field on Contact Information page

  @fillInvalidPhoneNumberWithAlbaniaCountry
  Scenario: As a user I want to select Albania and enter invalid numbers on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see Country Code dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    Given User clicks Country Code dropdown Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User enters invalid "61234567" phone numbers on Contact Information Page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Contact Information page
    And   User enters invalid "512345678 " phone numbers on Contact Information Page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Contact Information page
    And   User enters invalid "41234567" phone numbers on Contact Information Page
    Then  User should see "Phone number must be like 6XXXXXXXX !" message under mobile phone number field on Contact Information page


  @fillValidPhoneNumberWithAlbaniaCountry
  Scenario: As a user I want to select Albania and enter valid numbers on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see Country Code dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    Given User clicks Country Code dropdown Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User enters valid "628641593" into the phone number field on Contact Information page
    Then  User should not see the warning message on phone field on Contact Information page

  @writingInvalidAndValidEmailForContactType
  Scenario: As a user I want to enter invalid and valid characters based email into email field on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see Email textbox on Contact Information Page
    When  User clicks Email textbox on Contact Information Page
    And   User enters invalid emails "abcgmailcom" on Contact Information Page
    Then  User should see that background is red for the email field on Contact Information Page
    And   User enters invalid emails "emails@com" on Contact Information Page
    Then  User should see that background is red for the email field on Contact Information Page
    And   User enters invalid emails "emails@123.c" on Contact Information Page
    Then  User should see that background is red for the email field on Contact Information Page
    And   User enters valid "abc123@gmail.com" in to the email field on Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Contact Information Page
    Then  User should see that background is not red for the email field on Contact Information Page


  @addDifferentTypeOfContacts
  Scenario Outline: As a user I want to add different type of Contacts on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    Then  User should ensure each options in Type of Contact dropdown are selectable on Contact Information Page
    And   User selects "<Contact Type>" option in the Contact dropdown on Contact Information Page
    Then  User should see Country Code dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    Then  User should see Email textbox on Contact Information Page
    And   User clicks Country Code dropdown Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User enters valid "628641593" into the phone number field on Contact Information page
    Then  User should not see the warning background on phone field on Contact Information page
    When  User clicks Email textbox on Contact Information Page
    And   User enters valid "abc123@gmail.com" in to the email field on Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Contact Information Page
    Then  User should see that background is not red for the email field on Contact Information Page
    And   User clicks Next button on Contact Information Page
    Then  User is on the Address Information Page

    Examples:
      | Contact Type        |
      | Contact Person      |
      | Payment Responsible |
      | Technical Contact   |

  @addMultipleContact
  Scenario: As a user I want to add Multiple Contacts on Contact Information Page
    Given User should see the Type of Contact dropdown on Contact Information Page
    And   User clicks Type of Contact dropdown on Contact Information Page
    Then  User should ensure each options in Type of Contact dropdown are selectable on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see Country Code dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    Then  User should see Email textbox on Contact Information Page
    And   User clicks Country Code dropdown Contact Information Page
    When  User selects "+355" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User enters valid "628641593" into the phone number field on Contact Information page
    Then  User should not see the warning background on phone field on Contact Information page
    When  User clicks Email textbox on Contact Information Page
    And   User enters valid "abc123@gmail.com" in to the email field on Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of email structure on Contact Information Page
    Then  User should see that background is not red for the email field on Contact Information Page

    And   User clicks Add+ button to add Additional Contact on Contact Information Page
    Then  User should see the new Contact Type section

    Given User should see the additional Type of Contact dropdown on Contact Information Page
    And   User clicks additional Type of Contact dropdown on Contact Information Page
    Then  User should ensure each options in additional Type of Contact dropdown are selectable on Contact Information Page
    And   User selects "Contact Person" option in the Contact dropdown on Contact Information Page
    Then  User should see the same contact type error message on Contact Information Page
    And   User clicks additional Type of Contact dropdown on Contact Information Page
    And   User selects "Payment Responsible" option in the Contact dropdown on Contact Information Page
    Then  User should not see the same contact type error message on Contact Information Page
    Then  User should see additional Country Code dropdown on Contact Information Page
    Then  User should see additional Mobile Phone Number textbox on Contact Information Page
    Then  User should see additional Email textbox on Contact Information Page
    And   User clicks additional Country Code dropdown Contact Information Page
    When  User selects "+355" option in the additional Country Code dropdown on Contact Information page
    And   User clicks additional mobile phone number field on Contact Information page
    And   User enters valid "628641594" into the additional phone number field on Contact Information page
    Then  User should not see the additional warning background on phone field on Contact Information page
    When  User clicks additional Email textbox on Contact Information Page
    And   User enters valid "abc1234@gmail.com" in to the additional email field on Contact Information Page
    Then  User should see "." and "@" and "abc123@gmail.com" inside of additional email structure on Contact Information Page
    Then  User should see that additional background is not red for the email field on Contact Information Page
    And   User clicks Next button on Contact Information Page
    Then  User is on the Address Information Page



