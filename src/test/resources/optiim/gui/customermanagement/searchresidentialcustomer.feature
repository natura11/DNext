#language: en

Feature: Search Residential Customer


  @regression @pia @searchresidentialcustomer @VFALFT-9972 @smoke
  Scenario: Test Customer 360 view - Page Design
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    And  I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Trouble Tickets" for Tab
    And  I should be seeing that "Interaction" for Tab
    When I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    When I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" for Tab
    Then I should be seeing that "Order Status" for Tab
    Then I should be seeing that "Order Date" for Tab
    Then I should be seeing that "Order Item ID" for Tab
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Parent" for Tab
    Then I should be seeing that "Using Resource" for Tab


  @regression @pia @searchresidentialcustomer @VFALFT-9912 @smoke
  Scenario: Test MVP Search&Display Residential Customer in 360 View
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
    When I click Search Customer Close button
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "A12345678B" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab


  @regression @pia @searchresidentialcustomer @VFALFT-10034
  Scenario: Test Residential Customer in 360 view - MAIN/GENERAL/WIDGET-5(Tickets)
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    When I click Close Ticket button for Widget Page in the Customer Case Management
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #And  I should be seeing "Customer ID", "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #And  I should be seeing that Customer ID field is automaticly populated and the value  is same with Personel Number
    When I enter a value "Test Ticket" in the Subject field
    And  I enter a value "Test Deneme Ticket" in the Body field
    #Then I should be seeing that "Urgent" "Medium" "High" "Low" values are displayed
    When I select value "Medium" in the Priority field
    When I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    When I select value "Connectivity Problems" in the Case Type field
    #Then I should be seeing "Sub Type" field coming in the Ticket Details
    #And I should be seeing "Product Information" field coming in the Ticket Details
    When I click Close Ticket button for Widget Page in the Customer Case Management
    #Then I should be seeing that "Sales Rated" "Support Question" "Dealership Question" "Others"
    #When I select "Sales Related" in the Sub Type field
    #When I enter a value "Test Information" in the Product Information field
    #Then I should be seeing "New ticket added successfully!" alert popup message
    #And I should be seeing this record will come in the Trouble Tickets area
    #When I click the Show All Tickets
    #Then I should be seeing that all tickets that are related to customer are displayed
      #Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup


  @regression @pia @searchresidentialcustomer @VFALFT-9946 @smoke
  Scenario: Test Residential Customer in 360 view - Product
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
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Address" for Tab
    Then I should be seeing that "Product Status" for Tab
    Then I should be seeing that "Start Date" for Tab
    Then I should be seeing that "Expiry Date" for Tab
    Then I should be seeing that "Product Relationship" for Tab

  @regression @pia @searchresidentialcustomer @VFALFT-10363 @smoke
  Scenario: Test Residential Customer in 360 view - MAIN/GENERAL/WIDGET-1(Customer/Party Related Info)
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
    And  I should be seeing that "First Name" field is displayed for Widget
    And  I should be seeing that "Last Name" field is displayed for Widget
    And  I should be seeing that "Middle Name" field is displayed for Widget
    And  I should be seeing that "Identification Number" field is displayed for Widget
    And  I should be seeing that "Birth Date" field is displayed for Widget
    And  I should be seeing that "Blacklisted Flag" field is displayed for Widget
    And  I should be seeing that "Juridical Info" field is displayed for Widget
    And  I should be seeing that "Disability Type" field is displayed for Widget
    And  I should be seeing that "Place Of Birth" field is displayed for Widget
    And  I should be seeing that "Country Of Birth" field is displayed for Widget
    And  I should be seeing that "Citizenship" field is displayed for Widget
    And  I should be seeing that "Gender" field is displayed for Widget
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    And  I should be seeing that "Disabled Comm. Method" field is displayed for Widget
    And  I should be seeing that "Disabled Organization" field is displayed for Widget
    #And  I should be seeing that "Tax Exempt" field is displayed for Widget
    And  I should be seeing that "Customer Number" field is displayed for Widget
    And  I should be seeing that "Status" field is displayed for Widget
    And  I should be seeing that "Email" field is displayed for Widget
    And  I should be seeing that "Mobile Phone Number" field is displayed for Widget
    And  I should be seeing that "Fix Phone Number" field is displayed for Widget
    #And  I should be seeing that "Fax Number" field is displayed for Widget
    And  I should be seeing that "Communication Method" field is displayed for Widget
    And  I should be seeing that "POS" field is displayed for Widget
    And  I should be seeing that "Sales Agent" field is displayed for Widget
    And  I should be seeing that "Created User" field is displayed for Widget
    And  I should be seeing that "Customer Since" field is displayed for Widget
    And  I should be seeing that the value of  the "First Name" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Last Name" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Secondary Name" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Identification Number" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "POS" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Birth Date" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Place Of Birth" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Country Of Birth" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Citizenship" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Gender" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Email" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Mobile Phone Number" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Telephone Number" is correct to the related residential customer for CustomerParty Related Info Widget
    #And  I should be seeing that the value of  the "Fax" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Disconnection Date" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Disconnection Reason" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Created User" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Customer Since" is correct to the related residential customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Status" is correct to the related residential customer for CustomerParty Related Info Widget
    #Given the Customer Status is Active on "Customer/Party Related Info" widget
    #Then I should be seeing that Status field is green.
    #Given the Customer Status is Prospect on "Customer/Party Related Info" widget
    #Then I should be seeing that Status field is yellow.
    #Given the Customer Status is Deactive on "Customer/Party Related Info" widget
    #Then I should be seeing that Status field is red.



  @regression @pia @searchresidentialcustomer @VFALFT-10426
  Scenario: Test Residential Customer in 360 view - MAIN/Address
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
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Billing Widget
    And  I should be seeing that the value of  the "Address Line 2" is correct to the related residential customer for Billing Widget
    And  I should be seeing that the value of  the "Country" is correct to the related residential customer for Billing Widget
    And  I should be seeing that the value of  the "City" is correct to the related residential customer for Billing Widget
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Service Widget
    And  I should be seeing that the value of  the "Address Line 2" is correct to the related residential customer for Service Widget
    And  I should be seeing that the value of  the "Country" is correct to the related residential customer for Service Widget
    And  I should be seeing that the value of  the "City" is correct to the related residential customer for Service Widget
    #Given the Other Address is defined for the corporate customer


  @regression @pia @searchresidentialcustomer @VFALFT-10435
  Scenario: Test Residential Customer in 360 view - MAIN/Contact
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
    #Then I should be seeing that "Authorized Person" for Tab
    #When I click "Authorized Person" widget
    #Then I should be seeing that the "Authorized Person" widget is opened
    #And  I should be seeing that "Identification Number" field is displayed for Widget
    #And  I should be seeing that "First Name" field is displayed for Widget
    #And  I should be seeing that "Last Name" field is displayed for Widget
    #And I should be seeing that the value of  the Type of Authorization is correct to the related Residential Customer
    #And  I should be seeing that the value of  the "Identification Number" is correct to the related residential customer for Authorized Widget
    #And  I should be seeing that the value of  the "First Name" is correct to the related residential customer for Authorized Widget
    #And  I should be seeing that the value of  the "Last Name" is correct to the related residential customer for Authorized Widget

  @regression @pia @searchresidentialcustomer @VFALFT-10608 @smoke
  Scenario: Residential Customer in 360 view - Document Info (Documents that are uploaded already during creating or updating process)
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
    When I click "Document" Tab for Customer360 Page
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Uploaded At" is correct to the related residential customer for Document Info




  @regression @pia @searchresidentialcustomer @VFALFT-10344 @smokep
  Scenario: Test Residential Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products) Part 1 - List of Billing Account
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "12" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    When I click the "BillingProfile" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Order Item ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Modem Basic" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "active" field is displayed for Billing Account & Products Widget



  @regression @pia @searchresidentialcustomer @VFALFT-10449 @ignore
  Scenario: Test Residential Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products)- Part 2 Product Display
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    When I click the "BillingProfile" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Order Item ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "active" field is displayed for Billing Account & Products Widget



  @regression @pia @searchresidentialcustomer @VFALFT-10450
  Scenario: Test Residential Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products)- Part 3 Order Display & Details
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
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
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    #Given the Products Widget that is related with the corporate customer is displayed
    #When I click arrow button
    #Then I should be seeing that order details are displayed
    #When I check the value of Order No field on order details information
    #Then I should be seeing that value of Order No field is correct with order related to residential customer billing account
    #When I check the value of Contract Id field on order details information
    #Then I should be seeing that value of Contract Id field is correct with order related to residential customer billing account
    #When I click All Details button
    #Then I should be seeing that a pop-up window is opened
    #When I check "All Details Pop-up Window"
    #Then I should be seeing that "Order Id", "Order Status", "Order Date", "Order Channel",	"Sales Channel" fields are displayed
    #When I check the value of Order Id value on "All Details Pop-up Window"
    #Then I should be seeing that Order Id of Order No field is correct with product related to residential customer order details
    #When I check the value of Order Status value on "All Details Pop-up Window"
    #Then I should be seeing that Order Status of Order No field is correct with product related to residential customer order details
    #When I check the value of Order Date value on "All Details Pop-up Window"
    #Then I should be seeing that Order Date of Order No field is correct with product related to residential customer order details
    #When I check the value of Order Channel value on "All Details Pop-up Window"
    #Then I should be seeing that Order Channel of Order No field is correct with product related to residential customer order details
    #When I check the value of Sales Channel value on "All Details Pop-up Window"
    #Then I should be seeing that Sales Channel of Order No field is correct with product related to residential customer order details

  @regression @pia @searchresidentialcustomer @VFALFT-10947
    Scenario: Test Residential Customer in 360 view - Order
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" for Tab
    Then I should be seeing that "Order Status" for Tab
    Then I should be seeing that "Order Date" for Tab
    Then I should be seeing that "Order Item ID" for Tab
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Parent" for Tab
    Then I should be seeing that "Using Resource" for Tab


  @regression @pia @searchresidentialcustomer @VFALFT-11012
    Scenario: Test - Deactivate Simple Product for Induvial Customer
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Premium" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    Then I should be seeing that "Billing Account Name" field is displayed for Product Widget
    Then I should be seeing that "Agreement Id" field is displayed for Product Widget
    Then I should be seeing that "Start Date" field is displayed for Product Widget
    Then I should be seeing that "Termination Date" field is displayed for Product Widget
    #And  I should be seeing that "Deactivation" field is displayed for Product Widget
    #And  I should be seeing that "Buy Add-on" field is displayed for Product Widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Simple Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related main product is deactivated and displayed with red colour
    #Then I should be seeing that main product and Related Add On Products are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-11013
    Scenario: Test - Deactivate Bundle Product for Indiviual Customer
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
    And  I click "Account" Tab for Customer360 Page
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "TEST BUNDLE GIGAFIBRA" product and click
    Then I should be seeing that "Test Bundle GigaFibra" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    When I select a value "12 x ALL200 / MONTHLY" Product Term field
    When I click  the "Test Vodafone GigaFibra" Add-on product
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Test Bundle GigaFibra" my selected additional product is displayed
    Then I should be seeing that "Test Vodafone GigaFibra" my selected additional product is displayed
    And  I should be seeing that Future Date field is displayed
    When I enter a value that is after than the current date value in the Future Date field
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Test Bundle GigaFibra" for Product Tab
    And  I should be seeing that "Test Vodafone GigaFibra" for Product Tab
    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "Test Bundle GigaFibra" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-11014
    Scenario: Test - Deactivate Add-On Product for Individual Customer
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
    And  I click "Account" Tab for Customer360 Page
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "12 x ALL1,000 / MONTHLY" in the Payment Plan field
    When I click  the "Premium Enterprise Modem" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "Premium Enterprise Modem" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-11015
    Scenario: Test - Deactivate Simple Product for Corporate Customer
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
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "MODEM PREMIUM" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Modem Premium" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Premium" for Product Tab
    When I click "Modem Premium" for Product widget
    Then I should be seeing that "Billing Account Name" field is displayed for Product Widget
    Then I should be seeing that "Agreement Id" field is displayed for Product Widget
    Then I should be seeing that "Start Date" field is displayed for Product Widget
    Then I should be seeing that "Termination Date" field is displayed for Product Widget
    #And  I should be seeing that "Deactivation" field is displayed for Product Widget
    #And  I should be seeing that "Buy Add-on" field is displayed for Product Widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Simple Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related main product is deactivated and displayed with red colour
    #Then I should be seeing that main product and Related Add On Products are deactivated



  @regression @pia @searchresidentialcustomer @VFALFT-11016
    Scenario: Test - Deactivate Bundle Product for Corporate Customer
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
    And  I click "Account" Tab for Customer360 Page
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "GIGAFIBRA PRO 1 GBPS - IP" product and click
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    #When I select a value "24 x ALL10,000 / MONTHLY" Product Term field
    #When I click  the "GigaFibra Pro 1000-100 Mbps" Add-on product
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "GigaFibra Pro 1 Gbps - IP" for Product Tab
    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "GigaFibra Pro 1 Gbps - IP" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-11017
    Scenario: Test - Deactivate Add-On Product for Corporate Customer
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
    And  I click "Account" Tab for Customer360 Page
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated



  @regression @pia @searchresidentialcustomer @VFALFT-11018
    Scenario: Test - Deactivate Simple Product for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "MODEM PREMIUM" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Modem Premium" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Premium" for Product Tab
    When I click "Modem Premium" for Product widget
    Then I should be seeing that "Billing Account Name" field is displayed for Product Widget
    Then I should be seeing that "Agreement Id" field is displayed for Product Widget
    Then I should be seeing that "Start Date" field is displayed for Product Widget
    Then I should be seeing that "Termination Date" field is displayed for Product Widget
    #And  I should be seeing that "Deactivation" field is displayed for Product Widget
    #And  I should be seeing that "Buy Add-on" field is displayed for Product Widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Simple Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related main product is deactivated and displayed with red colour
    #Then I should be seeing that main product and Related Add On Products are deactivated




  @regression @pia @searchresidentialcustomer @VFALFT-11019
    Scenario: Test - Deactivate Bundle Product for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "GIGAFIBRA PRO 1 GBPS - IP" product and click
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "GigaFibra Pro 1 Gbps - IP" for Product Tab
    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "GigaFibra Pro 1 Gbps - IP" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-11020
    Scenario: Test - Deactivate Add-On Product for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    Then I should be seeing that "Billing Account Name" field is displayed for Product Widget
    Then I should be seeing that "Agreement Id" field is displayed for Product Widget
    Then I should be seeing that "Start Date" field is displayed for Product Widget
    Then I should be seeing that "Termination Date" field is displayed for Product Widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @searchresidentialcustomer @VFALFT-10609 @smoke
    Scenario: Residential Customer in 360 view - Document Info (Adding new Documents)
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
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Document created successfully!" for Customer360 Page
    #When I click "X" button
    #Then I should be seeing that The uploaded document is deleted
    #When I click "+" button
    #Then I should be seeing that a window is opened for uploading new documents

