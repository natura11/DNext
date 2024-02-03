#language: en

Feature: Customer Journey

  @regression @pia @customerjourney @VFALFT-12314 @smoke
    Scenario: Test FE-Redirect to Customer 360 view of the specific customer right after save operation on Customer UIs for Residential Customer
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
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
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
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Form" in the Document Type field
    And  I add file in the Document File field for Other Information
#    When I click Add button
#    Then I should be seeing the popup alert message "Customer created successfully"
#    And  I should be seeing that "Main Page" for Tab
#    And  I should be seeing that "Product" for Tab
#    And  I should be seeing that "Order" for Tab
#    And  I should be seeing that "General" for Tab
#    And  I should be seeing that "Address" for Tab
#    And  I should be seeing that "Contact" for Tab

  @regression @pia @customerjourney @VFALFT-12315
  Scenario: Test FE-Redirect to Customer 360 view of the specific customer right after save operation on Customer UIs for Corporate Customer
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
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "12042022" in the Issuing Date for Corporate Customer for General TAB
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
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    And  I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
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
    And  I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab