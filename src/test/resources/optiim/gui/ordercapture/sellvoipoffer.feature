#language: en

Feature: Sell VOIP Offer


  @regression @pia @sellvoipoffer @VFALFT-9866
  Scenario: Test Add VOIP Offer to Shopping Card
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
    When I select "Mirembajtje Tel -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I click Products button for Shopping Cart Page
    When I select "Mirembajtje Tel -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    #When I select a dummy product and click the Add to Cart button
    #Then I should be seeing that I can add the dummy product in the Shopping Cart


  @regression @pia @sellvoipoffer @VFALFT-9867
  Scenario: Negative Test Scenarios - Add VOIP Offer to Shopping Card
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
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "" in the Serial Number field
    #Then I should be seeing that the "Serial Number" in Configuration Parameters fields for the selected product is required
    And  I enter a value "" in the Phone Number field
    #Then I should be seeing that the "SipPassword" in Configuration Parameters fields for the selected product is required
    #And  I enter a value "" in the Phone Number field
    #Then I should be seeing that the "Phone Number" in Configuration Parameters fields for the selected product is required
    When I select a value "12MonthCommitment" Product Term field
    #Then I should be seeing that a value is selected and Add to Card button becomes not visible
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    #When I click Products button for Shopping Cart Page
    #When I select "TIRANAVOIPOFFER" product and click
    #And  I enter a value "A23423FGH5" in the Serial Number field
    #And  I enter a value "123456" in the SipPassword field
    #And  I enter a value "00457852365" in the Phone Number field
    #And I select a value from Product Term field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    #When I click the Add to Cart button
    #Then I should be seeing that I can not add the TV Offer product has the different Offering Terms in the Shopping Cart
    #When I select a dummy product and click the Add to Cart button
    #Then I should be seeing that I can add the dummy product in the Shopping Cart



  @regression @pia @sellvoipoffer @VFALFT-9868
  Scenario: Test Delete VOIP Offer to Shopping Card
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
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I select the product and delete for Shopping Cart Page
    And  I click Shopping Cart Button
    Then I should be seeing that "Your cart is currently empty" in case the product was deleted



  @regression @pia @sellvoipoffer @VFALFT-9863
  Scenario: Test Present VOIP Offer in DSales
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
    When I click the Edit button to update customer Service Address
    When I enter a value "Pallati 37 shkalla 4 apartamenti 15" in the Address Line One field
    When I select a value "BALLSH" in the City field for Corporate Customer
    When I click the update button
    Then I should be seeing the popup alert message "Service address created successfully!" for Products Page
    When I enter a value "MIREMBAJTJE TEL -100K-100N" in the Search Product field
    Then I should be seeing that "MIREMBAJTJE TEL -100K-100N" in the Search Product list
    Then I should be seeing the products are filtered with CATALOGUEs and CATEGORIEs
    When I click "DownloadSpeed" Category button
    And  I select a value "1" category
    Then I should be seeing that the "1" product of category is true selected
    And  I should be seeing that the "5" product of category is not selected
    When I select a value "5" category
    Then I should be seeing that the "1" product of category is true selected
    And  I should be seeing that the "5" product of category is true selected
    When I select a value "1" category
    Then I should be seeing that the "5" product of category is true selected
    And  I should be seeing that the "1" product of category is not selected
    When I select a value "5" category
    Then I should be seeing that the "1" product of category is not selected
    And  I should be seeing that the "5" product of category is not selected
    #When I check the filter of the products  with “Speed“ ,“Minute“ ,“Price“ parameters
    #Then I should be seeing that filter of the products parameters
    #When I check the value "Speed" field
    #Then I should be seeing that value of "speed" is shown
    #When I check the value "Minute" field
    #Then I should be seeing that value of "Minute" is shown
    #When I check the value "Price" field
    #Then I should be seeing that value of "Price" is shown
    And  I click Close button for Product Page
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed


  @regression @pia @sellvoipoffer @VFALFT-9864
  Scenario: Negative Test Scenarios - Present TV Offer in DSales
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    And  I should be seeing that the System retrieves the list of Products related to the Customer’s Service Address
    When I select "DIGITALB PREMIUM" product and click
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Digitalb Premium" my selected additional product is displayed
    #And  I enter a value "" in the Serial Number field
    #Then I should be seeing that the "Serial Number" in Configuration Parameters fields for the selected product is required
    #Then I should be seeing that the "SipPassword" in Configuration Parameters fields for the selected product is required
    #And  I enter a value "" in the Phone Number field
    #Then I should be seeing that the "Phone Number" in Configuration Parameters fields for the selected product is required


  @regression @pia @sellvoipoffer @VFALFT-9969
    Scenario: Submit Order and Evaluate for VOIP Product Offer
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
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    #Then Billing Account and Aggrement Created

  @regression @pia @sellvoipoffer @VFALFT-11148
    Scenario: VOIP Test Number Inventory Integration FE - Display Number for Residential Customer
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
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page





  @regression @pia @sellvoipoffer @VFALFT-11147
    Scenario: VOIP Test Number Inventory Integration FE - Display Number for Corporate Customer
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
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page



  @regression @pia @sellvoipoffer @VFALFT-11133 @uat
    Scenario: VOIP Test Number Inventory Integration FE - Display Number for Institute Customer
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
    #When I select a value "Invoice Account-Postpaid-ALL" in Invoice Account field
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "MIREMBAJTJE TEL -100K-100N" product and click
    #And  I enter a value "05457452289" in the Phone Number field
    When I select a value "12MonthCommitment" Product Term field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "Mirembajtje Tel -100K-100N" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page

