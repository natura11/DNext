#language: en

Feature: Customer 360

  @regression @pia @customer360 @VFALFT-12490 @smokep
    Scenario: Test FE 360 Create Support Ticket for Product
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
    When I select "Vodafone Gigafibra 100 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 100 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    #When I enter a value "1" in the MacAddress field
    When I click  the "Tarife Instalimi" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    When I click the Add to Cart button
    When I click Shopping Cart Button
    Then I should be seeing that "Vodafone Gigafibra 100 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click Load Ticket button
    And  I get Intallation Ticket Id
#    And  I Create Shopping Cart Active Status
#      |status  |
#      |passed  |
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    When I click "Product" Tab for Customer360 Page
    Then I should be seeing that "Modem Basic" for Product Tab
    When I click "Modem Basic" for Product widget
    And  I should be seeing that "Create Support Ticket" field is displayed for Product Widget
    When I click "Create Support Ticket" button for Product Widget
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I select value "Kthim pajisje" in the Case Type field
    And  I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my kthim pajisje." in the Body field
    When I click update button
    Then I should be seeing "New ticket added successfully!" alert popup message


  @regression @pia @customer360 @VFALFT-12726 @ignore
    Scenario: Test FE Search Engine extended with resource characteristics as IP
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP -if static ip used", "Fix Phone Number" values are displayed
    When I select the "IP -if static ip used" value from Select Search Type DropdownList
    When I enter "80.78.70.130" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list


  @regression @pia @customer360 @VFALFT-12731 @smoke
    Scenario: Test FE Search Engine extended with resource characteristics as IP Negative
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP -if static ip used", "Fix Phone Number" values are displayed
    When I select the "IP -if static ip used" value from Select Search Type DropdownList
    When I enter "10.0.0.111" value on Search field and click Search button
    Then I should be seeing the popup alert message "Customer Not Found!" for Customer360 Page


  @regression @pia @customer360 @VFALFT-12732 @ignore
  Scenario: Test FE Search Engine extended with resource characteristics as Mac Address
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP -if static ip used", "Fix Phone Number" values are displayed
    When I select the "Mac Of Device" value from Select Search Type DropdownList
    When I enter "DC537C02B374" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list


  @regression @pia @customer360 @VFALFT-12733 @smoke
  Scenario: Test FE Search Engine extended with resource characteristics as Mac Address Negative
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP -if static ip used", "Fix Phone Number" values are displayed
    When I select the "Mac Of Device" value from Select Search Type DropdownList
    When I enter "AA:AA:GG:CC" value on Search field and click Search button
    Then I should be seeing the popup alert message "Customer Not Found!" for Customer360 Page


  @regression @pia @customer360 @VFALFT-12822 @smokep
    Scenario: Test 360 Orders View for Individual Customer
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
    When I click  the "Tarife Instalimi" Add-on product
    When I select a value "random" Product Term field for Purchasable  Addons
    #When I enter a value "2" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
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
    And  I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" for Tab
    Then I should be seeing that "Order Status" for Tab
    Then I should be seeing that "Order Date" for Tab
    Then I should be seeing that "Order Item ID" for Tab
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Parent" for Tab
    Then I should be seeing that "Using Resource" for Tab
    When I click "Akses Fee per Modem Basic" widget
    Then I should be seeing that "Order Detail" field is displayed for Widget
    Then I should be seeing that "Order Info" field is displayed for Widget
    Then I should be seeing that "Order Id" field is displayed for Widget
    Then I should be seeing that "Order Date" field is displayed for Widget
    Then I should be seeing that "Payment Method" field is displayed for Widget
    Then I should be seeing that "Invoice" field is displayed for Widget
    Then I should be seeing that "Order Status" field is displayed for Widget
    Then I should be seeing that "Order Items" field is displayed for Widget
    Then I should be seeing that "Order Item ID" field is displayed for Widget
    Then I should be seeing that "Name" field is displayed for Widget
    Then I should be seeing that "Quantity" field is displayed for Widget
    Then I should be seeing that "Price" field is displayed for Widget


  @regression @pia @customer360 @VFALFT-12823 @uat
    Scenario: Test 360 Orders View for Corporate Customer
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
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
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
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" for Tab
    Then I should be seeing that "Order Status" for Tab
    Then I should be seeing that "Order Date" for Tab
    Then I should be seeing that "Order Item ID" for Tab
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Product Name" for Tab
    Then I should be seeing that "Parent" for Tab
    Then I should be seeing that "Using Resource" for Tab
    When I click "Vodafone Gigafibra 30 Mbps" widget
    Then I should be seeing that "Order Detail" field is displayed for Widget
    Then I should be seeing that "Order Info" field is displayed for Widget
    Then I should be seeing that "Order Id" field is displayed for Widget
    Then I should be seeing that "Order Date" field is displayed for Widget
    Then I should be seeing that "Payment Method" field is displayed for Widget
    Then I should be seeing that "Invoice" field is displayed for Widget
    Then I should be seeing that "Order Status" field is displayed for Widget
    Then I should be seeing that "Customer Info" field is displayed for Widget
    Then I should be seeing that "Customer Name" field is displayed for Widget
    Then I should be seeing that "Country" field is displayed for Widget
    Then I should be seeing that "State/Region" field is displayed for Widget
    Then I should be seeing that "Address" field is displayed for Widget
    Then I should be seeing that "Order Items" field is displayed for Widget
    Then I should be seeing that "Order Item ID" field is displayed for Widget
    Then I should be seeing that "Name" field is displayed for Widget
    Then I should be seeing that "Quantity" field is displayed for Widget
    Then I should be seeing that "Price" field is displayed for Widget
    #Then I should be seeing that "200 ALL" field is displayed for Widget
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Widget
    Then I should be seeing that "1" field is displayed for Widget
    Then I should be seeing that "BERAT" field is displayed for Widget
    Then I should be seeing that "TESTCORP" field is displayed for Widget


  @regression @pia @customer360 @VFALFT-12920 @smokep
    Scenario: Test 360 Shopping Carts View-For Enterprise Customer
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
    When I enter a value "3" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" field is displayed for Widget
    Then I should be seeing that "Channel" field is displayed for Widget
    Then I should be seeing that "Billing Account Name" field is displayed for Widget
    Then I should be seeing that "Agreement Id" field is displayed for Widget
    Then I should be seeing that "Product Name" field is displayed for Widget
    Then I should be seeing that "Total Price" field is displayed for Widget
    Then I should be seeing that "active" field is displayed for Widget
    Then I should be seeing that "Modem Basic" field is displayed for Widget


  @regression @pia @customer360 @VFALFT-12919
    Scenario: Test 360 Shopping Carts View - For Individual Customer
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
    When I select a value "24MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    #Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Shopping Cart" Tab for Customer360 Page
    Then I should be seeing that "Status" for Tab
    Then I should be seeing that "Channel" for Tab
    Then I should be seeing that "Billing Account" for Tab
    Then I should be seeing that "Shopping Cart ID" for Tab
    Then I should be seeing that "Total Price" for Tab
    When I click Shopping Cart Panel
    Then I should be seeing that "Status" field is displayed for Widget
    Then I should be seeing that "Channel" field is displayed for Widget
    Then I should be seeing that "Billing Account Name" field is displayed for Widget
    Then I should be seeing that "Agreement Id" field is displayed for Widget
    Then I should be seeing that "Product Name" field is displayed for Widget
    Then I should be seeing that "Total Price" field is displayed for Widget
    Then I should be seeing that "active" field is displayed for Widget
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" field is displayed for Widget



  @regression @pia @customer360 @VFALFT-14299 @smokep
    Scenario: Test Fix Agreement view in 360
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
    When I enter a value "4" in the MacAddress field
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    And  I have opened the "Customer Management" application
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
    And  I click "Agreement" Tab for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
