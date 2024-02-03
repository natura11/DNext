#language: en

Feature: vfal-si-fe-improvements

  @regression @pia @vfalsifeimprovements @VFALFT-12163 @smokep
    Scenario: Test Attachment file type and multiple selection limitation for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    When I add file in the Document File field
    When I click the Document Add button
    Then I should be seeing the popup alert message for Create Customer page "You can not add more than one document!"
    When I click Cancel File button for Individual Customer for General information TAB
    When I select a value "ID Card" for the Document Type field
    Then I should be seeing the message "You have to add customers ID document!"
    And  I enter a value "12122020" in the Issuing Date
    When I add file in the Document File field
    And  I click the Document View Page button
    Then I should be seeing the popup alert message for Create Customer page "document.jpg"
    #And  I should be seeing image format
    When I click Cancel File button for Individual Customer for General information TAB
    When I add png file in the Document File field
    And  I click the Document View Page button
    Then I should be seeing the popup alert message for Create Customer page "document_1.png"
    When I click Cancel File button for Individual Customer for General information TAB
    When I add pdf file in the Document File field
    And  I click the Document View Page button
    Then I should be seeing the popup alert message for Create Customer page "document_1.pdf"
    When I click Cancel File button for Individual Customer for General information TAB
    When I add space defined file in the Document File field
    And  I click the Document View Page button
    Then I should be seeing the popup alert message for Create Customer page "document 1.pdf"
    When I add - defined file in the Document File field
    And  I click the Document View Page button
    Then I should be seeing the popup alert message for Create Customer page "document-1.pdf"
    #And  I click the Document View Page button
    When I click Cancel File button for Individual Customer for General information TAB
    When I add file greater than 5MB in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #When I add jpg file greater than 5MB in the Document File field
    #Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I add png file greater than 5MB in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I add txt file in the Document File field
    Then I should be seeing the popup alert message for Create Customer page "Only image and pdf files are accepted!"
    When I click "Contact Information" tab
    Then I should be seeing "Contact Information" tab
    When I select a value Authorized Type : "Authorized Person"
    When I enter a value "C" in the Identification Number Field for Contact Tab
    When I click Search Identification button for Contact Information
    When I enter a value "eric" in the First Name Field
    When I enter a value "damme" in the Last Name Field
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab
    When I add file in the Document File field for Contact Tab
    #And  I click Cancel File button for Contact Tab
    #When I add png file in the Document File field for Contact Tab
    #And  I click Cancel File button for Contact Tab
    #When I add pdf file in the Document File field for Contact Tab
    #And  I click Cancel File button for Contact Tab
    #When I add file greater than 5MB in the Document File field for Contact Tab
    #Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #And  I click Cancel File button for Contact Tab
    #When I add png file greater than 5MB in the Document File field for Contact Tab
    #Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #And  I click Cancel File button for Contact Tab
    #When I add jpg file greater than 5MB in the Document File field for Contact Tab
    #Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    #And  I click Cancel File button for Contact Tab
    #When I add txt file in the Document File field for Contact Tab
    #Then I should be seeing the popup alert message for Create Customer page "Only image and pdf files are accepted!"




  @regression @pia @vfalsifeimprovements @VFALFT-12164 @smokep
    Scenario: Test Attachment file type and multiple selection limitation for Corporate Customer
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
    And  I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    Then I should be seeing the message "You have to add customers ID document!" for Corporate Customer
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10072022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    And  I click Cancel File button for Corporate Customer for General information TAB
    When I add png file in the Document File field for Corporate Customer for General information TAB
    And  I click Cancel File button for Corporate Customer for General information TAB
    When I add pdf file in the Document File field for Corporate Customer for General information TAB
    And  I click Cancel File button for Corporate Customer for General information TAB
    When I add file greater than 5MB in the Document File field for Corporate Customer for General information TAB
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I add png file greater than 5MB in the Document File field for Corporate Customer for General information TAB
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I add pdf file greater than 5MB in the Document File field for Corporate Customer for General information TAB
    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
    When I add txt file in the Document File field for Corporate Customer for General information TAB
    Then I should be seeing the popup alert message for Create Customer page "Only image and pdf files are accepted!"
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
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    And  I click Cancel File button for Corporate Customer
#    When I add png file in the Document File field for Corporate Customer for General information TAB
#    And  I click Cancel File button for Corporate Customer for General information TAB
#    When I add pdf file in the Document File field for Corporate Customer for General information TAB
#    And  I click Cancel File button for Corporate Customer for General information TAB
#    When I add file greater than 5MB in the Document File field for Corporate Customer for General information TAB
#    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
#    When I add png file greater than 5MB in the Document File field for Corporate Customer for General information TAB
#    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
#    When I add pdf file greater than 5MB in the Document File field for Corporate Customer for General information TAB
#    Then I should be seeing the popup alert message for Create Customer page "File size can not be bigger than 5 MB!"
#    When I add txt file in the Document File field for Corporate Customer for General information TAB
#    Then I should be seeing the popup alert message for Create Customer page "Only image and pdf files are accepted!"
    Then I should be seeing the message "You have to add customers ID document!" for Corporate Customer




  @regression @pia @vfalsifeimprovements @VFALFT-12398 @smoke
    Scenario: Test FE - Put related icons to dropdowns on Create Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I click General Information tab
    When I select the "Female" value from Gender DropdownList
    Then I should be seeing that there is "Female" icon beside
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that there is "Male" icon beside




  @regression @pia @vfalsifeimprovements @VFALFT-12399
    Scenario: Test FE - Put related icons to dropdowns on Create Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I select a value "Female" in the Gender field for Corporate Customer
    Then I should be seeing that there is "Female" icon beside
    When I select a value "Male" in the Gender field for Corporate Customer
    Then I should be seeing that there is "Male" icon beside




  @regression @pia @vfalsifeimprovements @VFALFT-12400
    Scenario: Test FE - Put related icons to dropdowns for Individual Customer on Customer360 View Page
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
    Then I should be seeing that "Gender" field is displayed for Admin Information Tab
    When I select the "Female" value from Gender DropdownList
    Then I should be seeing that there is "Female" icon beside
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that there is "Male" icon beside


  @regression @pia @vfalsifeimprovements @VFALFT-12401
    Scenario: Test FE - Put related icons to dropdowns for Corporate Customer on Customer360 View
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
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click the Contact Tab
    #Then I should be seeing that Contact Tab is opened
    #When I check the Contact Tab
    #Then I should be seeing that Admin Information widget is displayed
    #When I click the Admin Information widget
    #Then I should be seeing that Admin Information widget is opened
    #When I click on "Edit" Button
    #Then I should be seeing that fields that can be updated
    #When I check the Gender field
    #Then Gender field is displayed
    #When I click the Gender field
    #Then I should be seeing that values which are "Female" and "Male" are displayed on the drop-down list
    #When I check the "Female" value on the drop-down list
    #Then I should be seeing that there is female icon beside the "Female" value on the drop-down list
    #When I check the "Male" value on the drop-down list
    #Then I should be seeing that there is a male icon beside the "Male" value on the drop-down list
    #When I check the Country of Birth field
    #Then Country of Birth field is displayed
    #When I click the Country of Birth field
    #Then I should be seeing that values are displayed on the drop-down list
    #When I check the values on the Country of Birth field
    #Then I should be seeing that values are displayed with the flag icon beside of the values
    #When I check the "Country Code" field on Phone Number field
    #Then I should be seeing that Country Code field is displayed
    #When I check the value of "Country Code"
    #Then I should be seeing that "+355" is displayed on Country Code field with the flag icon
    #When I check the "Country Code" field on Work Phone Number field
    #Then I should be seeing that Country Code field is displayed
    #When I check the value of "Country Code"
    #Then I should be seeing that "+355" is displayed on Country Code field with the flag icon
    #When I click "Cancel" button
    #Then I should be seeing that a related customer information is displayed


  @regression @pia @vfalsifeimprovements @VFALFT-12498 @smokep
    Scenario: Test FE - Telephone Number Changes for Individual Customer
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
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I select one of the Country "+213" from list different from Albenia
    When I enter a value "123456789" in the Mobile Number field
    When I select one of the Country "+93" from list different from Albenia
    When I enter a value "12345678" in the Mobile Number field
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
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab




  @regression @pia @vfalsifeimprovements @VFALFT-12499 @smokep
    Scenario: Test FE - Telephone Number Changes for Corporate Customer
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
    And  I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    And  I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
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
    When I select a value "Male" in the Gender field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select one of the Country "+213" from list different corporate from Albenia
    And  I enter a value "12345678" in the Mobile Number field for Corporate Customer
    When I select one of the Country "+93" from list different corporate from Albenia
    And  I enter a value "123456789" in the Mobile Number field for Corporate Customer
    When I select one of the Work Phone Country "+213" from list different corporate from Albenia
    And  I enter a value "12345678" in the Mobile Work Number field for Corporate Customer
    When I select one of the Work Phone Country "+93" from list different corporate from Albenia
    And  I enter a value "123456789" in the Mobile Work Number field for Corporate Customer



  @regression @pia @vfalsifeimprovements @VFALFT-12509 @smokep
    Scenario: Test FE - Invoice Account Changes For Corporate Customers
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
    And  I select a value "Email" in the Communication Method for Corporate Customer
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
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
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
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    And I should be seeing that values of Payment Type field are "POSTPAID ACCOUNT", "PREPAID ACCOUNT"
    And  I should be seeing that values of Bill Media field are "", "Paper", "E-Bill"
    When I select a value "Paper" in the Bill Media field
    Then I should be seeing that values of Currency field are "ALL", "EUR", "USD"
    And  I select a value "ALL" in the Currency field
    And  I enter a value "Corporate Customer" in the Description field
    Then I should be seeing that values of Payment Method field are "Cash", "Direct Debit"
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    And  I enter a value "TK 12345123412341234" in the Bank Account No field
    And  I select a value "Corporate Customer" in the Owner field
    Then I should be seeing that "Currency Prepaid" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description Prepaid" field is displayed for Invoice Account Information tab
    #And  I enter a value "Corporate Customer" in the Description Prepaid field
    And  I click the Next Button for Other Information for Corporate Customer


  @regression @pia @vfalsifeimprovements @ignore @VFALFT-12502 @ignore
    Scenario: Test FE - Personal Number Validation Warning For New Rule for male customers
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
    When I enter a value "02061998" in the Birth field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field
    When I enter a value "02061992" in the Birth field
    When I select the "Female" value from Gender DropdownList
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
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
    When I click Add button
    Then I should be seeing the popup alert message "Customer Saved Successfully"



  @regression @pia @vfalsifeimprovements @ignore @VFALFT-12503 @ignore
    Scenario: Test FE - Personal Number Validation Warning For New Rule for female
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
    When I enter a value "02061998" in the Birth field
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field
    When I enter a value "02061992" in the Birth field
    When I select the "Female" value from Gender DropdownList
    When I click Add button
    Then I should be seeing an error message about the "Add" mandatory field
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
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
    When I click Add button
    Then I should be seeing the popup alert message "Customer Saved Successfully"
    #When I enter the "K55919123L" on Identification Number field



  @regression @pia @vfalsifeimprovements @VFALFT-12975 @smokep
    Scenario: Test Customer Revisions - FE - Make Images Downloadable
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
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Uploaded At" is correct to the related residential customer for Document Info
    When I click on the View button on the Document Info widget
    #Then I should be seeing that document image popup
    When I click on the "close" button
    When I click on the "Download" button
    #Then I should be seeing that document is downloaded


  @regression @pia @vfalsifeimprovements @VFALFT-12523
    Scenario: Test Personal Number Should Be Removed From Contact Section for Individual Customer
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
    And  I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click "Legal_Custodian" widget
    Then I should be seeing that "Name" field is displayed for Widget
    #And  I should be seeing that "Middle Name" field is displayed for Widget
    And  I should be seeing that "Last Name" field is displayed for Widget
    #And  I should be not seeing that "Identification Number" field
    And  I should be seeing that "Identification Number" field is displayed for Widget
    And  I should be seeing that "Birth Date" field is displayed for Widget
    And  I should be seeing that "Citizenship" field is displayed for Widget
    And  I should be seeing that "Gender" field is displayed for Widget
    And  I should be seeing that "Contact Type" field is displayed for Widget
    And  I should be seeing that "Contact Name" field is displayed for Widget
    And  I should be seeing that "Document" field is displayed for Widget


