#language: en

Feature: Deactivate Bundle Fulfillment

  @regression @pia @deactivebundlefulfillment @VFALFT-10906
  Scenario: Test Handle DNexT product Inventory Update regarding Deactivation for Bundle,
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
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
    #Given the Billing Account Status is active
    #When I click three dots is opened menu and "Deactivate" select
    #Then I should be seeing deactivate process started toast message
    #When I select and check customer Billing Account Status
    #Then I should be seeing changed Billing Account Status

  @regression @pia @deactivebundlefulfillment @VFALFT-10907
  Scenario: Test Handle Deactivate Provisioning for Bundle
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
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
    #Given the Billing Account Status is active
    #When I click three dots is opened menu and "Deactivate" select
    #Then I should be seeing deactivate process started toast message
    #When I select and check customer Billing Account Status
    #Then I should be seeing changed Billing Account Status