#    And  I should be seeing the popup alert message "in process" for Customer360 Page
#    And  I should be seeing the popup alert message "Commitment" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    And  I should be seeing "Start Date" for Agreement Detail Page
    And  I should be seeing "End Date" for Agreement Detail Page
    And  I should be seeing "Agreement Type" for Agreement Detail Page
    And  I should be seeing "Customer Name" for Agreement Detail Page


  @regression @pia @customer360 @VFALFT-14251 @smoke
    Scenario: Test There should be a link on DSales UI for the Customer360 (Individual)
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
    When I click the Customer360 link button
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab


  @regression @pia @customer360 @VFALFT-14252 @smoke
    Scenario: Test There should be a link on DSales UI for the Customer360 (Enterprise)
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
    When I click the Customer360 link button
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab


  @regression @pia @customer360 @VFALFT-14253
    Scenario: Test There should be a link on DSales UI for the Customer360 (Institute)
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
    When I click the Customer360 link button
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab


  @regression @pia @customer360 @VFALFT-17029 @smoke
    Scenario: Create Interaction for UI
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
    And  I click more vert icon for Interaction Field
    And  I click Create button for Interaction Field
    Then I should be seeing "Interactions Details" page
    When I select value "Interaction - Fix Informational" in the Case Type field
    And  I select value "My Contract" in the Sub Types field for Interaction
    And  I click create button
    And  I should be seeing that "Interaction created successfully!" for Tab
    And  I should be seeing that "Interaction - Fix Informational" for Tab
    And  I should be seeing that "My Contract" for Tab



