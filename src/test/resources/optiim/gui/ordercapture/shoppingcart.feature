#language: en

Feature: Shopping Cart


  @regression @pia @shoppingcart @VFALFT-13166 @uat @smokep
    Scenario: Test Shopping Cart Cancellation for Corporate Customer
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
    When I enter a value "29" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the "CANCEL" button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted



  @regression @pia @shoppingcart @VFALFT-13159 @uat @smokep
    Scenario: Test Shopping Cart Cancellation for Individual Customer
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
    When I enter a value "30" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the "CANCEL" button
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted


  @regression @pia @shoppingcart @VFALFT-12901
    Scenario: Test Testing of FE expected payloads for Item and Total price calculations for shopping cart
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


  @regression @pia @shoppingcart @VFALFT-13447 @smokep
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while individual customer purchases a product with the different service address
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
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "31" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Price" for Authorize Edit Dialog
#    Then I should be seeing that "Description" for Authorize Edit Dialog
#    #When I enter a value "500" Price field for Authorize Edit Dialog
#    #When I enter a value "VOIP 200 Mins Monthly 12 Months" Description field for Authorize Edit Dialog
#    And  I click New Adress Button for Authorize Edit Page
#    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
#    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
#    #Then I should be seeing that "Country" for Authorize Edit Dialog
#    Then I should be seeing that "City" for Authorize Edit Dialog
#    When I enter a value "ALBANIAN 1" Address Line 1 field for Authorize Edit Dialog
#    When I enter a value "ALBANIAN 2" Address Line 2 field for Authorize Edit Dialog
#    When I select a value "BALLSH" City field for Authorize Edit Dialog
#    When I click "Create" button for Product Details Page
    When I click "Save" button for Product Details Page
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed


  @regression @pia @shoppingcart @VFALFT-13448
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while individual customer purchases a product with the same service address
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
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13449
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while individual customer purchases a product with the different service address
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
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened



  @regression @pia @shoppingcart @VFALFT-13450
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while individual customer purchases a product with the same service address
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened

  @regression @pia @shoppingcart @VFALFT-13454
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while enterprise customer purchases a product with the different service address
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
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13455
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while enterprise customer purchases a product with the same service address
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
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13456
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while enterprise customer purchases a product with the different service address
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13457
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while enterprise customer purchases a product with the same service address
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13458
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while Institute customer purchases a product with the different service address
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
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened

  @regression @pia @shoppingcart @VFALFT-13459
    Scenario: GeoAPI in the Authorized Edit button on the Product Details Page while Institute customer purchases a product with the same service address
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
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened



  @regression @pia @shoppingcart @VFALFT-13461
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while Institute customer purchases a product with the different service address
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
    When I select "VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I select a value "BALLSH" City field for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    Then I should be seeing that "Service address created successfully!" popup is opened



  @regression @pia @shoppingcart @VFALFT-13462
    Scenario: GeoAPI in the Authorized Edit button on the Shopping Cart while Institute customer purchases a product with the same service address
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
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "12 X ALL" Product Term field
    When I select a value "ALL1,500 3Month" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Add-on product and click edit button
    Then I should be seeing that the Product Configuration UI is opened
    When I click "Authorize Edit" button for Product Details Page
    Then I should be seeing that "Authorize Edit Dialog" popup is opened
    Then I should be seeing that "Address Line1" for Authorize Edit Dialog
    Then I should be seeing that "Address Line2" for Authorize Edit Dialog
    Then I should be seeing that "Country" for Authorize Edit Dialog
    Then I should be seeing that "City" for Authorize Edit Dialog
    Then I should be seeing that "Price" for Authorize Edit Dialog
    Then I should be seeing that "Amount" for Authorize Edit Dialog
    Then I should be seeing that "Description" for Authorize Edit Dialog
    When I click "Ok" button for Product Details Page
    #Then I should be seeing that "Geographic address found!" popup is opened
    #Then I should be seeing that "Geographic address not found and has been created!" popup is opened


  @regression @pia @shoppingcart @VFALFT-13604 @ignore
    Scenario: Test Renewal Option and Cart for Commitment Products for Corporate Customer
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "12 X ALL" Product Term field
    When I select a value "ALL1,500 3Month" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
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
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click Payment button
    Then I should be seeing that the Shopping Cart Page
