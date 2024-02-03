#language: en

Feature: Deactivate Product as an API

  @regression @pia @deactiveproductasanap @VFALFT-10869
    Scenario: Test Deactivation order creation BE for UI triggering
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    When I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Billing Account Status" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Account Number" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Activation Date" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Billing Address" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Payment Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    #Given the Billing Account Status is active
    #When I click three dots is opened menu and "Deactivate" select
    #Then I should be seeing deactivate process started toast message
    #When I select and check customer Billing Account Status
    #Then I should be seeing changed Billing Account Status



  @regression @pia @deactiveproductasanap @VFALFT-10673
    Scenario: Test Deactivation triggering from UI for Simple Product (Corporate Customer)
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
    And  I should be seeing that "active" for Product Tab
    When I click "Modem Basic" for Product widget
    And  I click "Deactivation" button for Product Widget
    #And  I click "OK" for Product widget
    Then I should be seeing that "Deactivation Process is started" Offer product is selected
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Terminate" for Product Tab
    #When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    #And  I click "Deactivation" button for Product Widget
    #And  I click "OK" for Product widget



  @regression @pia @deactiveproductasanap @VFALFT-10674 @ignore
    Scenario: Test Deactivation triggering from UI for Simple Product (Residential Customer)
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
    #And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    # And  I should be seeing that "active" for Product Tab
    When I click "Modem Basic" for Product widget
    And  I click "Deactivation" button for Product Widget
    #And  I click "OK" for Product widget
    Then I should be seeing that "Deactivation Process is started" Offer product is selected
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Terminate" for Product Tab





  @regression @pia @deactiveproductasanap @VFALFT-10675
    Scenario: Test Deactivation triggering from UI for Bundle Product (Corporate Customer)
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
    When I select "GIGAFIBRA PRO 1 GBPS - IP" product and click
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    #When I select a value "24 x ALL10,000 / MONTHLY" Product Term field
    When I click  the "GigaFibra Pro 1000-100 Mbps" Add-on product
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" my selected additional product is displayed
    Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
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
    And  I should be seeing that "GigaFibra Pro 1 Gbps - IP" for Product Tab
    And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "GigaFibra Pro 1 Gbps - IP" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated


  @regression @pia @deactiveproductasanap @VFALFT-10676
    Scenario: Test Deactivation triggering from UI for Bundle Product (Residential Customer)
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
    When I select "GIGAFIBRA PRO 1 GBPS - IP" product and click
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    #When I select a value "24 x ALL10,000 / MONTHLY" Product Term field
    When I click  the "GigaFibra Pro 1000-100 Mbps" Add-on product
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "GigaFibra Pro 1 Gbps - IP" my selected additional product is displayed
    Then I should be seeing that "GigaFibra Pro 1000-100 Mbps" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
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
    And  I should be seeing that "GigaFibra Pro 1 Gbps - IP" for Product Tab
    And  I should be seeing that "GigaFibra Pro 1000-100 Mbps" for Product Tab
    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
#    And  I should be seeing that "active" for Product Tab
    When I click "GigaFibra Pro 1 Gbps - IP" for Product widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #When I click on "No" button on warning and confirmation message pop-up screen
    #Then I should be seeing that deactivation operation is not be applied
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing that a warning and confirmation message is displayed
    #Then I should be seeing that “Product Order Note“ field is displayed as a textbox and an optional field
    #When I enter a value "Deactivation for Test of a Bundle Product" for  “Product Order Note“ field
    #Then I should be seeing that “Product Order Note“ field can be filled
    #When I click on "Yes" button on warning and confirmation message pop-up screen
    #Then I should be seeing that related bundle Products are deactivated and represented with red colour
    #Then I should be seeing that all the Products in the Bundle are deactivated
    #Then I should be seeing that Add-on Product and all products under the bundle are deactivated

  @regression @pia @deactiveproductasanap @VFALFT-10940
    Scenario: Testing of end to end "Deactivation order creation"
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
    When I select "MODEM PREMIUM" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Modem Premium" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #When I check the SI-BPMN on the BE side
    #Then I should be seeing that the steps automatically advance
    And  I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Billing Account & Products" widget
    Then I should be seeing that the "Billing Account & Products" widget is opened
    #And  I should be seeing that "Billing Account Status" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Account Number" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Activation Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Address" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Type" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    When I click the Products Panel for Billing Account & Products Widget
    When I click "Deactivation" button for Product Widget
    #Then I should be seeing process started toast message
    #When I select and check customer Billing Account Status
    #Then I should be seeing changed Billing Account Status