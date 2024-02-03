#language: en

Feature: Revisions for Customer Management

  @regression @pia @revisionsforcustomermanagement @VFALFT-11202
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - FE for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    And  I should be seeing that baseType and type are displayed as "Individual"

  @regression @pia @revisionsforcustomermanagement @VFALFT-11219
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - FE for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    And  I should be seeing that baseType and type are displayed as "Organization"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11220
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - FE for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    And  I should be seeing that baseType and type are displayed as "Organization"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11184
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - BE for Residential Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    And  I should be seeing that baseType and type are displayed as "Individual"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11226
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - BE for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    And  I should be seeing that baseType and type are displayed as "Organization"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11225
  Scenario: Test Moving the EngagedParty entity from RelatedParty to PartyRef - BE for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    And  I should be seeing that baseType and type are displayed as "Organization"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11321
  Scenario: Test FE-FullName Information of the Customer for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    #Then I should be seeing that the Name field is displayed as Full Name for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-11320 @smoke
  Scenario: Test FE-FullName Information of the Customer for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that the Name field is displayed as Full Name for Corporate Customer

  @regression @pia @revisionsforcustomermanagement @VFALFT-11319 @smoke
  Scenario: Test FE-FullName Information of the Customer for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    Then I should be seeing that the Name field is displayed as Full Name


  @regression @pia @revisionsforcustomermanagement @VFALFT-11496 @smoke
  Scenario: Test FE-Individual Customer Status Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "Prospect" for Tab
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "40" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
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
    Then I should be seeing that "Customer Information" for Tab
      Then I should be seeing that "Prospect" for Tab



  @regression @pia @revisionsforcustomermanagement @VFALFT-11497 @smokep
  Scenario: Test FE-Corporate Customer Status Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "Prospect" for Tab
    And  I click "Account" Tab for Customer360 Page
    When I click on the "Postpaid" button
    When I click on the "more_vert" button
    When I click on the "Edit" button
    And  I select a value "Cash" in the Payment Method field
    When I click on the "Save" button
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "0" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    #Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "Prospect" for Tab



  @regression @pia @revisionsforcustomermanagement @VFALFT-11498
  Scenario: Test FE-Institute Customer Status Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "Prospect" for Tab
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
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that "Prospect" for Tab



  @regression @pia @revisionsforcustomermanagement @VFALFT-11622 @ignore
  Scenario: Test FE- Individual- Customer 360 display - Since Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field


  @regression @pia @revisionsforcustomermanagement @VFALFT-11623 @ignore
  Scenario: Test FE- Corporate- Customer 360 display - Since Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-11624 @ignore
  Scenario: Test FE- Institute- Customer 360 display - Since Information
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-11629 @ignore
  Scenario: Test BE - Individual-Customer Since Information is required
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field


  @regression @pia @revisionsforcustomermanagement @VFALFT-11630 @ignore
  Scenario: Test BE - Corporate-Customer Since Information is required
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-11631 @ignore
  Scenario: Test BE -Institute- Customer Since Information is required
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    Then I should be seeing that "name" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "value" value is displayed on the BE side for Characteristic field for Corporate Customer
    Then I should be seeing that "valueType" value is displayed on the BE side for Characteristic field for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-11362
  Scenario: Test Corporate Customer FE-Billing Account Status
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab
    #Then I should be seeing that "Main Page", "Product", "Order", "Hierarchy" in the Residential Customer 360 Degree View Page
    And  I should be seeing that Main Page includes "General", "Address" and "Contact" tabs
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    #Then I should be seeing that stauts of Invoice Account will be set to"Defined" while creation
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a grey colour
    #Then I should be seeing the Invoice Account stauts should be set to "Active"
    #Then I should be seeing the the colour of the Billing Account Status line is displayed as a green color
    #Then I should be seeing the Invoice Account status should be set to "Inactive"
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a Red colour


  @regression @pia @revisionsforcustomermanagement @VFALFT-11363
  Scenario: Test Institute Customer FE-Billing Account Status
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab
    #Then I should be seeing that "Main Page", "Product", "Order", "Hierarchy" in the Residential Customer 360 Degree View Page
    And  I should be seeing that Main Page includes "General", "Address" and "Contact" tabs
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    #Then I should be seeing that stauts of Invoice Account will be set to"Defined" while creation
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a grey colour
    #Then I should be seeing the Invoice Account stauts should be set to "Active"
    #Then I should be seeing the the colour of the Billing Account Status line is displayed as a green color
    #Then I should be seeing the Invoice Account status should be set to "Inactive"
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a Red colour



  @regression @pia @revisionsforcustomermanagement @VFALFT-11364 @smoke
  Scenario: Test Individual Customer FE-Billing Account Status
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Main Page" for Tab
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab
    #Then I should be seeing that "Main Page", "Product", "Order", "Hierarchy" in the Residential Customer 360 Degree View Page
    And  I should be seeing that Main Page includes "General", "Address" and "Contact" tabs
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    #Then I should be seeing that stauts of Invoice Account will be set to"Defined" while creation
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a grey colour
    #Then I should be seeing the Invoice Account stauts should be set to "Active"
    #Then I should be seeing the the colour of the Billing Account Status line is displayed as a green color
    #Then I should be seeing the Invoice Account status should be set to "Inactive"
    #Then I should be seeing the the colour of the Billing Account status line is displayed as a Red colour


  @regression @pia @revisionsforcustomermanagement @VFALFT-11492 @ignore
  Scenario: Test BE-Invoice Account Relationship
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    #Then I should be seeing that name is equal to InvoiceAccount between invoice account and customer



  @regression @pia @revisionsforcustomermanagement @VFALFT-11635
  Scenario: Test FE-Currency is required for the Invoice Account for Corporate Customers
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    Then I should be seeing that values of Currency field are "ALL", "EUR", "USD"
    When I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11509 @ignore
  Scenario: Test BE-Currency is required for the Invoice Account for Corporate Customers
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #Then I should be seeing that accountType is displayed as InvoiceAccount
    #Then I should be seeing that Currency is displayed with the correct value


  @regression @pia @revisionsforcustomermanagement @VFALFT-11512 @smoke
  Scenario: Test FE-Party Role - Customer 360 for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Authorized_Person" for Tab
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click the "Authorized_Person" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click the "Legal_Custodian" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click "Update" button for Product Widget
    Then I should be seeing that "First Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Document Type" for Tab
    #And  I click Cancel button for Identification Number
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field
    And  I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab in the Customer360 Page
    When I select the "Male" value from Gender DropdownList for Contact Tab in the Customer360 Page
    And  I select the "ANDORRAN" value from Citizenship DropdownList for Contact Tab in the Customer360 Page
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab in the Customer360 Page
    When I click Cancel File button for Individual Customer for General information TAB
    When I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing that "ERIC" "First Name" value updated for Widget
    Then I should be seeing that "DAMME" "Last Name" value updated for Widget





  @regression @pia @revisionsforcustomermanagement @VFALFT-11513
  Scenario: Test FE-Party Role - Customer 360 for Institute Customer
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
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    #When I click Edit button for Customer360 Page
    When I click "Update" button for Product Widget
    When I enter a value "Aslı" in the First Name field for Corporate Customer
    When I enter a value "Demir" in the Last Name field
    When I enter a value "Enver" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    #Then I should be seeing that "600000000" "Mobile Number" value updated for Widget
    #When I check the type field on the BE side
    #Then I should be seeing that PartyRole is displayed in the type field
    #When I check the name field in the relatedParty field
    #Then I should be seeing that Authorized Person of Aslan Bilen is displayed
    #When I check the role field in the relatedParty field
    #Then I should be seeing that Authorized Person is displayed
    #When I check the referredType field in the relatedParty field
    #Then I should be seeing that partyRole is displayed



  @regression @pia @revisionsforcustomermanagement @VFALFT-11514 @smoke
  Scenario: Test FE-Party Role - Customer 360 for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Update" button for Product Widget
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field
    When I enter a value "ENVER" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    #Then I should be seeing that "600000000" "Mobile Number" value updated for Widget

  @regression @pia @revisionsforcustomermanagement @VFALFT-11373 @ignore
  Scenario: Test FE-Party Role - Customer Create for Institute Customer Administrator
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    #When I check the name field on the BE side
    #Then I should be seeing that BASKENT UNIVERSITESI Administrator is displayed in the name field
    #When I check the type field on the BE side
    #Then I should be seeing that PartyRole is displayed in the type field
    #When I check the name field in the relatedParty field
    #Then I should be seeing that Administrator of BASKENT UNIVERSITESI is displayed
    #When I check the role field in the relatedParty field
    #Then I should be seeing that Administrator is displayed
    #When I check the referredType field in the relatedParty field
    #Then I should be seeing that partyRole is displayed
    #When I check the referredType in the engagedParty field
    #Then I should be seeing that Individual is displayed in the referredType field
    #When I check the name value in the engagedParty field
    #Then I should be seeing that Tugba Bilen is displayed in the name field


  @regression @pia @revisionsforcustomermanagement @VFALFT-11365
  Scenario: Test FE-Party Role - Customer Create for Individual Customer Authorized Person
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    #When I select a value Authorized Type : "Authorized Person"
    #And  I select a value Authorized Type : "Legal Custodian"
    #And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11372
  Scenario: Test FE-Party Role - Customer Create for Corporate Customer Administrator
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that "name" value is displayed on the BE side for Engaged Party field
    Then I should be seeing that "type" value is displayed on the BE side for Engaged Party field
    Then I should be seeing that "referredType" value is displayed on the BE side for Engaged Party field


  @regression @pia @revisionsforcustomermanagement @VFALFT-1636
  Scenario: Test FE-Currency is required for the Invoice Account for Institute Customers
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Government Customer" menu
    Then I should be seeing "New Government Customer" page
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Govt & Education" from Dropdown List in the Industry field
    And  I select a value "Public Institution" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-11608
  Scenario: Test Design FE-Party Role - Customer Update for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Update" button for Product Widget
    When I enter a value "Aslı" in the First Name field for Corporate Customer
    When I enter a value "Demir" in the Last Name field
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget

  @regression @pia @revisionsforcustomermanagement @VFALFT-11607 @smoke
  Scenario: Test Design FE-Party Role - Customer Update for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    #When I click Edit button for Customer360 Page
    When I click "Update" button for Product Widget
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field
    When I enter a value "ENVER" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-11537
  Scenario: Test Design FE-Party Role - Customer Update for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list


  @regression @pia @revisionsforcustomermanagement @VFALFT-12301 @smoke
  Scenario: Test FE-Validation of Albanian Phone Numbers for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    Then I should be seeing that "Country Code" field is displayed for Admin Information Tab
    Then I should be seeing that "+355" field is displayed for Admin Information Tab
    When I enter a value "71235678" in the Mobile Number field for Corporate Customer
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    And  I enter a new value "1234567" in the Work Number field for Corporate Customer
    Then I should be seeing that "Work Number" field is mandatory and not leaved empty
    When I enter a new value "12345678" in the Work Number field for Corporate Customer
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-12302 @smoke
  Scenario: Test FE-Validation of Albanian Phone Numbers for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    #Then I should be seeing that "Country Code" field is displayed for General Information Tab
    Then I should be seeing that "Country Code" field is displayed for Admin Information Tab
    #Then I should be seeing that "+355" field is displayed for General Information Tab
    When I enter a value "11235678" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I enter a value "600000000" in the Mobile Number field
    When I click Address Information tab
    Then I should be seeing "Address Information" tab


  @regression @pia @revisionsforcustomermanagement @VFALFT-12350 @smoke
  Scenario: Test FE-Validation of Albanian Phone Numbers for Individual Customer on Customer 360 View Page
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Individual Customer in the Customer360 Page
    And  I click Cancel button for Identification Number
    #Then I should be seeing that "Country Code" field is displayed for General Information Tab
    Then I should be seeing that "+355" field is displayed for Admin Information Tab
    #Then I should be seeing that "+355" field is displayed for General Information Tab
    When I enter a value "11235678" in the Mobile Number field
    Then I should be seeing an error message about the "Mobile Number" mandatory field
    When I enter a value "600000000" in the Mobile Number field


  @regression @pia @revisionsforcustomermanagement @VFALFT-12351 @smoke
  Scenario: Test FE-Validation of Albanian Phone Numbers for Corporate customer on Customer360 View
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Admin" widget
    When I click "Update" button for Product Widget
    #And  I click Cancel button for Identification Number
    Then I should be seeing that "Country Code" field is displayed for Admin Information Tab
    Then I should be seeing that "+355" field is displayed for Admin Information Tab
    When I enter a value "71235678" in the Mobile Number field for Contact Admin Tab
    Then I should be seeing that "Phone Number" field is mandatory and not leaved empty
    When I enter a value "600000000" in the Mobile Number field for Contact Admin Tab
    And  I enter a new value "1234567" in the Work Number field for Corporate Customer
    Then I should be seeing that "Work Number" field is mandatory and not leaved empty
    When I enter a new value "12345678" in the Work Number field for Corporate Customer

  @regression @pia @revisionsforcustomermanagement @VFALFT-12317 @ignore
  Scenario: Test BE-Validation of Albanian Phone Numbers for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    #When I check the BE side of partManagement API for individual customer
    #Then I should be seeing that partManagement API is displayed with related individual customer
    #When I check the value of "Contact Medium" object
    #Then I should be seeing that "Email", "Phone Number" and "Postal_Address" are displayed
    #When I check the Mobile Phone charareristic object
    #Then I should be seeing that value of the phone number that is entered during the individual customer creation is displayed




  @regression @pia @revisionsforcustomermanagement @VFALFT-12318 @ignore
  Scenario: Test BE-Validation of Albanian Phone Numbers for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    #When I check the BE side of partManagement API for individual customer
    #Then I should be seeing that partManagement API is displayed with related individual customer
    #When I check the value of "Contact Medium" object
    #Then I should be seeing that "Email", "Phone Number" and "Postal_Address" are displayed
    #When I check the Mobile Phone charareristic object
    #Then I should be seeing that the phone number that is entered during the individual customer creation is displayed



  @regression @pia @revisionsforcustomermanagement @VFALFT-12363 @ignore
  Scenario: Test BE-Validation of Albanian Phone Numbers for Individual Customer on Customer360 View Page
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I check the BE side of partManagement API for individual customer
    #Then I should be seeing that partManagement API is displayed with related individual customer
    #When I check the value of "Contact Medium" object
    #Then I should be seeing that "Email", "Phone Number" and "Postal_Address" are displayed
    #When I check the Mobile Phone charareristic object
    #Then I should be seeing that value of the phone number that is entered during the individual customer creation is displayed



  @regression @pia @revisionsforcustomermanagement @ignore @VFALFT-12364 @ignore
  Scenario: Test BE-Validation of Albanian Phone Numbers for Corporate Customer on Customer360 View Page
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I check the BE side of partManagement API for corporate customer
    #Then I should be seeing that partManagement API is displayed with related corporate customer
    #When I check the value of "Contact Medium" object
    #Then I should be seeing that "Email", "Phone Number" and "Postal_Address" are displayed
    #When I check the Mobile Phone charareristic object
    #Then I should be seeing that value of the phone number that is entered during the corporate customer creation is displayed


  @regression @pia @revisionsforcustomermanagement @VFALFT-12293
  Scenario: Test FE - Document Revisions Create Corporate Customer for NIPT document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    #And  I should be seeing "PAPER" default field in the Bill Media Dropdown list.
    #When I select a value "E-BILL" from Dropdown List in the Bill Media field
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10122022" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    #And  I click Search button for Billing Address
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    #And  I should be seeing that "Payment Type" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    #Then I should be seeing that User Reference field is displayed
    #Then I should be seeing that User Reference field is automatically taken from the Name of the Corporate Customer
    #Then I should be seeing that default value is displayed as Prepaid in the Payment Type field
    #Then I should be seeing that default value is displayed as Cash in the Payment Method field
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    #And  I select a value "Postpaid" in the Payment Type field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"
    #When I select a document which is below than 5MB and click upload button
    #Then I should be seeing that the document is upload
    #When I click "X" button
    #Then I should be seeing that The uploaded document is deleted
    #When I click Next button
    #Then I should be seeing that Admin Information tab is opened



  @regression @pia @revisionsforcustomermanagement @VFALFT-12321
  Scenario: Test FE - Document Revisions Create Corporate Customer for Uploading Additional Document on General Information Tab
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    #And  I add file in the Document File field for Corporate Customer
    And  I click Cancel File button for Corporate Customer
    #And  I click Cancel File button for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12323 @ignore
  Scenario: Test FE - Document Revisions Create Corporate Customer for Admin Person document mappings
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    #When I check the document location from BE
    #Then I should be seeing that attachment of Admin is located in PartyRole API
    #When I check the description from BE
    #Then I should be seeing that The description of the document is merged with the First Name and Last Name of the Administrator



  @regression @pia @revisionsforcustomermanagement @VFALFT-12346
  Scenario: Test FE - Document Revisions Create Corporate Customer for LOVs documents
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10122022" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    #And  I select a value "Postpaid" in the Payment Type field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12348
  Scenario: Document Revisions Create Residential Customer for LOVs documents
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "PATOS" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "TIRANE" in the City field
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"

  @regression @pia @revisionsforcustomermanagement @VFALFT-12325
  Scenario: Document Revisions Create Residential Customer for Uploading Additional Document on Admin Information Tab
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "1" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "nazım" in the First Name field
    Then I should be seeing that "nazım" "First Name" value characters are uppercase
    When I enter a value "ran" in the Last Name field
    Then I should be seeing that "ran" "Last Name" value characters are uppercase
    When I enter a value "hikmet" in the Secondary Name field
    Then I should be seeing that "hikmet" "Secondary Name" value characters are uppercase
    When I enter a value "nazım.hikmet@ran.com" in the Email field
    Then I should be seeing that "nazım.hikmet@ran.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    When I select the "ALBANIAN" value from Citizenship DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "Passport" for the Document Type field
    When I enter a value "12042021" in the Issuing Date
    #And  I enter a value "1" in the Document Number field
    When I add file in the Document File field
    When I click Cancel File button
    When I select a value "ID CARD" for the Document Type field
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BALLSH" in the City field
    #And  I click Search button for Billing Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    When I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12324 @ignore
  Scenario: Document Revisions Create Residential Customer for Authorized Person document mappings
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    #When I check the document location from BE
    #Then I should be seeing that attachment of Admin is located in PartyRole API
    #When I check the description from BE
    #Then I should be seeing that The description of the document is merged with the First Name and Last Name of the Administrator


  @regression @pia @revisionsforcustomermanagement @VFALFT-12383 @smoke
  Scenario: Test Name Field should allow some Special Characters for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And I click Next button
    Then I should be seeing "General Information" tab
    Then I should be seeing that Personal Number field is deactive and not editable
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "nazım." in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım-" in the First Name field
    #Then I should be seeing an not error message about the "First Name"
    When I enter a value "nazım+" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım&" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım()" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım%" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I open "Customer360" menu
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    When I click Edit button for Individual Customer in the Customer360 Page
    When I enter a value "nazım." in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım-" in the First Name field
    #Then I should be seeing an not error message about the "First Name"
    When I enter a value "nazım+" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım&" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım()" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "nazım%" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field
    When I enter a value "123456789" in the First Name field
    Then I should be seeing an error message about the "First Name" mandatory field


  @regression @pia @revisionsforcustomermanagement @VFALFT-12382 @smoke
  Scenario: Test Name Field should allow some Special Characters for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    When I enter a value "lamborghini." in the Name field
    When I enter a value "lamborghini-" in the Name field
    When I enter a value "lamborghini+" in the Name field
    When I enter a value "lamborghini&" in the Name field
    When I enter a value "lamborghini()" in the Name field
    When I enter a value "lamborghini%" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "123456789" in the Name field
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Individual Customer in the Customer360 Page
    When I enter a value "lamborghini." in the Name field
    When I enter a value "lamborghini-" in the Name field
    When I enter a value "lamborghini+" in the Name field
    When I enter a value "lamborghini&" in the Name field
    When I enter a value "lamborghini()" in the Name field
    When I enter a value "lamborghini%" in the Name field
    Then I should be seeing that "Name" field is mandatory and not leaved empty
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "123456789" in the Name field


  @regression @pia @revisionsforcustomermanagement @VFALFT-12430
  Scenario: Testing for "BE - Population of Customer Number" for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that starting F and 8 digit number for corporate customer number


  @regression @pia @revisionsforcustomermanagement @VFALFT-12432
  Scenario: Testing for "BE - Population of Customer Number" for Indıvidual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    Then I should be seeing that starting F and 8 digit number for Individual customer number


  @regression @pia @revisionsforcustomermanagement @VFALFT-12437 @smoke
  Scenario: Test FE - Population of Customer Number for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that starting F and 8 digit number for Individual and Corporate customer number for customer360 page

  @regression @pia @revisionsforcustomermanagement @VFALFT-12438 @smoke
  Scenario: Test FE - Population of Customer Number for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    Then I should be seeing that starting F and 8 digit number for Individual and Corporate customer number for customer360 page


  @regression @pia @revisionsforcustomermanagement @VFALFT-12308
  Scenario: Test FE - Document Revisions Corporate Customer 360 Display for Removing the Admin documents from Contact Tab
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Admin" widget
    When I click "Update" button for Product Widget
    #Then I should be seeing that document that is created during the corporate creation process is not displayed

  @regression @pia @revisionsforcustomermanagement @VFALFT-12237 @uat
  Scenario: Test FE - Document Revisions Residential Customer 360 Display
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page
    #Then I should be seeing the popup alert message "ID CARD" for Customer360 Page
    #Then I should be seeing the popup alert message "10.10.2015" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-12304
  Scenario: Test FE - Document Revisions Corporate Customer 360 Display on the Document Info Widget
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related corporate customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10042022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page
    Then I should be seeing the popup alert message "Extract QKR" for Customer360 Page
    #Given the Agreement Documents are uploaded
    #Then I should be seeing that residential Agreement documents is displayed on Documents Info widget
    #Given the Billing Account Documents are uploaded
    #Then I should be seeing that residential Party's documents is displayed on Documents Info widget



  @regression @pia @revisionsforcustomermanagement @VFALFT-12462 @uat
  Scenario: Test FE - Document Revisions Residential Customer 360 Update for Individual Identification Document Update
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-12463 @smoke @uat
  Scenario: Test FE - Document Revisions Residential Customer 360 Update for Authorized Person Document Update
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "PASSPORT" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Document created successfully!" for Customer360 Page



  @regression @pia @revisionsforcustomermanagement @VFALFT-12464 @smoke @uat
  Scenario: Test FE - Document Revisions Residential Customer 360 Update for Individual Person document Mappings
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related residential customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related residential customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related residential customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Document created successfully!" for Customer360 Page
    #Then I should be seeing the popup alert message "A12345238B" for Customer360 Page
    #Then I should be seeing that new attachment of Individual Person document is located in PartyManagement API
    #Then I should be seeing that previous attachment is moved to Party.attachment


  @regression @pia @revisionsforcustomermanagement @VFALFT-12445
  Scenario: Test FE - Document Revisions Corporate Customer 360 Update for Organization Identification Document (NIPT)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related corporate customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10042022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page
    Then I should be seeing the popup alert message "Extract QKR" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-12473
  Scenario: Test FE - Document Revisions Corporate Customer 360 Update for Admin Document (AdminDoc)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related corporate customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10042022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page
    Then I should be seeing the popup alert message "Extract QKR" for Customer360 Page




  @regression @pia @revisionsforcustomermanagement @VFALFT-12474 @smoke
  Scenario: Test FE - Document Revisions Corporate Customer 360 Update for Document Mappings
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    #And  I should be seeing that the value of  the "Document Type" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Name" is correct to the related corporate customer for Document Info
    And  I should be seeing that the value of  the "Description" is correct to the related corporate customer for Document Info
    #And  I should be seeing that the value of  the "Size" is correct to the related corporate customer for Document Info
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10072022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Document created successfully!" for Customer360 Page
    Then I should be seeing the popup alert message "Extract QKR" for Customer360 Page

  @regression @pia @revisionsforcustomermanagement @VFALFT-12783
  Scenario: Test FE - Regex Should Be Removed For Passport For Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "U223456" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    And  I should be seeing that Document Type field as "Passport"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12729
  Scenario: Test Customer Revisions - Multiple Revisions Required for Customer360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Trouble Tickets" for Tab
    And  I should be seeing that "Interaction" for Tab
    And  I should be seeing that "Invoice" for Tab
    When I click "Document" Tab for Customer360 Page
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    When I click on the View button on the Document Info widget
    Then I should be seeing that document image popup
    #Then I should be seeing that document is downloadable
    #When I click on the Download button



  @regression @pia @revisionsforcustomermanagement @VFALFT-12610 @smoke
  Scenario: Test FE- Address Revisions-Move Billing Addresses To Invoice Accounts for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    And  I click "Main Page" Tab for Customer360 Page
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    #And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Billing Widget
    #And  I should be seeing that the value of  the "Address Line 2" is correct to the related residential customer for Billing Widget
    And  I should be seeing that the value of  the "Country" is correct to the related residential customer for Billing Widget
    #And  I should be seeing that the value of  the "City" is correct to the related residential customer for Billing Widget
    #And  I should be seeing that the value of  the "Address Line 1" is correct to the related residential customer for Service Widget
    #And  I should be seeing that the value of  the "Address Line 2" is correct to the related residential customer for Service Widget
    And  I should be seeing that the value of  the "Country" is correct to the related residential customer for Service Widget
    #And  I should be seeing that the value of  the "City" is correct to the related residential customer for Service Widget




  @regression @pia @revisionsforcustomermanagement @VFALFT-12605 @smoke
  Scenario: Test FE- Address Revisions-Move Billing Addresses To Invoice Accounts for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget
    And  I click "Main Page" Tab for Customer360 Page
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    #And  I should be seeing that the value of  the "Address Line 1" is correct to the related corporate customer for Billing Widget
    #And  I should be seeing that the value of  the "Address Line 2" is correct to the related corporate customer for Billing Widget
    And  I should be seeing that the value of  the "Country" is correct to the related corporate customer for Billing Widget
    #And  I should be seeing that the value of  the "City" is correct to the related corporate customer for Billing Widget
    #And  I should be seeing that the value of  the "Address Line 1" is correct to the related corporate customer for Service Widget
    #And  I should be seeing that the value of  the "Address Line 2" is correct to the related corporate customer for Service Widget
    And  I should be seeing that the value of  the "Country" is correct to the related corporate customer for Service Widget
    #And  I should be seeing that the value of  the "City" is correct to the related corporate customer for Service Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-12977
  Scenario: Test Customer Revisions - FE - Country Code Support for Indıvidual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I select one of the Country "🇹🇷 +90" from list different from Albenia
    When I enter a value "05457450000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12978
  Scenario: Test Customer Revisions - FE - Country Code Support for Enterprise Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select one of the Country "🇹🇷 +90" from list different corporate from Albenia
    And  I enter a value "05457450000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10122022" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    #And  I click Search button for Billing Address
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12987
  Scenario: Test Validation rule for issue date of personal id to be not older than 10 years for Corporate.
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    When I enter a value "12122007" in the Issuing Date
    Then I should be seeing that "Issuing Date" field is mandatory and not leaved empty
    When I click the Admin Information tab
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    Then I should be not seeing that "Issuing Date1" field

  @regression @pia @revisionsforcustomermanagement @VFALFT-12986
  Scenario: Test Validation rule for issue date of personal id to be not older than 10 years for Individual.
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "ID Card" for the Document Type field
    And  I enter a value "12122007" in the Issuing Date
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I select a value "PASSPORT" for the Document Type field
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I click Contact Information tab
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be not seeing that "Issuing Date1" field
    And  I select a value Authorized Type : "Authorized Person"
    Then I should be not seeing that "Issuing Date1" field


  @regression @pia @revisionsforcustomermanagement @VFALFT-12995
  Scenario: Test Validation rule for issue date of personal id to be not older than 10 years Customer360 Individual.
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" widget
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2007" in the Document Issue Date field for Customer360 page
    Then I should be seeing an error message about the "Issuing Date" mandatory field
    When I select a value "PASSPORT" in the Document Type field for Customer360 page
    Then I should be seeing an error message about the "Issuing Date" mandatory field

  @regression @pia @revisionsforcustomermanagement @VFALFT-12996
  Scenario: Test Validation rule for issue date of personal id to be not older than 10 years Customer360 Corporate.
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    When I click on the "add" button
    And  I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10042020" in the Document Issue Date field for Customer360 page
    Then I should be seeing an error message about the "Issuing Date" mandatory field


  @regression @pia @revisionsforcustomermanagement @VFALFT-13040
  Scenario: Test Industry Field Information - For Enterprise Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    Then I should be seeing that "Finance & Insurance" "Manufacturing" "Construction" "Mining & Agriculture" "Retail & Wholesale" "Professional Services" "Accommodation & Leisure" "Transport & Logistics" "Media" "Telecoms" "Utilities" "Healthcare" values is displayed in the Industry field
    When I select a value "Manufacturing" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    #    And  I click Send Pin button for Corporate Customer for General TAB
