#language: en

Feature: Sell VTV Offer

  @regression @pia @sellvtvoffer @VFALFT-10314
  Scenario: Test Present Vodafone TV offer in Dsales
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
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    #When I click the Edit button to update customer Service Address
    #Then I should be seeing that the Edit Service Address of the Customer page can be opened
    #And  I should be seeing that "Address Line 1", "Address Line 2", "Country", "City" fields are displayed
    #When I click Close button for Product Page
    #When I update Service Address of the Customer page
    #Then I should be seeing that different address updated on Service Address of the Customer
    #And  I should be seeing that product list is related to the new Service Address
    When I enter a value "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" in the Search Product field
    Then I should be seeing that "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" in the Search Product list
    When I enter a value " " in the Search Product field
    #Then I should be seeing that " " in the Search Product list
    When I enter a value "2N1 TV VOD TRING MINI SPORTE - 1M" in the Search Product field
    Then I should be seeing that "2N1 TV VOD TRING MINI SPORTE - 1M" in the Search Product list
    When I click Close button for Product Page
    And  I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    #When I check the filter of the products  with “Speed“ ,“Minute“ ,“Price“ parameters
    #Then I should be seeing that filter of the products parameters
    #When I check the value "Speed" field
    #Then I should be seeing that value of "speed" is shown
    #When I check the value "Minute" field
    #Then I should be seeing that value of "Minute" is shown
    #When I check the value "Price" field
    #Then I should be seeing that value of "Price" is shown
    When I select "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    #And  I should be seeing that "VodafoneTVDefaultUserId", "VodafoneTVHouseHoldUserId", "VodafoneTVOttMasterUserId", "VodafoneTVOttUserPassword", "VodafoneTVSubscriptionid" fields are displayed
    #When I select a value "12 Month Commitment" Product Term field
    #Then I should be seeing that "A$200.00" in the Payment Plan field


  @regression @pia @sellvtvoffer @VFALFT-10322
  Scenario: Test Delete Vodafone TV offer to Shopping Cart
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
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" product and click
    Then I should be seeing that the Product Configuration UI is opened
#    And  I select a value "ABEL" in TVInfrastructure field
#    When I select a value "12 Month Commitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "TV - Vodafone TV Prime - 1V-Cat-Acq" my selected additional product is displayed
    When I select the product and delete for Shopping Cart Page
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted


  @regression @pia @sellvtvoffer @VFALFT-10317
  Scenario: Test Add Vodafone TV offer to Shopping Cart
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
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #Then I should be seeing that "VodafoneTVDefaultUserId", "VodafoneTVHouseHoldUserId", "VodafoneTVOttMasterUserId", "VodafoneTVOttUserPassword", "VodafoneTVSubscriptionid" fields are displayed
#    And  I select a value "ABEL" in TVInfrastructure field
#    When I select a value "12 Month Commitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "TV - Vodafone TV Prime - 1V-Cat-Acq" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #Then I should be seeing that "VodafoneTVDefaultUserId", "VodafoneTVHouseHoldUserId", "VodafoneTVOttMasterUserId", "VodafoneTVOttUserPassword", "VodafoneTVSubscriptionid" fields are displayed
#    And  I select a value "ABEL" in TVInfrastructure field
#    When I select a value "12 Month Commitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "TV - Vodafone TV Prime - 1V-Cat-Acq" my selected additional product is displayed
    #When I select a dummy product and click the Add to Cart button
    #Then I should be seeing that I can add the dummy product in the Shopping Cart


  @regression @pia @sellvtvoffer @VFALFT-10325
  Scenario: Test Negative Scenarios Add Vodafone TV offer to Shopping Cart
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
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "TV - VODAFONE TV PRIME - 1V-CAT-ACQ" product and click
    Then I should be seeing that the Product Configuration UI is opened
    And  I should be seeing that "Predefined Characteristic" for Product Detail page
    And  I should be seeing that "Product Term" for Product Detail page
    #Then I should be seeing that "VodafoneTVDefaultUserId", "VodafoneTVHouseHoldUserId", "VodafoneTVOttMasterUserId", "VodafoneTVOttUserPassword", "VodafoneTVSubscriptionid" fields are displayed
#    And  I select a value "ABEL" in TVInfrastructure field
#    When I select a value "12 Month Commitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "TV - Vodafone TV Prime - 1V-Cat-Acq" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    #When I select "APPLE CHARGER" product and click
    #Then I should be seeing the popup alert message "No suitable term is available" for Products Page