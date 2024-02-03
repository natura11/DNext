#language: en

Feature: Installation


  @regression @pia @installation @VFALFT-11151 @uat @smoke
  Scenario: Test Create Initial Installation Ticket for Residential Customer
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
    #When I click "Tickets" widget
    #Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TEST Residential Customer New installation" in the Subject field for create ticket page
    And I enter a value "TEST Description for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Medium" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "New Installation" in the Sub Types field
#    And  I enter a value "TEST VODAFONE ONE" in the Shop field
#    And  I enter a value "Tirane" in the Service Address City field
#    And  I enter a value "2003-06-04T00:00:00Z" in the Appointment Date & Time field
#    And  I enter a value "2021-06-24T00:00:03Z" in the Service Activation Date field
#    And  I enter a value "A2:C4:F5:D8:E9" in the MAC Address field
#    And  I enter a value "0200912010" in the Order Item Number field
#    And  I enter a value "ABCDEGHB" in the Serial Number field for Trouble Tickets Page
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #Then I should be seeing that Severity is "2" for individual residential customer
    #Then I should be seeing that a summary including these fields are displayed; customer name, customer contact info, service address, product detail, offer details, complete order detail, bundle/add-on info


  @regression @pia @installation @VFALFT-11152 @uat
  Scenario: Negative Test Create Initial Installation Ticket for Residential Customer
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
    #When I click "Tickets" widget
    #Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TEST Residential Customer New installation" in the Subject field for create ticket page
    And I enter a value "TEST Description for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Medium" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "New Installation" in the Sub Types field
    #And  I enter a value "TEST VODAFONE ONE" in the Shop field
    #And  I enter a value "Tirane" in the Service Address City field
    #And  I enter a value "2003-06-04T00:00:00Z" in the Appointment Date & Time field
    #And  I enter a value "2021-06-24T00:00:03Z" in the Service Activation Date field
    #And  I enter a value "A2:C4:F5:D8:E9" in the MAC Address field
    #And  I enter a value "0200912010" in the Order Item Number field
    #And  I enter a value "ABCDEGHB" in the Serial Number field for Trouble Tickets Page
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #Then I should be seeing that Severity is "2" for individual residential customer
    #Then I should be seeing that a summary including these fields are displayed; customer name, customer contact info, service address, product detail, offer details, complete order detail, bundle/add-on info
    #Then I should be not seeing an error message in the mandatory field


  #@regression @pia @installation @VFALFT-11153
  #Scenario: Test Create Initial Installation Ticket for Corporate Customer
    #Given I have opened the "Customer Management" application
    #When I Create Corporate Customer "C"



  #@regression @pia @installation @VFALFT-11154
  #Scenario: Negative Test Create Initial Installation Ticket for Corporate Customer
    #Given I have opened the "Customer Management" application
    #When I have logged into the system.
    #When I Create Corporate Customer "C"
    #When I click "Customer360" menu
    #Then I should be seeing that the "Customer360" page is opened
    #Given I select "NIPT" from Search Type
    #When I enter "A01020304B" value on Search field and click Search button
    #Then I should be seeing that a related corporate customer can be displayed
    #When I click the Main Page tab and General sub-tab
    #Then I should be seeing that Main Page tab and General sub-tab is opened
    #When I click the "Tickets" widget
    #Then I should be seeing that "Tickets" widget is opened
    #When I checked the fields in Ticket Details popup window
    #Then I should be seeing that Ticket Details popup window contains Subject, Description, Status, Priority, Case Type fields in the same window
    #When I leave "Subject" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Description" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Status" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Priority" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Case Type" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #Given I have select the "Installation Management" from "Case Type" field
    #When I leave "Sub Types" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #Given I have select the "New Installation" from "Sub Types" field
    #When I leave "Shop" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Service Address City" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I leave "Order Item Number" field empty and click "Create" button
    #Then I should be seeing an error message about the mandatory field
    #When I would be saving the ticket and click "Create" button
    #Then I should be not seeing an error message in the mandatory field


  @regression @pia @installation @VFALFT-11500 @ignore
    Scenario: Test BE-Installation Ticket Revision for Corporate Customer
    Given I have opened the "Customer Management" application
   #Given the Residential Customer is created
   #When I click "Customer360" menu
   #Then I should be seeing that the "Customer360" page is opened
   #Given I select "NIPT" from Search Type
   #When I enter "A01020304B" value on Search field and click Search button
   #Then I should be seeing that a related corporate customer can be displayed
   #Given the product bought by the customer is defined with Mac Address,Serial Number, Appoitnment Date And Time and Service Activation Date configurable characteristics
   #When I go to Product tab
   #Then I should be seeing that Product tab is opened
   #When I click on New Order button
   #Then I should be seeing that product list is opened which is related with city information for the customer
   #When I click on the product including desired configurable characteristics
   #Then I should be seeing that Product page is opened
   #Given the configurable characterics fields are populated
   #And offering term is selected as "12 Monhts Commitment"
   #When I click on "Add to Card" button
   #Then I should be seeing that product is added to Shopping Card
   #And a warning appears as "Shopping Card is updated successfully"
   #When I click on "Go to Shopping Card" button
   #Then I should be seeing that Shopping Card page is opened
   #When I click on checkout button
   #Then I should be seeing that a warning as "Checkout is successfully completed" displayed
   #When I go to Customer 360 view / Order tab
   #Then I should be seeing that Order related to product which is bought by customer
   #When I check the Backend side
   #Then I should be seeing that ProductOrder.Id, ProductOrder.Description and ProductOrder.RelatedParty.Name are displayed with correct values
   #When I go to Customer 360 view / General tab / Tickets widget
   #Then I should be seeing that ticket related with product order is displayed
   #When I check the Backend side
   #Then I should be seeing that Customer Name, Address, City and phoneNumber fields are displayed with correct values
   #When I check the Ticket Subject value from Backend side
   #Then I should be seeing that Ticket Subject is starting with 'INST' + Order id + customer name+City+Address
   #When I check Severity on Backend side
   #Then I should be seeing that Severity value is "1" for corporate customer
   #When I check the priority field from Backend side
   #Then I should be seeing that Priority is "Medium"
   #When I check ticketType from Backend side
   #Then I should be seeing that ticketType is "Installation Management"
   #When I check "id":"99" from pExtension values on Backend side
   #Then I should be seeing that its value as "New Installation"
   #When I check "id":"100" from pExtension values on Backend side
   #Then I should be seeing that its value as "100000"
   #When I check "id":"101" from pExtension values on Backend side
   #Then I should be seeing that its value as "BERAT" as city information related with customer
   #When I check "id":"104" from pExtension values on Backend side
   #Then I should be seeing that its value as  "1232" as Product Order id information related with customer
   #When I check "id":"143" from pExtension values on Backend side
   #Then I should be seeing that its value as "1223"  as Geographical id information related with customer
   #When I check "id":"106" from pExtension values on Backend side
   #Then I should be seeing that its value as  "6762a7cc" as OrderItemId information related with customer
   #When I check "id":"142" from pExtension values on Backend side
   #Then I should be seeing that its value as  "2021-07-01 14:00:00" as AppoitnmentDateAndTime information related with customer
   #When I check "id":"134" from pExtension values on Backend side
   #Then I should be seeing that its value as  "2021-07-05 14:00:00" ServiceActivationDate information related with customer


  @regression @pia @installation @VFALFT-11499 @ignore
    Scenario: Test BE-Installation Ticket Revision for Residential Customer
    Given I have opened the "Customer Management" application
    #Given the Residential Customer is created
    #When I click "Customer360" menu
    #Then I should be seeing that the "Customer360" page is opened
    #Given I select "Personal Number" from Search Type
    #When I enter "A01020304B" value on Search field and click Search button
    #Then I should be seeing that a related residential customer can be displayed
    #Given the product bought by the customer is defined with Mac Address,Serial Number, Appoitnment Date And Time and Service Activation Date configurable characteristics
    #When I go to Product tab
    #Then I should be seeing that Product tab is opened
    #When I click on New Order button
    #Then I should be seeing that product list is opened which is related with city information for the customer
    #When I click on the product including desired configurable characteristics
    #Then I should be seeing that Product page is opened
    #Given the configurable characterics fields are populated
    #And offering term is selected as "12 Monhts Commitment"
    #When I click on "Add to Card" button
    #Then I should be seeing that product is added to Shopping Card
    #And a warning appears as "Shopping Card is updated successfully"
    #When I click on "Go to Shopping Card" button
    #Then I should be seeing that Shopping Card page is opened
    #When I click on checkout button
    #Then I should be seeing that a warning as "Checkout is successfully completed" displayed
    #When I go to Customer 360 view / Order tab
    #Then I should be seeing that Order related to product which is bought by customer
    #When I check the Backend side
    #Then I should be seeing that ProductOrder.Id, ProductOrder.Description and ProductOrder.RelatedParty.Name are displayed with correct values
    #When I go to Customer 360 view / General tab / Tickets widget
    #Then I should be seeing that ticket related with product order is displayed
    #When I check the Backend side
    #Then I should be seeing that Customer Name, Address, City and phoneNumber fields are displayed with correct values
    #When I check the Ticket Subject value from Backend side
    #Then I should be seeing that Ticket Subject is starting with 'INST' + Order id + customer name+City+Address
    #When I check Severity on Backend side
    #Then I should be seeing that Severity value is "2" for indvidual customer
    #When I check the priority field from Backend side
    #Then I should be seeing that Priority is "Medium"
    #When I check ticketType from Backend side
    #Then I should be seeing that ticketType is "Installation Management"
    #When I check "id":"99" from pExtension values on Backend side
    #Then I should be seeing that its value as "New Installation"
    #When I check "id":"100" from pExtension values on Backend side
    #Then I should be seeing that its value as "100000"
    #When I check "id":"101" from pExtension values on Backend side
    #Then I should be seeing that its value as "BERAT" as city information related with customer
    #When I check "id":"104" from pExtension values on Backend side
    #Then I should be seeing that its value as  "1232" as Product Order id information related with customer
    #When I check "id":"143" from pExtension values on Backend side
    #Then I should be seeing that its value as "1223"  as Geographical id information related with customer
    #When I check "id":"106" from pExtension values on Backend side
    #Then I should be seeing that its value as  "6762a7cc" as OrderItemId information related with customer
    #When I check "id":"142" from pExtension values on Backend side
    #Then I should be seeing that its value as  "2021-07-01 14:00:00" as AppoitnmentDateAndTime information related with customer
    #When I check "id":"134" from pExtension values on Backend side
    #Then I should be seeing that its value as  "2021-07-05 14:00:00" ServiceActivationDate information related with customer


  @regression @pia @installation @VFALFT-13966 @smokep
    Scenario: Test Order ID in Installation Ticket
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Corporate Customer
      |name               |
      |Corporate          |
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
    When I select "Vodafone Gigafibra 50 Mbps" product and click
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" Offer product is selected
    When I select a value "random" Product Term field
    When I click  the "Akses Fee per Modem Basic" Add-on product
    When I select a value "random" Product Term field for Purchasable Resources
    When I enter a value "9" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Akses Fee per Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Given I have opened the "Customer Management" application
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    When I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Order" Tab for Customer360 Page
    Then I should be seeing that "Order Id" for Tab
    Then I should be seeing that "Order Status" for Tab
    Then I should be seeing that "Order Date" for Tab
    When I click "Modem Basic" widget
    Then I should be seeing that "Order Detail" field is displayed for Widget
    Then I should be seeing that "Order Info" field is displayed for Widget
    Then I should be seeing that "Order Id" field is displayed for Widget
    Then I should be seeing that "Order Date" field is displayed for Widget
    Then I should be seeing that "Payment Method" field is displayed for Widget
    When I should be seeing "Order Id" value