#    Then I should be seeing that quantity field is displayed
#    When I check the default value in the quantity field
#    Then I should be seeing that 1 is displayed
#    When I try to decrease the number from 1 to 0
#    Then I should be seeing that it is not allowed
#    When I increase the number
#    Then I should be seeing that I can increase the number
#    When I check the total prices
#    Then I should be seeing that the total price is calculated according to the quantity
#    When I click the checkout button
#    Then I should see the payment screen pop up
#    When I click the proceed button I should see the payment completed


  @regression @pia @shoppingcart @VFALFT-13585 @ignore
    Scenario: Test Renewal Option and Cart for Commitment Products for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
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
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    #When I click the "PROCEED" button
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
    And  I should be seeing that "Modem Basic" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click Payment button
    Then I should be seeing that the Shopping Cart Page
#    When I check the quantity field
#    Then I should be seeing that quantity field is displayed
#    When I check the default value in the quantity field
#    Then I should be seeing that 1 is displayed
#    When I try to decrease the number from 1 to 0
#    Then I should be seeing that it is not allowed
#    When I increase the number
#    Then I should be seeing that I can increase the number
#    When I check the total prices
#    Then I should be seeing that the total price is calculated according to the quantity
#    When I click the checkout button
#    Then I should see the payment screen pop up
#    When I click the proceed button I should see the payment completed


  @regression @pia @shoppingcart @VFALFT-13584 @ignore
    Scenario: Test Renewal Option and Cart for Commitment Products for Individual Customer
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
    When I click the "12 X ALL999" button
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    #When I click the "PROCEED" button
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
      |status|
      |passed|
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Basic" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click Payment button
    Then I should be seeing that the Shopping Cart Page
