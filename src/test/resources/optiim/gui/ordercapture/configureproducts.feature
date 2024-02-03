#language: en

Feature: Configure Products


  @regression @pia @configureproducts @VFALFT-9949 @ignore
  Scenario: Test Add Vodafone TV Offer to Shopping Card
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
    When I select "VODAFONE TV PRIME" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone TV Prime" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "MODEMPRODUCTOFFERING" product and click
    Then I should be seeing the popup alert message "No suitable term is available" for Products Page



  @regression @pia @configureproducts @VFALFT-9950
  Scenario: Test Delete Vodafone TV Offer to Shopping Card
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
    When I select "DIGITALB PREMIUM" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    When I select the product and delete for Shopping Cart Page
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted


  @regression @pia @configureproducts @VFALFT-9951 @ignore
  Scenario: Test Present Vodafone TV Offer in DSales
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
    When I enter a value "VODAFONE TV PRIME" in the Search Product field
    Then I should be seeing that "VODAFONE TV PRIME" in the Search Product list
    And  I click Close button for Product Page
    And  I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    #When I check the filter of the products  with “Speed“ ,“Minute“ ,“Price“ parameters
    #Then I should be seeing that filter of the products parameters
    #When I check the value "Speed" field
    #Then I should be seeing that value of "speed" is shown
    #When I check the value "Minute" field
    #Then I should be seeing that value of "Minute" is shown
    #When I check the value "Price" field
    #Then I should be seeing that value of "Price" is shown
    When I select "VODAFONE TV PRIME" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    When I select a value "12MonthCommitment" Product Term field
    #Then I should be seeing that "12 x ALL400 / MONTHLY" in the Payment Plan field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    #When I select a value "Cash" Product Term field


  @regression @pia @configureproducts @VFALFT-12516 @ignore
    Scenario: Test Configure Distinct Products for Prepaid
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
    #Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page

