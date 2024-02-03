#language: en

Feature: Deactivate Fulfillment


  @regression @pia @deactivatefulfillment @VFALFT-13605 @smoke
  Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="yes" for Enterprise Customer
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    When I select a value "Yes" in the Customer Saved field
    And  I select a value "Saved Due to Penalty" in the Reason Detail field
    #And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message



  @regression @pia @deactivatefulfillment @VFALFT-13606 @smoke
    Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="no" and Penalty Waiving="no" for Enterprise Customer
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    When I select a value "No" in the Customer Saved field
    And  I select a value "Not Saved- Roaming" in the Reason Detail field
    #And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message



  @regression @pia @deactivatefulfillment @VFALFT-13607 @ignore
    Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="no" and Penalty Waiving="yes" for Enterprise Customer
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    Then I should be seeing that "Yes", "No" values in the Termination Request Cancelled Dropdown list
    When I select a value "No" in the Customer Saved field
    #Then I should be seeing that "Termination Reason" Dropdown list
    And  I should be seeing that "Penalty Waiving" Dropdown list
    #And  I should be seeing that "1", "2", "3" values in the Termination Reason Dropdown list
    #When I select a value "1" in the Termination Reason field
    Then I should be seeing that "Yes", "No" values in the Penalty Waiving Dropdown list
    When I select a value "Yes" in the Penalty Waiving field
    And  I select a value "1" in the Waiving Reason field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message


  @regression @pia @deactivatefulfillment @VFALFT-13609 @ignore
    Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="yes" for Individual Customer
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
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    Then I should be seeing that "Yes", "No" values in the Termination Request Cancelled Dropdown list
    When I select a value "Yes" in the Customer Saved field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message



  @regression @pia @deactivatefulfillment @VFALFT-13610 @ignore
    Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="no" and Penalty Waiving="no" for Individual Customer
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
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    Then I should be seeing that "Yes", "No" values in the Termination Request Cancelled Dropdown list
    When I select a value "No" in the Customer Saved field
    #Then I should be seeing that "Termination Reason" Dropdown list
    And  I should be seeing that "Penalty Waiving" Dropdown list
    #And  I should be seeing that "1", "2", "3" values in the Termination Reason Dropdown list
    #When I select a value "1" in the Termination Reason field
    Then I should be seeing that "Yes", "No" values in the Penalty Waiving Dropdown list
    When I select a value "No" in the Penalty Waiving field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message




  @regression @pia @deactivatefulfillment @VFALFT-13612 @ignore
    Scenario: Test Customer Retention Ticket with if Termination Request Cancelled="no" and Penalty Waiving="yes" for Individual Customer
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
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And  I enter a value "I have a problem about my customer" in the Body field
    And  I select value "Medium" in the Priority field
    And  I select value "Customer Retention" in the Case Type field
    Then I should be seeing that "Yes", "No" values in the Termination Request Cancelled Dropdown list
    When I select a value "No" in the Customer Saved field
    #Then I should be seeing that "Termination Reason" Dropdown list
    And  I should be seeing that "Penalty Waiving" Dropdown list
    #And  I should be seeing that "1", "2", "3" values in the Termination Reason Dropdown list
    #When I select a value "1" in the Termination Reason field
    Then I should be seeing that "Yes", "No" values in the Penalty Waiving Dropdown list
    When I select a value "Yes" in the Penalty Waiving field
    And  I select a value "1" in the Waiving Reason field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message


