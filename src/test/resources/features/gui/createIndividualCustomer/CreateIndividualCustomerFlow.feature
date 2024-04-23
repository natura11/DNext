@VFALFT-22217 @smoke @regression @IndividualCustomer
Feature:New Individual Customer-Customer Creation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    When   User clicks Create Individual Customer on Home page
    Then   User should see the "New Individual Customer" header on screen on Create Customer page

  @individualAlbanianCustomerCreation @smoke
  Scenario: As a user I want to create an Albanian Individual Customer
    When  User enters random identification ID for ALBANIAN to the identification number field on Search Individual page
    And   User clicks search button on Create Individual Customer page
    And   User checks the identification ID is already exists or not on Search Individual page
    Then  User should see the random identification ID is new for ALBANIAN on Search Individual page
    And   User clicks next Button in Search Individual on Create Individual Customer page

    Then  User should see the "General Information" tab is opened
    When  User enters random firstname on Individual General Information page
    And   User enters random lastname on Individual General Information page
    And   User enters random email on Individual General Information page
    And   User enters random birthdate on Individual General Information page
    And   User selects random gender on Individual General Information page
    And   User selects "ALBANIA" as country of birth on Individual General Information page
    And   User selects random place of birth on Individual General Information page
    And   User clicks Citizenship dropdown on Create Individual Customer page
    And   User selects ALBANIAN citizenship from dropdown on Create Individual Customer page
    And   User clicks Communication Method dropdown on New Individual Customer page
    And   User selects random Communication Method on Individual General Information page
    And   User enters random mobile phone number on Individual General Information page
    And   User clicks Next button on Individual General Information Page

    Then  User should see the "Address Information" tab is opened
    When  User clicks Address Line 1 Field in Address Information on Create Individual Customer page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox in Address Information on Create Individual Customer page
    When  User clicks City dropdown in Address Information on Create Individual Customer page
#    Then  User should select "BERAT" option in the City dropdown on Address Information Page
    And   User selects random city on Individual Address Information page
    And   User clicks Next button in Address Information on Create Individual Customer page

    Then  User should see the "Contact Information" tab is opened
    And   User clicks Type of Contact dropdown on Individual Contact Information Page
    And   User selects random option in the Contact dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Individual Contact Information Page
    When  User clicks Country Code dropdown Individual Contact Information Page
    And   User selects "+355" option in the Country Code dropdown on Individual Contact Information page
    And   User clicks mobile phone number field on Individual Contact Information page
    And   User enters random mobile phone number on Contact Information page
    And   User clicks Email textbox on Individual Contact Information Page
    And   User enters random email on Contact Information Page
    When  User clicks Next button on Individual Contact Information Page

    Then  User should see the "Invoice Account" tab is opened
    When  User clicks Description Field on Individual Invoice Account page
    And   User enters a value "Individual Test Description 123" in the Description textbox on Individual Invoice Account page
    And   User clicks Payment Method dropdown on Individual Invoice Account page
    And   User should select "Cash" option in the Payment Method dropdown on Individual Invoice Account page
    And   User clicks email field on Individual Invoice Account page
    And   User enters random Ebill email on Individual Invoice Account page
    And   User clicks mobile phone number field on Individual Invoice Account page
    And   User enters random Ebill mobile number on Individual Invoice Account page
    And   User clicks credit rating postpaid dropdown on Individual Invoice Account page
    And   User selects random credit ration for postpaid on Individual Invoice Account page
    And   User adds a valid "document.jpg" document for Ebill document on Individual Invoice Account page
    Then  User should see the name of "document.jpg" added Ebill document on Individual Invoice Account page
    And   User clicks credit rating prepaid dropdown on Individual Invoice Account page
    And   User selects random credit ration for prepaid on Individual Invoice Account page

    And   User clicks Next button on Individual Invoice Account page
    Then  User should see the "Other Information" tab is opened
    When  User clicks the General Information button for Individual
    Then  User should see the "General Information" tab is opened
    Then  User should see the random customer data is fetched to input fields on Individual Other Information Page
    Then  User should see the first checkbox is selected on Individual Other Information Page
    Then  User should see the second checkbox is selected on Individual Other Information Page
    Then  User should see the Message checkbox is selected on Individual Other Information Page
    Then  User should see the Telephone checkbox is selected on Individual Other Information Page
    Then  User should see the Email checkbox is selected on Individual Other Information Page
    Then  User should see the Post checkbox is selected on Individual Other Information Page
    Then  User should see the Facebook checkbox is selected on Individual Other Information Page
    Then  User should see the Po-Yes checkbox is selected on Individual Other Information Page
    Then  User should see the Jo-No checkbox is not selected on Individual Other Information Page

    When  User clicks the Generate Form button on Individual Other Information Page
    Then  User should see the Generate Form open in a new window on Individual Other Information Page
    And   User go back to Individual Other Information Page
    And   User adds a valid "gdprForm.pdf" document for Consent Form on Individual Other Information Page
    Then  User should see the name of "gdprForm.pdf" added pdf document on Individual Other Information Page
    When  User clicks Save button on Individual Other Information page
    Then  User should see the "Customer created successfully" snake message
    Then  User should be  General part  under  Main page  button on Customer360 search page
