#language: en

Feature: Purchase Bundle Offer

  @regression @pia @purchasebundleoffer @VFALFT-10717
    Scenario: Test Bundle structure in CartItem for Corporate Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #When I click the “Add to Cart“ Button
    #Then I should be seeing that the main product and the selected bundle products that are related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side



  @regression @pia @purchasebundleoffer @VFALFT-10716
    Scenario: Test Bundle structure in CartItem for Residential Customer
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
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #When I click the “Add to Cart“ Button
    #Then I should be seeing that the main product and the selected bundle products that are related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side



  @regression @pia @purchasebundleoffer @VFALFT-10726
  Scenario: Test Addon structure in CartItem for Residential Customer
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
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side



  @regression @pia @purchasebundleoffer @VFALFT-10727
  Scenario: Test Addon structure in CartItem for Corporate Customer
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
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side


  @regression @pia @purchasebundleoffer @VFALFT-10687 @uat
    Scenario: Test Shopping cart modification for Add-on offer (in the Shopping Cart) for Corporate Customer
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
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    When I click  the "Modem Premium" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Premium" my selected additional product is displayed
    When I click the Add-on product and click edit button
    When I select a value "FIBER" in the InternetInfrastructure field
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These Products Will be Removed From Shopping Cart" message is displayed
    When I click the Confirm button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed



  @regression @pia @purchasebundleoffer @VFALFT-10684 @uat @smokep
    Scenario: Test Shopping cart modification for Add-on offer (in the Shopping Cart) for Residential Customer
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
    When I enter a value "18" in the MacAddress field
    When I click  the "Tarife Instalimi" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Tarife Instalimi" my selected additional product is displayed
    When I click the Add-on product and click edit button
    When I select a value "FIBER" in the InternetInfrastructure field
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping cart updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These items will be removed from your cart!" message is displayed
    When I click the "Ok" button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "50" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed


  @regression @pia @purchasebundleoffer @VFALFT-10681 @uat
    Scenario: Test Shopping cart modification for bundle offers (in the Shopping Cart) for Corporate Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These items will be removed from your cart!" message is displayed
    When I click the Confirm button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that New Billing Account and Aggrement is created on the BE side



  @regression @pia @purchasebundleoffer @VFALFT-10678 @uat
    Scenario: Test Shopping cart modification for bundle offers (in the Shopping Cart) for Residential Customer
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
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These items will be removed from your cart!" message is displayed
    When I click the Confirm button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that New Billing Account and Aggrement is created on the BE side



  @regression @pia @purchasebundleoffer @VFALFT-10746
    Scenario: Test Order capture add on offering characteristic configuration for Corporate Customer
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
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed




  @regression @pia @purchasebundleoffer @VFALFT-10745
    Scenario: Test Order capture add on offering characteristic configuration for Residential Customer
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
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed




  @regression @pia @purchasebundleoffer @VFALFT-10744
    Scenario: Test Order capture bundle offering characteristic configuration for Corporate Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "T-Bundle" product and click
    When I click  the "Digitalb Premium" Add-on product
    #Then I should be seeing that "DownloadSpeed : 15", "UploadSpeed : 3"
    #Then I should be seeing that "Screen : 15.5", "Processor : A13"
    #When I select a value "Configurable Characteristic" Product Term field for Bundle product


  @regression @pia @purchasebundleoffer @VFALFT-10743
    Scenario: Test Order capture bundle offering characteristic configuration for Residential Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "T-Bundle" product and click
    #When I click  the "GigaFibra Pro 1 Gbps - I" Add-on product
    When I select a value "Predefined Characteristic" Product Term field for Bundle product
    #Then I should be seeing that "DownloadSpeed : 15", "UploadSpeed : 3"
    #Then I should be seeing that "Screen : 15.5", "Processor : A13"
    #When I select a value "Configurable Characteristic" Product Term field for Bundle product



  @regression @pia @purchasebundleoffer @VFALFT-11098 @ignore
    Scenario: Test Validation for Bundle Offer Deactivation
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
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select a value "Bundle" category for Bundle Product
    And  I click Search Product button for Product Page
    When I select "Vodafone Gigafibra 30 Mbps Plus Vodafone TV Prime" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps Plus Vodafone TV Prime" Offer product is selected
    When I click the "12Month" button
    When I click  the "Modem Basic" Add-on product
    When I click the "12 X ALL100" button
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    When I click  the "Smart Card" Add-on product
    And  I enter a value "002001156138" in the Serial Number field
    When I click the "12 X ALL0" button
    When I click the "12 X ALL1000" button
    When I click the "12 X ALL300" button
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps Plus Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "Internet 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Modem Basic" for Product widget
    And  I click "Deactivation" button for Product Widget
    #And  I click "OK" for Product widget
    Then I should be seeing that "Deactivation Process is started" Offer product is selected
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Terminate" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    And  I click "Deactivation" button for Product Widget
    And  I click "OK" for Product widget
    And  I wait "90000" millisecond to process
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing that "terminate" for Tab


  @regression @pia @purchasebundleoffer @VFALFT-11349
    Scenario: Test BE-Checkout optional bundle items added from 360 view for Residential Customer
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
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #Then I should be seeing that account billing create and billing account are linked to eachother on API
    #Then I should be seeing that docsis call is created on API
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Test Vodafone TV" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    #When I click on "Delete" button
    #Then I should be seeing that product is removed from Shopping Card
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that Billing Account and Aggrement is updated


  @regression @pia @purchasebundleoffer @VFALFT-11350
    Scenario: Test BE-Checkout optional bundle items added from 360 view for Corporate Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #Then I should be seeing that account billing create and billing account are linked to eachother on API
    #Then I should be seeing that docsis call is created on API
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Test Vodafone TV" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "12Month Commitment", "Cash" for Product Term
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "Cryptoguard" updated value.
    When I click Shopping Cart Button
    #When I click on "Delete" button
    #Then I should be seeing that product is removed from Shopping Card
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that Billing Account and Aggrement is updated


  @regression @pia @purchasebundleoffer @VFALFT-11351
    Scenario: Test BE-Checkout optional bundle items added from 360 view for Institute Customer
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
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #Then I should be seeing that account billing create and billing account are linked to eachother on API
    #Then I should be seeing that docsis call is created on API
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Test Vodafone TV" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "12Month Commitment", "Cash" for Product Term
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "Cryptoguard" updated value.
    When I click Shopping Cart Button
    #When I click on "Delete" button
    #Then I should be seeing that product is removed from Shopping Card
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that Billing Account and Aggrement is updated


  @regression @pia @purchasebundleoffer @VFALFT-11354
    Scenario: Test BE-Validation during adding bundle to the shopping cart for Institute Customer
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
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Optional Product" button for Product Widget
    #Then I should be seeing that product page is opneed and the optional bundle products are displayed
    #When I check the bundle products that are already purchased on the bundle product list
    #Then I should be seeing that the bundle products that are already purchased are not displayed on the bundle product list
    #When I check the fields of the optional bundle products
    #Then I should be seeing that Configurable Charachteristics, Predefined Charachteristics, Product Term and Payment Plan fields are displayed
    #Given the optional bundle product has the Predefined Charachteristics
    #When I check the fields of the Predefined Charachteristics
    #Then I should be seeing that the Predefined Charachteristics are related with the bundle product are displayed
    #Given the optional bundle product has the Configurable Charachteristics
    #When I check the fields of the Configurable Charachteristics
    #Then I should be seeing that the Configurable Charachteristics are related with the bundle product are displayed
    #When I enter the values in the Configurable Charachteristics field
    #Then I should be seeing that I can enter values in the Configurable Charachteristics field
    #When I check the Product Term related with the optional bundle product
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the optional bundle product
    #When I click the Add To Cart button
    #Then I should be seeing the optional bundle product is added into the shopping cart
    #When I check the cartItem.product.productRelationship
    #Then I should be seeing that Product id is displayed in id field and relationshipType is displayed as componentOf
    #When I check the productInv.productTerm {amount,duration}
    #Then I should be seeing that  productInv.productTerm {amount,duration}==cartItem.product.productTerm  {amount,duration}


  @regression @pia @purchasebundleoffer @VFALFT-11353
    Scenario: Test BE-Validation during adding bundle to the shopping cart for Corporate Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Optional Product" button for Product Widget
    #Then I should be seeing that product page is opneed and the optional bundle products are displayed
    #When I check the bundle products that are already purchased on the bundle product list
    #Then I should be seeing that the bundle products that are already purchased are not displayed on the bundle product list
    #When I check the fields of the optional bundle products
    #Then I should be seeing that Configurable Charachteristics, Predefined Charachteristics, Product Term and Payment Plan fields are displayed
    #Given the optional bundle product has the Predefined Charachteristics
    #When I check the fields of the Predefined Charachteristics
    #Then I should be seeing that the Predefined Charachteristics are related with the bundle product are displayed
    #Given the optional bundle product has the Configurable Charachteristics
    #When I check the fields of the Configurable Charachteristics
    #Then I should be seeing that the Configurable Charachteristics are related with the bundle product are displayed
    #When I enter the values in the Configurable Charachteristics field
    #Then I should be seeing that I can enter values in the Configurable Charachteristics field
    #When I check the Product Term related with the optional bundle product
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the optional bundle product
    #When I click the Add To Cart button
    #Then I should be seeing the optional bundle product is added into the shopping cart
    #When I check the cartItem.product.productRelationship
    #Then I should be seeing that Product id is displayed in id field and relationshipType is displayed as componentOf
    #When I check the productInv.productTerm {amount,duration}
    #Then I should be seeing that  productInv.productTerm {amount,duration}==cartItem.product.productTerm  {amount,duration}


  @regression @pia @purchasebundleoffer @VFALFT-11352
    Scenario: Test BE-Validation during adding bundle to the shopping cart for Residential Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Optional Product" button for Product Widget
    #Then I should be seeing that product page is opneed and the optional bundle products are displayed
    #When I check the bundle products that are already purchased on the bundle product list
    #Then I should be seeing that the bundle products that are already purchased are not displayed on the bundle product list
    #When I check the fields of the optional bundle products
    #Then I should be seeing that Configurable Charachteristics, Predefined Charachteristics, Product Term and Payment Plan fields are displayed
    #Given the optional bundle product has the Predefined Charachteristics
    #When I check the fields of the Predefined Charachteristics
    #Then I should be seeing that the Predefined Charachteristics are related with the bundle product are displayed
    #Given the optional bundle product has the Configurable Charachteristics
    #When I check the fields of the Configurable Charachteristics
    #Then I should be seeing that the Configurable Charachteristics are related with the bundle product are displayed
    #When I enter the values in the Configurable Charachteristics field
    #Then I should be seeing that I can enter values in the Configurable Charachteristics field
    #When I check the Product Term related with the optional bundle product
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the optional bundle product
    #When I click the Add To Cart button
    #Then I should be seeing the optional bundle product is added into the shopping cart
    #When I check the cartItem.product.productRelationship
    #Then I should be seeing that Product id is displayed in id field and relationshipType is displayed as componentOf
    #When I check the productInv.productTerm {amount,duration}
    #Then I should be seeing that  productInv.productTerm {amount,duration}==cartItem.product.productTerm  {amount,duration}

  @regression @pia @purchasebundleoffer @VFALFT-11333
    Scenario: Test FE-Buy optional bundle items from 360 view for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I get Migration Customer "individual", "10", "id"
    And  I enter "" value on Search field and click Search button for Migration
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
   #When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "T-Bundle" for Product widget
    When I click "Buy Optional Product" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #When I click  the "Test Vodafone TV" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    #When I click  the "Test Vodafone TV" Add-on product
    #Then I should be seeing the popup alert message "Product is removed" for Products Page
    #When I select a value "12MonthCommitment" Product Term field
    #Then I should be seeing that "12 x ALL200 / MONTHLY" in the Payment Plan field
    #When I select a value "12 x ALL200 / MONTHLY" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing the popup alert message "Shopping Card is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" my selected additional product is displayed
    #Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These items will be removed from your cart!" message is displayed
    When I click the "Ok" button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    #When I click Product tab  on Customer 360 page
    #Then I should be seeing that bundle product which is bought by customer is displayed
    #When I check the status of bundle product on product tab
    #Then I should be seeing that Status of bundle product is "Active"
    #When I click on three dots button on the product as menu item
    #Then I should be seeing that “Buy Bundle Optional Item” button
    #Then I should be seeing that a warning appears as "NO optional bundle Items are available for this product."


  @regression @pia @purchasebundleoffer @VFALFT-11334 @smokep
    Scenario: Test FE-Buy optional bundle items from 360 view for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I get Migration Customer "individual", "10", "id"
    And  I enter "" value on Search field and click Search button for Migration
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select a value "Bundle" category for Bundle Product
    And  I click Search Product button for Product Page
    When I select "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" Offer product is selected
    When I click the "12Month" button
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I click the "12 X ALL100" button
    When I enter a value "19" in the MacAddress field
    When I click  the "Akses Fee per Smart Card" Add-on product
    And  I enter a value "002001156138" in the Serial Number field
    When I click the "12 X ALL0" button
    When I click the "12 X ALL1200" button
    When I click the "12 X ALL300" button
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button for Migration
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Vodafone TV Prime" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that "Vodafone TV Prime" Offer product is selected
    When I click  the "Tring Sport" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    When I click the Add to Cart button
    Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page



  @regression @pia @purchasebundleoffer @VFALFT-11335
    Scenario: Test FE-Buy optional bundle items from 360 view for Institute Customer
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
    When I select "T-BUNDLE" product and click
    Then I should be seeing that "T-Bundle" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    When I click  the "T-Vodafone GigaFibra 50" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "T-Bundle" for Product Tab
    Then I should be seeing that "Digitalb Premium" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "Digitalb Premium" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I click  the "Digitalb Premium" Add-on product
    Then I should be seeing the popup alert message "Product is removed" for Products Page
    When I click  the "Digitalb Premium" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing the popup alert message "Shopping Card is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click Shopping Cart Button
    When I select the product and delete for Shopping Cart Page
    Then I should be seeing that "These Products Will be Removed From Shopping Cart" message is displayed
    When I click the Confirm button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted
    When I click Products button for Shopping Cart Page
    #When I click Product tab  on Customer 360 page
    #Then I should be seeing that bundle product which is bought by customer is displayed
    #When I check the status of bundle product on product tab
    #Then I should be seeing that Status of bundle product is "Active"
    #When I click on three dots button on the product as menu item
    #Then I should be seeing that “Buy Bundle Optional Item” button
    #Then I should be seeing that a warning appears as "NO optional bundle Items are available for this product."