#    And  I enter a value " " Pin field for Corporate Customer for General TAB
#    And  I click Validate Pin button for Corporate Customer for General TAB
    #And  I select "Extract QKR" in the Document Type field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    And  I select a value "Male" in the Gender field for Corporate Customer
    And  I enter a value "02061992" in the BirthDate field for Corporate Customer
    #And  I select a value "Phone" in the Communication Method for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    And  I select "AdminDoc" in the Document Type field for Corporate Customer
    #And  I enter a value "10122022" in the Issuing Date for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
#    And  I click the Generate Form
#    And  I select a value "Consent Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"

  @regression @pia @revisionsforcustomermanagement @VFALFT-13043
  Scenario: Test Industry field Information - For Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Government Customer" menu
    Then I should be seeing "New Government Customer" page
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "Army" in the Name field
    Then I should be seeing that "Army" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Govt & Education" from Dropdown List in the Industry field
    #And  I select a value "Government" from Dropdown List in the Customer Type field
    Then I should be seeing "Army","Central State Agencies", "Diplomatic Courp","Other","Public Institution","Religious Foundations" and "State Police" in the Segment field
    And  I select a value "Public Institution" from Dropdown List in the Segment field
    Then I should be seeing JuridicalInfo field is populated as "PUBLIC AND OTHER INSTITUTIONS"
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
#    And  I click the Generate Form
#    And  I select a value "Consent Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12527 @ignore
  Scenario: Test Validation of Personal Number for Male
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Female" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    When I click Add button
    #Then I should be seeing the popup alert message "Personal Number does not match NID format !"
    When I click General Information tab
    When I select the "Male" value from Gender DropdownList
    And  I enter a value "22 October 1998" in the Birth field 2nd. version
    When I click Add button
    #Then I should be seeing the popup alert message "Personal Number does not match NID format !"
    When I enter a value "02061992" in the Birth field
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12528 @ignore
  Scenario: Test Validation of Personal Number for Female
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value " " in the Identification Number field for Female
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I enter a value "12/04/2021" in the Issuing Date for Contact Tab
    #When I add file in the Document File field for Contact Tab
    When I click Add button
    #Then I should be seeing the popup alert message "Personal Number does not match NID format !"
    When I click General Information tab
    When I select the "Female" value from Gender DropdownList
    And  I enter a value "22 October 1998" in the Birth field 2nd. version
    When I click Add button
    #Then I should be seeing the popup alert message "Personal Number does not match NID format !"
    When I enter a value "02061992" in the Birth field
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-12629
  Scenario: Test Customer Type, Segment and Legal Entity Information for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    And  I should be seeing that "Juridical Info" field is displayed for Widget
    #Then I should be seeing that "Type","Market Segment","Juridical Info" on the cretaCustomer for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-12630
  Scenario: Test Customer Type, Segment and Legal Entity Information for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "Customer Name" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    #And  I should be seeing that "Legal Entity" field is displayed for Widget
    #When I check the BE side
    #Then I should be seeing that "Type","Market Segment","Juridical Info" on the cretaCustomer for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-13092 @smoke
  Scenario: Test Search Input Should Show Error Message If Search Icon Is Not Clicked (Individual)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "0" in the Identification Number field for Add New User
    Then I click Next button
    Then I should be seeing the popup alert message for Create Customer page "Please click search icon!"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13091
  Scenario: Test Search Input Should Show Error Message If Search Icon Is Not Clicked (Enterprise)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "0" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing the popup alert message for Create Customer page "Please click search icon!"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13209 @ignore
  Scenario: Test Geographical/Servis Address will be used for all address information for Creating Individual Customer with other address informations
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "New Address" in the Address Line One field
    When I enter a value "Albania" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address not found and has been created!"
    #When I check the BE side
    #Then I should be seeing that address information of the customer on the Geographic Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13210 @ignore
  Scenario: Test Geographical/Servis Address will be used for all address information for Creating Individual Customer with same address informations
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    #When I check the BE side
    #Then I should be seeing that address information of the customer on the Geographic Address
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "true"
    #When I click Service Address switch
    #Then I should be seeing Service Address switch value will be coming "false"
    #And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    #And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    #When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    #When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    #When I select a value "BERAT" in the City field for Service Address
    #And  I click Search button for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13206 @ignore
  Scenario: Geographical/Servis Address will be used for all address information for Creating Corporate Customer with same address informations
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13163 @ignore
  Scenario: Geographical/Servis Address will be used for all address information for Creating Corporate Customer with other address informations
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    #And  I select a value "Business" from Dropdown List in the Customer Type field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "New Address" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-13708
  Scenario: Test CityList LOV of Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Government Customer" menu
    Then I should be seeing "New Government Customer" page
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Govt & Education" from Dropdown List in the Industry field
    And  I select a value "Public Institution" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    And  I should be seeing that Place Of Birth city list value
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    And  I should be seeing that Address City list value
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
#    And  I click the Generate Form
#    And  I select a value "Consent Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"
    #Then I should be seeing that Customer360 page is opened
    #Then I click Address Tab
    #And I click Service Address Tab and click Edit button
    #Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje"
    #And I click Billing Address Tab and Edit button
    #Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”
    #Then I click Contact Tab and Edit button
    #And I check Place Of Birth city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”


  @regression @pia @revisionsforcustomermanagement @VFALFT-13709
  Scenario: Test CityList LOV of Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    And  I should be seeing that 11 area : "Identification Number","First Name","Last Name","Secondary Name","Email","Birth Date","Gender","Country Of Birth","Place Of Birth","Citizenship","Phone Number","Document Type" for Admin Information tab in the Corporate Customer Page
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    And  I should be seeing that Place Of Birth city list value
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #And  I click Send Pin button for Corporate Customer for Admin TAB
    #And  I enter a value " " Pin field for Corporate Customer for Admin TAB
    #And  I click Validate Pin button for Corporate Customer for Admin TAB
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    And  I should be seeing that Address City list value
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
#    And  I click the Generate Form
#    And  I select a value "Consent Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button for Corporate Customer
#    Then I should be seeing the popup alert message "Customer created successfully"
    #Then I should be seeing that Customer360 page is opened
    #Then I click Address Tab
    #And I click Service Address Tab and click Edit button
    #Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje"
    #And I click Billing Address Tab and Edit button
    #Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”
    #Then I click Contact Tab and Edit button
    #And I check Place Of Birth city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”


  @regression @pia @revisionsforcustomermanagement @VFALFT-13710
  Scenario: Test CityList LOV Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    And  I should be seeing that Place Of Birth city list value
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    #When I enter a value "C" in the Document Number field
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    And  I should be seeing that Address City list value
    When I select a value "BERAT" in the City field
    #And  I click Search button for Billing Address
    #Then I should be seeing the popup alert message "Geographic address found!"
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #When I click Search Identification button for Contact Information
    #When I enter a value "eric" in the First Name Field
    #When I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab
    #When I select the "Male" value from Gender DropdownList for Contact Tab
    #And  I select the "ALBANIAN" value from Citizenship DropdownList for Contact Tab
    #When I select a value "ID CARD" for the Document Type field for Contact Tab
    #When I add file in the Document File field for Contact Tab
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    #When I select a value "BERAT" in the Bank Name field
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
#    And  I click the Generate Form
#    And  I select a value "Consent Form" in the Document Type field
#    And  I add file in the Document File field for Other Information
#    When I click Add button
#    Then I should be seeing the popup alert message "Customer created successfully"
#    Then I should be seeing that Customer360 page is opened
#    Then I click Customer/Party Related Info Tab on General tab and click Edit button
#    And I check Place Of Birth city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”
#    Then I click Address Tab
#    And I click Service Address Tab and click Edit button
#    Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje"
#    And I click Billing Address Tab and Edit button
#    Then I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”
#    Then I click Product tab and New Order
#    Then I should be seeing that dsales page
#    And I click Update Service Address button on page
#    And I check city list “Bajram,Curri,Bajze,Ballsh,Berat,Bilisht,Bulqize,Burrel,Cerrik,Corovode,Delvine,Divjake,Durres,Elbasan,Erseke,Fier,Fierze,Finiq,Fushe Arrez,Fushe Kruje,Gjirokaster,Gramsh,Himare,Kamez,Kavaje,Kelcyre,Klos,Konispol,Koplik,Korce,Kraste,Krrabe,Kruje,Krume,Kucove,Kukes,Kurbnesh,Lac,Leskovik,Lezhe,Libohove,Librazhd,Lushnje,Maliq,Mamurras,Manez,Memaliaj,Milot,Orikum,Patos,Peqin,Permet,Peshkopi,Pogradec,Polican,Prrenjas,Puke,Reps,Roskovec,Rreshen,Rrogozhine,Rubik,Sarande,Selenice,Shengjin,Shijak,Shkoder,Sukth,Tepelene,Tirane,Ulez,Ura Vajgurore,Vau i Dejes,Vlore,Vore,Diber,Other,Golem,Luz,Luz.S,Velipoje”


  @regression @pia @revisionsforcustomermanagement @VFALFT-13705 @smoke
  Scenario: Test Blacklisted Flag should be editable for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Blacklisted" field is displayed for Widget
    And  I should be seeing that the value of  the "Blacklisted" is correct to the related corporate customer for CustomerParty Related Info Widget
    When I click Edit button for Customer360 Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    Then I should be seeing that "YES", "NO" values in the Blacklist Flag Dropdown list
    When I select a value "YES" in the Blacklist Flag field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Organization updated successfully!" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-13706
  Scenario: Test Blacklisted Flag should be editable for Indıvıdual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      | name        |
      | Residential |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Blacklisted" field is displayed for Widget
    And  I should be seeing that the value of  the "Blacklisted" is correct to the related corporate customer for CustomerParty Related Info Widget
    When I click Edit button for Individual Customer in the Customer360 Page
    Then I should be seeing that "YES", "NO" values in the Blacklist Flag Dropdown list
    When I select a value "YES" in the Blacklist Flag field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Individual updated successfully!" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-13636
  Scenario: Test Tax Exemption Information Institute customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Government Customer" menu
    Then I should be seeing "New Government Customer" page
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    Then I should be seeing that Tax Exemption field is selected
    When I Create Aggregated Institute Customer
      | name      |
      | Institute |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Tax Exempt" field is displayed for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-13634
  Scenario: Test Tax Exemption Information for Corporate customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    Then I should be seeing that Tax Exemption field is selected
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    #When I click "Customer/Party Related Info" widget
    #Then I should be seeing that the "Customer/Party Related Info" widget is opened
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "Tax Exempt" field is displayed for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14290 @smoke
  Scenario: Test Customer Create and Update specifications for "Disabled Customers"
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I select a value "Individual" from Dropdown List in the Segment field for Individual Customer
    When I enter a value "robert" in the First Name field
    Then I should be seeing that "robert" "First Name" value characters are uppercase
    When I enter a value "damme" in the Last Name field
    Then I should be seeing that "damme" "Last Name" value characters are uppercase
    When I enter a value "justin" in the Secondary Name field
    Then I should be seeing that "justin" "Secondary Name" value characters are uppercase
    When I enter a value "robert.justin@damme.com" in the Email field
    Then I should be seeing that "robert.justin@damme.com" "Email" value characters are uppercase
    When I enter a value "02061992" in the Birth field
    Then I should be seeing that Birth field is be older than 18 years old.
    When I select the "Male" value from Gender DropdownList
    When I select the "ALBANIA" value from Country Of Birth DropdownList
    Then I should be seeing that Country Of Birth field as "ALBANIA"
    When I select the "BERAT" value from Place Of Birth DropdownList
    Then I should be seeing that "ALBANIAN" area is DropdownList
    When I select a value "Email" in the Communication Method for Corporate Customer
    #And  I select a value "Credit Class 1" in the Credit Rating field
    When I enter a value "600000000" in the Mobile Number field
    #And  I click Send Pin button
    #And  I enter a value " " Pin field
    #And  I click Validate Pin button
    When I select a value "ID Card" for the Document Type field
    When I enter a value "12/04/2021" in the Issuing Date
    When I add file in the Document File field
    When I click Next button for Address Information
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    When I click Next button for Contact Information
    Then I should be seeing "Contact Information" tab
    And  I select a value Authorized Type : "Authorized Person"
    And  I select a value Authorized Type : "None"
    And  I click the Next Button for Invoice Account Information
    And  I select a value "Paper" in the Bill Media field
    And  I select a value "ALL" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information
    And  I click the Disability button
    And  I enter a value "Disabled Organization" in the Disabled Organization field
    And  I select a value "Blindness" in the Disabled Type field
    And  I select a value "Phone" in the Preferred Communication Method field
    And  I select a value "Large Print Address" in the Contract Type field
    And  I click the Generate Form
