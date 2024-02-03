#language: en

Feature: Create Corporate Customer

  @regression @pia @createcorporatecustomer @VFALFT-9276
  Scenario: Test General Information for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
#    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer


  @regression @pia @createcorporatecustomer @VFALFT-9278
  Scenario: Negative Scenarios -Test General Information for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I click the Next button
    Then I should be seeing that "NIPT" field is mandatory and not leaved empty
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    #When I try to change Type field
    #Then I should be seeing that Type field is not changed
    #When I leave Segment field empty
    #Then I should be seeing that Segment field is mandatory and not leaved empty
    When I click the Next Button for Admin Information
    Then I should be seeing that "Industry" field is mandatory and not leaved empty
    When I enter a value "" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I enter a value "??**//..!!!--,,__" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty


  @regression @pia @createcorporatecustomer @VFALFT-9323
  Scenario: Test Admin Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Female" in the Gender field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer for General information TAB



  @regression @pia @createcorporatecustomer @VFALFT-9325
  Scenario: Negative Scenarios -Test Admin Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    #Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    #When I enter a value "" in the Secondary Name field for Corporate Customer
    #Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    When I enter a value "" in the Email field for Corporate Customer
    Then I should be seeing that "Email" field is mandatory and not leaved empty
    When I enter a value "abc123" in the Email field for Corporate Customer
    Then I should be seeing that "Email" field is mandatory and not leaved empty
    When I enter a value "" in the BirthDate field for Corporate Customer
    Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    When I enter a value "17032005" in the BirthDate field for Corporate Customer
    Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    When I enter a value "" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "..**,,//abcABC??" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    #When I enter a value ""in the Identification Number field for Corporate Customer
    #Then I should be seeing that "Identification Number" field is mandatory and not leaved empty
    When I click the Next Button for Address Information
    Then I should be seeing that "Place Of Birth" field is mandatory and not leaved empty
    Then I should be seeing that "Gender" field is mandatory and not leaved empty
    Then I should be seeing that "Communication Method" field is mandatory and not leaved empty


  @regression @pia @createcorporatecustomer @VFALFT-9328
  Scenario: Test Adress Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "TIRANE" in the City field for Corporate Customer
    Then I should be seeing that City field as "TIRANE" for Address Information tab in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Also Service Address
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    When I select a value "TIRANE" in the City field for Also Service Address


  @regression @pia @createcorporatecustomer @VFALFT-9329
  Scenario: Negative Scenarios -Test Address Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I enter a value "" in the Address Line One field for Corporate Customer
    Then I should be seeing that "Address Line One" field is mandatory and not leaved empty



  @regression @pia @createcorporatecustomer @VFALFT-9206 @uat
  Scenario: Negative Scenarios - Test Create Corporate Parent Account
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Enterprise Parent Account" menu
    Then I should be seeing that the "Parent Accounts" title for Corporate Parent Account Page
    When I click Add button for Corporate Parent Account Page
    Then I should be seeing "Parent Account" popup
    When I enter a value "" in the Name field for Corporate Parent Account Page
    Then I should be seeing that "Name" field is mandatory and not leaved empty for Corporate Parent Account Page
    When I click New Customer button for Corporate Parent Account Page
    When I enter a value "" in the NIPT field for Corporate Parent Account Page
    Then I should be seeing that "NIPT" field is mandatory and not leaved empty for Corporate Parent Account Page
    #When I enter a value "" in the Type field
    #Then I should be seeing that "Type" field is mandatory and not leaved empty
    Then I should be seeing that "Add" field is mandatory and not leaved empty for Corporate Parent Account Page


  @regression @pia @createcorporatecustomer @VFALFT-9199 @smoke @uat
  Scenario: Test Create Corporate Parent Account
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Enterprise Parent Account" menu
    Then I should be seeing that the "Parent Accounts" title for Corporate Parent Account Page
    When I click Add button for Corporate Parent Account Page
    Then I should be seeing "Parent Account" popup
    And  I should be seeing that Name field is displayed for Corporate Parent Account Page
    When I enter a value "VodafoneTurkey" in the Name field for Corporate Parent Account Page
    Then I should be seeing that "VodafoneTurkey" "Name" value characters are uppercase for Corporate Parent Account Page
    When I click New Customer button for Corporate Parent Account Page
    And  I enter a value "" in the NIPT field and choose registered user for Corporate Parent Account Page
    And  I click Search button for Corporate Parent Account Page
    And  I click on related customer from search list for Corporate Parent Account Page
    And  I click "Done" button
    When I would be saving the The Parent Account and click Add button
    Then I should be seeing the popup alert message "Parent account created successfully" for Corporate Parent Account Page
    #Then I should be seeing that "VODAFONETURKEY" The Parent Account is created


  @regression @pia @createcorporatecustomer @VFALFT-9201
  Scenario: Test Negative Scenarios General Information for Creating Customer-Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I click the Next button
    Then I should be seeing that "NIPT" field is mandatory and not leaved empty
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    #When I try to change Type field
    #Then I should be seeing that Type field is not changed
    #When I leave Segment field empty
    #Then I should be seeing that Segment field is mandatory and not leaved empty
    When I click the Next Button for Admin Information
    Then I should be seeing that "Industry" field is mandatory and not leaved empty
    #Then I should be seeing that "Bill Media" field is mandatory and not leaved empty
    When I enter a value "" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I enter a value "??**//..!!!--,,__" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty


  @regression @pia @createcorporatecustomer @VFALFT-9198
  Scenario: Test General Information for Creating Customer-Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I click the Next button
    Then I should be seeing that "NIPT" field is mandatory and not leaved empty
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "siemens" in the Name field
    Then I should be seeing that "siemens" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer


  @regression @pia @createcorporatecustomer @VFALFT-9225
  Scenario: Test Customer Contact Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page


  @regression @pia @createcorporatecustomer @VFALFT-9226
  Scenario: Test Negative Scenarios Customer Contact Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I click Next button for Contact Information in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    When I enter a value "" in the Address Line One field for Also Service Address
    Then I should be seeing that "Service Address Line One" field is mandatory and not leaved empty
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    #When I select a value "" in the City field for Also Service Address
    Then I should be seeing that "Service City" field is mandatory and not leaved empty

  @regression @pia @createcorporatecustomer @VFALFT-9332
  Scenario: Test Add Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "14042021" in the Issuing Date for Corporate Customer
    #And I enter a value "C" in the Identification Number Two field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    And  I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createcorporatecustomer @VFALFT-9275 @smoke
  Scenario: Test Negative Scenarios Corporate Customer Address Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    And  I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "" in the Address Line One field for Corporate Customer
    When I click Add button for Corporate Customer
    Then I should be seeing that "Address Line One" field is mandatory and not leaved empty
    When I click Next button for Contact Information in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "" in the Address Line One field for Also Service Address
    Then I should be seeing that "Service Address Line One" field is mandatory and not leaved empty
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    #When I select a value "" in the City field for Also Service Address
    #Then I should be seeing that "Service City" field is mandatory and not leaved empty


  @regression @pia @createcorporatecustomer @VFALFT-9271
  Scenario: Test Corporate Customer Address Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Ambasada Turke Rruga e Elbasanit no:65 Tirana/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "TIRANE" in the City field for Corporate Customer
    Then I should be seeing that City field as "TIRANE" for Address Information tab in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed for Also Service Address Button
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Service Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "Ambasada Turke Rruga e Elbasanit no:65 Tirana/Albania" in the Address Line One field for Also Service Address
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    When I select a value "TIRANE" in the City field for Also Service Address
    Then I should be seeing that City field as "TIRANE" for Also Service Address



  @regression @pia @createcorporatecustomer @VFALFT-9224 @smoke
  Scenario: Test Add Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10072022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "14042021" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    #And  I select a value "1" in the Credit Rating field
    #And  I select a value "1" in the Credit Rating field for Prepaid Account
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"



  @regression @pia @createcorporatecustomer @VFALFT-9214
  Scenario: Test Negative Scenarios Address Info Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I click Add button for Corporate Customer
    Then I should be seeing that "City" field is mandatory and not leaved empty
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    #When I enter a value "" in the Address Line One field for Corporate Customer
    #Then I should be seeing that "Address Line One" field is mandatory and not leaved empty
    When I click Service Address switch for Corporate Customer
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "" in the Address Line One field for Also Service Address
    Then I should be seeing that "Service Address Line One" field is mandatory and not leaved empty
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    #When I select a value "" in the City field for Also Service Address
    Then I should be seeing that "Service City" field is mandatory and not leaved empty
    When I click Next button for Contact Information in the Corporate Customer Page



  @regression @pia @createcorporatecustomer @VFALFT-9210 @smoke
  Scenario: Test Negative Scenarios Admin Information Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I click the Next Button for Address Information
    Then I should be seeing that "Gender" field is mandatory and not leaved empty
    Then I should be seeing that "Place Of Birth" field is mandatory and not leaved empty
    Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    Then I should be seeing that "Communication Method" field is mandatory and not leaved empty
    #When I enter a value ""in the Identification Number field for Corporate Customer
    #Then I should be seeing that "Identification Number" field is mandatory and not leaved empty
    #When I enter a value "++sss99jjj"in the Identification Number field for Corporate Customer
    #Then I should be seeing that "Identification Number" field is mandatory and not leaved empty
    When I enter a value "" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "a123...--" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    When I enter a value "B78jj__...--" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    When I enter a value "45435ööö__...--" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    When I enter a value "" in the Email field for Corporate Customer
    Then I should be seeing that "Email" field is mandatory and not leaved empty
    When I enter a value "deneme..." in the Email field for Corporate Customer
    Then I should be seeing that "Email" field is mandatory and not leaved empty
    #When I enter a value "18022005" in the BirthDate field for Corporate Customer
    #Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    When I enter a value "" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "___+++++" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty




  @regression @pia @createcorporatecustomer @VFALFT-9202
  Scenario: Test Admin Information Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "arda" in the First Name field for Corporate Customer
    Then I should be seeing that "arda" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "feridun" in the Last Name field for Corporate Customer
    Then I should be seeing that "feridun" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "mehmet" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "mehmet" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "arda.feridun@gmail.com" in the Email field for Corporate Customer
    Then I should be seeing that "arda.feridun@gmail.com" "Email" value characters are uppercase for Corporate Customer Page
    #When I enter a value "boundary value" in the BirthDate field for Corporate Customer
    When I enter a value "15011950" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Female" in the Gender field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #Then I should be seeing that values are "Sales Visit" "Phone" "Direct Mail" "Email" "Wireless Message" "SMS" "Fax" in the Communication Method field
    #When I select a value "Direct Mail" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10102020" in the Issuing Date for Corporate Customer
    #And  I enter a value "14042021" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer

  @regression @pia @createcorporatecustomer @VFALFT-9707
  Scenario: Test Customer Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    #Then I should be seeing that 2 area : "Issuing Date","Document Number" for Admin Information tab in the Create Corporate Customer page
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    And  I click Cancel File button for Corporate Customer
    #Then I should be seeing the message "You have to add customers ID document!" for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    #When I select a document which is equal 5MB and click upload button
    #Then I should be seeing that the document is upload
    #When I select "Other" in the Document Type field for Corporate Customer
    #And  I enter a value "10102020" in the Issuing Date for Corporate Customer
    #And  I enter a value "C" in the Identification Number Two field for Corporate Customer
    #And  I add file in the Document File field for Corporate Customer
    #And  I click Cancel File button for Corporate Customer
    #When I click "+" button
    #Then I should be seeing that a window is opened for uploading new documents
    #When I check the Document Type field on the additional document window
    #Then I should be seeing that the document type is displayed on the additional document window
    #When I check the Document Issue date field on the addional document window
    #Then I should be seeing that the document issue date is displayed on the addional document window
    #When I check the Document Number field on the addional document window
    #Then I should be seeing that the document Number is displayed on the addional document window
    #When I check the Document Attachment field on the addional document window
    #Then I should be seeing that the document attachment field is displayed
    #When I select a value "Other" in the Document Type field on addional document window
    #Then I should be seeing that I can select Others in the Document Type field on addional document window
    #When I enter a value "10.10.2008" in the Document issue date field on the additional document window
    #Then I should be seeing that I can enter a value in the Document issue date field on the additional documnet window
    #When I enter a value "1234567890" in the document number field on the additional document window
    #Then I should be seeing that I can enter a value in the document number field additional document window
    #When I click the document attachment field on the additional document window
    #Then I should be seeing that upload document field is displayed on the additional document
    #When I click upload document button and upload a document which is below than 5 MB
    #Then I should be seeing that I can upload the document
    #When I click "X" button
    #Then I should be seeing that The uploaded document is deleted
    #When I click upload document button and upload a document which is equal 5 MB
    #Then I should be seeing that I can upload the document
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createcorporatecustomer @VFALFT-9719 @smoke
  Scenario: Negative Scenarios -Test Customer Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    When I enter a value "lamborghini" in the Name field
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10072022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIA" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    When I add file greater than 5MB in the Document File field for Corporate Customer
    Then I should be seeing the popup alert message for Medium Contact "File size can not be bigger than 5 MB!" for Corporate Customer


  @regression @pia @createcorporatecustomer @VFALFT-9720 @ignore @uat
  Scenario: Test Upon Error during Save Of Information for Customer Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "SOHO" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I click Send Pin button for Corporate Customer for General TAB
    And  I enter a value " " Pin field for Corporate Customer for General TAB
    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    And  I select a value "Phone" in the Communication Method for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10122022" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    #And  I click Search button for Billing Address
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    #And  I should be seeing that "Payment Type" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    #Then I should be seeing that User Reference field is displayed
    #Then I should be seeing that User Reference field is automatically taken from the Name of the Corporate Customer
    #Then I should be seeing that default value is displayed as Prepaid in the Payment Type field
    #Then I should be seeing that default value is displayed as Cash in the Payment Method field
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    #And  I select a value "Postpaid" in the Payment Type field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"
    #When the error is occured (e.g. the internet connection is interrupted) during saving process and I check the uploaded documents
    #Then I should be seeing that uploaded documents are deleted

  @regression @pia @createcorporatecustomer @VFALFT-9213
  Scenario: Test Address Info Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    And  I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    And  I enter a value "Rozafa" in the Address Line Two field for Corporate Customer
    Then I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Also Service Address
    And  I enter a value "Rozafa" in the Address Line Two field for Also Service Address
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    When I select a value "BERAT" in the City field for Also Service Address
    Then I should be seeing that City field as "BERAT" for Also Service Address
    Then I should be seeing that is area : "Medium Type" DropdownList for Corporate Customer



  @regression @pia @createcorporatecustomer @VFALFT-9215
  Scenario: Test Invoice Account Info Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Invoice Account Information tab
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    #And  I should be seeing that "Payment Type" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    #Then I should be seeing that User Reference field is displayed
    #Then I should be seeing that User Reference field is automatically taken from the Name of the Corporate Customer
    #Then I should be seeing that default value is displayed as Prepaid in the Payment Type field
    #Then I should be seeing that default value is displayed as Cash in the Payment Method field
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    #And  I select a value "Postpaid" in the Payment Type field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field


  @regression @pia @createcorporatecustomer @VFALFT-9223
  Scenario: Test Negative Scenarios Invoice Account Info Create Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Invoice Account Information tab
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    When I select a value "" in the Bill Media field
    Then I should be seeing that "Bill Media" field is mandatory and not leaved empty
    And  I select a value "Direct Debit" in the Payment Method field
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    When I enter a value "" in the Bank Account No field
    Then I should be seeing that "Bank Account No" field is mandatory and not leaved empty



  @regression @pia @createcorporatecustomer @VFALFT-9330
  Scenario: Test Invoice Account Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Invoice Account Information tab
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    #And  I should be seeing that "Payment Type" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    #Then I should be seeing that User Reference field is displayed
    #Then I should be seeing that User Reference field is automatically taken from the Name of the Corporate Customer
    #Then I should be seeing that default value is displayed as Prepaid in the Payment Type field
    #Then I should be seeing that default value is displayed as Cash in the Payment Method field
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    #And  I select a value "Postpaid" in the Payment Type field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field

  @regression @pia @createcorporatecustomer @VFALFT-9331
  Scenario: Negative Scenarios -Test Invoice Account Information Creation for Customer Basic Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Invoice Account Information tab
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    When I select a value "" in the Bill Media field
    Then I should be seeing that "Bill Media" field is mandatory and not leaved empty
    And  I select a value "Direct Debit" in the Payment Method field
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    When I enter a value "" in the Bank Account No field
    Then I should be seeing that "Bank Account No" field is mandatory and not leaved empty


  @regression @pia @createcorporatecustomer @VFALFT-11331
    Scenario: Test FE-Blacklisted Flag - Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Blacklisted" field is displayed for Widget
    And  I should be seeing that the value of  the "Blacklisted" is correct to the related corporate customer for CustomerParty Related Info Widget


  @regression @pia @createcorporatecustomer @VFALFT-12111 @smoke
    Scenario: Test FE-Corporate Customer: Create Invoice Account Details
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation Leisure" "Transport Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10072022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    #When I click Service Address switch for Corporate Customer
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    And  I should be seeing that values of Bill Media field are "", "Paper", "E-Bill"
    When I select a value "Paper" in the Bill Media field
    Then I should be seeing that values of Currency field are "ALL", "EUR", "USD"
    When I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    Then I should be seeing that values of Payment Method field are "Cash", "Direct Debit"
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    #And  I select a value "1" in the Credit Rating field
    #And  I select a value "1" in the Credit Rating field for Prepaid Account
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createcorporatecustomer @VFALFT-11619 @smoke
    Scenario: Test FE-Corporate Customer 360: Invoice Account Display
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    #Then I should be seeing that the value of "Bill Media" field is correct

