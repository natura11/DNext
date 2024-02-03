#language: en

Feature: Purchase Offer

  @regression @pia @purchaseoffer @VFALFT-9338 @smokep
  Scenario: Test Product ShoppingCart
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "20" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed

  @regression @pia @purchaseoffer @VFALFT-9349 @smokep
  Scenario: Test Display Products
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
    When I click the New Order button for Postpaid
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    And  I should be seeing that New Order page is opened


  @regression @pia @purchaseoffer @VFALFT-9507 @smokep
  Scenario: Test Display Products According to the Updated Address
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
    When I click the New Order button for Postpaid
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    And  I should be seeing that New Order page is opened
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button


  @regression @pia @purchaseoffer @VFALFT-9348 @smokep
  Scenario: Test Product Search
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I enter a value "Vodafone Gigafibra 50 Mbps" in the Search Product field
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" in the Search Product list
    When I enter a value "Digitalb Premium" in the Search Product field
    Then I should be seeing that "Digitalb Premium" in the Search Product list


  @regression @pia @purchaseoffer @VFALFT-9277 @smokep
  Scenario: Test Product Filter
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
    And  I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    When I click "DownloadSpeed" Category button
    And  I select a value "1" category
    Then I should be seeing that the "1" product of category is true selected
    And  I should be seeing that the "5" product of category is not selected
    When I select a value "5" category
    Then I should be seeing that the "1" product of category is true selected
    And  I should be seeing that the "5" product of category is true selected
    When I select a value "1" category
    Then I should be seeing that the "5" product of category is true selected
    And  I should be seeing that the "1" product of category is not selected
    When I select a value "5" category
    Then I should be seeing that the "1" product of category is not selected
    And  I should be seeing that the "5" product of category is not selected
    #When I check the filter of the products  with "Speed" ,"Minute" and "Price" parameters
    #Then I should be seeing the products are filtered
    #When I check the filter of the products  with "Speed" parameter
    #Then I should be seeing the "Speed" is filtered
    #When I check the filter of the products  with "Minute" parameter
    #Then I should be seeing the  "Minute" Parameter is filtered
    #When I check the filter of the products with "price" parameter
    #Then I should be seeing the "price" parameter is filtered


  @regression @pia @purchaseoffer @VFALFT-9346
  Scenario: Test Negative Scenarios Shopping Cart
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "Cash" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card
    When I click Products button for Shopping Cart Page
    When I select "T-BUNDLE" product and click
    Then I should be seeing the popup alert message "No suitable term is available" for Products Page



  @regression @pia @purchaseoffer @VFALFT-9343
  Scenario: Test Shopping Cart
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card
    When I click Products button for Shopping Cart Page



  @regression @pia @purchaseoffer @VFALFT-10872 @ignore
    Scenario: Test Order Fulfillment SI-BPMN integration
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
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
    #When I check the SI-BPMN on the BE side
    #Then I should be seeing that the steps automatically advance


  @regression @pia @purchaseoffer @VFALFT-10110 @smokep
    Scenario: Test End-to-end Shopping Cart test
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
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    And  I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I select a value "FIBER" in the InternetInfrastructure field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Basic" for Product Tab
    When I click "Modem Basic" for Product widget
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





  @regression @pia @purchaseoffer @VFALFT-14500 @smoke
    Scenario: Test No Purchase on Blacklisting for individual customer
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
    When I select a value "YES" in the Blacklist Flag field
    When I click the "Save" Button
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing the popup alert message "Order cannot be created for the Blacklisted customer" for Customer360 Page


  @regression @pia @purchaseoffer @VFALFT-15233 @smoke
    Scenario: Test No Purchase on Blacklisting and Penalty Debt
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
    When I select a value "YES" in the Blacklist Flag field
    When I click the "Save" Button
    And  I click "Account" Tab for Customer360 Page
    And  I click the New Order button for Postpaid
    Then I should be seeing the popup alert message "Order cannot be created for the Blacklisted customer" for Customer360 Page