#    And  I select a value "Disability Form" in the Document Type field for Disability Option
#    And  I select a value "Consent Form" in the Document Type field for Customer Information
#    And  I add file in the Document File field for Other Information
#    When I click Add button
#    Then I should be seeing the popup alert message "Customer created successfully"


  @regression @pia @revisionsforcustomermanagement @VFALFT-14309
  Scenario: Negative Scenarios - Test Customer Create and Update specifications for "Disabled Customers"
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    Then I should be seeing "General Information" tab
    When I click "Other Information" tab
    And  I click the Disability button
    And  I select a value "" in the Disabled Type field
    Then I should be seeing an error message about the "Disability Type" mandatory field
    #And  I should be seeing an error message about the "Preferred Communication Method" mandatory field
    #And  I should be seeing an error message about the "Contract Type" mandatory field
    When I click the Generate Form
    Then I should be seeing that the Generate Form button is not active



  @regression @pia @revisionsforcustomermanagement @VFALFT-14254
  Scenario: Test Geo Address Revision (Enterprise)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    And  I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    And  I enter a value "Rozafa" in the Address Line Two field for Corporate Customer
    Then I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    #Then I should be not seeing that Search button
    When I click Service Address switch for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed for Also Service Address Button
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Also Service Address
    And  I enter a value "Rozafa" in the Address Line Two field for Also Service Address
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    When I select a value "BERAT" in the City field for Also Service Address
    Then I should be seeing that City field as "BERAT" for Also Service Address
    #Then I should be not seeing that Search button


  @regression @pia @revisionsforcustomermanagement @VFALFT-14255
  Scenario: Test Geo Address Revision (Institute)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Government Customer" menu
    Then I should be seeing "New Government Customer" page
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    When I click the Address Information tab
    Then I should be seeing "Address Information" tab for Corporate Customer
    And  I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Billing Address" is displayed for Corporate Customer
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    And  I enter a value "Rozafa" in the Address Line Two field for Corporate Customer
    Then I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    #Then I should be not seeing that Search button
    When I click Service Address switch for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed for Also Service Address Button
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Also Service Address
    #And  I should be seeing that Contact Type Field default value of the Contact Type Field is "Service Address" is displayed for Also Service Address
    And  I should be seeing that Country field as "ALBANIA" for Also Service Address
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Also Service Address
    And  I enter a value "Rozafa" in the Address Line Two field for Also Service Address
    Then I should be seeing that City field is displayed as Dropdownlist for Also Service Address
    When I select a value "BERAT" in the City field for Also Service Address
    Then I should be seeing that City field as "BERAT" for Also Service Address
    #Then I should be not seeing that Search button



  @regression @pia @revisionsforcustomermanagement @VFALFT-14256
  Scenario: Test Geo Address Revision (Individual)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Individual Customer" menu
    Then I should be seeing that the "New Individual Customer" page
    Then I should be seeing "Search Individual" tab
    When I enter a value "C" in the Identification Number field for Add New User
    And  I click Next button
    When I click "Address Information" tab
    Then I should be seeing "Address Information" tab
    And  I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I enter a value "Albania/Tirana" in the Address Line Two field
    When I select a value "BERAT" in the City field
    #Then I should be not seeing that Search button
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "true"
    When I click Service Address switch
    Then I should be seeing Service Address switch value will be coming "false"
    And  I should be seeing that 6 area : "Medium Type", "Contact Type", "Address Line 1", "Address Line 2", "Country", "City"
    And  I should be seeing country value will be coming default "ALBANIA" for Service Address
    When I enter a value "Autostrada Tirane-Durres" in the Address Line One field for Service Address
    When I enter a value "Elbasanit no:65" in the Address Line Two field for Service Address
    When I select a value "BERAT" in the City field for Service Address
    #Then I should be not seeing that Search button

  @regression @pia @revisionsforcustomermanagement @VFALFT-13863 @smoke
    Scenario: Test Customer 360: Contact Information - Missing Information should be added
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
    And  I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click "Update" button for Product Widget
    And  I select a value Authorized Type : "Legal Custodian"
    Then I should be seeing that "First Name", "Last Name", "Personal Number", "Authorization Document Type" field displayed
    When I click Cancel File button for Customer360 Page
    When I enter a value "C" in the Identification Number Field for Contact Tab
    And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field
    And  I enter a value "damme" in the Last Name Field
    And  I enter a value "02061992" in the BirthDate field in the Corporate Customer for Customer360 Page
    When I select the "MALE" value from Gender DropdownList for Contact Tab in the Customer360 Page
    And  I select the "ANDORRAN" value from Citizenship DropdownList for Contact Tab in the Customer360 Page
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab in the Customer360 Page
    When I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Contact updated successfully!" for Customer360 Page
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click "Update" button for Product Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-13255
    Scenario: Test DCM - SLA Add on Product Purchasing with the Main Product
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
    When I select "SLA ADD-ON PRODUCT" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "SLA ADD-ON PRODUCT" my selected additional product is displayed
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
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    When I click "Product" Tab for Customer360 Page
    Then I should be seeing that "SLA ADD-ON PRODUCT" for Product Tab
    And  I should be seeing that "Create Support Ticket" field is displayed for Product Widget
    When I click "Create Support Ticket" button for Product Widget
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing "After Sales Incident Case Type" Case Type coming in the drop down list
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing "SLA ADD-ON PRODUCT" for Product Information
    #And  I should be seeing the Case Records "City" field in the Ticket Details popup
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #When I check the be side to check the severity value
    #Then I should be seeing that the severity value is equal to sla add on products severity


  @regression @pia @revisionsforcustomermanagement @VFALFT-14308
    Scenario: Test DCM - Late SLA Add on Product Purchasing
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
    When I select "SLA ADD-ON PRODUCT" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "SLA ADD-ON PRODUCT" my selected additional product is displayed
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
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    When I click "Product" Tab for Customer360 Page
    Then I should be seeing that "SLA ADD-ON PRODUCT" for Product Tab
    And  I should be seeing that "Create Support Ticket" field is displayed for Product Widget
    When I click "Create Support Ticket" button for Product Widget
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing "After Sales Incident Case Type" Case Type coming in the drop down list
    And  I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And  I should be seeing "SLA ADD-ON PRODUCT" for Product Information
    #And  I should be seeing the Case Records "City" field in the Ticket Details popup
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #When I check the be side to check the severity value
    #Then I should be seeing that the severity value is equal to sla add on products severity


  @regression @pia @revisionsforcustomermanagement @VFALFT-14509 @smoke
    Scenario: Test Corporate: New UIs - Billing Account
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Account" Tab for Customer360 Page
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget

  @regression @pia @revisionsforcustomermanagement @VFALFT-14507
    Scenario: Test Individual Billing Account
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
    #And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Created Date" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Status" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Rating Type" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Amount" field is displayed for Billing Account & Products Widget
    When I click the "Postpaid" Button
    And  I should be seeing that "Billing Account Detail" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account ID" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Cycle" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Period" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Offset" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Billing Details" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Account Type" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Reason" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Currency" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Payment Method" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Bill Media" field is displayed for Billing Account & Products Widget
    #And  I should be seeing that "Products" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Primary Contact" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Name" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Role" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Email" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Phone" field is displayed for Billing Account & Products Widget
    And  I should be seeing that "Address" field is displayed for Billing Account & Products Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14496 @smoke @ignore
    Scenario: Test Corporate Customer: New UIs Contact (Add)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    When I click on the "add" button
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field for Corporate Customer
    When I enter a value "ASLI@DOT.COM" in the Email field for Contact Tab in the Customer360 Page
    When I select a value "MALE" in the Gender field for Corporate Customer
    When I enter a value "02061993" in the BirthDate field for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "ALBANIA" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Contact Admin Tab
    And  I add file in the Document File field for Contact Tab in the Customer360 Page
    #When I enter a value "600000000" in the Mobile Number field for Contact Tab in the Customer360 Page
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    #Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    #Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    #Then I should be seeing that "600000000" "Mobile Number" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14495 @smoke
    Scenario: Test Individual Customer: New UIs Contact (Add)
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
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Authorized_Person" for Tab
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click the "Authorized_Person" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click the "Legal_Custodian" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    #Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    #Then I should be seeing that "Mobile Phone Number" for Tab
    #Then I should be seeing that "Email" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click on the "add" button
    Then I should be seeing that "First Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Document Type" for Tab
    #And  I click Cancel button for Identification Number
    When I select a value Authorized Type : "Authorized Person" for Contact Tab
    And  I enter a value "C" in the Identification Number Field for Residential Contact Tab
    And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field in the Corporate Customer for Customer360 Page
    And  I enter a value "damme" in the Last Name Field in the Corporate Customer for Customer360 Page
    And  I enter a value "02061992" in the BirthDate field in the Corporate Customer for Customer360 Page
    When I select the "MALE" value from Gender DropdownList for Contact Tab in the Customer360 Page
    And  I select the "ANDORRAN" value from Citizenship DropdownList for Contact Tab in the Customer360 Page
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab in the Customer360 Page
    When I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Contact updated successfully!" for Customer360 Page
    Then I should be seeing that "ERIC" "First Name" value updated for Widget
    Then I should be seeing that "DAMME" "Last Name" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14468 @smoke
    Scenario: Test Individual: Update for New Customer 360 UIs from R&D - Contact
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
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Authorized_Person" for Tab
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click the "Authorized_Person" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click the "Legal_Custodian" for Contact Tab in the Customer360 Page
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Identification Number" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    Then I should be seeing that "Document" for Tab
    When I click the Close button for Customer360 Page
    When I click "Update" button for Product Widget
    Then I should be seeing that "First Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Citizenship" for Tab
    Then I should be seeing that "Document Type" for Tab
    #And  I click Cancel button for Identification Number
    #When I enter a value "C" in the Identification Number Field for Contact Tab
    #And  I click Search Identification button for Contact Information
    And  I enter a value "eric" in the First Name Field
    And  I enter a value "damme" in the Last Name Field
    #When I enter a value "02061992" in the Birth field for Contact Tab in the Customer360 Page
    When I select the "Male" value from Gender DropdownList for Contact Tab in the Customer360 Page
    And  I select the "ANDORRAN" value from Citizenship DropdownList for Contact Tab in the Customer360 Page
    When I select a value "LETTER OF ATTORNEY" for the Document Type field for Contact Tab in the Customer360 Page
    When I click Cancel File button for Individual Customer for General information TAB
    When I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing that "ERIC" "First Name" value updated for Widget
    Then I should be seeing that "DAMME" "Last Name" value updated for Widget



  @regression @pia @revisionsforcustomermanagement @VFALFT-14471 @smoke
    Scenario: Test Corporate: Update for New Customer 360 UIs from R&D - Contact
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Update" button for Product Widget
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field
    When I enter a value "ENVER" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    Then I should be seeing that "666666666" "Mobile Number" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14485 @smoke
    Scenario: Test Corporate: New Customer 360 UIs from R&D - Contact
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Contact Name" for Tab
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Middle Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Mobile Phone Number" for Tab
    Then I should be seeing that "Email" for Tab
    When I click "Update" button for Product Widget
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field
    When I enter a value "ENVER" in the Secondary Name field for Corporate Customer
    #When I enter a value "02061992" in the BirthDate field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "TURKEY" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I enter a value "ANKARA" from Dropdown List in Place Of Birth field for Corporate Customer
    When I select a value "ALBANIAN" from Dropdownlist in the Citizenship field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    #When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    #When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    #When I click the Cancel button for Contact Tab in the Customer360 Page
    #And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message for Medium Contact "Contact updated successfully!" for Corporate Customer
    Then I should be seeing that "Aslı" "First Name" value updated for Widget
    Then I should be seeing that "Demir" "Last Name" value updated for Widget
    Then I should be seeing that "Enver" "Middle Name" value updated for Widget
    #Then I should be seeing that "02/06/1992" "BirthDate" value updated for Widget
    #Then I should be seeing that "Phone" "Communication Method" value updated for Widget
    #Then I should be seeing that "ANKARA" "Place Of Birth" value updated for Widget
    #Then I should be seeing that "TURKEY" "Country Of Birth" value updated for Widget
    #Then I should be seeing that "TURKISH" "Citizenship" value updated for Widget
    #Then I should be seeing that "Male" "Gender" value updated for Widget
    #Then I should be seeing that "nick.kale@mail.com" "Email" value updated for Widget
    Then I should be seeing that "666666666" "Mobile Number" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14488 @smoke
    Scenario: Test Corporate Customer: New UIs General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "NIPT" field is displayed for Widget
    And  I should be seeing that "Industry" field is displayed for Widget
    And  I should be seeing that "Account Manager" field is displayed for Widget
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    And  I should be seeing that "Juridical Info" field is displayed for Widget
    #And  I should be seeing that "Credit Team" field is displayed for Widget
    And  I should be seeing that "Dunning Level" field is displayed for Widget
    And  I should be seeing that "Customer Grouping" field is displayed for Widget
    And  I should be seeing that "Disconnection Date" field is displayed for Widget
    #And  I should be seeing that "Disconnection Reason" field is displayed for Widget
    And  I should be seeing that "Parent Account" field is displayed for Widget
    And  I should be seeing that "Potential Fraud" field is displayed for Widget
    And  I should be seeing that "Potential Fraud Comment" field is displayed for Widget
    #And  I should be seeing that "First Class Responsible" field is displayed for Widget
    And  I should be seeing that "Number Of Employees" field is displayed for Widget
    And  I should be seeing that "Blacklisted Flag" field is displayed for Widget
    And  I should be seeing that "Tax Exempt" field is displayed for Widget
    And  I should be seeing that "Customer Number" field is displayed for Widget
    And  I should be seeing that "Name" field is displayed for Widget
    And  I should be seeing that "Status" field is displayed for Widget
    And  I should be seeing that "Email" field is displayed for Widget
    And  I should be seeing that "Mobile Phone Number" field is displayed for Widget
    And  I should be seeing that "Fix Phone Number" field is displayed for Widget
    #And  I should be seeing that "Fax Number" field is displayed for Widget
    And  I should be seeing that "Communication Method" field is displayed for Widget
    And  I should be seeing that "POS" field is displayed for Widget
    And  I should be seeing that "Sales Agent" field is displayed for Widget
    And  I should be seeing that "Created User" field is displayed for Widget
    And  I should be seeing that "Customer Since" field is displayed for Widget
    Then I should be seeing that "Trouble Tickets" for Tab
    Then I should be seeing that "Interaction" for Tab






  @regression @pia @revisionsforcustomermanagement @VFALFT-14489 @smoke
    Scenario: Test Individual Customer: New UIs General Info
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    Then I should be seeing that "Customer Information" for Tab
    And  I should be seeing that "First Name" field is displayed for Widget
    And  I should be seeing that "Last Name" field is displayed for Widget
    And  I should be seeing that "Middle Name" field is displayed for Widget
    And  I should be seeing that "Identification Number" field is displayed for Widget
    And  I should be seeing that "Birth Date" field is displayed for Widget
    And  I should be seeing that "Blacklisted Flag" field is displayed for Widget
    And  I should be seeing that "Juridical Info" field is displayed for Widget
    And  I should be seeing that "Disability Type" field is displayed for Widget
    And  I should be seeing that "Place Of Birth" field is displayed for Widget
    And  I should be seeing that "Country Of Birth" field is displayed for Widget
    And  I should be seeing that "Citizenship" field is displayed for Widget
    And  I should be seeing that "Gender" field is displayed for Widget
    And  I should be seeing that "Customer Type" field is displayed for Widget
    And  I should be seeing that "Segment" field is displayed for Widget
    And  I should be seeing that "Disabled Comm. Method" field is displayed for Widget
    And  I should be seeing that "Disabled Organization" field is displayed for Widget
    #And  I should be seeing that "Tax Exempt" field is displayed for Widget
    And  I should be seeing that "Customer Number" field is displayed for Widget
    And  I should be seeing that "Name" field is displayed for Widget
    And  I should be seeing that "Status" field is displayed for Widget
    And  I should be seeing that "Email" field is displayed for Widget
    And  I should be seeing that "Mobile Phone Number" field is displayed for Widget
    And  I should be seeing that "Fix Phone Number" field is displayed for Widget
    #And  I should be seeing that "Fax Number" field is displayed for Widget
    And  I should be seeing that "POS" field is displayed for Widget
    And  I should be seeing that "Sales Agent" field is displayed for Widget
    And  I should be seeing that "Created User" field is displayed for Widget
    And  I should be seeing that "Customer Since" field is displayed for Widget
    Then I should be seeing that "Trouble Tickets" for Tab
    Then I should be seeing that "Interaction" for Tab



  @regression @pia @revisionsforcustomermanagement @VFALFT-14492
    Scenario: Test Individual Customer: New UIs -Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    When I click on the "add" button
    Then I should be seeing that the values are "ID CARD", "PASSPORT", "Attorney Letter" for residential customer in the Document Type field
    When I select a value "ID CARD" in the Document Type field for Customer360 page
    And  I select a value "12.12.2021" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-14494
    Scenario: Test Corporate Customer: New UIs -Document
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Document" Tab for Customer360 Page
    #Then I should be seeing that "Document ID" for Tab
    #And  I should be seeing that "Document Type" field is displayed for Document Info widget
    And  I should be seeing that "Name" field is displayed for Document Info widget
    And  I should be seeing that "Description" field is displayed for Document Info widget
    #And  I should be seeing that "Size" field is displayed for Document Info widget
    And  I should be seeing that "Uploaded At" field is displayed for Document Info widget
    When I click on the "add" button
    Then I should be seeing that the values are "Extract QKR", "Admin Doc" in the Document Type field
    When I select a value "Extract QKR" in the Document Type field for Customer360 page
    And  I select a value "10042022" in the Document Issue Date field for Customer360 page
    And  I add file in the Document File field for Customer360 page
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "DOCUMENT_CREATED_SUCCESSFULLY" for Customer360 Page


  @regression @pia @revisionsforcustomermanagement @VFALFT-14497 @smoke
    Scenario: Test Individual Customer: New UIs Address
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    And  I select a value "TIRANE" in the City field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
#    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
#    And  I select a value "TIRANE" in the City field
#    When I click the "Save" Button
#    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    Then I should be seeing that "Pallati 37 shkalla 4 apartamenti 15" "Address Line 1" value updated for Widget
#    Then I should be seeing that "TIRANE" "City" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14498
    Scenario: Test Corporate Customer: New UIs Address
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "SERVICE_ADDRESS" for Tab
    And  I should be seeing that "BILLING_ADDRESS" for Tab
    And  I should be seeing that "Address Line 1" for Tab
    And  I should be seeing that "Address Line 2" for Tab
    And  I should be seeing that "City" for Tab
    And  I should be seeing that "Country" for Tab
    When I click Service Address Edit button for Customer360 Page
    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    And  I select a value "ULEZ" in the City field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    When I click Billing Address Edit button for Customer360 Page
