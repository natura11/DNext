#language: en

Feature: Update Customer


  @regression @pia @updatecustomer @VFALFT-9324 @ignore
  Scenario: Test Negative Scenarios Invoice Account Information Update Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #Then I should be seeing that "ELECTRONIC" "PAPER" "E-BILL" values is displayed in the Bill Media field
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation & Leisure" "Transport & Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
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
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I enter a value "612345678" in the Mobile Number field for Corporate Customer
    And  I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I select a value "TIRANE" in the City field for Corporate Customer
    #When I click "Invoice Account Information" tab
    #Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    #When I leave the User Reference field empty
    #Then I should be seeing that User Reference field is mandatory and I see a warning about the User Reference field
    #When I leave the Payment Type field empty
    #Then I should be seeing that Payment Type field is mandatory and I see a warning about the Payment Type field
    #When I leave the Payment Method field empty
    #Then I should be seeing that Payment Method field is mandatory and I see a warning about the Payment Method field
    #Given Payment Method is Direct Debit
    #When I leave the Bank Name field empty
    #Then I should be seeing that Bank Name field is mandatory and I see a warning about the Bank Name field
    #Given Payment Method is Direct Debit
    #When I leave the Bank Account No field empty
    #Then I should be seeing that Bank Account No field is mandatory and I see a warning about the Bank Account No field

  @regression @pia @updatecustomer @VFALFT-9287 @ignore
  Scenario: Test Invoice Account Information Update Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #Then I should be seeing that "ELECTRONIC" "PAPER" "E-BILL" values is displayed in the Bill Media field
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    #Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation & Leisure" "Transport & Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
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
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I enter a value "612345678" in the Mobile Number field for Corporate Customer
    And  I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I select a value "TIRANE" in the City field for Corporate Customer
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
    #Then I should be seeing that Credit Team is  displayed as Listbox
    #When I select a value in the Credit Team
    #Then I should be seeing the values are "0- No Corporate" "1- High Value Corporate" "2-Low Value Corporate"
    #When I select a value "1- High Value Corporate" in the Corporate Type field
    #Then I should be seeing that Dunning Level is displayed
    #Then I should be seeing the values are "0- Account" "1-Subscription"
    #When I select a value "0- Account" in the Dunning Level field
    #Then I should be seeing that Disconnection Date is displayed as Date format
    #When I enter a value "23.06.2021" in the Disconnection Date field
    #Then I should be seeing that Disconnection Reason field is displayed
    #When I enter a value "Disconnection" in the Disconnection Reason field
    #Given Backoffice Agents login the system
    #Then I should be seeing that POS field is displayed
    #Then I should be seeing that POS field is “Automatically” populated
    #When I enter a new value in the POS field
    #Then I should be seeing that Tax Exempt  is displayed as Dropdownlist
    #Then I should be seeing the values are "0.0" "1.0"
    #When I select a value "0.0" in the Tax Exempt field
    #Then I should be seeing that Parent Account is displayed
    #When I enter a value in the Parent Account field and click Search button and select
    #Then I should be seeing that  Payments Installment is displayed as Dropdownlist
    #Then I should be seeing the values are "External Collection" "To be Paid Totally" "To be Paid in 2 installments" "To be Paid in 3 installments""To be Paid in 4 installments" "To be Paid in 5 installments" "To be Paid in 6 installments"
    #When I select a value "External Collection" in the Payments Installment field
    #Then I should be seeing that Potential Fraud is displayed
    #When I select a value in the Potential Fraud field
    #Then I should be seeing that Potential Fraud Comment is displayed
    #When I enter a value in the Potential Fraud Comment field
    #Then I should be seeing that First Class Responsible is displayed
    #When I select a value in the First Class Responsible field
    #Then I should be seeing that Number Of Employees field is displayed
    #When I enter a value "23" in the Number Of Employees field
    #Then I should be seeing that I can enter a value in the Number Of Employees field
    #Then I should be seeing that Blacklisted  field is displayed
    #When I select a value in the Blacklisted field

  @regression @pia @updatecustomer @VFALFT-9256 @ignore
  Scenario: Test Admin Information for Updating Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #Then I should be seeing that "ELECTRONIC" "PAPER" "E-BILL" values is displayed in the Bill Media field
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation & Leisure" "Transport & Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
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
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    #When I enter a value "C" in the Identification Number field for Corporate Customer
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
    #When I select a value "Phone" in the Communication Method for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "14042021" in the Issuing Date for Corporate Customer
    #And I enter a value "C" in the Identification Number Two field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    And  I enter a value "612345678" in the Mobile Number field for Corporate Customer
    When I enter a new value "0035324443322" in the Work Number field for Corporate Customer
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
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Customer Saved Successfully"

  @regression @pia @updatecustomer @VFALFT-9248 @ignore
  Scenario: Test General Information for Updating Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "BEKO" in the Name field
    Then I should be seeing that "BEKO" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #Then I should be seeing that "ELECTRONIC" "PAPER" "E-BILL" values is displayed in the Bill Media field
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    #Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation Leisure" "Transport Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
    When I select a value "Manufacturing" from Dropdown List in the Industry field
    #When I select a new value in the Enterprise Account Manager field
    #Then I should be seeing that I can update the value in the Enterprise Account Manager field

  @regression @pia @updatecustomer @VFALFT-9252 @ignore
  Scenario: Test Negative Scenarios General Information for Updating Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I enter a value "??**//..!!!--,,__" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty

  @regression @pia @updatecustomer @VFALFT-9281 @ignore
  Scenario: Test Negative Scenarios Admin Information Update Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "micheal" in the Name field
    #Then I should be seeing that Name field is editable
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    #Then I should be seeing that Bill Media  field is editable
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
    #Then I should be seeing that Industry field is editable
    #When I enter a new value for Account Manager field
    #Then I should be seeing that Account Manager  field is editable
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    #When I enter a value "" in the Last Name field for Corporate Customer
    #Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    #When I enter a value "" in the Secondary Name field for Corporate Customer
    #Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    When I enter a value "..**,,//123??" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    #When I enter a value "" in the Email field for Corporate Customer
    #Then I should be seeing that "Email" field is mandatory and not leaved empty
    When I enter a value "abc123" in the Email field for Corporate Customer
    Then I should be seeing that "Email" field is mandatory and not leaved empty
    #When I enter a value "" in the BirthDate field for Corporate Customer
    #Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    When I click Birth Date close button for Corporate Customer
    When I enter a value "17032005" in the BirthDate field for Corporate Customer
    Then I should be seeing that "Birth Date" field is mandatory and not leaved empty
    #When I enter a value "" in the Mobile Number field for Corporate Customer
    #Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "..**,,//abcABC??" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    #When I enter a value ""in the Identification Number field for Corporate Customer
    #Then I should be seeing that "Identification Number" field is mandatory and not leaved empty
    When I click the Next Button for Address Information

  @regression @pia @updatecustomer @VFALFT-10803 @ignore
  Scenario: Test Update Residential Customer - General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing that the Search Individual tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
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
    #And  I select a value "Credit Class 1" in the Credit Rating field
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
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "TIRANE" in the City field
    When I click Save button
    Then I should be seeing the popup alert message "Customer Saved Successfully"
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "ROBERT" "First Name" value updated for Widget
    Then I should be seeing that "DAMME" "Last Name" value updated for Widget
    Then I should be seeing that "JUSTIN" "Secondary Name" value updated for Widget
    Then I should be seeing that "ROBERT.JUSTIN@DAMME.COM" "Email" value updated for Widget
    Then I should be seeing that "PATOS" "Place of Birth" value updated for Widget

  @regression @pia @updatecustomer @VFALFT-10707 @uat @ignore
  Scenario: Test Update Corporate Customer - Document Type Info -360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    When I enter a value "lamborghini" in the Name field
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    And  I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I enter a value "600000000" in the Mobile Number field for Corporate Customer
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I enter a value "10122021" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
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
    And  I click Save button for Corporate Customer
    Then I should be seeing the popup alert message "Customer Saved Successfully"
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document Info" widget
    Then I should be seeing that the "Document Info" widget is opened
    And  I should be seeing that "AdminDoc" "Document Type" value updated for Document Info Widget
    And  I should be seeing that "14.04.2021" "Issuing Date" value updated for Document Info Widget


  @regression @pia @updatecustomer @VFALFT-10693 @uat @ignore
  Scenario: Test Update Residential Customer-Document Info-360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    And  I should be seeing that the Search Individual tab
    When I enter a value "C" in the Identification Number field and choose registered user
    And  I click Search Identification button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    And  I enter a value "600000000" in the Mobile Number field
    And  I enter a value "bukuroshe.drita@gmail.com" in the Email field
    And  I click Cancel File button
    And  I select a value "ID Card" for the Document Type field
    And  I enter a value "12122020" in the Issuing Date
    #And  I enter a value "C" in the Document Number field
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    #When I enter a value "ALBANIA" in the Country field
    When I select a value "TIRANE" in the City field
    When I click Save button
    Then I should be seeing the popup alert message "Customer Saved Successfully"
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document Info" widget
    Then I should be seeing that the "Document Info" widget is opened
    And  I should be seeing that "ID CARD" "Document Type" value updated for Document Info Widget
    And  I should be seeing that "12.12.2020" "Issuing Date" value updated for Document Info Widget

  @regression @pia @updatecustomer @VFALFT-9327 @ignore
  Scenario: Test Update for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #Then I should be seeing that "ELECTRONIC" "PAPER" "E-BILL" values is displayed in the Bill Media field
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation & Leisure" "Transport & Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
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
    #And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    #When I click Cancel File button for Corporate Customer
    #When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    #When I select a value "ALBANIA" in the Country field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
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
    When I click Save button for Corporate Customer
    Then I should be seeing the popup alert message "Customer Saved Successfully"


  @regression @pia @updatecustomer @VFALFT-9284 @ignore
  Scenario: Test Negative Scenarios Address Info Update Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I enter a value "" in the Address Line One field for Corporate Customer
    Then I should be seeing that "Address Line One" field is mandatory and not leaved empty

  @regression @pia @updatecustomer @VFALFT-9030 @ignore
  Scenario:Negative Scenarios Test Customer Address Information Update For Foreigner
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "ahmet" in the First Name field
    And  I enter a value "ahmet.mehmet@gmail.com" in the Email field
    And  I enter a value "600000000" in the Mobile Number field
    When I select a value "Passport" for the Document Type field
    When I add file in the Document File field
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "" in the Address Line One field
    When I enter a value "" in the Address Line Two field
    #When I select a value "" in the Country field
    #And  I enter a value "" in the City field
    #Then I should be seeing an error message about the "Address1" mandatory field
    #Then I should be seeing an error message about the "Country" mandatory field
    #Then I should be seeing an error message about the "City" mandatory field
    When I click Save button
    #Then I should be seeing an error message about the "Save" mandatory field



  @regression @pia @updatecustomer @VFALFT-9122 @ignore
  Scenario:Test Customer Information Update for Foreigner
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field and choose registered user
    When I click Search Identification button
    #And I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "cemal" in the First Name field
    Then I should be seeing that "cemal" "First Name" value characters are uppercase
    When I enter a value "cınar" in the Last Name field
    Then I should be seeing that "cınar" "Last Name" value characters are uppercase
    When I enter a value "mehmet" in the Secondary Name field
    Then I should be seeing that "mehmet" "Secondary Name" value characters are uppercase
    When I enter a value "cemal.cınar@yahoo.com" in the Email field
    Then I should be seeing that "cemal.cınar@yahoo.com" "Email" value characters are uppercase
    #When I click Birth Date close button
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "Ankara" value from Place Of Birth DropdownList
    #When I select the "TURKISH" value from Citizenship DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "Passport" for the Document Type field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Atatürk Mah. 212.Sok. Cagdas Apartmani No:7 Cankaya" in the Address Line One field
    When I select a value "BERAT" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    When I enter a value "C" in the Identification Number Field for Contact Tab
    When I click Search Identification button for Contact Information
    When I enter a value "eric" in the First Name Field
    When I enter a value "damme" in the Last Name Field
    When I enter a value "02061992" in the Birth field for Contact Tab
    When I select the "Male" value from Gender DropdownList for Contact Tab
    And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    When I add file in the Document File field for Contact Tab
    When I click Save button
    When I should be seeing the popup alert message "Customer Saved Successfully"


  @regression @pia @updatecustomer @VFALFT-9146 @ignore
  Scenario:Negative Scenarios Test Customer Information Update for Foreigner
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I enter a value "123" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I click Save button
    Then I should be seeing an error message about the "Save" mandatory field

  @regression @pia @updatecustomer @VFALFT-9152 @ignore
  Scenario:Test Customer Information Update for Residential
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "erica" in the First Name field
    Then I should be seeing that "erica" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "erica.damme@gmail.com" in the Email field
    Then I should be seeing that "erica.damme@gmail.com" "Email" value characters are uppercase
    #When I click Birth Date close button
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    And  I select the "ALBANIAN" value from Citizenship DropdownList
    And  I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    And  I select a value "Passport" for the Document Type field
    And  I click Next button for Address Information
    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Address Tab
    And  I should be seeing that the value of  the "City" is correct to the related residential customer for Address Tab
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    And  I enter a value "Albania/Tirana" in the Address Line Two field
    And  I select a value "TIRANE" in the City field
    And  I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    When I click Save button
    Then I should be seeing the popup alert message "Customer Saved Successfully"



  @regression @pia @updatecustomer @VFALFT-9153 @ignore
  Scenario:Negative Scenarios Test Customer Information Update for Residential
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I enter a value "123" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I click Save button
    Then I should be seeing an error message about the "Save" mandatory field


  @regression @pia @updatecustomer @VFALFT-10889 @ignore
  Scenario: Negative Test Update 360 Corporate Customer - General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I enter a value "??**//..!!!--,,__" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    #When I select a value "" from Dropdown List in the Bill Media field
    #When I select a value "" from Dropdown List in the Industry field
    #When I leave Account Manager field empty
    #Then I should be seeing warnings are displayed about mandatory fields
    When I click the "Save" Button
    Then I should be seeing that "Save" Button is not active


  @regression @pia @updatecustomer @VFALFT-10888 @ignore
  Scenario: Test Update 360 Corporate Customer - General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "micheal" in the Name field
    #Then I should be seeing that Name field is editable
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    #Then I should be seeing that Bill Media  field is editable
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    #Then I should be seeing that Industry field is editable
    #When I enter a new value for Account Manager field
    #Then I should be seeing that Account Manager  field is editable
    When I click the Admin Information tab
    And  I enter a value "nic" in the First Name field for Corporate Customer
    And  I enter a value "600000000" in the Mobile Number field for Corporate Customer
    And  I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I click the Address Information tab
    And  I select a value "TIRANE" in the City field for Corporate Customer
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
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Customer created successfully"
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    And  I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin Information" for Tab
    When I click "Admin Information" widget
    Then I should be seeing that the "Admin Information" widget is opened
    Then I should be seeing that "NIC" "First Name" value updated for Widget
    Then I should be seeing that "NICK.KALE@MAIL.COM" "Email" value updated for Widget
    Then I should be seeing that "0035554443322" "Mobile Phone Number" value updated for Widget


  @regression @pia @updatecustomer @VFALFT-10831 @ignore
  Scenario: Test Update Corporate Customer - Admin info - 360 Positive SGiven I have opened the "Customer Management" application
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    #Then I should be seeing that "Identification Number" field is deactive and not editable
    #When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "Haluk" in the First Name field for Corporate Customer
    Then I should be seeing that "Haluk" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "Levent" in the Last Name field
    Then I should be seeing that "Levent" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "Mehmet" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "Mehmet" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    And  I select a value "Phone" in the Communication Method for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click Save button for Corporate Customer
    #When I open "Customer360" menu
    #Then I should be seeing that the "Customer Search" page is opened
    #And  I should be seeing that Select Search Type field is a Dropdown list
    #When I select the "NIPT" value from Select Search Type DropdownList
    #And  I enter "" value on Search field and click Search button
    #Then I should be seeing that a related customer can be displayed
    #When I click on related customer from search list
    #When I click "Contact" Tab for Customer360 Page
    #Then I should be seeing that "Admin Information" for Tab
    #When I click "Admin Information" widget
    #Then I should be seeing that the "Admin Information" widget is opened
    #Then I should be seeing that all updated fields are displayed with correct values


  @regression @pia @updatecustomer @VFALFT-10832 @ignore
  Scenario: Negative Test Update Corporate Customer - Admin Info 360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    #Then I should be seeing that "Identification Number" field is not editable for Corporate Customer
    When I enter a value "" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "a123...--" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "" in the Last Name field for Corporate Customer
    #Then I should be seeing that "Last Name" field is mandatory and not leaved empty
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
    #When I enter "****????!!!" for "Birth Date"
    #Then I should be seeing warnings about the mandatory fields
    When I enter a value "" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "___+++++" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    #When I leave Place Of Birth field empty
    #Then I should be seeing warnings about the mandatory fields
    #When I check Communication Method field
    #Then I should be seeing that I cannot leave empty "Communication Method" field
    #When I leave Country Of Birth field empty
    #Then I should be seeing warnings about the mandatory fields
    #When I leave Citizenship field empty
    #Then I should be seeing warnings about the mandatory fields

  @regression @pia @updatecustomer @VFALFT-10824 @ignore
  Scenario: Negative Test Update Corporate Customer - Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I click the Document Add button for Corporate Customer
    Then I should be seeing the popup alert message for Medium Contact "You can not add more than one document!" for Corporate Customer
    When I click Cancel File button for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "12122020" in the Issuing Date for Corporate Customer
    #When I enter a value "C" in the Document Number field
    When I add file greater than 5MB in the Document File field for Corporate Customer
    Then I should be seeing the popup alert message for Medium Contact "File size can not be bigger than 5 MB!" for Corporate Customer
    #When I enter a value "C" in the Identification Number Two field for Corporate Customer
    #Then I should be seeing that "Document Number" field is mandatory and not leaved empty
    #And  I enter a value "" in the Issuing Date for Corporate Customer
    #Then I should be seeing that "Issuing Date" field is mandatory and not leaved empty
    #And  I enter a value "??!!,,**--ABCabc_" in the Issuing Date for Corporate Customer
    #Then I should be seeing that "Issuing Date" field is mandatory and not leaved empty

  @regression @pia @updatecustomer @VFALFT-10823 @uat @ignore
  Scenario: Negative Test Update Residential Customer - Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing that the Search Individual tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    When I click the Document Add button
    Then I should be seeing the popup alert message for Create Customer page "You can not add more than one document!"
    When I click Cancel File button
    When I select a value "ID Card" for the Document Type field
    Then I should be seeing the message "You have to add customers ID document!"
    When I select a value "ID Card" for the Document Type field
    And  I enter a value "12122020" in the Issuing Date
    When I add file greater than 5MB in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I enter a value "" in the Document Number field
    Then I should be seeing an error message about the "Document Number" mandatory field
    When I click Birth Date close button
    And  I enter a value "" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    And  I enter a value "??!!,,**--ABCabc_" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field


  @regression @pia @updatecustomer @VFALFT-10807 @ignore
  Scenario: Test Update Corporate Customer - Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    Then I should be seeing "General Information" tab for Corporate Customer
    When I enter a value "lamborghini" in the Name field
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    Then I should be seeing that Document Type field as "AdminDoc" for Corporate Customer
    When I click the Document Add button for Corporate Customer
    Then I should be seeing the popup alert message for Medium Contact "You can not add more than one document!" for Corporate Customer
    When I click Cancel File button for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "12122020" in the Issuing Date for Corporate Customer
    #And  I enter a value "1" in the Identification Number Two field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    And  I click Save button for Corporate Customer
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document Info" widget
    Then I should be seeing that the "Document Info" widget is opened
    And  I should be seeing that "AdminDoc" "Document Type" value updated for Document Info Widget
    And  I should be seeing that "12.12.2020" "Issuing Date" value updated for Document Info Widget
    #When I click on "Contact-Address Information" tab
    #Then I should be seeing that "Contact-Address Information" tab is opened
    #Then I should be seeing that all updated fields are displayed with correct values

  @regression @pia @updatecustomer @VFALFT-10819 @ignore
  Scenario: Test Update Residential Customer - Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing that the Search Individual tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    #Then I should be seeing that "Identification Number" field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "Bukuroshe" in the First Name field
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I enter a value "bukuroshe.drita@gmail.com" in the Email field
    When I select a value "ID Card" for the Document Type field
    Then I should be seeing that Document Type field as "ID Card"
    When I click the Document Add button
    Then I should be seeing the popup alert message for Create Customer page "You can not add more than one document!"
    When I click Cancel File button
    When I select a value "ID Card" for the Document Type field
    Then I should be seeing the message "You have to add customers ID document!"
    When I select a value "ID Card" for the Document Type field
    And  I click Issuing Date close button for Create Residential Customer Page
    And I enter a value "12122020" in the Issuing Date
    #And  I enter a value "C" in the Document Number field
    And  I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "TIRANE" in the City field
    When I click Save button
    Then I should be seeing the popup alert message "Customer Saved Successfully"
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document Info" widget
    Then I should be seeing that the "Document Info" widget is opened
    #And  I should be seeing that "ID CARD" "Document Type" value updated for Document Info Widget
    And  I should be seeing that "12.12.2020" "Issuing Date" value updated for Document Info Widget
    #When I click on "Contact-Authorize Customer" tab
    #Then I should be seeing that "Contact-Authorize Customer" tab is opened
    #Then I should be seeing that all updated fields are displayed with correct values

  @regression @pia @updatecustomer @VFALFT-9029 @ignore
  Scenario:Test Customer Address Information Update For Foreigner
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Foreigner Customer
      |name               |
      |Foreigner          |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "ahmet" in the First Name field
    And  I enter a value "ahmet.mehmet@gmail.com" in the Email field
    And  I enter a value "600000000" in the Mobile Number field
    When I select a value "Passport" for the Document Type field
    When I add file in the Document File field
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    And I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Orman mah. fidan sok. D5" in the Address Line One field
    When I select a value "BERAT" in the City field
    When I click Save button
    Then I should be seeing the popup alert message "Customer Saved Successfully"



  @regression @pia @updatecustomer @VFALFT-9081 @ignore
  Scenario:Negative Scenarios Test Customer Address Information Update For Residential
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    And  I enter a value "robert.justin@damme.com" in the Email field
    And  I enter a value "600000000" in the Mobile Number field
    When I click Address Information tab
    Then I should be seeing "Address Information" tab
    And I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Address Tab
    And  I should be seeing that the value of  the "City" is correct to the related residential customer for Address Tab
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address1" mandatory field
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I enter a value "" in the Address Line One field for Service Address
    Then I should be seeing an error message about the "Service Address 1" mandatory field
    When I click Next button for Contact Information
    #Then I should be seeing an error message about the "City" mandatory field
    #Then I should be seeing an error message about the "Service Address City" mandatory field
    When I click Save button
    Then I should be seeing an error message about the "Save" mandatory field



  @regression @pia @updatecustomer @VFALFT-9283 @ignore
  Scenario: Test Address Information Update Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and choose registered user
    When I enter a value "lamborghini" in the Name field
    When I click the Admin Information tab
    When I enter a value "nic" in the First Name field for Corporate Customer
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "StephanStrasse, 28 22047" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "TIRANE" in the City field for Corporate Customer
    Then I should be seeing that City field as "TIRANE" for Address Information tab in the Corporate Customer Page
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
    When I click Save button for Corporate Customer
    Then I should be seeing the popup alert message "Customer Saved Successfully"


  @regression @pia @updatecustomer @VFALFT-10804 @ignore
  Scenario: Negative Test Update Residential Customer - General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing that the Search Individual tab
    When I enter a value "C" in the Identification Number field and choose registered user
    When I click Search Identification button
    Then I should be seeing "General Information" tab
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I enter a value "" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    #When I leave POS field empty
    #Then I should be seeing warnings about the mandatory fields
    When I click Birth Date close button for Create Residential Customer Page
    When I enter a value "17032025" in the Birth field
    Then I should be seeing an error message about the "Birth" mandatory field
    When I click Birth Date close button for Create Residential Customer Page
    When I enter a value "****????!!!" in the Birth field
    Then I should be seeing an error message about the "Birth" mandatory field
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I enter a value "****????!!!" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    #When I leave Segment field empty and click "Add" button
    #Then I should be seeing an error message about the "Segment" mandatory field
    #When I leave POS field empty and click "Add" button
    #Then I should be seeing an error message about the "POS" mandatory field
    #When I leave Job Description empty
    #Then I should be seeing warnings about the Optionally fields
    #When I leave Education empty
    #Then I should be seeing warnings about the Optionally fields
    #When I leave Fix Phone Number field empty
    #Then I should be seeing warnings about the Optional fields
    #Then I should be seeing an error message about the "Place Of Birth" mandatory field
    #Then I should be seeing an error message about the "Country Of Birth" mandatory field
    #Then I should be seeing an error message about the "Citizenship" mandatory field
    #Then I should be seeing an error message about the "Gender" mandatory field
    When I enter a value "ROBERT.COM" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I enter a value "123" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    Then I should be seeing an error message about the "Save" mandatory field

  @regression @pia @updatecustomer @VFALFT-10817 @ignore
  Scenario: Test Update Corporate Customer - Extended Trouble Ticket
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
    #When I click "Tickets" widget
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    When I select value "Medium" in the Priority field
    And I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    #Then I should be seeing "Trouble Tickets" page
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Trouble Ticket List


  @regression @pia @updatecustomer @VFALFT-10821
  Scenario: Test Negative Scenario Update Corporate Customer - Extended Trouble Ticket
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Status" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Created Date" field is not editable


  @regression @pia @updatecustomer @VFALFT-10816 @uat
  Scenario: Test Update Corporate Customer - Single Trouble Ticket
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
    Then I should be seeing that Trouble Tickets list that are created before 30 days is displayed for related customer
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Status" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Created Date" field is not editable
    When I select value "Medium" in the Priority field
    And I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    #Then I should be seeing "Trouble Tickets" page
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Trouble Ticket List


  @regression @pia @updatecustomer @VFALFT-10818 @uat @ignore
  Scenario: Test Negative Scenario Update Corporate Customer - Single Trouble Ticket
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Status" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Created Date" field is not editable


  @regression @pia @updatecustomer @VFALFT-10886 @smokep
  Scenario: Test Update 360 Corporate Customer - Customer 360 - Customer/Party Related Info
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
    Then I should be seeing that "Customer Information" for Tab
    When I click Edit button for Customer360 Page
    When I select a value "Construction" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I click on the "Save" button
    Then I should be seeing the popup alert message "Organization updated successfully" for Customer360 Page
    When I click second Edit button for Customer360 Page
    When I enter a value "lamborghini" in the Name field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Customer360 Page
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "Elton" in the Sales Agent field
    And  I click on the "Save" button
    And  I should be seeing that "Elton" for Tab
    And  I should be seeing that "LAMBORGHINI@GMAIL.COM" for Tab


  @regression @pia @updatecustomer @VFALFT-10887 @uat
  Scenario: Negative Test Update 360 Corporate Customer - Customer 360 - Customer/Party Related Info
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
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Customer360 Page
    When I enter a value "" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I enter a value "??**//..!!!--,,__" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    When I click the "Save" Button
    Then I should be seeing that "Generate Form" for Tab



  @regression @pia @updatecustomer @VFALFT-10833 @smokep
  Scenario: Test Update Corporate Customer -Customer 360 - Contact type
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
    When I click "Contact" Tab for Customer360 Page
    #Then I should be seeing that "Admin Information" for Tab
    #When I click "Admin Information" widget
    #Then I should be seeing that the "Admin Information" widget is opened
    #When I click Edit button for Customer360 Page
    When I click "Update" button for Product Widget
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field
    When I enter a value "ENVER" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    #Then I should be seeing that "600000000" "Mobile Number" value updated for Widget

  @regression @pia @updatecustomer @VFALFT-10834 @uat @smokep
  Scenario: Negative Test Update Corporate Customer -Customer 360- Contact type
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
    And  I click "Contact" Tab for Customer360 Page
    When I click "Update" button for Product Widget
    When I enter a value "" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "a123...--" in the First Name field for Corporate Customer
    Then I should be seeing that "First Name" field is mandatory and not leaved empty
    When I enter a value "" in the Last Name field for Corporate Customer
    When I enter a value "B78jj__...--" in the Last Name field for Corporate Customer
    Then I should be seeing that "Last Name" field is mandatory and not leaved empty
    When I enter a value "45435ööö__...--" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "Secondary Name" field is mandatory and not leaved empty
    #And  I enter a value "02062020" in the BirthDate field in the Corporate Customer for Customer360 Page
    #Then I should be seeing that "Birth Date" field is mandatory and not leaved empty




  @regression @pia @updatecustomer @VFALFT-10835 @smokep
  Scenario: Test Update Residential Customer Customer360- Address Negative Scenario
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    #And  I should be seeing country value will be coming default "ALBANIA"
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address1" mandatory field
    When I click Cancel File button for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    #And  I should be seeing country value will be coming default "ALBANIA"
