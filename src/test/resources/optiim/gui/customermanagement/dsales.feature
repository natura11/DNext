#language: en

Feature: DSales

  @regression @pia @dsales @VFALFT-12229 @smoke
    Scenario: Test FE - Choose Invoice account during Shopping Cart for Individual Customer
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
    And  I click "Account" Tab for Customer360 Page
    Then I should be seeing that "Invoice Account" for Tab
    And  I should be seeing that "Postpaid" for Tab
    And  I should be seeing that "Prepaid" for Tab
    #And  I should be seeing that New Order button is displayed "active"



  @regression @pia @dsales @VFALFT-12230
    Scenario: Test FE - Choose Invoice account during Shopping Cart for Corporate Customer
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
    Then I should be seeing that "Invoice Account" for Tab
    And  I should be seeing that "Postpaid" for Tab
    And  I should be seeing that "Prepaid" for Tab
    #And  I should be seeing that New Order button is displayed "active"


  @regression @pia @dsales @VFALFT-12311 @ignore
    Scenario: Test BE - UI filter for Simple products
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    #When I check the Configurable characteristics of the product
    #Then I should be seeing that more than one options for the Configurable characteristics
    #When I select one of the Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I select one of the different Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I check the Product Specification information on the BE side
    #Then I should be seeing that Product Specification detail information is displayed
    #When I check the Product Catalog - Product Offer  on the BE side
    #Then I should be seeing that Product Offer details information is displayed
    #When I check the Product Offering Price information on the BE side
    #Then I should be seeing that for each configurable characteristic price information is displayed



  @regression @pia @dsales @VFALFT-12312 @ignore
    Scenario: Test BE - UI filter for Add on products
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
    Then I should be seeing that "Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Test Add onGigaFibra Prime 5-5 Mbps" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    #When I check the Configurable characteristics of the product
    #Then I should be seeing that more than one options for the Configurable characteristics
    #When I select one of the Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I select one of the different Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I check the Product Specification information on the BE side
    #Then I should be seeing that Product Specification detail information is displayed
    #When I check the Product Catalog - Product Offer  on the BE side
    #Then I should be seeing that Product Offer details information is displayed
    #When I check the Product Offering Price information on the BE side
    #Then I should be seeing that for each configurable characteristic price information is displayed


  @regression @pia @dsales @VFALFT-12313 @ignore
    Scenario: Test BE - UI filter for Bundle products
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
    #When I check the Configurable characteristics of the product
    #Then I should be seeing that more than one options for the Configurable characteristics
    #When I select one of the Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I select one of the different Configurable characteristic and check the price
    #Then I should be seeing that the price information is updated according to the selected Configurable characteristic
    #When I check the Product Specification information on the BE side
    #Then I should be seeing that Product Specification detail information is displayed
    #When I check the Product Catalog - Product Offer  on the BE side
    #Then I should be seeing that Product Offer details information is displayed
    #When I check the Product Offering Price information on the BE side
    #Then I should be seeing that for each configurable characteristic price information is displayed



  @regression @pia @dsales @VFALFT-12471 @smoke
    Scenario: Test FE - DSales Keycloak integration (Login,Logout,Checkout Processes)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that the Product Configuration UI is opened
    When I have log out into the system for Product Page
    Then I should be seeing that the "Sign in to your account" page is opened for Login Page

  @regression @pia @dsales @VFALFT-12379
    Scenario: Test FE - UI filter for Add on products
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
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    When I click  the "Tarife Instalimi" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Tarife Instalimi" my selected additional product is displayed




  @regression @pia @dsales @VFALFT-12380
    Scenario: Test FE - UI filter for Bundle products
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
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    #Then I should be seeing that "24 x ALL10,000 / MONTHLY" in the Payment Plan field
    And  I should be seeing that "Offer Type" popup is opened
    And  I should be seeing that "Bundle" popup is opened
    When I select a value "12MonthCommitment" Product Term field
    #Then I should be seeing that "12 x ALL10,000 / MONTHLY" in the Payment Plan field



  @regression @pia @dsales @VFALFT-12452
    Scenario: Test FE - filter for City
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
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
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account Name" for Tab
    Then I should be seeing that "Agreement Id" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Total Price" for Tab
    Then I should be seeing that "active" for Tab
    Then I should be seeing that "Modem Basic" for Tab


  @regression @pia @dsales @VFALFT-12454
    Scenario: Test FE - filter for Channel
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
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "DIGITALB PREMIUM" product and click
    Then I should be seeing that the Product Configuration UI is opened