#    Then I should be seeing that 4 area : "Address Line 1", "Address Line 2", "Country" and "City"
#    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
#    And  I select a value "ULEZ" in the City field
#    When I click the "Save" Button
#    Then I should be seeing the popup alert message "Address updated successfully!" for Customer360 Page
#    Then I should be seeing that "Pallati 37 shkalla 4 apartamenti 15" "Address Line 1" value updated for Widget
#    Then I should be seeing that "ULEZ" "City" value updated for Widget


  @regression @pia @revisionsforcustomermanagement @VFALFT-14770 @smoke
    Scenario: Test Institute Customers-Communication Method Update for all types of
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
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Customer360 Page
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I select a value "SMS" in the Communication Method for Corporate Customer
    When I select a value "Email & SMS" in the Communication Method for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-14769 @smoke
    Scenario: Test Individual Customers-Communication Method Update for all types of
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
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Individual Customer in the Customer360 Page
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I select a value "SMS" in the Communication Method for Corporate Customer
    When I select a value "Email & SMS" in the Communication Method for Corporate Customer


  @regression @pia @revisionsforcustomermanagement @VFALFT-14766 @smoke
    Scenario: Test Enterprise Customers-Communication Method Update for all types of
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
    Then I should be seeing that "Customer Information" for Tab
    When I click second Edit button for Customer360 Page
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I select a value "SMS" in the Communication Method for Corporate Customer
    When I select a value "Email & SMS" in the Communication Method for Corporate Customer

  @regression @pia @revisionsforcustomermanagement @VFALFT-14617 @smoke
    Scenario: Corporate Customer: New UIs Contact (Delete)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    When I click on the "add" button
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "ASLI" in the First Name field for Corporate Customer
    When I enter a value "DEMIR" in the Last Name field for Corporate Customer
    When I enter a value "ASLI@DOT.COM" in the Email field for Contact Tab in the Customer360 Page
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "02061993" in the BirthDate field for Corporate Customer
    When I select a value "TURKISH" from Dropdownlist in the Citizenship field for Corporate Customer
    When I select a value "ALBANIA" from Dropdownlist in the Country Of Birth field for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Contact Admin Tab
    And  I add file in the Document File field for Contact Tab in the Customer360 Page
    When I click the "Save" Button
    And  I wait "10000" millisecond to process
    And  I click "Delete" button for Product Widget
    And  I click "Yes" for Manual Order
    #Then I should be seeing that "Contact created successfully!" for Tab
    #Then I should be not seeing "666666666" page


  @regression @pia @revisionsforcustomermanagement @VFALFT-14467 @smoke
    Scenario: Individual Customer: New UIs Contact (Delete)
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
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Legal_Custodian" for Tab
    When I click "Delete" button for Product Widget
    And  I click "Yes" for Product widget
    And  I wait "7000" millisecond to process
    Then I should be not seeing "Legal_Custodian" page


  @regression @pia @revisionsforcustomermanagement @VFALFT-14776
    Scenario: will be deleted
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    And  I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Contact Information tab
    Then I should be seeing "Contact Information" tab for Corporate Customer
    When I select the "Technical Contact" value from Contact Type DropdownList for Corporate Customer
    And  I enter a value "600000000" in the Mobile Number field for Corporate Contact Tab
    And  I enter a value "contact@gmail.com" in the Email field for Corporate Contact Tab
    When I Create Aggregated Corporate Customer
      | name      |
      | Corporate |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Admin" for Tab
    When I click "Update" button for Product Widget
    #Then I should be seeing that I can update the fields

  @regression @pia @revisionsforcustomermanagement @VFALFT-14486 @smoke
    Scenario: Test Individual: New Customer 360 UIs from R&D - Contact
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
    When I click "Contact" Tab for Customer360 Page
    Then I should be seeing that "Contact Type" for Tab
    Then I should be seeing that "Name" for Tab
    Then I should be seeing that "Last Name" for Tab
    Then I should be seeing that "Gender" for Tab
    Then I should be seeing that "Birth Date" for Tab
    Then I should be seeing that "Citizenship" for Tab


  @regression @pia @revisionsforcustomermanagement @VFALFT-14765
    Scenario: Test New Contact Types for Enterprise Customers
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I open "Create Business Customer" menu
    Then I should be seeing that the "New Business Customer" page for Corporate Customer
    When I should be seeing "Search Organization" tab for Corporate Customer
    When I enter a value "A" in the NIPT field and click the Search button
    When I click the Next button
    Then I should be seeing "General Information" tab for Corporate Customer
    And  I should be seeing that 5 area :"Organization Number","Name","Industry","Bill Media" and "Account Manager" for General Information tab in the Corporate Customer Page
    When I enter a value "lamborghini" in the Name field
    Then I should be seeing that "lamborghini" "Name" value characters are uppercase for Corporate Customer Page
    When I select a value "Finance & Insurance" from Dropdown List in the Industry field
    And  I select a value "Corporate" from Dropdown List in the Segment field
    And  I enter a value "lamborghini@gmail.com" in the Email field for Corporate Customer for General TAB
    When I select a value "Email" in the Communication Method for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer for General TAB
    And  I enter a value "10042022" in the Issuing Date for Corporate Customer for General TAB
    And  I add file in the Document File field for Corporate Customer for General information TAB
    When I click the Next Button for Admin Information
    Then I should be seeing "Admin Information" tab for Corporate Customer
    When I enter a value "C" in the Identification Number field for Corporate Customer
    When I enter a value "nic" in the First Name field for Corporate Customer
    Then I should be seeing that "nic" "First Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "kale" in the Last Name field for Corporate Customer
    Then I should be seeing that "kale" "Last Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "salva" in the Secondary Name field for Corporate Customer
    Then I should be seeing that "salva" "Secondary Name" value characters are uppercase for Corporate Customer Page
    When I enter a value "nick.kale@mail.com" in the Email field for Corporate Customer
    When I enter a value "02061992" in the BirthDate field for Corporate Customer
    Then I should be seeing that Country Of Birth field as "ALBANIA" for Corporate Customer
    When I select a value "BERAT" from Dropdown List in Place Of Birth field for Corporate Customer
    Then I should be seeing that Citizenship field default value is "ALBANIAN" for Corporate Customer
    When I select a value "Male" in the Gender field for Corporate Customer
    When I enter a value "600000000" in the Mobile Number field for Corporate Customer
    When I select "AdminDoc" in the Document Type field for Corporate Customer
    And  I add file in the Document File field for Corporate Customer
    When I click the Next Button for Contact Information
    Then I should be seeing "Contact Information" tab for Corporate Customer
    When I select the "Technical Contact" value from Contact Type DropdownList for Corporate Customer
    And  I enter a value "600000000" in the Mobile Number field for Corporate Contact Tab
    And  I enter a value "contact@gmail.com" in the Email field for Corporate Contact Tab
    When I click the Next Button for Address Information
    Then I should be seeing "Address Information" tab for Corporate Customer
    Then I should be seeing that "Medium Type","Contact Type","Address Line One","Address Line Two","Country","City"  fields are displayed  for Address Information tab in the Corporate Customer Page
    And  I should be seeing that the default value of the Medium Type Field is "Address" is displayed for Corporate Customer
    And  I should be seeing that Country field as "ALBANIA" for Address Information tab in the Corporate Customer Page
    When I enter a value "Turke Rruga e Elbasanit no:65 Tirane/Albania" in the Address Line One field for Corporate Customer
    Then I should be seeing that City field is displayed as Dropdownlist for Corporate Customer
    When I select a value "BERAT" in the City field for Corporate Customer
    Then I should be seeing that City field as "BERAT" for Address Information tab in the Corporate Customer Page
    When I click Service Address switch for Corporate Customer
    When I click the Next Button for Invoice Account Information
    Then I should be seeing "Invoice Account Information" tab for Corporate Customer
    And  I should be seeing that "Bill Media" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Currency" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Description" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Payment Method" field is displayed for Invoice Account Information tab
    When I select a value "Paper" in the Bill Media field
    And  I select a value "EUR" in the Currency field
    And  I enter a value "For Customer" in the Description field
    And  I select a value "Direct Debit" in the Payment Method field
    Then I should be seeing that "Bank Name" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Bank Account No" field is displayed for Invoice Account Information tab
    And  I should be seeing that "Owner" field is displayed for Invoice Account Information tab
    When I select a value "Tirana" in the Bank Name field
    When I enter a value "0897- 12345678 - 5001 - 5002" in the Bank Account No field
    When I select a value "Customer" in the Owner field
    And  I click the Next Button for Other Information for Corporate Customer
    And  I click the Generate Form
    And  I select a value "Consent Form" in the Document Type field
    And  I add file in the Document File field for Other Information
    When I click Add button for Corporate Customer
    Then I should be seeing the popup alert message "Customer created successfully"


