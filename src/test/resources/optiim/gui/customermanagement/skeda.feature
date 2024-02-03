#language: en

Feature: Skeda


  @regression @pia @skeda @VFALFT-12479 @ignore
    Scenario: Test FE Skeda Network Inv Backoffice for Individual Customer on Service Address
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
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "Billing Address" for Tab
    And  I should be seeing that "Service Address" for Tab
    When I click "Service Address" widget
    Then I should be seeing that the "Service Address" widget is opened
    And  I should be seeing the popup alert message "Add Technical Resource" for Customer360 Page
    When I click "Add Technical Resource" button for Service Address widget
    And  I should be seeing the popup alert message "Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    When I click the "Delete" Button
    Then I should be seeing that one of the Resource attached to this Product is removed on PopUp Window
    When I click the "Edit" Button
    #Then I should be seeing that additional PopUp window is opened to edit the one of the Resource attached to this Product
    #Then I should be seeing that the "Resource Type" that is choosen for editing is displayed with the characteristic on additional PoPup window and can not be edited
    #Then I should be seeing that field format of characteristic is TextBox or DropDown List
    #When I choose one of the characteristic that is belong to resource for editing on additional PopUp Window
    #Then I should be seeing that the characteristic can be edited
    When I click the "Add Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    Then I should be seeing that "Resource Type" field is displayed for Product Widget
    When I select a value "testSpec1" in the Resource Type field
    Then I should be seeing that "Premium Value" field is displayed for Product Widget
    #Then I should be seeing that value of the Resource Type field are the values that will be coming from the Resource Catalogue
    And  I enter a value "testvalue" in the PremiumValue field
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    And  I should be seeing the popup alert message "Technical Resources" for Customer360 Page
    #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Technical Resources" for Customer360 Page


  @regression @pia @skeda @VFALFT-12480 @ignore
    Scenario: Test FE Skeda Network Inv Backoffice for Corporate Customer on Service Address
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
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "Billing Address" for Tab
    And  I should be seeing that "Service Address" for Tab
    When I click "Service Address" widget
    Then I should be seeing that the "Service Address" widget is opened
    And  I should be seeing the popup alert message "Add Technical Resource" for Customer360 Page
    When I click "Add Technical Resource" button for Service Address widget
    And  I should be seeing the popup alert message "Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    When I click the "Delete" Button
    Then I should be seeing that one of the Resource attached to this Product is removed on PopUp Window
    When I click the "Edit" Button
    #Then I should be seeing that additional PopUp window is opened to edit the one of the Resource attached to this Product
    #Then I should be seeing that the "Resource Type" that is choosen for editing is displayed with the characteristic on additional PoPup window and can not be edited
    #Then I should be seeing that field format of characteristic is TextBox or DropDown List
    #When I choose one of the characteristic that is belong to resource for editing on additional PopUp Window
    #Then I should be seeing that the characteristic can be edited
    When I click the "Add Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    Then I should be seeing that "Resource Type" field is displayed for Product Widget
    When I select a value "testSpec1" in the Resource Type field
    Then I should be seeing that "Premium Value" field is displayed for Product Widget
    #Then I should be seeing that value of the Resource Type field are the values that will be coming from the Resource Catalogue
    And  I enter a value "testvalue" in the PremiumValue field
    And  I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    And  I should be seeing the popup alert message "Technical Resources" for Customer360 Page
    #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Technical Resources" for Customer360 Page



  @regression @pia @skeda @VFALFT-12481
    Scenario: Test FE Skeda Network Inv Backoffice for Individual Customer on Product
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
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Tecnical Resource Information" button for Product Widget
    And  I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    And  I should be seeing that "Resource Type" for Product Tab
    And  I should be seeing that "Resource Name" for Product Tab
    And  I should be seeing that "Status" for Product Tab
    And  I should be seeing that "MAC/TEL/USER" for Product Tab
    And  I should be seeing that "Actions" for Product Tab
    And  I should be seeing that "Delete" for Product Tab
    And  I should be seeing that "Edit" for Product Tab
    When I click "Delete" for Product widget
    When I click "Yes" for Product widget
    And  I should be seeing that "TERMINATED" for Product Tab
    When I click the "Edit" Button
    And  I should be seeing that "Update Resource" for Product Tab
    Then I should be seeing that "Resource Type" field is not editable for Update Resource Page
    When I enter a value "12345" in the MacAddress field for Update Resource Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    Then I should be seeing that "12345" field is displayed for Product Widget
      #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Technical Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    When I click the "Add Technical Resource" Button
    #And  I select a value "test" in the Resource Name Field
    #And  I select a value "1" in the Resource Value Field
    #Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    #And  I should be seeing that "test" for Product Tab
    #And  I should be seeing that "ASSIGNED" for Product Tab


  @regression @pia @skeda @VFALFT-12482
    Scenario: Test FE Skeda Network Inv Backoffice for Corporate Customer on Product
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
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Tecnical Resource Information" button for Product Widget
    And  I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    And  I should be seeing that "Resource Type" for Product Tab
    And  I should be seeing that "Resource Name" for Product Tab
    And  I should be seeing that "Status" for Product Tab
    And  I should be seeing that "MAC/TEL/USER" for Product Tab
    And  I should be seeing that "Actions" for Product Tab
    And  I should be seeing that "Delete" for Product Tab
    And  I should be seeing that "Edit" for Product Tab
    When I click "Delete" for Product widget
    When I click "Yes" for Product widget
    And  I should be seeing that "TERMINATED" for Product Tab
    When I click the "Edit" Button
    And  I should be seeing that "Update Resource" for Product Tab
    Then I should be seeing that "Resource Type" field is not editable for Update Resource Page
    When I enter a value "12345" in the MacAddress field for Update Resource Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    Then I should be seeing that "12345" field is displayed for Product Widget
      #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Technical Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    When I click the "Add Technical Resource" Button
    #And  I select a value "test" in the Resource Name Field
    #And  I select a value "1" in the Resource Value Field
    #Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    #And  I should be seeing that "test" for Product Tab
    #And  I should be seeing that "ASSIGNED" for Product Tab





  @regression @pia @skeda @VFALFT-12483 @ignore
    Scenario: Test FE Link to Skeda BO from Customer 360 Services/Resources view for Individual Customer on Service Address
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
    Then I should be seeing that "Billing Address" for Tab
    And  I should be seeing that "Service Address" for Tab
    When I click "Service Address" widget
    Then I should be seeing that the "Service Address" widget is opened
    And  I should be seeing the popup alert message "Add Technical Resource" for Customer360 Page

  @regression @pia @skeda @VFALFT-12484 @ignore
    Scenario: Test FE Link to Skeda BO from Customer 360 Services/Resources view for Corporate Customer on Service Address
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
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Address" Tab for Customer360 Page
    Then I should be seeing that "Billing Address" for Tab
    And  I should be seeing that "Service Address" for Tab
    When I click "Service Address" widget
    Then I should be seeing that the "Service Address" widget is opened
    And  I should be seeing the popup alert message "Add Technical Resource" for Customer360 Page


  @regression @pia @skeda @VFALFT-12486 @ignore
    Scenario: Test FE Link to Skeda BO from Customer 360 Services/Resources view for Corporate Customer on Product
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
    #And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    #And  I select a value "FIBER" TVInfrastructure field
    #Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    #Then I should be seeing the popup alert message "Shopping cart created successfully!" for Products Page
    Then I should be seeing that "Vodafone Gigafibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    #And  I select a value "CARD" in the Payment Method field for Collect Payment & Confirm
    #And  I click the Payment Collected
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
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Modem Basic" for Product Tab
    When I click "Modem Basic" for Product widget
    When I click "Tecnical Resource Information" button for Product Widget
    And  I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    And  I should be seeing that "Resource Type" for Product Tab
    And  I should be seeing that "Resource Name" for Product Tab
    And  I should be seeing that "Status" for Product Tab
    And  I should be seeing that "MAC/TEL/USER" for Product Tab
    And  I should be seeing that "Actions" for Product Tab
