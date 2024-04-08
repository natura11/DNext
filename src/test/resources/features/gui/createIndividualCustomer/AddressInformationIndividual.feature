@VFALFT-23460 @regression @addressInformationForIndividualCustomer
Feature: New Individual Customer - Address Information

  Background: As a user,I want to Create Individual Customer on New Individual Customer page
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User clicks Create Individual Customer on Home page
    Given User clicks the Address Information button
    Given User is in the Address Information on Create Individual Customer page

  @continueWithoutAddingAddressOnIndividual
  Scenario: As a user I want to continue without adding any Address in Address Information on Create Individual Customer page
    Given User is in the Address Information on Create Individual Customer page
    And   User clicks Next button in Address Information on Create Individual Customer page
    Then  User is in the Address Information on Create Individual Customer page
    Then  User sees the Address Line 1 is required in Address Information on Create Individual Customer page

  @backToPreviousPageWithoutAddingAddressOnIndividual
  Scenario: As a user I want to go previous page without adding any Address in Address Information on Create Individual Customer page
    Given User is in the Address Information on Create Individual Customer page
    And   User clicks Back button on Address Information on Create Individual Customer page
    Then  User is in the General Information on Create Individual Customer page

  @fillingInputFieldsIndividualAddressPage
  Scenario: As a user I want to fill Address Line 1,2 and Post Code in Address Information on Create Individual Customer page
    Given User should see the Address Line 1 textbox in Address Information on Create Individual Customer page
    When  User clicks Address Line 1 Field in Address Information on Create Individual Customer page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox in Address Information on Create Individual Customer page
    And   User clears Address Line 1 Field in Address Information on Create Individual Customer page
    Then  User sees the Address Line 1 is required in Address Information on Create Individual Customer page
    And   User clicks Address Line 1 Field in Address Information on Create Individual Customer page
    Then  User enters a value "FIRST ADDRESS" in the Address Line 1 textbox in Address Information on Create Individual Customer page
    Given User should see the Address Line 2 textbox in Address Information on Create Individual Customer page
    And   User clicks Address Line 2 Field in Address Information on Create Individual Customer page
    Then  User enters a value "SECOND ADDRESS" in the Address Line 2 textbox in Address Information on Create Individual Customer page
    Given User should see the Post Code textbox in Address Information on Create Individual Customer page
    And   User clicks Post Code Field on Address Information in Create Individual Customer page
    Then  User enters a value "1234" in the Post Code textbox in Address Information on Create Individual Customer page

  @notEditingOtherFieldsOnIndividual
  Scenario: As a user I want to see the other fields are non-editable in Address Information on Create Individual Customer page
    Given User should see the Medium Type textbox in Address Information on Create Individual Customer page
    Then  User see the Medium Type textbox is non-editable in Address Information on Create Individual Customer page
    Given User should see the Contact Type textbox on Address Information in Create Individual Customer page
    Then  User see the Contact Type textbox is non-editable in Address Information on Create Individual Customer page
    Given User should see the Country dropdown in Address Information on Create Individual Customer page
    Then  User see the Country dropdown is non-editable in Address Information on Create Individual Customer page
    Then  User see the ALBANIA value on the Country dropdown in Address Information on Create Individual Customer page

  @selectionOptionFromCityDropdownOnIndividual
  Scenario: As a user I want to select a City option from City dropdown in Address Information on Create Individual Customer page
    Given User should see the City dropdown in Address Information on Create Individual Customer page
    When User clicks City dropdown in Address Information on Create Individual Customer page
    And User should ensure each options in City dropdown are selectable in Address Information on Create Individual Customer page
    Then  User should select "CERRIK" option in the City dropdown in Address Information on Create Individual Customer page
    When User clicks City dropdown in Address Information on Create Individual Customer page
    Then  User should select "BERAT" option in the City dropdown in Address Information on Create Individual Customer page

  @FillingRequiredFieldsForAddressOnIndividual
  Scenario: As a user I want to enter a billing address with required fields in Address Information on Create Individual Customer page
    Given User should see the Address Line 1 textbox in Address Information on Create Individual Customer page
    Given User should see the City dropdown in Address Information on Create Individual Customer page
    When  User clicks Address Line 1 Field in Address Information on Create Individual Customer page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox in Address Information on Create Individual Customer page
    When  User clicks City dropdown in Address Information on Create Individual Customer page
    And   User should select "BERAT" option in the City dropdown in Address Information on Create Individual Customer page
    And   User clicks Next button in Address Information on Create Individual Customer page
    Then  User is on the Individual Contact Information page

  @enteringDifferentServiceAddressOnIndividual
  Scenario: As a user I want to enter a different service address in Address Information on Create Individual Customer page
    Given User should see the Service Address slider in Address Information on Create Individual Customer page
    When User switch off the slider in Address Information on Create Individual Customer page
    Then User should see the Service Address field for Contact Type in Address Information on Create Individual Customer page
    Given User should see the Address Line 1 textbox for Service Address in Address Information on Create Individual Customer page
    And   User clicks Address Line 1 Field for Service Address in Address Information on Create Individual Customer page
    Then  User enters a value "FIRST SERVICE ADDRESS" in the Address Line 1 textbox for Service Address in Address Information on Create Individual Customer page
    And   User clears Address Line 1 Field for Service Address in Address Information on Create Individual Customer page
    Then  User sees the Address Line 1 is required for Service Address in Address Information on Create Individual Customer page
    Then  User enters a value "FIRST SERVICE ADDRESS" in the Address Line 1 textbox for Service Address in Address Information on Create Individual Customer page
    Given User should see the Address Line 2 textbox for Service Address in Address Information on Create Individual Customer page
    And   User clicks Address Line 2 Field for Service Address in Address Information on Create Individual Customer page
    Then  User enters a value "SECOND SERVICE ADDRESS" in the Address Line 2 textbox for Service Address in Address Information on Create Individual Customer page
    Given User should see the Post Code textbox for Service Address in Address Information on Create Individual Customer page
    And   User clicks Post Code Field for Service Address in Address Information on Create Individual Customer page
    Then  User enters a value "1234" in the Post Code textbox for Service Address in Address Information on Create Individual Customer page
    Given User should see the Country dropdown for Service Address in Address Information on Create Individual Customer page
    Then  User see the Country dropdown is non-editable for Service Address in Address Information on Create Individual Customer page
    Then  User see the ALBANIA value on the Country dropdown for Service Address in Address Information on Create Individual Customer page
    Given User should see the City dropdown for Service Address in Address Information on Create Individual Customer page
    When User clicks City dropdown for Service Address in Address Information on Create Individual Customer page
    And User should ensure each options in City dropdown are selectable for Service Address in Address Information on Create Individual Customer page
    Then  User should select "CERRIK" option in the City dropdown for Service Address in Address Information on Create Individual Customer page
    When User clicks City dropdown for Service Address in Address Information on Create Individual Customer page
    Then  User should select "BERAT" option in the City dropdown for Service Address in Address Information on Create Individual Customer page
    And   User clicks Next button in Address Information on Create Individual Customer page
    Then  User is on the Individual Contact Information page