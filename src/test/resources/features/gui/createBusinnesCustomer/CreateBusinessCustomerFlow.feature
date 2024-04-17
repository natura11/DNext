@VFALFT-23470 @smoke @regression @BusinessCustomer
Feature:New Business Customer-Customer Creation

  Background:
    Given  I have opened the "Customer Management" application
    Given  I enter a value "gerta.vathi" in the Username or email field on Sign In page
    Given  I enter a value "1234" in the Password field on Sign In page
    Given  I click the Sign in button on Sign In page
    Given  User opens Create Business Customer page on Home page
    Then   User should see the "New Business Customer" header on screen on Create Customer page

  @BusinessAlbanianCustomerCreation @smoke
  Scenario: As a user I want to create an Albanian Business  Customer
    When  User enters random NIPT for ALBANIAN to the NIPT number field on Search Organization page
    And   User clicks the Search button on Search Organization page
    And   User checks the NIPT is usable or not on Search Business page
    Then  User should see the random NIPT is new for ALBANIAN on Search Business page
    And   User clicks the Next button on Search Organization page

    Then  User should see the "General Information" tab is opened
    When  User clicks Industry dropdown on general information page
    And   User should selects any option in the Industry dropdown on general information page
    And   User enters random organization name on Business General Information page
    Then  User should see the Company Name is autofilled with organization name on Business General Information page
    When  User clicks Segment dropdown on general information page
    And   User should selects any options in the Segment dropdown on general information page
 #   Then  User should selects "Corporate" option in the Segment dropdown on general information page
    And   User clicks Tax Exempt dropdown on general information page
    And   User should selects any option in the Tax Exempt dropdown on general information page
    And   User enters random email on Business General Information page
    And   User clicks Communication Method dropdown on general information page
    And   User selects any communication option on General Information Page
    And   User enters random mobile phone number on Business General Information page
    And   User enters random valid issuing date on Business General Information page
    And   User adds a "document.jpg" of which format is image on general information page
    And   User should see the name of "document.jpg" added jpg document on the screen on general information page
    And   User clicks the Next button on general information page

    Then  User should see the "Admin Information" tab is opened
    When  User clicks on the Identification Number field on Admin Information Page
    And   User enters one existing "M12345678C" ID number into the Identification Number field on Admin Information page
    And   User clicks the search icon in Identification Number field on Admin Information page
    And   User sees some ID related information were fetched on Admin Information Page
      | Identification Number | M12345678C |
      | First Name            | MECNUN     |
      | Last Name             | CINAR      |
      | Gender                | MALE       |
      | Birth Date            | 1/10/2005  |
      | Citizenship           | ALBANIAN   |
      | Country Of Birth      | ALBANIA    |
      | Place Of Birth        | BERAT      |
    Then User should see the "Phone number must be like 6XXXXXXXX !"warning message  under number field on Admin Information Page
    And   User enters random email on Business Admin Information page
    And   User enters random mobile phone number on Business Admin Information page
    Then  User should see this "You have to add customers ID document!" warning message near to add button on Admin Information Page
    And   User add "pdfSample.pdf" document file on Admin Information Page
    Then  User should see the name of "pdfSample.pdf" added jpg document on the screen on Admin Information Page
    And   User clicks next Button on Admin Information Page

    Then  User should see the "Contact Information" tab is opened
    And   User clicks Type of Contact dropdown on Contact Information Page
    And   User selects random option in the Contact dropdown on Contact Information Page
    Then  User should see Mobile Phone Number textbox on Contact Information Page
    When  User clicks Country Code dropdown Contact Information Page
    And   User selects "+355" option in the Country Code dropdown on Contact Information page
    And   User clicks mobile phone number field on Contact Information page
    And   User enters random mobile phone number on Contact Information page
    And   User clicks Email textbox on Contact Information Page
    And   User enters random email on Contact Information Page
    And   User clicks Next button on Contact Information Page

    Then  User should see the "Address Information" tab is opened
    Then  User see the Medium Type textbox is non-editable on Address Information Page
    Then  User see the Contact Type textbox is non-editable on Address Information Page
    Then  User see the Country dropdown is non-editable on Address Information Page
    Then  User see the ALBANIA value on the Country dropdown on Address Information Page
    When  User clicks Address Line 1 Field on Address Information Page
    And   User enters a value "FIRST ADDRESS" in the Address Line 1 textbox on Address Information Page
    And   User clicks Post Code Field on Address Information Page
    And   User enters a value "1234" in the Post Code textbox on Address Information Page
    And   User clicks City dropdown on Address Information Page
    Then  User should select random option in the City dropdown on Address Information Page
    And   User clicks Next button on Address Information Page

    Then  User should see the "Invoice Account" tab is opened
    And   User clicks Description Field on Invoice Account page
    And   User enters a value "Business Test Description 123" in the Description textbox on Invoice Account page
    And   User clicks Payment Method dropdown on Invoice Account page
    And   User should ensure each options in Payment Method dropdown are selectable on Invoice Account page
    And   User should select "Cash" option in the Payment Method dropdown on Invoice Account page
    When  User clicks email field on Invoice Account page
    And   User enters random Ebill email on Business Invoice Account page
    And   User clicks mobile phone number field on Invoice Account page
    And   User enters random Ebill mobile number on Business Invoice Account page
    And   User clicks credit rating postpaid dropdown on Business Invoice Account page
    And   User selects random credit ration for postpaid on Business Invoice Account page
    And   User adds a valid "dummy.pdf" document for Ebill document on Business Invoice Account page
    Then  User should see the name of "dummy.pdf" added Ebill document on Business Invoice Account page
    And   User clicks credit rating prepaid dropdown on Business Invoice Account page
    And   User selects random credit ration for prepaid on Business Invoice Account page
    And   User clicks Next button on Invoice Account page

    Then  User should see the "Other Information" tab is opened

    When  User clicks the General Information button for Business
    Then  User should see the "General Information" tab is opened
    Then  User should see the random customer data is fetched to input fields on Business Other Information Page
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