#    And  I should be seeing that "Delete" for Product Tab
#    And  I should be seeing that "Edit" for Product Tab
#    When I click "Delete" for Product widget
#    When I click "Yes" for Product widget
#    And  I should be seeing that "TERMINATED" for Product Tab
#    When I click the "Edit" Button
#    And  I should be seeing that "Update Resource" for Product Tab
#    Then I should be seeing that "Resource Type" field is not editable for Update Resource Page
#    When I enter a value "12345" in the MacAddress field for Update Resource Page
#    When I click the "Save" Button
#    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
#    Then I should be seeing that "12345" field is displayed for Product Widget
      #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Technical Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    When I click the "Add Technical Resource" Button
    When I select a value "DATA" in the Resource Type field
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    And  I should be seeing that "DATA" for Product Tab
    And  I should be seeing that "ASSIGNED" for Product Tab
    #When I click Skeda Menu Button



  @regression @pia @skeda @VFALFT-12485
    Scenario: Test FE Link to Skeda BO from Customer 360 Services/Resources view for Individual Customer on Product
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
    When I select the "Customer Name" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    And  I click "Product" Tab for Customer360 Page
    And  I should be seeing that "Vodafone Gigafibra 30 Mbps" for Product Tab
    When I click "Vodafone Gigafibra 30 Mbps" for Product widget
    When I click "Tecnical Resource Information" button for Product Widget
    And  I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    Then I should be seeing that all the Resources attached to this Product
    And  I should be seeing that "Resource Type" for Product Tab
    And  I should be seeing that "Resource Name" for Product Tab
    And  I should be seeing that "Status" for Product Tab
    And  I should be seeing that "MAC/TEL/USER" for Product Tab
    And  I should be seeing that "Actions" for Product Tab
    And  I should be seeing that "Delete" for Product Tab
    And  I should be seeing that "Edit" for Product Tab
    When I click "Delete" for Product widget
    When I click "Yes" for Product widget
    And  I should be seeing that "TERMINATED" for Product Tab
    When I click the "Edit" Button
    And  I should be seeing that "Update Resource" for Product Tab
    Then I should be seeing that "Resource Type" field is not editable for Update Resource Page
    #When I enter a value "12345" in the MacAddress field for Update Resource Page
    When I click the "Save" Button
    Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    #Then I should be seeing that "12345" field is displayed for Product Widget
      #Then I should be seeing that additional Popup window is closed and new resource that is added is displayed on PopUp window
    When I click the "Add Technical Resource" Button
    Then I should be seeing the popup alert message "Add New Resource" for Customer360 Page
    When I click the Close button for Customer360 Page
    Then I should be seeing the popup alert message "Skeda Technical Resources" for Customer360 Page
    When I click the "Add Technical Resource" Button
    #And  I select a value "test" in the Resource Name Field
    #And  I select a value "1" in the Resource Value Field
    #Then I should be seeing the popup alert message "Resource added successfully!" for Customer360 Page
    #And  I should be seeing that "test" for Product Tab
    #And  I should be seeing that "ASSIGNED" for Product Tab
