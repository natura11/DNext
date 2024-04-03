@VFALFT-22207 @regression @addressInformationForBusiness
Feature:New Business Customer-Address Information

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Given User clicks the Address Information button
    Given User is on the Address Information Page

  @continueWithoutAddingAddressForBusinessAddress
  Scenario: As a user I want to continue without adding any Address on Address Information Page
    Given User is on the Address Information Page
    And   User clicks Next button on Address Information Page
    Then  User is on the Address Information Page
    Then  User sees the Address Line 1 is required on Address Information Page

  @backToPreviousPageWithoutAddingAddressForBusinessAddress
  Scenario: As a user I want to go previous page without adding any Address on Address Information Page
    Given User is on the Address Information Page
    And   User clicks Back button on Address Information Page
    Then  User is on the Contact Information page

  @fillingAddressLine1ForBusinessAddress
  Scenario: As a user I want to fill Address Line 1 on Address Information Page
    Given User should see the Address Line 1 textbox on Address Information Page
    When  User clicks Address Line 1 Field on Address Information Page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox on Address Information Page
    And   User clears Address Line 1 Field on Address Information Page
    Then  User sees the Address Line 1 is required on Address Information Page
    And   User clicks Address Line 1 Field on Address Information Page
    Then  User enters a value "FIRST ADDRESS" in the Address Line 1 textbox on Address Information Page

  @fillingAddressLine2ForBusinessAddress
  Scenario: As a user I want to fill Address Line 2 on Address Information Page
    Given User should see the Address Line 2 textbox on Address Information Page
    And   User clicks Address Line 2 Field on Address Information Page
    Then  User enters a value "SECOND ADDRESS" in the Address Line 2 textbox on Address Information Page

  @fillingPostCodeForBusinessAddress
  Scenario: As a user I want to fill Post Code on Address Information Page
    Given User should see the Post Code textbox on Address Information Page
    And   User clicks Post Code Field on Address Information Page
    Then  User enters a value "1234" in the Post Code textbox on Address Information Page

  @notEditingOtherFieldsForBusinessAddress
  Scenario: As a user I want to see the other fields are non-editable on Address Information Page
    Given User should see the Medium Type textbox on Address Information Page
    Then  User see the Medium Type textbox is non-editable on Address Information Page
    Given User should see the Contact Type textbox on Address Information Page
    Then  User see the Contact Type textbox is non-editable on Address Information Page
    Given User should see the Country dropdown on Address Information Page
    Then  User see the Country dropdown is non-editable on Address Information Page
    Then  User see the ALBANIA value on the Country dropdown on Address Information Page

  @selectionOptionFromCityDropdownForBusinessAddress
  Scenario: As a user I want to select a City option from City dropdown
    Given User should see the City dropdown on Address Information Page
    When User clicks City dropdown on Address Information Page
    And User should ensure each options in City dropdown are selectable on Address Information Page
    Then  User should select "CERRIK" option in the City dropdown on Address Information Page
    When User clicks City dropdown on Address Information Page
    Then  User should select "BERAT" option in the City dropdown on Address Information Page

  @FillingRequiredFieldsForAddressForBusinessAddress
  Scenario: As a user I want to enter a billing address with required fields on Address Information Page
    Given User should see the Address Line 1 textbox on Address Information Page
    Given User should see the City dropdown on Address Information Page
    When  User clicks Address Line 1 Field on Address Information Page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox on Address Information Page
    When  User clicks City dropdown on Address Information Page
    And   User should select "BERAT" option in the City dropdown on Address Information Page
    And   User clicks Next button on Address Information Page
    Then  User is on the Invoice Account page

  @enteringDifferentServiceAddressForBusinessAddress
  Scenario: As a user I want to enter a different service address on Address Information Page
    Given User should see the Service Address slider on Address Information Page
    When User switch off the slider on Address Information Page
    Then User should see the Service Address field for Contact Type on Address Information Page
    Given User should see the Address Line 1 textbox for Service Address on Address Information Page
    And   User clicks Address Line 1 Field for Service Address on Address Information Page
    Then  User enters a value "FIRST SERVICE ADDRESS" in the Address Line 1 textbox for Service Address on Address Information Page
    And   User clears Address Line 1 Field for Service Address on Address Information Page
    Then  User sees the Address Line 1 is required for Service Address on Address Information Page
    Then  User enters a value "FIRST SERVICE ADDRESS" in the Address Line 1 textbox for Service Address on Address Information Page
    Given User should see the Address Line 2 textbox for Service Address on Address Information Page
    And   User clicks Address Line 2 Field for Service Address on Address Information Page
    Then  User enters a value "SECOND SERVICE ADDRESS" in the Address Line 2 textbox for Service Address on Address Information Page
    Given User should see the Post Code textbox for Service Address on Address Information Page
    And   User clicks Post Code Field for Service Address on Address Information Page
    Then  User enters a value "1234" in the Post Code textbox for Service Address on Address Information Page
    Given User should see the Country dropdown for Service Address on Address Information Page
    Then  User see the Country dropdown is non-editable for Service Address on Address Information Page
    Then  User see the ALBANIA value on the Country dropdown for Service Address on Address Information Page
    Given User should see the City dropdown for Service Address on Address Information Page
    When User clicks City dropdown for Service Address on Address Information Page
    And User should ensure each options in City dropdown are selectable for Service Address on Address Information Page
    Then  User should select "CERRIK" option in the City dropdown for Service Address on Address Information Page
    When User clicks City dropdown for Service Address on Address Information Page
    Then  User should select "BERAT" option in the City dropdown for Service Address on Address Information Page
    And   User clicks Next button on Address Information Page
    Then  User is on the Invoice Account page