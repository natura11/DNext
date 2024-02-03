#language: en

Feature: Purchase Add-on Offer


  @regression @pia @purchaseaddonoffer @VFALFT-11328
  Scenario: Test BE-Checkout add-on items added from 360 view for Residential Customer
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
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed
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
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    #And  I should be seeing that "Premium Enterprise Modem" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "12MonthCommitment", "Cash" for Product Term
    #When I click  the "Premium Enterprise Modem" Add-on product
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    #When I Get Billing Account ""




  @regression @pia @purchaseaddonoffer @VFALFT-11329
  Scenario: Test BE-Checkout add-on items added from 360 view for Corporate Customer
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
    When I click  the "Modem Basic" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
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
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
      #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    #When I Get Billing Account ""



  @regression @pia @purchaseaddonoffer @VFALFT-11336
  Scenario: Test BE-Checkout add-on items added from 360 view for Institute Customer
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    When I click  the "Modem Basic" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
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
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
    #Then I should be seeing that quantity is displayed "1"
    #Then I should be seeing that id is displayed as main product id
    And I click the Checkout button
    When I Get Billing Account ""
    Then I should be seeing that Note value is generated in the Billing Account on the BE side


  @regression @pia @purchaseaddonoffer @VFALFT-11528 @ignore
    Scenario: Test FE-Represent add-on offer at shopping cart with the main offer for Individual Customer
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #When I check the BE side and select the "shoppingcart"
    #Then I should be seeing that relationshipType is displayed as "hasAddon"


  @regression @pia @purchaseaddonoffer @VFALFT-11529 @ignore
    Scenario: Test - Represent add-on offer at shopping cart with the main offer for Corporate Customer
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #When I check the BE side and select the "shoppingcart"
    #Then I should be seeing that relationshipType is displayed as "hasAddon"


  @regression @pia @purchaseaddonoffer @VFALFT-11530 @ignore
    Scenario: Test - Represent add-on offer at shopping cart with the main offer for Institute Customer
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #When I check the BE side and select the "shoppingcart"
    #Then I should be seeing that relationshipType is displayed as "hasAddon"



  @regression @pia @purchaseaddonoffer @VFALFT-10667 @betodo
    Scenario: Test Buy Add-on Product on 360 view for residential customer
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
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Tarife Instalimi" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Tarife Instalimi" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    #Then I should be seeing that "National Football League" is displayed related with the main product
    When I select a value "Configurable Characteristic" Product Term field for Add-on product
    #And  I click Edit button for Product Detail Page
    #Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    #When I click Shopping Cart Button
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the Add-on product
    #Then I should be seeing that Add to Cart button is checked

  @regression @pia @purchaseaddonoffer @VFALFT-10668
    Scenario: Test Adding Add-on Product to Shopping Card on 360 view for Residential Customer
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
    Then I should be seeing that "24 x ALL1,000 / MONTHLY" in the Payment Plan field
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
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
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field for Add-on product
    #And  I click Edit button for Product Detail Page
    #Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    #When I click Shopping Cart Button
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the Add-on product
    #Then I should be seeing that Add to Cart button is checked
    #Then I should be seeing that Product is is displayed in id field and relationshipType is displayed as addonOff



  @regression @pia @purchaseaddonoffer @VFALFT-10669
    Scenario: Test Buy Add-on product on 360 view for Corporate Customer
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
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
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
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field for Add-on product
    #And  I click Edit button for Product Detail Page
    #Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    #When I click Shopping Cart Button
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the Add-on product
    #Then I should be seeing that Add to Cart button is checked

  @regression @pia @purchaseaddonoffer @VFALFT-10670
    Scenario: Test Adding add-on Product to Shopping Card on 360 view for Corporate Customer
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
    ##When I click  the "Premium Enterprise Modem" Add-on product
    ##Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
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
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Buy Add-on" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "Predefined Characteristic" Product Term field
    #Then I should be seeing that "SerialNumber : 5", "CableTVProductID : 69007"
    When I select a value "Configurable Characteristic" Product Term field for Add-on product
    #And  I click Edit button for Product Detail Page
    #Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    #When I click Shopping Cart Button
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the Add-on product
    #Then I should be seeing that Add to Cart button is checked
    #Then I should be seeing that Product is is displayed in id field and relationshipType is displayed as addonOff


  @regression @pia @purchaseaddonoffer @VFALFT-10662
    Scenario: Buy Bundle Product on 360 view for Residential Customer
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
    #And I should be seeing that Status of "GigaFibra Pro 1000-100 Mbps" product is "active"
    When I click "Buy Optional Product" button for Product Widget
    And  I switch to new window tab
    Then I should be seeing that the Product Configuration UI is opened
    #Then I should be seeing that optional bundle products that can be purchased by customer are listed
    #Then I should be seeing that the bundle products that are already purchased are not displayed on the bundle product list
    #When I increase the quantity value
    #Then I should be seeing that I can change the quantity value
    #Then I should be seeing that the Product Term that I have already purchased with the main product should be same with the bundle product
    Then I should be seeing that "Configurable Characteristic" for Product Detail page
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing the popup alert message "Shopping Card is updated successfully" for Products Page
    When I click Shopping Cart Button
    Then I should be seeing that "T-Bundle" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    And  I click Edit button for Product Detail Page
    Then I should be seeing the popup alert message "Shopping Cart is updated successfully" for Products Page
    When I click Shopping Cart Button
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    #And  I should be seeing that "Fiber" updated value.
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