#    When I enter a value "" in the Address Line One field
#    Then I should be seeing an error message about the "Address1" mandatory field
#    When I click Cancel File button for Customer360 Page



  @regression @pia @updatecustomer @VFALFT-10836 @smokep
  Scenario: Test Update Corporate Customer360- Address Negative Scenario
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    #And  I should be seeing country value will be coming default "ALBANIA"
    When I enter a value "" in the Address Line One field
    Then I should be seeing an error message about the "Address1" mandatory field
    When I click Cancel File button for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    #And  I should be seeing country value will be coming default "ALBANIA"
#    When I enter a value "" in the Address Line One field
#    Then I should be seeing an error message about the "Address1" mandatory field
#    When I click Cancel File button for Customer360 Page



  @regression @pia @updatecustomer @VFALFT-10695 @smokep
  Scenario: Test Update Residential Customer - Customer 360 - Contact
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Authorized_Person" for Tab
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click the "Authorized_Person" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click the "Legal_Custodian" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click "Update" button for Product Widget
    Then I should be seeing that "First Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Document Type" for Tab
    #And  I click Cancel button for Identification Number
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field
    And  I enter a value "damme" in the Last Name Field
    #And  I enter a value "02061992" in the BirthDate field in the Corporate Customer for Customer360 Page
    When I select the "MALE" value from Gender DropdownList for Contact Tab in the Customer360 Page
    And  I select the "ANDORRAN" value from Citizenship DropdownList for Contact Tab in the Customer360 Page
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab in the Customer360 Page
    #When I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Contact updated successfully!" for Customer360 Page
    Then I should be seeing that "ERIC" "First Name" value updated for Widget
    Then I should be seeing that "DAMME" "Last Name" value updated for Widget
    Then I should be seeing that "MALE" "Gender" value updated for Widget
    Then I should be seeing that "ALBANIAN" "Citizenship" value updated for Widget


  @regression @pia @updatecustomer @VFALFT-10812 @uat
  Scenario: Negative Test Update Residential Customer - Customer 360 - Contact type
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Authorized_Person" for Tab
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click "Update" button for Product Widget
    Then I should be seeing that "First Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Document Type" for Tab
    When I enter a value "" in the First Name Field
    Then I should be seeing an error message about the "First Name Contact" mandatory field
    When I enter a value "" in the Last Name Field
    Then I should be seeing an error message about the "Last Name Contact" mandatory field
    When I click Cancel File button for Customer360 Page
    #And  I enter a value "" in the Identification Number Field for Contact Tab
    #Then I should be seeing an error message about the "Identification Contact" mandatory field
    #When I enter a value "1203***" in the Issuing Date for Contact Tab
    #Then I should be seeing an error message about the "Issuing Date" mandatory field
    #When I enter a value "" in the Document Number field for Contact Tab
    #Then I should be seeing an error message about the "Document Number" mandatory field


  @regression @pia @updatecustomer @VFALFT-10692 @smokep
  Scenario: Test Update Residential Customer - Customer 360 - Customer/Party Related Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    When I click Edit button for Individual Customer in the Customer360 Page
    When I enter a value "CEMAL" in the First Name field
    Then I should be seeing that "cemal" "First Name" value characters are uppercase
    When I enter a value "CINAR" in the Last Name field
    Then I should be seeing that "cınar" "Last Name" value characters are uppercase
    When I enter a value "MEHMET" in the Secondary Name field
    Then I should be seeing that "mehmet" "Secondary Name" value characters are uppercase
    When I click Birth Date close button
    When I enter a value "02061993" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "MALE" value from Gender DropdownList
    When I select the "TURKEY" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "TURKEY"
    When I enter the "Ankara" value from Place Of Birth DropdownList
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I select a value "YES" in the Blacklist Flag field
    And  I enter a value "Disabled Organization" in the Disabled Organization field
    And  I select a value "Blindness" in the Disabled Type field
    And  I select a value "SMS" in the Preferred Communication Method field
    And  I select a value "Braille Address" in the Contract Type field
    #When I select the "TURKISH" value from Citizenship DropdownList
    #And  I click Cancel button for Identification Number
    When I click the "Save" Button
    #Then I should be seeing the popup alert message "Individual updated successfully!"
    And  I should be seeing that "SMS" for Tab
    When I click second Edit button for Individual Customer in the Customer360 Page
    When I enter a value "CEMAL.CINAR@YAHOO.COM" in the Email field
    Then I should be seeing that "cemal.cınar@yahoo.com" "Email" value characters are uppercase
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "Elton" in the Sales Agent field
    When I click the "Save" Button
    And  I should be seeing that "Elton" for Tab
    And  I should be seeing that "CEMAL.CINAR@YAHOO.COM" for Tab
    #Then I should be seeing the popup alert message "Customer updated successfully!"




  @regression @pia @updatecustomer @VFALFT-10694 @smokep
  Scenario: Test Update Residential Customer Customer360- Address Positive Scenario
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    And  I select a value "ULEZ" in the City field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
#    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
#    And  I select a value "ULEZ" in the City field
#    When I click the "Save" Button
#    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    Then I should be seeing that "Pallati 37 shkalla 4 apartamenti 15" "Address Line 1" value updated for Widget
#    Then I should be seeing that "ULEZ" "City" value updated for Widget

  @regression @pia @updatecustomer @VFALFT-10705 @smokep
  Scenario: Test Update Corporate Customer360- Address Positive Scenario
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    And  I select a value "ULEZ" in the City field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
#    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
#    And  I select a value "ULEZ" in the City field
#    When I click the "Save" Button
#    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    Then I should be seeing that "Pallati 37 shkalla 4 apartamenti 15" "Address Line 1" value updated for Widget
#    Then I should be seeing that "ULEZ" "City" value updated for Widget



  @regression @pia @updatecustomer @VFALFT-10806 @uat @smokep
  Scenario: Negative Test Update Residential Customer - Customer 360 - Customer/Party Related Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    When I click Edit button for Individual Customer in the Customer360 Page
    When I enter a value "" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "" in the Last Name field
    Then I should be seeing an error message about the "Last Name" mandatory field
    When I click Birth Date close button
    And  I enter a value "17032020" in the Birth field
    Then I should be seeing an error message about the "Birth" mandatory field
    When I enter a value "****????!!!" in the Birth field
    Then I should be seeing an error message about the "Birth" mandatory field
    Then I should be seeing an error message about the "Save" mandatory field
    When I click the "Cancel" button
    When I click second Edit button for Individual Customer in the Customer360 Page
    When I enter a value "deneme.com" in the Email field
    Then I should be seeing an error message about the "Email" mandatory field
    When I click Cancel button for Identification Number
    When I enter a value "" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I enter a value "****????!!!" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I enter a value "123" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    Then I should be seeing that "Form" for Tab
    #When I enter a value " " in the Fix Phone Number field
    #Then I should be seeing an error message about the "Fix Phone Number" mandatory field



  @regression @pia @updatecustomer @VFALFT-10808 @ignore
  Scenario: Test Update Residential Customer - Single Trouble Ticket
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    And I select value "High" in the Priority field
    And I select value "Partner Services Case Type" in the Case Type field
    And I select value "Partner Account Issues" in the Sub Types field
    And I enter a value "Vodafone product" in the Product Information field
    And I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And  I should be seeing that "High" "Priority" value updated for Tickets Widget
    And  I should be seeing that "Partner Services Case Type" "Case Type" value updated for Tickets Widget


  @regression @pia @updatecustomer @VFALFT-10809 @uat @smokep
  Scenario: Test Update Residential Customer - Extended Trouble Ticket
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    #When I enter a value "TA Ticket" in the Subject field
    #And I enter a value "I have a problem about my billing." in the Body field
    And I select value "Medium" in the Priority field
    #And I select value "Hosting" in the Case Type field
    #And I select value "Suspend Issue" in the Sub Types field
    And I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    #Then I should be seeing "Trouble Tickets" page
    #And  I should be seeing that "I have a problem about my billing." "Description" value updated for Tickets Widget
    And  I should be seeing that "Medium" "Priority" value updated for Tickets Widget
    And  I should be seeing that "Installation Management" "Case Type" value updated for Tickets Widget
    #And  I should be seeing that "Partner Account Issues" "Sub Types" value updated for Tickets Widget
    #And  I should be seeing that "Vodafone product" "Product Information" value updated for Tickets Widget


  @regression @pia @updatecustomer @VFALFT-10810 @uat @ignore
  Scenario: Negative Scenario Test Update Residential Customer - Single Trouble Ticket
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I Create Ticket
      | name                    | description           | severity | priority | ticketType                    | custom1Value    | custom1ID | customm2Value | custom2ID |
      | Installations Case Type | Created By Automation | 1        | Urgent   | Installation Issues Case Type | Software Issues | 68        | test1         | 71        |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    #And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    Then I should be seeing that "Ticket ID" field is not editable
    #When I enter a value "" in the Subject field
    #And  I enter a value "" in the Body field
    #And I click Priority field
    #And I click Case Type field
    #And I select value "Partner Services Case Type" in the Case Type field
    #And I select value "" in the Sub Types field
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory fields coming
    #Then I should be seeing that Status is mandatory fields.
    Then I should be seeing that "Created Date" field is not editable
    #Then I should be seeing that "Sub Types" is mandatory fields.


  @regression @pia @updatecustomer @VFALFT-10811 @smokep
  Scenario: Negative Scenario Test Update Residential Customer - Extended Trouble Ticket
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable

