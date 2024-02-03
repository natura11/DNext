#language: en

Feature: Create Foreigner Customer

  @regression @pia @createforeignercustomer @VFALFT-8986
  Scenario: Test Foreigner Customer address
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    And I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani" in the Address Line One field
    And I enter a value "No:7 Cankaya" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab


  @regression @pia @createforeignercustomer @VFALFT-8987
  Scenario: Negative Scenarios Of Test Foreigner Customer address
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    When I enter a value "" in the Address Line One field
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    When I enter a value "" in the Address Line One field for Service Address
    Then I should be seeing an error message about the "Service Address 1" mandatory field
    And I click Next button for Contact Information
    Then I should be seeing an error message about the "Address1" mandatory field
    Then I should be seeing an error message about the "Service Address City" mandatory field
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartman" in the Address Line One field
    Then I should be seeing an error message about the "City" mandatory field
    And I click Next button for Contact Information
    #Then I should be seeing an error message about the "City" mandatory field
    When I select a value "TIRANE" in the City field
    And I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab


  @regression @pia @createforeignercustomer @VFALFT-8965 @smoke
  Scenario: Test Create Customer for Foreigner Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "NAZIM" in the First Name field
    Then I should be seeing that "nazım" "First Name" value characters are uppercase
    When I enter a value "RAN" in the Last Name field
    Then I should be seeing that "ran" "Last Name" value characters are uppercase
    When I enter a value "HIKMET" in the Secondary Name field
    Then I should be seeing that "hikmet" "Secondary Name" value characters are uppercase
    When I enter a value "nazım.hikmet@ran.com" in the Email field
    Then I should be seeing that "nazım.hikmet@ran.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "ANKARA" value from Place Of Birth DropdownList
    When I select the "TURKISH" value from Citizenship DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    When I enter a value "12042021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Cankaya" in the Address Line Two field
    When I select a value "BERAT" in the City field
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
    #Then I should be seeing that "Type Of Authorization" "Foreigner Flag" "First Name" "Last Name" "Personal Number" "Authorization Document Type" "Authorization Document" areas
    #Given the value is "Customer" of the Type Of Authorization field
    #When I check the The “First Name“, “Last Name“, “Personal Number“, “Authorization Document Type” and “Authorization Document“ fields
    #Then I should be seeing that these fields are not displayeAnd  I select a value Authorized Type : "Authorized Person"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    #And  I select a value Authorized Type : "Legal custodian"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
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
    #When I enter values in order "Type1", "Flag1", "Nazim", "Ran", "XS12345673" , "DocType1", "Doc1" in the input fields
    #Then I should be seeing than I can enter values in these input fields
    #When I check the "Sales Agent" field
    #Then I should be seeing that a DropdownList
    #When I select a value for Sales Agent from DropdownList
    #Then I should be seeing that I can select a value for Sales Agent Field
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
#    And  I add file in the Document File field for Other Information
#    When I click Add button
#    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @createforeignercustomer @VFALFT-8977
  Scenario: Test Create Customer for Foreigner Customer Negative Scenarios
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    And I click Next button
    Then I should be seeing an error message about the "Personal Number" mandatory field
    When I enter a value "1" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    #When I click Next button for Address Information
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I enter a value "" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    #When I enter a value in "Id Doc Date" different from the date format
    #Then I should be seeing that there is no allow
    #When I leave Document Number field empty and click "Add" button
    #Then I should be seeing an error message about mandatory field
    When I enter a value "02062048" in the Birth field
    When I click Next button for Address Information
    Then I should be seeing an error message about the "Birth" mandatory field
    Then I should be seeing an error message about the "Place Of Birth" mandatory field
    Then I should be seeing an error message about the "Country Of Birth" mandatory field
    Then I should be seeing an error message about the "Gender" mandatory field
    Then I should be seeing an error message about the "Document Type" mandatory field
    When I enter a value "yusuf.com" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "123" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I click "Address Information" tab
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address" mandatory field
    When I enter a value "" in the Address Line One field for Service Address
    Then I should be seeing an error message about the "Service Address 1" mandatory field
    When I click Next button for Contact Information
    Then I should be seeing an error message about the "City" mandatory field
    Then I should be seeing an error message about the "Service Address City" mandatory field
    When I click "Contact Information" tab
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
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

  @regression @pia @createforeignercustomer @VFALFT-8997 @smoke
  Scenario:Test Foreigner Customer Authorized Person Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "42222222223333333335" in the Identification Number field for Add New User
    And I click Next button
    When I click "Contact Information" tab
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    #Then I should be seeing that "Foreigner Flag" field displayed
    #Then I should be seeing that Foreigner Flag optinal and default value is un-checked
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    #Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "None"
    #Then I should be seeing that I can select as "Authorized Person" and these fields are not displayed
    #When I check the Foreigner Flag field
    #Then I should be seeing that I can check the Foreigner Flag
    And  I select a value Authorized Type : "Authorized Person"
    When I enter a value "C" in the Identification Number Field for Contact Tab
    When I click Search Identification button for Contact Information
    When I enter a value "eric" in the First Name Field
    When I enter a value "damme" in the Last Name Field
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    #When I add file in the Document File field for Contact Tab
    #When I Un-checked the Foreigner Flag field
    #Then I should be seeing that Foreigner Flag optinal and default value is un-checked
    #When I check the Foreigner Flag field
    #Then I should be seeing that I can check the Foreigner Flag
    #When I enter values in order "Legal Custodian", "Cemal", "Süreyya", "XS5435435" , "DocType2", "Doc2" in the input fields and click "Add" button
    #Then I should be seeing that the record is registered
    #When I try to define more than one Authorized Person for each Customer
    #Then I should be seeing that is possible
   



  @regression @pia @createforeignercustomer @VFALFT-8999
  Scenario:Negative Scenarios Test Foreigner Customer Authorized Person Information Creation
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    #Then I should be seeing that Identification Number-New Customer field is displayed
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    When I add file in the Document File field
    Then I click "Contact Information" tab
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "None"
    And  I select a value Authorized Type : "Authorized Person"
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "Given Name" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Family Name" mandatory field
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    #Then I should be seeing the message "You have to add customers PASSPORT document!"
    And  I enter a value "C" in the Identification Number Field for Contact Tab
    And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field
    And  I enter a value "damme" in the Last Name Field
    And  I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    And  I add file greater than 5MB in the Document File field for Contact Tab
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"



  @regression @pia @createforeignercustomer @VFALFT-9005
  Scenario: Test Create Party for Foreigner Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "nazım" in the First Name field
    Then I should be seeing that "nazım" "First Name" value characters are uppercase
    When I enter a value "ran" in the Last Name field
    Then I should be seeing that "ran" "Last Name" value characters are uppercase
    When I enter a value "hikmet" in the Secondary Name field
    Then I should be seeing that "hikmet" "Secondary Name" value characters are uppercase
    When I enter a value "nazım.hikmet@ran.com" in the Email field
    Then I should be seeing that "nazım.hikmet@ran.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "ANKARA" value from Place Of Birth DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    When I enter a value "12042021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Cankaya" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "None"
    #Then I should be seeing that I can select as "Authorized Person" and these fields are not displayed
    #When I check the Foreigner Flag field
    #Then I should be seeing that I can check the Foreigner Flag
    #And  I select a value Authorized Type : "Authorized Person"
    #When I enter a value "1" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    #When I enter values in order "Type1", "Flag1", "Nazim", "Ran", "XS12345673" , "DocType1", "Doc1" in the input fields
    #Then I should be seeing than I can enter values in these input fields
    #When I check the "Sales Agent" field
    #Then I should be seeing that a DropdownList
    #When I select a value for Sales Agent from DropdownList
    #Then I should be seeing that I can select a value for Sales Agent Field
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



  @regression @pia @createforeignercustomer @VFALFT-9007
  Scenario:Negative Scenarios- Test Create Party for Foreigner Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    And I click Next button
    Then I should be seeing an error message about the "Personal Number" mandatory field
    When I enter a value "1" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    #When I click Next button for Address Information
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I enter a value "" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    #When I enter a value in "Id Doc Date" different from the date format
    #Then I should be seeing that there is no allow
    #When I leave Document Number field empty and click "Add" button
    #Then I should be seeing an error message about mandatory field
    When I enter a value "17032025" in the Birth field
    When I click Next button for Address Information
    Then I should be seeing an error message about the "Birth" mandatory field
    Then I should be seeing an error message about the "Place Of Birth" mandatory field
    Then I should be seeing an error message about the "Country Of Birth" mandatory field
    Then I should be seeing an error message about the "Gender" mandatory field
    Then I should be seeing an error message about the "Document Type" mandatory field
    When I enter a value "yusuf.com" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "123" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I click "Address Information" tab
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address" mandatory field
    When I click Next button for Contact Information
    Then I should be seeing an error message about the "City" mandatory field
    Then I should be seeing an error message about the "Country" mandatory field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field


  @regression @pia @createforeignercustomer @VFALFT-9726
  Scenario: Test Create Individual Customer: Include Creation Of Billing Account for Foreigner Costumer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    #Then I should be seeing that Identification Number-New Customer field is displayed
    And I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "halil" in the First Name field
    Then I should be seeing that "halil" "First Name" value characters are uppercase
    When I enter a value "kara" in the Last Name field
    Then I should be seeing that "kara" "Last Name" value characters are uppercase
    When I enter a value "deniz" in the Secondary Name field
    Then I should be seeing that "deniz" "Secondary Name" value characters are uppercase
    When I enter a value "halil.kara@deniz.com" in the Email field
    Then I should be seeing that "halil.kara@deniz.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "SİVAS" value from Place Of Birth DropdownList
    When I select the "TURKISH" value from Citizenship DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    #When I enter a value "XS12345673" in the Personal Number field
    #Then I should be seeing that I can enter value in the staff number field
    #When I check the "Type" field
    #Then I should be seeing that "Type Information Of the Customer" field is “Automatically” set as “Consumer” for Foreigner Customer
    #When I check the "Segment" field
    #Then I should be seeing that "Segment Information Of the Customer" field`s default value is "Individual"
    #When I check the value of "Segment" field
    #Then I should be seeing "Individual" and "Foreigner"
    #When I select a value "Foreigner" in the Segment field
    #Then I should be seeing that I can select Segment field as "Foreigner"
    #When I select the "Country Of Birth" as Albania And check the "Segment Information Of the Customer" field
    #Then I should be seeing that "Segment Information Of the Customer" field`s default value is "Foreigner"
    #When I check the "POS" field
    #Then I should be seeing that  "POS" field is “Automatically” populated
    #Given Back Office Agents login the system
    #When I check the "POS" field
    #Then I should be seeing that POS field is editable
    #Given Admin logins the system
    #When I check the "POS" field
    #Then I should be seeing that POS field is editable
    #When I enter a date which is equal boundary value in the "BirtDate" field and click "Add" button
    #Then I should be seeing that the record can be registered
    #When I check the "Id Doc Date" field format
    #Then I should be seeing that "Id Doc Date" format is date format
    #When I enter a value "09.09.2020" in the Id Doc Date field
    #Then I should be seeing that I can enter a value in the Id Doc Date field
    #When I enter a value "Dok123456" in the "Document Number" field
    #Then I should seeing that I can enter a value in the Document Number field.
    #When I select a value "Passport" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    #And  I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Cankaya" in the Address Line Two field
    When I select a value "BERAT" in the City field
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
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side


  @regression @pia @createforeignercustomer @VFALFT-9075
  Scenario: Foreigner Customer-Test Mandatory Documents Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "orhan" in the First Name field
    Then I should be seeing that "orhan" "First Name" value characters are uppercase
    When I enter a value "veli" in the Last Name field
    Then I should be seeing that "veli" "Last Name" value characters are uppercase
    When I enter a value "kanık" in the Secondary Name field
    Then I should be seeing that "kanık" "Secondary Name" value characters are uppercase
    When I enter a value "orhan.kanik@gmail.com" in the Email field
    Then I should be seeing that "orhan.kanik@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "İSTANBUL" value from Place Of Birth DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    And  I should be seeing that Document Type field as "ID CARD"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    When I select a value "Passport" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    And  I add file in the Document File field
    And  I click Cancel File button
    Then I should be seeing the message "You have to add customers PASSPORT document!"
    And  I add file in the Document File field
    #When I add file 5MB in the Document File field
    #When I check the document Type field on the additional document window
    #Then I should be seeing that the document type is displayed on the additional document window
    #When I check the document issue date field on the addional document window
    #Then I should be seeing that the document issue date is displayed on the addional document window
    #When I check the Document Number field on the addional document window
    #Then I should be seeing that the document Number is displayed on the addional document window
    #When I check the document attachment field on the addional document window
    #Then I should be seeing that the document attachment field is displayed
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Beyoğlu" in the Address Line Two field
    When I select a value "TIRANE" in the City field
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


  @regression @pia @createforeignercustomer @VFALFT-9076
  Scenario: Negative Scenarios-Foreigner Customer- Test Mandatory Documents Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    #Then I should be seeing that 3 area :"Document Type","Issuing Date","Document Number" for General Information tab in the Create Customer page
    And  I should be seeing that Document Type field as "ID CARD"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    #When I select a value "Passport" for the Document Type field
    And  I enter a value "" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I enter a value "??!!,,**--ABCabc_" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I enter a value "08042020" in the Issuing Date
    And  I add file greater than 5MB in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #When I check the document attachment field on the addional document window
    #Then I should be seeing that the document attachment field is displayed
    #When I select a value "Others" in the Document Type field on addional document window
    #Then I should be seeing that I can select Others in the Document Type field on addional document window
    #When I enter a value "10/10/2008" in the Document issue date field on the additional document window
    #Then I should be seeing that I can enter a value in the Issuing Date field on the additional document window
    #When I enter a value "A12345678B" in the Identification Number field on the additional document window
    #Then I should be seeing that I can enter a value in the Identification Number field additional document window
    #When I click the Upload File field on the additional document window
    #Then I should be seeing that Upload File field is displayed on the additional document
    #When I click upload document button and upload a document which is greater than 5 MB
    #Then I should be seeing that a warning message is displayed




  @regression @pia @createforeignercustomer @VFALFT-8988
  Scenario: Negative Scenarios -Foreigner Customer Authorized-Test Mandatory Documents Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    When I click "Contact Information" tab
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    #And  I should be seeing that 3 area "Document Type", "Issuing Date", "Document Number" for Contact Information tab in the Create Customer page
    #When I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "Given Name" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Family Name" mandatory field
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    When I enter a value "haldun" in the First Name Field
    When I enter a value "taner" in the Last Name Field
    #And  I add file greater than 5MB in the Document File field for Contact Tab
    #Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    Then I should be seeing the message "You have to add customers ID document!"


  @regression @pia @createforeignercustomer @VFALFT-8983
  Scenario: Foreigner Customer Authorized-Test Mandatory Documents Collection
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "orhan" in the First Name field
    Then I should be seeing that "orhan" "First Name" value characters are uppercase
    When I enter a value "veli" in the Last Name field
    Then I should be seeing that "veli" "Last Name" value characters are uppercase
    When I enter a value "kanık" in the Secondary Name field
    Then I should be seeing that "kanık" "Secondary Name" value characters are uppercase
    When I enter a value "orhan.kanik@gmail.com" in the Email field
    Then I should be seeing that "orhan.kanik@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "İstanbul" value from Place Of Birth DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    And  I should be seeing that Document Type field as "ID CARD"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    And I enter a value "12122020" in the Issuing Date
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Beyoğlu" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    #And  I click Search button for Billing Address
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
    #Then I should be seeing the message "You have to add customers PASSAPORT document!" for Contact Tab
    #When I select a document which is equal 5MB and click upload button
    #Then I should be seeing that the document is upload
    #When I check the document Type field on the additional document window
    #Then I should be seeing that the document type is displayed on the additional document window
    #When I check the document issue date field on the addional document window
    #Then I should be seeing that the document issue date is displayed on the addional document window
    #When I check the Document Number field on the addional document window
    #Then I should be seeing that the document Number is displayed on the addional document window
    #When I check the document attachment field on the addional document window
    #Then I should be seeing that the document attachment field is displayed
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


  @regression @pia @createforeignercustomer @VFALFT-9675 @ignore
  Scenario: Test Upon Error during Save Of Information for Foreigner Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "orhan" in the First Name field
    Then I should be seeing that "orhan" "First Name" value characters are uppercase
    When I enter a value "veli" in the Last Name field
    Then I should be seeing that "veli" "Last Name" value characters are uppercase
    When I enter a value "kanık" in the Secondary Name field
    Then I should be seeing that "kanık" "Secondary Name" value characters are uppercase
    When I enter a value "orhan.kanik@gmail.com" in the Email field
    Then I should be seeing that "orhan.kanik@gmail.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "İstanbul" value from Place Of Birth DropdownList
    When I select the "TURKISH" value from Citizenship DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    #Then I should be seeing that 3 area :"Document Type","Issuing Date","Document Number" for General Information tab in the Create Customer page
    And  I should be seeing that Document Type field as "ID CARD"
    And  I should be seeing that "ID Card" "Passport" "Other" values is displayed in the Document Type field
    #When I select a value "Passport" for the Document Type field
    And I enter a value "12122020" in the Issuing Date
    #And  I enter a value "C" in the Document Number field
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I enter a value "Beyoğlu" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    #And  I click Search button for Billing Address
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
    #When the error is occured (e.g. the internet connection is interrupted) during saving process and I check the uploaded documents
    #Then I should be seeing that uploaded documents are deleted