#    And  I select a value "ABEL" in TVInfrastructure field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account Name" for Tab
    Then I should be seeing that "Agreement Id" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Total Price" for Tab
    Then I should be seeing that "active" for Tab
    Then I should be seeing that "Digitalb Premium" field is displayed for Widget

  @regression @pia @dsales @VFALFT-12455 @ignore
    Scenario: Test FE - filter for Marketsegment
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
    And  I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account Name" for Tab
    Then I should be seeing that "Agreement Id" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Total Price" for Tab
    Then I should be seeing that "active" for Tab
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Widget



  @regression @pia @dsales @VFALFT-12456 @ignore
    Scenario: Test FE - filter for Currency
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
    And  I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account Name" for Tab
    Then I should be seeing that "Agreement Id" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Total Price" for Tab
    Then I should be seeing that "active" for Tab
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Widget


  @regression @pia @dsales @VFALFT-12300
    Scenario: Test FE - For Add on Product - Pop-up during Shopping Cart to override price, amount, product description and place
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
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I enter a value "500" Price field for Authorize Edit Dialog
    When I enter a value "3" Amount field for Authorize Edit Dialog
    When I enter a value "2N1 TV Vod Tring Mini Sporte - 2M" Description field for Authorize Edit Dialog
    When I enter a value "ALBANIAN 1" Address Line 1 field for Authorize Edit Dialog
    When I enter a value "ALBANIAN 2" Address Line 2 field for Authorize Edit Dialog
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "2N1 TV Vod Tring Mini Sporte - 2M" my selected additional product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card




  @regression @pia @dsales @VFALFT-12299
    Scenario: Test FE - For Mandatory and Optional Bundle Products Pop-up during Shopping Cart to override price, amount, product description and place
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
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I enter a value "500" Price field for Authorize Edit Dialog
    When I enter a value "3" Amount field for Authorize Edit Dialog
    When I enter a value "Paketa- 2IN1 INTVFGF 50Mbps- TV Vod Tring Plote - 2M" Description field for Authorize Edit Dialog
    When I enter a value "ALBANIAN 1" Address Line 1 field for Authorize Edit Dialog
    When I enter a value "ALBANIAN 2" Address Line 2 field for Authorize Edit Dialog
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Paketa- 2IN1 INTVFGF 50Mbps- TV Vod Tring Plote - 2M" my selected additional product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card

  @regression @pia @dsales @VFALFT-12298 @smokep
    Scenario: Test FE - For Simple Product - Pop-up during Shopping Cart to override price, amount, product description and place
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
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "8" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    #When I enter a value "500" Price field for Authorize Edit Dialog
    #When I enter a value "VOIP 200 Mins Monthly 12 Months" Description field for Authorize Edit Dialog
    And  I click New Adress Button for Authorize Edit Page
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    #Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    When I enter a value "ALBANIAN 1" Address Line 1 field for Authorize Edit Dialog
    When I enter a value "ALBANIAN 2" Address Line 2 field for Authorize Edit Dialog
    When I select a value "FIER" City field for Authorize Edit Dialog
    When I click "Create" button for Product Details Page
    When I click "Save" button for Product Details Page
    #Then I should be seeing that "Service address created successfully!" popup is opened
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    And  I should be seeing Prices of Products calculated correctly on Shopping Card



  @regression @pia @dsales @VFALFT-12260
    Scenario: Test FE - UI filter for Simple products
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
    #And  I should be seeing that New Order button is displayed "active"
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    And  I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "ALL100" in the Payment Plan field
    #When I select a value "12 Month Commitment" Product Term field
    #Then I should be seeing that "12 x ALL20 / MONTHLY" in the Payment Plan field
    #When I select a value "24 Month Commitment" Product Term field
    #Then I should be seeing that "24 x ALL15 / MONTHLY" in the Payment Plan field



  @regression @pia @dsales @VFALFT-12637
    Scenario: Test FE Set Agent and Shop Information at shopping cart before check out for Corporate Customer
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
    #And  I should be seeing that New Order button is displayed "active"
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    And  I should be seeing that "Invoice Account - Postpaid - Lek" updated value.



  @regression @pia @dsales @VFALFT-12638
    Scenario: Test FE Set Agent and Shop Information at shopping cart before check out for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    And  I should be seeing that "Invoice Account - Prepaid - Lek" updated value.
