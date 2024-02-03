#language: en

Feature: Create Residential Customer


  @regression @pia @createresidentialcustomer @VFALFT-9028 @smoke @uat
  Scenario: Test Create Customer for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "5000000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    #And  I select a value "1" in the Credit Rating field
    #And  I select a value "1" in the Credit Rating field for Prepaid Account
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-9096
  Scenario: Negative Scenarios Of Test Create Customer for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    And  I click Next button
    Then I should be seeing an error message about the "Personal Number" mandatory field
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    #When I click Next button for Address Information
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I enter a value "" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    #When I leave Segment field empty and click "Add" button
    #Then I should be seeing an error message about the "Segment" mandatory field
    #When I leave POS field empty and click "Add" button
    #Then I should be seeing an error message about the "POS" mandatory field
    When I enter a value "02062048" in the Birth field
    When I click Next button for Address Information
    Then I should be seeing an error message about the "Birth" mandatory field
    Then I should be seeing an error message about the "Place Of Birth" mandatory field
    Then I should be seeing an error message about the "Country Of Birth" mandatory field
    Then I should be seeing an error message about the "Gender" mandatory field
    Then I should be seeing an error message about the "Document Type" mandatory field
    When I enter a value "ROBERT.COM" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "123" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I click "Address Information" tab
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address1" mandatory field
    When I enter a value "" in the Address Line One field for Service Address
    Then I should be seeing an error message about the "Service Address 1" mandatory field
    When I click Next button for Contact Information
    Then I should be seeing an error message about the "City" mandatory field
    Then I should be seeing an error message about the "Service Address City" mandatory field
    When I click "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "First Name Contact" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Last Name Contact" mandatory field
    #When I leave Customer Sales Agent field empty and click "Add" button
    #Then I should be seeing an error message about the "Customer Sales" mandatory field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field


  @regression @pia @createresidentialcustomer @VFALFT-9071 @smoke
  Scenario: Test Residential Customer Address
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    And I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field
    When I enter a value "Nr.61, Kashar, Tirane" in the Address Line Two field
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "CERRIK" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab

  @regression @pia @createresidentialcustomer @VFALFT-9073
  Scenario: Negative Scenarios Of Test Residential Customer address
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    When I enter a value "" in the Address Line One field
    And I click Next button for Contact Information
    Then I should be seeing an error message about the "Address1" mandatory field
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field
    Then I should be seeing an error message about the "City" mandatory field
    When I select a value "CERRIK" in the City field
    And I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab


  @regression @pia @createresidentialcustomer @VFALFT-9084 @uat
  Scenario:Test Residential Customer Authorized Person Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "Legal Custodian"
    And  I select a value Authorized Type : "Authorized Person"
    When I enter a value "C" in the Identification Number Field for Contact Tab
    When I click Search Identification button for Contact Information
    When I enter a value "eric" in the First Name Field
    When I enter a value "damme" in the Last Name Field
    When I enter a value "02061992" in the Birth field for Contact Tab
    When I select the "Male" value from Gender DropdownList for Contact Tab
    And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    When I add file in the Document File field for Contact Tab



  @regression @pia @createresidentialcustomer @VFALFT-9085 @uat
  Scenario:Negative Scenarios Test Residential Customer Authorized Person Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "None"
    And  I select a value Authorized Type : "Authorized Person"
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "First Name Contact" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Last Name Contact" mandatory field
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    And  I select a value Authorized Type : "Legal Custodian"
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "First Name Contact" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Last Name Contact" mandatory field
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field


  @regression @pia @createresidentialcustomer @VFALFT-9097 @ignore
  Scenario:Test Create Party for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "benard" in the First Name field
    Then I should be seeing that "benard" "First Name" value characters are uppercase
    When I enter a value "ervis" in the Last Name field
    Then I should be seeing that "ervis" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "benard.ervis@damme.com" in the Email field
    Then I should be seeing that "benard.ervis@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "ERSEKE" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "Passport" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Erseke" in the Address Line Two field
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "ERSEKE" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #And  I select a value Authorized Type : "Authorized Person"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-9099
  Scenario:Negative Scenarios - Test Create Party for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    And I click Next button
    Then I should be seeing an error message about the "Personal Number" mandatory field
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    #When I click Next button for Address Information
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I enter a value "" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field
    #When I leave Segment field empty and click "Add" button
    #Then I should be seeing an error message about the "Segment" mandatory field
    #When I leave POS field empty and click "Add" button
    #Then I should be seeing an error message about the "POS" mandatory field
    When I enter a value "02062100" in the Birth field
    #When I enter a value "22 October 1998" in the Birth field 2nd. version
    When I click Next button for Address Information
    Then I should be seeing an error message about the "Birth" mandatory field
    Then I should be seeing an error message about the "Place Of Birth" mandatory field
    Then I should be seeing an error message about the "Country Of Birth" mandatory field
    Then I should be seeing an error message about the "Gender" mandatory field
    Then I should be seeing an error message about the "Document Type" mandatory field
    When I enter a value "ervis.com" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "123456" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I click "Address Information" tab
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address" mandatory field
    When I click Next button for Contact Information
    Then I should be seeing an error message about the "City" mandatory field
    Then I should be seeing an error message about the "Country" mandatory field
    #When I enter values alternately "Emri", "Mbiemri", "A12345678B" , "DocType1" in the empty field and click "Add" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave Customer Sales Agent field empty and click "Add" button
    #Then I should be seeing an error message about the "Customer Sales" mandatory field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field


  @regression @pia @createresidentialcustomer @VFALFT-9725
  Scenario: Test Create Individual Customer: Include Creation Of Billing Account for Residential Costumer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "01042021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-9658
  Scenario: Residential Customer-Test Mandatory Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    Then I should be seeing that "Bukuroshe" "First Name" value characters are uppercase
    When I enter a value "Drita" in the Last Name field
    Then I should be seeing that "Drita" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    Then I should be seeing that "bukuroshe.drita@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    And  I should be seeing that Document Type field as "ID Card"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    When I select a value "ID Card" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    And  I add file in the Document File field
    And  I click Cancel File button
    Then I should be seeing the message "You have to add customers ID document!"
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "TIRANE" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-9660
  Scenario: Negative Scenarios -Residential Customer-Test Mandatory Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    Then I should be seeing that "Bukuroshe" "First Name" value characters are uppercase
    When I enter a value "Drita" in the Last Name field
    Then I should be seeing that "Drita" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    Then I should be seeing that "bukuroshe.drita@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    When I click Next button for Address Information
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I enter a value "??!!,,**--ABCabc__" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I enter a value "08042020" in the Issuing Date
    And  I add file greater than 5MB in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"


  @regression @pia @createresidentialcustomer @VFALFT-9661
  Scenario: Residential Customer Authorized Person -Test Mandatory Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    Then I should be seeing that "Bukuroshe" "First Name" value characters are uppercase
    When I enter a value "Drita" in the Last Name field
    Then I should be seeing that "Drita" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    Then I should be seeing that "bukuroshe.drita@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    #Then I should be seeing that 3 area :"Document Type","Issuing Date","Document Number" for General Information tab in the Create Customer page
    And  I should be seeing that Document Type field as "ID Card"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    When I select a value "ID Card" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    #And  I click Cancel File button for Contact Tab
    #Then I should be seeing the message "You have to add customers ID document!"
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    And  I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-9662
  Scenario: Negative Scenarios -Residential Customer Authorized Person -Test Mandatory Document Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    Then I should be seeing that "Bukuroshe" "First Name" value characters are uppercase
    When I enter a value "Drita" in the Last Name field
    Then I should be seeing that "Drita" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    Then I should be seeing that "bukuroshe.drita@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    #Then I should be seeing that 3 area :"Document Type","Issuing Date","Document Number" for General Information tab in the Create Customer page
    And  I should be seeing that Document Type field as "ID Card"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    When I select a value "ID Card" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    #And  I enter a value "C" in the Document Number field
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "TIRANE" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "Given Name" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Family Name" mandatory field
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    #Then I should be seeing the message "You have to add customers PASSPORT document!"
    And  I select a value Authorized Type : "Authorized Person"
    When I enter a value "C" in the Identification Number Field for Contact Tab
    When I click Search Identification button for Contact Information
    When I enter a value "eric" in the First Name Field
    When I enter a value "damme" in the Last Name Field
    When I enter a value "02061992" in the Birth field for Contact Tab
    When I select the "Male" value from Gender DropdownList for Contact Tab
    And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    And  I add file greater than 5MB in the Document File field for Contact Tab
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"


  @regression @pia @createresidentialcustomer @VFALFT-9669 @ignore
  Scenario: Test Upon Error during Save Of Information for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    Then I should be seeing that "Bukuroshe" "First Name" value characters are uppercase
    When I enter a value "Drita" in the Last Name field
    Then I should be seeing that "Drita" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    Then I should be seeing that "bukuroshe.drita@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    #Then I should be seeing that 3 area :"Document Type","Issuing Date","Document Number" for General Information tab in the Create Customer page
    And  I should be seeing that Document Type field as "ID Card"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    When I select a value "ID Card" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"
    #When the error is occured (e.g. the internet connection is disconnected) during saving process and I check the uploaded documents
    #Then I should be seeing that uploaded documents are deleted



  @regression @pia @createresidentialcustomer @VFALFT-11332 @smoke
    Scenario: Test FE-Blacklisted Flag - Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    #And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Blacklisted" field is displayed for Widget
    #Then I should be seeing that the Black Listed of information is displayed


  @regression @pia @createresidentialcustomer @VFALFT-13445
    Scenario: Individual Customer Creating with the id used in Admin Information on the Creating Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "" in the Identification Number field with Admin Information id value for Enterprise Customer
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-13444
    Scenario: Individual Customer Creating with the id used in Admin Information on the Creating Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "" in the Identification Number field with Admin Information id value for Enterprise Customer
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-13443
    Scenario: Individual Customer Creating with the id used in Authorized Person
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "" in the Identification Number field with Contact Information id value for Individual Customer
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createresidentialcustomer @VFALFT-13442
    Scenario: Individual Customer Creating with the id used in legal custodian
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "" in the Identification Number field with Contact Information id value for Individual Customer
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"