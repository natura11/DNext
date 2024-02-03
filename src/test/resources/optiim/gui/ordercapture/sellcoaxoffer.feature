#language: en

Feature: Sell Coax Offer

  @regression @pia @sellcoaxoffer @VFALFT-9384 @smokep
  Scenario: Test Present Coax offer in Dsales
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
    Then I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    And  I should be seeing that "Contract Duration" for Product Detail page
    And  I should be seeing that "Pajisje te reja" for Product Detail page
    And  I should be seeing that "Purchasable Addons" for Product Detail page
    And  I should be seeing that "Authorize Edit" for Product Detail page
    And  I should be seeing that "Add to Cart" for Product Detail page



  @regression @pia @sellcoaxoffer @VFALFT-9362
  Scenario: Negative Test Scenarios-Present Coax offer in Dsales
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Configurable Characteristic" for Product Detail page


  @regression @pia @sellcoaxoffer @VFALFT-9376 @smokep
    Scenario: Test Add Coax offer to Shopping Cart
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
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    And  I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "27" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    And  I should be seeing Prices of Products calculated correctly on Shopping Card
    When I click the Checkout button
    When I click Products button for Shopping Cart Page



  @regression @pia @sellcoaxoffer @VFALFT-9417
    Scenario: Test Negative Scenarios Add Coax offer to Shopping Cart
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
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    And  I should be seeing that New Order page is opened
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Configurable Characteristic" for Product Detail page
    #And  I should be seeing that "Product Term" for Product Detail page
#    And I enter a value "" in the MacAddress field
#    And  I enter a value "" in the Phone Number field
#    And I enter a value "" in the SipUser field
#    And I enter a value "" in the Serial Number field
    #When I click the Add to Cart button
    #Then I should be seeing that Shopping Cart screen is opened and my selected product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card
    #When I click Products button for Shopping Cart Page
    #When I select "400MBPS MODEM" product and click
    #Then I should be seeing the popup alert message "No suitable term is available" for Products Page
    #When I select a new Coax Offer product has the different Rating Type in the Shopping Cart from Product List and click the "Add to Cart" button
    #Then I should be seeing that I can not add the Coax Offer product has the different Rating Type in the Shopping Cart


  @regression @pia @sellcoaxoffer @VFALFT-9461 @smokep
    Scenario: Test Delete Coax offer to Shopping Cart
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
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    And  I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "28" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I select the product and delete for Shopping Cart Page
    When I click the "Ok" button
    And I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted










