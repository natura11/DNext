#language: en

Feature: Sell TV Offer


  @regression @pia @selltvoffer @VFALFT-9613 @smokep
  Scenario: Test Present TV offer in Dsales
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
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Digitalb Premium" product and click
    Then I should be seeing that "Digitalb Premium" Offer product is selected
    And  I should be seeing that "Contract Duration" for Product Detail page
    When I select a value "random" Product Term field
    And  I select a value "Cryptoguard" in TVInfrastructure field
    And  I should be seeing that "Pajisje te reja" for Product Detail page
    When I click  the "Smart Card" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    Then I should be seeing that Payment Plan section will be filtered according to the selected offering term


  @regression @pia @selltvoffer @VFALFT-9614 @smokep
  Scenario: Negative Test Scenarios-Test Present TV offer in Dsales
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
    Then I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Digitalb Premium" product and click
    Then I should be seeing that "Digitalb Premium" Offer product is selected
    And  I should be seeing that "Contract Duration" for Product Detail page
    And  I should be seeing that "Pajisje te reja" for Product Detail page
    And  I should be seeing that "Purchasable Addons" for Product Detail page
    #And  I leave the "" in TVInfrastructure fields for the selected product are empty
    #Then I should be seeing that the "TVInfrastructure" in Configuration Parameters fields for the selected product is required


  @regression @pia @selltvoffer @VFALFT-9572 @smokep
    Scenario: Test Add TV offer to Shopping Cart
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
    When I select "Digitalb Premium" product and click
    Then I should be seeing that "Digitalb Premium" Offer product is selected
    And  I should be seeing that "Contract Duration" for Product Detail page
    When I select a value "random" Product Term field
    And  I select a value "Cryptoguard" in TVInfrastructure field
    And  I should be seeing that "Pajisje te reja" for Product Detail page
    When I click  the "Smart Card" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    And  I should be seeing Prices of Products calculated correctly on Shopping Card
    When I click Products button for Shopping Cart Page


  @regression @pia @selltvoffer @VFALFT-9579
    Scenario: Test Negative Scenarios Add TV offer to Shopping Cart
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
    When I select "DIGITALB PREMIUM" product and click
    Then I should be seeing that the Product Configuration UI is opened
#    And  I select a value "ABEL" in TVInfrastructure field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    #And  I should be seeing Prices of Products calculated correctly on Shopping Card
    When I click Products button for Shopping Cart Page
    #When I select "400MBPS MODEM" product and click
    #Then I should be seeing the popup alert message "No suitable term is available" for Products Page


  @regression @pia @selltvoffer @VFALFT-9672 @smokep
    Scenario: Test Delete TV offer to Shopping Cart
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Digitalb Premium" product and click
    Then I should be seeing that "Digitalb Premium" Offer product is selected
    And  I should be seeing that "Contract Duration" for Product Detail page
    When I select a value "random" Product Term field
    And  I select a value "Cryptoguard" in TVInfrastructure field
    And  I should be seeing that "Pajisje te reja" for Product Detail page
    When I click  the "Smart Card" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    Then I should be seeing that "Smart Card" my selected additional product is displayed
    When I select the product and delete for Shopping Cart Page
    When I click the "Ok" button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted







