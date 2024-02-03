#language: en

Feature: Sell Bundle Offer

  @regression @pia @sellbundleoffer @VFALFT-10732 @smokep
    Scenario: Test Bundle end-to-end testing for Residential Customer
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
    When I select a value "Bundle" category for Bundle Product
    And  I click Search Product button for Product Page
    When I select "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" Offer product is selected
    When I click the "12Month" button
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I click the "12 X ALL100" button
    When I enter a value "23" in the MacAddress field for Bundle Product
    When I click  the "Smart Card" Add-on product
    And  I enter a value "002001156138" in the Serial Number field
    When I click the "12 X ALL0" button
    When I click the "12 X ALL1200" button
    When I click the "12 X ALL300" button
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #Then I should be seeing that account billing create and billing account are linked to eachother on API
    #Then I should be seeing that docsis call is created on API
    #Then I should be seeing that order is created on API
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
    And  I wait "90000" millisecond to process
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed
    And  I should be seeing that "active" for Product Tab



  @regression @pia @sellbundleoffer @VFALFT-10733 @smokep
    Scenario: Test Bundle end-to-end testing for Corporate Customer
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
    When I select a value "Bundle" category for Bundle Product
    And  I click Search Product button for Product Page
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" Offer product is selected
    When I click the "12Month" button
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I click the "12 X ALL100" button
    When I enter a value "24" in the MacAddress field for Bundle Product
    When I click  the "Smart Card" Add-on product
    And  I enter a value "002001156138" in the Serial Number field
    When I click the "12 X ALL0" button
    When I click the "12 X ALL1200" button
    When I click the "12 X ALL300" button
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed
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
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed
    And  I should be seeing that "active" for Product Tab


  @regression @pia @sellbundleoffer @VFALFT-10741
    Scenario: Test Shopping Cart to Order - Bundle for Corporate
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
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side and it is kept as "bundles"


  @regression @pia @sellbundleoffer @VFALFT-10740 @smokep
    Scenario: Test Shopping Cart to Order - Bundle for Residential
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
    When I select a value "Bundle" category for Bundle Product
    And  I click Search Product button for Product Page
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" Offer product is selected
    When I click the "12Month" button
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I click the "12 X ALL100" button
    When I enter a value "25" in the MacAddress field for Bundle Product
    When I click  the "Smart Card" Add-on product
    And  I enter a value "002001156138" in the Serial Number field
    When I click the "12 X ALL0" button
    When I click the "12 X ALL1200" button
    When I click the "12 X ALL300" button
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps Plus VF TV Prime" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    Then I should be seeing that "50 Mbps" my selected additional product is displayed


  @regression @pia @sellbundleoffer @VFALFT-10739 @uat
    Scenario: Test Shopping Cart to Order - Addon for Corporate
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
    #When I click  the "Premium Enterprise Modem" Add-on product
    #Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side and it is kept as "hassAddOn"

  @regression @pia @sellbundleoffer @VFALFT-10738 @uat
    Scenario: Test Shopping Cart to Order - Addon for Residential
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
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    #Then I should be seeing that "Premium Enterprise Modem" my selected additional product is displayed
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side and it is kept as "hassAddOn"



  @regression @pia @sellbundleoffer @VFALFT-11088
    Scenario: Test Bundle end-to-end testing for Institute Customer
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
    #When I Get Billing Account ""
    #Then I should be seeing that Note value is generated in the Billing Account on the BE side
    #Then I should be seeing that the main product and the selected add on product that is related to the main product are displayed
    #When I check the CartItem RelationshipType field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    #When I check the ProductRelationShip field on the BE side
    #Then I should be seeing that CartItem RelationshipType value is generated on the BE side
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
     #Then I should be seeing that docsis call is created on API
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
    And  I should be seeing that "T-Bundle" for Product Tab
    #And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "created" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab



  @regression @pia @sellbundleoffer @VFALFT-11089 @smokep
    Scenario: Test Add-on end-to-end testing for Institute Customer
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
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "26" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    When I click  the "Tarife Instalimi" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Then I should be seeing that "Tarife Instalimi" my selected additional product is displayed
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
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    #And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "Akses Fee per Modem Basic" for Product Tab
    And  I should be seeing that "Tarife Instalimi" for Product Tab
    And  I should be seeing that "active" for Product Tab

