#language: en

Feature: Search Corporate Customer

  @regression @pia @searchcorporatecustomer @VFALFT-9955
  Scenario: Test MVP Search & Display Corporate Customer in 360 view
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
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab


  @regression @pia @searchcorporatecustomer @VFALFT-10072
  Scenario: Test Corporate Customer in 360 view - MAIN/GENERAL/WIDGET-5(Tickets)
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
    When I enter a value "Test Ticket" in the Subject field for create ticket page
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
    #And I should be seeing "Support query" Case Type coming in the drop down list
    When I select value "Connectivity Problems" in the Case Type field
    #Then I should be seeing that "Sales Rated" "Support Question" "Dealership Question" "Others"
    #When I select "Sales Related" in the Sub Type field
    #Then I should be seeing "Sub Type" field coming in the Ticket Details
    And I should be seeing "Product Information" field coming in the Ticket Details
    #When I enter a value "Test Information" in the Product Information field
    #Then I should be seeing "New ticket added successfully!" alert popup message
    #And I should be seeing this record will come in the Trouble Tickets area
    #When I click the Show All Tickets
    #Then I should be seeing that all tickets that are related to customer are displayed
    When I click Close Ticket button for Widget Page in the Customer Case Management
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup


  @regression @pia @searchcorporatecustomer @VFALFT-9947 @smokep
  Scenario: Test Corporate Customer in 360 view - Product
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
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
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "10" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
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
    And  I should be seeing that "Akses Fee per Modem Basic" for Product Tab
    When I click "Akses Fee per Modem Basic" for Product widget
    Then I should be seeing that "Product Inventory" for Tab
    And  I should be seeing that "Order" for Tab
    Then I should be seeing that "Product Id" for Tab
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Agreement Id" for Tab
    Then I should be seeing that "Agreement Name" for Tab
    Then I should be seeing that "Billing Account ID" for Tab
    Then I should be seeing that "Billing Account Name" for Tab
    Then I should be seeing that "Is Bundle" for Tab
    Then I should be seeing that "Expiry Date" for Tab
    Then I should be seeing that "Product Offering Id" for Tab
    Then I should be seeing that "Product Offering Name" for Tab
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Product Price" for Tab
    Then I should be seeing that "Price Type" for Tab
    Then I should be seeing that "Product Characteristic" for Tab
    Then I should be seeing that "MACAddress" for Tab
    Then I should be seeing that "PPPoEUser" for Tab
    Then I should be seeing that "Infrastructure" for Tab
    Then I should be seeing that "ONTSerialNumber" for Tab
    Then I should be seeing that "SpecType" for Tab
    Then I should be seeing that "SpecSubType" for Tab
    Then I should be seeing that "GLCode" for Tab
    Then I should be seeing that "BrandName" for Tab
    Then I should be seeing that "TotalCost" for Tab
    Then I should be seeing that "GuaranteeAmount" for Tab
    Then I should be seeing that "RatingType" for Tab
    Then I should be seeing that "DeviceType" for Tab
    Then I should be seeing that "BRMServiceType" for Tab
    Then I should be seeing that "PPPoEPassword" for Tab
    Then I should be seeing that "ResourceModel" for Tab
    Then I should be seeing that "BRMProductId_USD" for Tab
    Then I should be seeing that "BRMProductId_ALL" for Tab
    Then I should be seeing that "BRMProductId_EUR" for Tab
    Then I should be seeing that "SLA" for Tab
    Then I should be seeing that "PostPaidType" for Tab
    Then I should be seeing that "ERPGLCode" for Tab


  @regression @pia @searchcorporatecustomer @VFALFT-10408
  Scenario: Test Corporate Customer in 360 view - MAIN/Address
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related corporate customer for Billing Widget
    And  I should be seeing that the value of  the "Address Line 2" is correct to the related corporate customer for Billing Widget
    And  I should be seeing that the value of  the "Country" is correct to the related corporate customer for Billing Widget
    And  I should be seeing that the value of  the "City" is correct to the related corporate customer for Billing Widget
    And  I should be seeing that the value of  the "Address Line 1" is correct to the related corporate customer for Service Widget
    And  I should be seeing that the value of  the "Address Line 2" is correct to the related corporate customer for Service Widget
    And  I should be seeing that the value of  the "Country" is correct to the related corporate customer for Service Widget
    And  I should be seeing that the value of  the "City" is correct to the related corporate customer for Service Widget
    #Given the Other Address is defined for the corporate customer

  @regression @pia @searchcorporatecustomer @VFALFT-10434 @smoke
  Scenario: Test Corporate Customer in 360 view - MAIN/Contact
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
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab
    And  I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Mobile Phone Number" for Tab
    Then I should be seeing that "Email" for Tab
    When I click "Admin" widget
    And  I should be seeing that "Name" field is displayed for Widget
    And  I should be seeing that "Middle Name" field is displayed for Widget
    And  I should be seeing that "Last Name" field is displayed for Widget
    And  I should be seeing that "Identification Number" field is displayed for Widget
    And  I should be seeing that "Birth Date" field is displayed for Widget
    And  I should be seeing that "Citizenship" field is displayed for Widget
    And  I should be seeing that "Gender" field is displayed for Widget
    And  I should be seeing that "Contact Type" field is displayed for Widget
    And  I should be seeing that "Contact Name" field is displayed for Widget
    And  I should be seeing that "Mobile Phone Number" field is displayed for Widget
    And  I should be seeing that "Email" field is displayed for Widget
    And  I should be seeing that "Document" field is displayed for Widget
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Middle Name" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Last Name" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Identification Number" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Birth Date" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Citizenship" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Gender" is correct to the related corporate customer for Admin Information Widget
    #And  I should be seeing that the value of  the "Contact Type" is correct to the related corporate customer for Admin Information Widget
    #And  I should be seeing that the value of  the "Contact Name" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Mobile Phone Number" is correct to the related corporate customer for Admin Information Widget
    And  I should be seeing that the value of  the "Email" is correct to the related corporate customer for Admin Information Widget
    #And  I should be seeing that the value of  the "Document" is correct to the related corporate customer for Admin Information Widget




  @regression @pia @searchcorporatecustomer @VFALFT-10607 @smoke
  Scenario: Test Corporate Customer in 360 view - Document Info (Documents are Uploaded during Creating Process)
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
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Uploaded At" is correct to the related corporate customer for Document Info



  @regression @pia @searchcorporatecustomer @VFALFT-10446 @smokep
    Scenario: Corporate Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products) - Part 3 Order Display & Details
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
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "11" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
    #Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
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
    When I click "Akses Fee per Modem Basic" widget
    Then I should be seeing that "Order Detail" field is displayed for Widget
    Then I should be seeing that "Order Info" field is displayed for Widget
    Then I should be seeing that "Order Id" field is displayed for Widget
    Then I should be seeing that "Order Date" field is displayed for Widget
    Then I should be seeing that "Payment Method" field is displayed for Widget
    Then I should be seeing that "Invoice" field is displayed for Widget
    Then I should be seeing that "Order Status" field is displayed for Widget
    Then I should be seeing that "Order Items" field is displayed for Widget
    Then I should be seeing that "Order Item ID" field is displayed for Widget
    Then I should be seeing that "Name" field is displayed for Widget
    Then I should be seeing that "Quantity" field is displayed for Widget
    Then I should be seeing that "Price" field is displayed for Widget


  @regression @pia @searchcorporatecustomer @VFALFT-10445
    Scenario: Corporate Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products) - Part 2 Product Display
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

  @regression @pia @searchcorporatecustomer @VFALFT-10443
    Scenario: Corporate Customer in 360 view - MAIN/GENERAL/WIDGET-3(Billing Account & Products) - Part 1 List of Billing Account
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
    When I select the "NIPT" value from Select Search Type DropdownList
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


  @regression @pia @searchcorporatecustomer @VFALFT-10949
    Scenario: Test Corporate Customer in 360 view - Order
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
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" field is displayed for Widget
    Then I should be seeing that "Order Status" field is displayed for Widget
    Then I should be seeing that "Order Date" field is displayed for Widget
    Then I should be seeing that "Status" field is displayed for Widget
    Then I should be seeing that "Reason" field is displayed for Widget
    Then I should be seeing that "Product Name" field is displayed for Widget
    Then I should be seeing that "Sales Agent" field is displayed for Widget
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Widget
    #Then I should be seeing that value of Order Id field is correct with related corporate customer
    #Then I should be seeing that value of Order Status field is correct with related corporate customer
    #Then I should be seeing that value of Order Date field is correct with related corporate customer
    #Then I should be seeing that value of Order Channel field is correct with related corporate customer
    #Then I should be seeing that value of Sales Channel field is correct with related corporate customer



  @regression @pia @searchcorporatecustomer @VFALFT-10313 @smoke
    Scenario: Test Corporate Customer in 360 view - MAIN/GENERAL/WIDGET-1(Customer/Party Related Info)
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
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    And  I should be seeing that "NIPT" field is displayed for Widget
    And  I should be seeing that "Industry" field is displayed for Widget
    And  I should be seeing that "Account Manager" field is displayed for Widget
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    And  I should be seeing that "Juridical Info" field is displayed for Widget
    #And  I should be seeing that "Credit Team" field is displayed for Widget
    And  I should be seeing that "Dunning Level" field is displayed for Widget
    And  I should be seeing that "Customer Grouping" field is displayed for Widget
    And  I should be seeing that "Disconnection Date" field is displayed for Widget
    #And  I should be seeing that "Disconnection Reason" field is displayed for Widget
    And  I should be seeing that "Parent Account" field is displayed for Widget
    And  I should be seeing that "Potential Fraud" field is displayed for Widget
    And  I should be seeing that "Potential Fraud Comment" field is displayed for Widget
    #And  I should be seeing that "First Class Responsible" field is displayed for Widget
    And  I should be seeing that "Number Of Employees" field is displayed for Widget
    And  I should be seeing that "Blacklisted Flag" field is displayed for Widget
    And  I should be seeing that "Tax Exempt" field is displayed for Widget
    And  I should be seeing that "Customer Number" field is displayed for Widget
    And  I should be seeing that "Name" field is displayed for Widget
    And  I should be seeing that "Status" field is displayed for Widget
    And  I should be seeing that "Email" field is displayed for Widget
    And  I should be seeing that "Mobile Phone Number" field is displayed for Widget
    And  I should be seeing that "Fix Phone Number" field is displayed for Widget
    #And  I should be seeing that "Fax Number" field is displayed for Widget
    And  I should be seeing that "POS" field is displayed for Widget
    And  I should be seeing that "Sales Agent" field is displayed for Widget
    And  I should be seeing that "Created User" field is displayed for Widget
    And  I should be seeing that "Customer Since" field is displayed for Widget
    And  I should be seeing that the value of  the "Customer Name" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "NIPT" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Industry" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Enterprise Account Manager" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Created User" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Customer Since" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Sales Agent" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Credit Team" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Dunning Level" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Disconnection Date" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Disconnection Reason" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "POS" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Parent Account" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Potential Fraud" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Potential Fraud Comment" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "First Class Responsible" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Number Of Employees" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Blacklisted" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Segment" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Tax Exempt" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Juridical Info" is correct to the related corporate customer for CustomerParty Related Info Widget
    And  I should be seeing that the value of  the "Customer Type" is correct to the related corporate customer for CustomerParty Related Info Widget


  @regression @pia @searchcorporatecustomer @VFALFT-10708 @smoke
    Scenario: Test Update Corporate Customer-Admin Information
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
    When I select a value "MALE" in the Gender field for Corporate Customer
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget



  @regression @pia @searchcorporatecustomer @VFALFT-10610 @smoke
    Scenario: Test Corporate Customer in 360 view - Document Info (Adding new Documents)
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
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10072022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Document created successfully!" for Customer360 Page
    #When I click "X" button
    #Then I should be seeing that The uploaded document is deleted
    #When I click "+" button
    #Then I should be seeing that a window is opened for uploading new documents