#    When I check the quantity field
#    Then I should be seeing that quantity field is displayed
#    When I check the default value in the quantity field
#    Then I should be seeing that 1 is displayed
#    When I try to decrease the number from 1 to 0
#    Then I should be seeing that it is not allowed
#    When I increase the number
#    Then I should be seeing that I can increase the number
#    When I check the total prices
#    Then I should be seeing that the total price is calculated according to the quantity
#    When I click the checkout button
#    Then I should see the payment screen pop up
#    When I click the proceed button I should see the payment completed

  @regression @pia @shoppingcart @VFALFT-14320 @ignore
    Scenario: Test Order Termination Pop-Up and Reason (Just Termination Acticity included)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product for Purchasable Resources
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "41" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click "Deactivation" button for Product Widget
    Then I should be seeing that "Upsell" for Tab
    And  I should be seeing that "Voluntary Deactivation" for Tab
    And  I should be seeing that "Renewal" for Tab
    When I click "Voluntary Deactivation" for Deactivation Process
    When I click "Waive" for Product widget
    When I click "Waive" for Product widget
    And  I should be seeing that "Agreement deactivated successfully!" for Tab


  @regression @pia @shoppingcart @VFALFT-14644 @ignore
    Scenario: Test Adding the paymentcycle filed to the SHC checkout screen
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I get Migration Customer "individual", "10", "id"
    And  I enter "" value on Search field and click Search button for Migration
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    When I select a value "ALL4,050 3Month" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "ALL1,500 3Month" Product Term field
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    #When I click the "PROCEED" button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #When I click the "Customer360" button
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
    #And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click Payment button
    Then I should be seeing that the Shopping Cart Page
    #When i click on payment cycle i should see i can pay monthly product installments
    #When I click on the payment cycle I should see that I can change the monthly product installments

  @regression @pia @shoppingcart @VFALFT-16363 @smokep
    Scenario: Agreement-Deactivation-Upsell
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product for Purchasable Resources
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "32" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I wait "45000" millisecond to process
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Akses Fee per Modem" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click "Deactivation" button for Product Widget
    And  I should be seeing that "Pick your deactivation reason" for Tab
    Then I should be seeing that "Upsell" for Tab
    And  I should be seeing that "Voluntary Deactivation" for Tab
    And  I should be seeing that "Renewal" for Tab
    When I click "Upsell" for Deactivation Process
    When I click "Ok" for Product widget
    When I click "Ok" for Product widget
    And  I should be seeing that "Agreement deactivated successfully!" for Tab
    And  I wait "90000" millisecond to process
    And  I click "Agreement" Tab for Customer360 Page
    #And  I should be seeing that "terminate" for Tab


  @regression @pia @shoppingcart @VFALFT-16364 @smokep
    Scenario: Agreement-Deactivation-Voluntary Deactivation / Charge
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product for Purchasable Resources
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "33" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I wait "45000" millisecond to process
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Akses Fee per Modem" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click "Deactivation" button for Product Widget
    And  I should be seeing that "Pick your deactivation reason" for Tab
    Then I should be seeing that "Upsell" for Tab
    And  I should be seeing that "Voluntary Deactivation" for Tab
    And  I should be seeing that "Renewal" for Tab
    When I click "Voluntary Deactivation" for Deactivation Process
    When I click "Charge" for Product widget
    When I click "Charge" for Product widget
    And  I should be seeing that "Agreement deactivated successfully!" for Tab
    And  I wait "90000" millisecond to process
    And  I click "Agreement" Tab for Customer360 Page
    #And  I should be seeing that "terminate" for Tab


  @regression @pia @shoppingcart @VFALFT-16365 @smokep
    Scenario: Agreement-Deactivation-Voluntary Deactivation / Waive
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product for Purchasable Resources
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "34" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I wait "45000" millisecond to process
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Akses Fee per Modem" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click "Deactivation" button for Product Widget
    And  I should be seeing that "Pick your deactivation reason" for Tab
    Then I should be seeing that "Upsell" for Tab
    And  I should be seeing that "Voluntary Deactivation" for Tab
    And  I should be seeing that "Renewal" for Tab
    When I click "Voluntary Deactivation" for Deactivation Process
    When I click "Waive" for Product widget
    When I click "Waive" for Product widget
    And  I should be seeing that "Agreement deactivated successfully!" for Tab
    And  I wait "90000" millisecond to process
    And  I click "Agreement" Tab for Customer360 Page
    #And  I should be seeing that "terminate" for Tab



  @regression @pia @shoppingcart @VFALFT-16366 @smokep
    Scenario: Agreement-Deactivation-Renewal
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product for Purchasable Resources
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "35" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I wait "45000" millisecond to process
    And  I get Intallation Ticket Id
    And  I Create Shopping Cart Active Status
      |status  |
      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Akses Fee per Modem" for Product Tab
    And  I should be seeing that "active" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click "Deactivation" button for Product Widget
    And  I should be seeing that "Pick your deactivation reason" for Tab
    Then I should be seeing that "Upsell" for Tab
    And  I should be seeing that "Voluntary Deactivation" for Tab
    And  I should be seeing that "Renewal" for Tab
    When I click "Renewal" for Deactivation Process
    When I click "Ok" for Product widget
    When I click "Ok" for Product widget
    And  I should be seeing that "Agreement deactivated successfully!" for Tab
    And  I wait "90000" millisecond to process
    And  I click "Agreement" Tab for Customer360 Page
    #And  I should be seeing that "terminate" for Tab

  @regression @pia @shoppingcart @VFALFT-16367 @smokep
    Scenario: Fiscalization Receipst-Refund
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "F4441304" value on Search field and click Search button for Migration Customer
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Fiscalization Receipts" Tab for Customer360 Page
    And  I should be seeing that "Refund" for Product Tab
    And  I should be seeing that "Products" for Product Tab
    And  I should be seeing that "Invoice Date" for Product Tab
    And  I should be seeing that "Payment Type" for Product Tab
    And  I should be seeing that "Invoice ID" for Product Tab
    And  I should be seeing that "Invoice Amount" for Product Tab
    And  I should be seeing that "Agreement Id" for Product Tab
    And  I should be seeing that "Payment Method" for Product Tab
    And  I wait "3000" millisecond to process
    When I click "Refund" for Product widget
    When I click the "Yes" button
    And  I should be seeing that "Refund has successfully completed" for Product Tab


  @regression @pia @shoppingcart @VFALFT-16379 @smokep
    Scenario: Show Modem Status
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "36" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
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
    And  I should be seeing that "Akses Fee per Modem Basic" for Product Tab
    And  I should be seeing that "active" for Product Tab
    When I click "Akses Fee per Modem Basic" for Product widget
    When I click "Show Modem Status" button for Product Widget
    #Then I should be seeing that "crm.abcom.al"  Page Url


  @regression @pia @shoppingcart @VFALFT-16383 @smokep
    Scenario: Change Device
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
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "37" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Given I have opened the "Customer Management" application
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
    And  I should be seeing that "active" for Product Tab
    And  I should be seeing that "Vodafone Gigafibra 50 Mbps" for Product Tab
    When I click "Modem Basic" for Product widget
    When I click "Change Device" button for Product Widget
    When I click "Upsell" for Product widget
    When I click "Proceed" for Product widget
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the "Modem Basic" button
    When I select a value "random" Product Term field
    When I enter a value "0024d1822c83" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page


  @regression @pia @shoppingcart @VFALFT-16823 @smokep
    Scenario: Manuel Order-Create Manuel Order
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "38" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
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
    When I click "Vodafone Gigafibra 50 Mbps" for Product widget
    When I click "Manual Order" button for Product Widget
    And  I wait "2000" millisecond to process
    When I click "Create Manual Order" for Manual Order
    And  I should be seeing that "Manual Order created successfully!" for Product Tab
    And  I should be seeing that "Product Name" for Product Tab
    And  I should be seeing that "Created Date" for Product Tab
    And  I should be seeing that "Status" for Product Tab
    And  I should be seeing that "Customer Number" for Product Tab
    And  I should be seeing that "Inventory Status" for Product Tab
    And  I should be seeing that "Product Type" for Product Tab
    And  I should be seeing that "Created User" for Product Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Manuel Order Activate" for Product Tab

  @regression @pia @shoppingcart @VFALFT-16919 @smokep
    Scenario: Manuel Order-Suspend
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "39" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
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
    When I click "Vodafone Gigafibra 50 Mbps" for Product widget
    When I click "Manual Order" button for Product Widget
    And  I wait "2000" millisecond to process
    When I click "Suspend" for Manual Order
    And  I should be seeing that "Manual Order suspend successfully!" for Product Tab
    And  I should be seeing that "Suspend" for Product Tab


  @regression @pia @shoppingcart @VFALFT-17213 @smokep
  Scenario: Manuel Order-Resume
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I get Order Completed Customer
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button for Order Completed Customer
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    When I click "Vodafone Gigafibra 50 Mbps" for Product widget
    When I click "Manual Order" button for Product Widget
    And  I wait "2000" millisecond to process
    When I click "Resume" for Manual Order
    And  I should be seeing that "Manual Order resume successfully!" for Product Tab
    And  I should be seeing that "Resume" for Product Tab

  @regression @pia @shoppingcart @VFALFT-xxxx @smokep
  Scenario: Prepaid Old Debts Pay
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "F4402340" value on Search field and click Search button for Migration Customer
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click on the Pay button
    And  I select a value "CASH" in the Payment Method field for Debt Pay
    And  I click the Payment Collected for Debt Pay
    When I click on the "Proceed" button


  @regression @pia @shoppingcart @VFALFT-17215 @ignore
  Scenario: Purchaseble Inventory for Postpaid
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I get Order Completed Customer
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button for Order Completed Customer
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    #When I select a value "FIBER" in the InternetInfrastructure field for Inventory
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page


  @regression @pia @shoppingcart @VFALFT-17216 @ignore
  Scenario: Purchaseble Inventory for Prepaid
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I get Order Completed Customer
    When I select the "Customer ID" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button for Order Completed Customer
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "Vodafone Gigafibra 30 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" Offer product is selected
    #When I select a value "FIBER" in the InternetInfrastructure field for Inventory
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    When I click the "PROCEED" button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page