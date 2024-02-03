#language: en

Feature: aftersales

  @regression @pia @aftersales @VFALFT-12365 @smokep
    Scenario: Test FE - Renew Prepaid Agreement
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
    And  I click the New Order button
    Then I should be seeing that New Order page is opened
    And  I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "13" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    And  I select a value "CASH" in the Payment Method field for Collect Payment & Confirm
    And  I click the Payment Collected
    When I click the Proceed button
    When I click the "PROCEED" button
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
    And  I should be seeing that "Modem Basic" for Product Tab
    And  I click "Agreement" Tab for Customer360 Page
    And  I should be seeing the popup alert message "Address" for Customer360 Page
    Then I should be seeing the popup alert message "Agreement Id" for Customer360 Page
    And  I should be seeing the popup alert message "Agreement Status" for Customer360 Page
    And  I should be seeing the popup alert message "Type" for Customer360 Page
    And  I should be seeing the popup alert message "Start Date" for Customer360 Page
    And  I should be seeing the popup alert message "End Date" for Customer360 Page
    When I click on related product from agreement list
    Then I should be seeing the popup alert message "Agreement Detail" for Customer360 Page
    When I click Reprchase button
    Then I should be seeing that the Shopping Cart Page
