@VFALFT-22209 @regression @otherInformationForBusiness
Feature:New Business Customer-Other Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page

  @checkFieldsForBusinessOther
  Scenario: As a user I want to Check the Company name, Organization Number and Industry fields
    When  User fills in the NIPT field with valid and non-existing  "I56867986N" on Search Organization page
    Then  User clicks the Search button on Search Organization page
    And   User is not allowed to use the search button on Search Organization page
    And   User clicks the Next button on Search Organization page
    And   User clicks Industry dropdown on general information page
    Then  User should selects any option in the Industry dropdown on general information page
    And   User clicks Name Field on general information page
    Then  User enters a value "Reinger" consisting of letters and special characters in the name box on general information page
    And   User clicks Segment dropdown on general information page
    Then  User should selects any options in the Segment dropdown on general information page
    And   User enters valid "ABC@ABC.COM" in to the email field on general information page
    And   User clicks Communication Method dropdown on general information page
    And   User selects any communication option on General Information Page
    And   User clicks mobile phone numbers field on general information page
    And   User enters mobile valid phone number "698933127" on general information page
    And   User enters random valid issuing date on Business General Information page
    And   User adds a "document.jpg" of which format is image on general information page
    And   User should see the name of "document.jpg" added jpg document on the screen on general information page
    And   User clicks the Next button on general information page
    Then  User is on the Admin Information  page
    When  User clicks on the Identification Number field on Admin Information Page
    When  User enters one non existing valid "C84353649W" ID number into the Identification Number field on Admin Information page
    Then  User should see "Please click search icon!" warning under the Identification Number field on Admin Information Page
    And   User clicks the search icon in Identification Number field on Admin Information page
    And   User  clicks the First Name field and enters the  first name as "Ervin" into the First Name field on Admin Information Page
    And   User  clicks the Last Name field and enters the  first name as "Candida" into the First Name field on Admin Information Page
    And   User enters valid "ABC@ABC.COM" in to the email field on  Admin Information Page
    And   User Male option from gender on Admin Information Page
    And   User selects of valid birth date as "18/03/2006" on Admin Information Page
    And   User selects the country as Albania as country of birth on Admin Information Page
    And   User selects Berat as place of birth on Admin Information Page
    And   User adds "698933127" the Mobile Phone  Number into the Mobile Phone Number on Admin Information Page
    And   User add "document.jpg" document file on Admin Information Page
    Then  User should see the name of "document.jpg" added jpg document on the screen on Admin Information Page
    And   User clicks next Button on Admin Information Page
    And   User clicks Next button on Contact Information Page
    When  User clicks City dropdown on Address Information Page
    And   User should select "BERAT" option in the City dropdown on Address Information Page
    Then  User enters a value "FIRST ADDRESS" in the Address Line 1 textbox on Address Information Page
    And   User clicks Next button on Address Information Page
    Then  User is on the Invoice Account page
    And   User clicks mobile phone number field on Invoice Account page
    And   User enters valid "698933127" into the phone number field on Invoice Account page
    And   User clicks email field on Invoice Account page
    And   User enters valid "ABC@ABC.COM" in to the email field on Invoice Account page
    And   User clicks Next button on Invoice Account page
    And   User clicks the General Information button for Business
    Then  User is on the Business General Information page
    Then  User should see the random customer data is fetched to input fields on Business Other Information Page

  @clickGenerateFormForBusinessOther
  Scenario: As a user I want to Check and Download the Generate Form
    When  User clicks the Other Information button for Individual
    And   User clicks the Generate Form button on Individual Other Information Page
    Then  User should see the Generate Form open in a new window on Individual Other Information Page
    And   User go back to Individual Other Information Page
    And   User adds a valid "gdprForm.pdf" document for Consent Form on Individual Other Information Page
    Then  User should see the name of "gdprForm.pdf" added pdf document on Individual Other Information Page
