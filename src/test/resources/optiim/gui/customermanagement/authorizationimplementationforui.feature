#language: en

Feature: Authorization implementation for UI

  @regression @pia @authorizationimplementationforui @VFALFT-15195
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(deactivation_role)
    Given I have opened the "Customer Management" application
    When I enter a value "ufuk.akay" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    When I click "Product" Tab for Customer360 Page
    Then I should be seeing that "Digitalb Premium" for Product Tab
    When I click "Modem Basic" for Product widget
    When I click "Deactivation" button for Product Widget


  @regression @pia @authorizationimplementationforui @VFALFT-15196 @smoke
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360) (create_customer)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup1" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And I should be not seeing "Create Individual Customer" page
    And I should be not seeing "Create Enterprise Customer" page
    And I should be not seeing "Create Institute Customer" page

  @regression @pia @authorizationimplementationforui @VFALFT-15212
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(create_submit_order)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup4" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    Then I should not seeing new order buttons because it doesn't have the create_submit_order role for Account Tab


  @regression @pia @authorizationimplementationforui @VFALFT-15213
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(create_shopping_cart)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup3" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    Then I should not seeing new order buttons because it doesn't have the create_submit_order role for Account Tab
    And I should be not seeing "Shopping Cart" page

  @regression @pia @authorizationimplementationforui @VFALFT-15214
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(create_trouble_tickets)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup3" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    Then I should be seeing "Trouble Tickets" page
    When I click main move vert icon
    Then I should be seeing "Refresh" page
    #And I should be not seeing "Create" page


  @regression @pia @authorizationimplementationforui @VFALFT-15234 @smoke
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(agreement_detail_view)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup4" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    And I should be not seeing "Agreement" page


  @regression @pia @authorizationimplementationforui @VFALFT-15235 @smoke
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(see_created_shopping_carts)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup3" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    And I should be not seeing "Shopping Cart" page


  @regression @pia @authorizationimplementationforui @VFALFT-15236
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(see_postpaid_bills)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup3" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    #And I should be not seeing "Invoice" page

  @regression @pia @authorizationimplementationforui @VFALFT-15237
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(attachment_view_role)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup3" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    And  I click "Document" Tab for Customer360 Page
    Then I should not seeing download and view buttons because it doesn't have the attachment_view_role role for Document Tab


  @regression @pia @authorizationimplementationforui @VFALFT-15238
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(update_trouble_tickete)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup5" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    #Then I should see that the price field will be read-only since it doesn't have the "update_trouble_tickete" role.

  @regression @pia @authorizationimplementationforui @VFALFT-15239
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(view_inst_status_details)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup4" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    #And I should be not seeing "Details" page



  @regression @pia @authorizationimplementationforui @VFALFT-15240
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(edit_cust_details)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup4" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    Then I should not seeing edit buttons because it doesn't have the edit_cust_details role for Individual Party Info
    And  I click "Account" Tab for Customer360 Page
    Then I should not seeing edit buttons because it doesn't have the edit_cust_details role for Address Tab
    And  I click "Contact" Tab for Customer360 Page
    Then I should not seeing update buttons because it doesn't have the edit_cust_details role for Contact Tab


  @regression @pia @authorizationimplementationforui @VFALFT-15243
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(sms_validation_bypass)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup5" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    Then I should not be seeing send pin button in general information field, because it have the sms_validation_bypass role.

  @regression @pia @authorizationimplementationforui @VFALFT-15241
    Scenario: Test User Role Managemet ( FE ) Dsales(create_agreement)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup5" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    When I select "DIGITALB PREMIUM" product and click
    Then I should be seeing that the Product Configuration UI is opened
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    And I should not seeing checkout button because it doesn't have the create_agreement role


  @regression @pia @authorizationimplementationforui @VFALFT-15242
    Scenario: Test User Role Managemet ( FE ) Dsales(price_overwrite)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup5" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
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
    When I select "DIGITALB PREMIUM" product and click
    Then I should be seeing that the Product Configuration UI is opened
    When I select a value "12MonthCommitment" Product Term field
    When I click "Authorize Edit" button for Product Details Page
    Then I should see that the price field will be read-only since it doesn't have the price_overwrite role.


  @regression @pia @authorizationimplementationforui @VFALFT-15393
    Scenario: Test User Role Managemet ( FE ) - BackOffice
    Given I have opened the "Back Office" application
    When I enter a value "role.grup5" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
    Then I should be seeing that the "UNAUTHORIZED !401!" page


  @regression @pia @authorizationimplementationforui @VFALFT-15438 @smoke
    Scenario: Test ViewProcess from the options at Backoffice task view
    Given I have opened the "Back Office" application
    When I enter a value "gerta.vathi" in the UserName field
    And  I enter a value "12345" in the Password field
    And  I click the login button for Login Page
    Then I should be seeing that the "All Tasks" page
    When I click on related customer from task list
    When I click "ViewProcess" button for Product Widget


  @regression @pia @authorizationimplementationforui @VFALFT-15672 @smoke
    Scenario: Test User Role Management ( FE ) DCRM (Customer 360)(view_all_customers)
    Given I have opened the "Customer Management" application
    When I enter a value "role.grup2" in the UserName field
    And  I enter a value "1234" in the Password field
    And  I click the login button for Login Page
    Then I should be seeing that the "UNAUTHORIZED !401!" page






