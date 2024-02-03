#language: en

Feature: Create Case

  @regression @pia @createcase @VFALFT-8881 @smoke
  Scenario: Test Render fields in DCase and DNext 360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I click Subject field
    And I click Description field
    And I click Priority field
    And I click Case Type field
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory fields coming
    #And  I should be seeing "Customer ID", "Subject", "Description", "Priority" and "Case Type" mandatory field coming

  @regression @pia @createcase @VFALFT-8882
  Scenario: Test Link Case to Customer
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory fields coming
    #And I should be seeing "Customer ID" field coming by default selected and not editable

  @regression @pia @createcase @VFALFT-9033 @smoke
  Scenario: Test Get Case Type Fields from DCase and DNext 360
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I click "Case Type" dropdown list
    And  I should be seeing "Soft Churn" Case Type coming in the drop down list
    And  I should be seeing "Other" Case Type coming in the drop down list
    And  I should be seeing "Customer Retention" Case Type coming in the drop down list
    And  I should be seeing "Device Replacement" Case Type coming in the drop down list
    And  I should be seeing "Support query" Case Type coming in the drop down list
    And  I should be seeing "Installation Management" Case Type coming in the drop down list
    And  I should be seeing "After Sales Incident Case Type" Case Type coming in the drop down list
    And  I should be seeing "Manual Order Ticket" Case Type coming in the drop down list
    And  I should be seeing "Survey Ticket" Case Type coming in the drop down list


  @regression @pia @createcase @VFALFT-9037
  Scenario: Test Get All Case Type Items Fields in DCase and DNext 360
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Residential Customer
      |name               |
      |Residential        |
    When I open "Customer360" menu
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I select value "Soft Churn" in the Case Type field
    Then I should be seeing "Sub Types" field coming in the Ticket Details
    When I select value "Hosting" in the Case Type field
    Then I should be seeing "Sub Types" field coming in the Ticket Details
    When I select value "Customer Retention" in the Case Type field
    Then I should be seeing "Sub Types" field coming in the Ticket Details
    When I select value "Telephony" in the Case Type field
    Then I should be seeing "Sub Types" field coming in the Ticket Details


  @regression @pia @createcase @VFALFT-8994 @smoke
  Scenario: Create case record on the DNext 360 degree - Connectivity Problems
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my business issue." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Soft Churn" in the Case Type field
    #And I select value "Coax line problem" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area

  @regression @pia @createcase @VFALFT-8551 @smoke
  Scenario: Create case record on the DNext 360 degree - Booster Problems
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my booster." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Support query" in the Case Type field
    #And I select value "Booster and the VF fixed network" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8549 @smoke
  Scenario: Create case record on the DNext 360 degree - Corporate LAN
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my Corporate LAN." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "After Sales Incident Case Type" in the Case Type field
    #And I select value "Connectivity" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8553 @smoke
  Scenario: Create case record on the DNext 360 degree - Device Problems
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my device problems." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Soft Churn" in the Case Type field
    #And I select value "Restart device" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8550 @smoke
  Scenario: Create case record on the DNext 360 degree - Hosting
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my hosting." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Perditesim te dhenash per klientin" in the Case Type field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8552 @smoke
  Scenario: Create case record on the DNext 360 degree - Internetwork Issue
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my internetwork issue." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Other" in the Case Type field
    #And I select value "Loop" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8554 @smoke
  Scenario: Create case record on the DNext 360 degree - Other VAS Problems
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my other vas problems." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Device Replacement" in the Case Type field
    #And I select value "Firmware Issue" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-8555 @smoke
  Scenario: Create case record on the DNext 360 degree - Power Issue
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
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my power issue." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Manual Order Ticket" in the Case Type field
    #And I select value "Interruptions problem" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @createcase @VFALFT-11355 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Residential Customer on Single Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers


  @regression @pia @createcase @VFALFT-11356 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Corporate Customer on Single Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers



  @regression @pia @createcase @VFALFT-11357 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Institute Customer on Single Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers




  @regression @pia @createcase @VFALFT-11358 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Residential Customer on Extended Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers



  @regression @pia @createcase @VFALFT-11359 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Corporate Customer on Extended Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers


  @regression @pia @createcase @VFALFT-11360 @ignore
    Scenario: Test FE-DCM 360 view Link to Customer from Faveo ticket for Institute Customer on Extended Widget
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
    When I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    Given I have opened the "DCase" application
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    #When I click the Customer Name on Treads widget
    #Then I should be seeing that the "Customer360" page is opened with the related customers


  @regression @pia @createcase @VFALFT-11415 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Residential Customer on Single Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed


  @regression @pia @createcase @VFALFT-11416 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Corporate Customer on Single Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed




  @regression @pia @createcase @VFALFT-11417 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Institute Customer on Single Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click main move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed


  @regression @pia @createcase @VFALFT-11418 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Residential Customer on Extended Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    #When I click the three dots and click the extend button
    #Then I should be seeing that Extended Trouble Widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed



  @regression @pia @createcase @VFALFT-11419 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Corporate Customer on Extended Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    #When I click the three dots and click the extend button
    #Then I should be seeing that Extended Trouble Widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed


  @regression @pia @createcase @VFALFT-11420 @ignore
    Scenario: Test FE - Create DCase link for the trouble ticket in DCM 360 view for Institute Customer on Extended Widget
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    #When I click the three dots and click the extend button
    #Then I should be seeing that Extended Trouble Widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed


  @regression @pia @createcase @VFALFT-11517 @ignore
    Scenario: Test BE-Modification in DCase Faveo code for ContextUrl field
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
    And  I click "Tickets" widget
    Then I should be seeing that the "Tickets" widget is opened
    #When I click the three dots and click the extend button
    #Then I should be seeing that Extended Trouble Widget is opened
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #Then I should be seeing that "Subject" field is a Text Area
    #Then I should be seeing that "Description" field is a Text Area
    #Then I should be seeing that "Priority" field is Drop-down list
    #Then I should be seeing that "Case Type" field is Drop-down list
    When I enter a value "Optimization Issue" in the Subject field for create ticket page
    And I enter a value "Optimization Problem" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    And I select value "Urgent" in the Priority field
    #Then I should be seeing that "Case Type" field is Drop-Down list
    And I select value "Installation Management" in the Case Type field
    #Then I should be seeing that "Sub Types" field is Drop-Down list
    And  I select value "Support" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    When I click move vert icon
    And  I click details button
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Sla" field in the Ticket Details popup
    And  I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Description" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And  I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And  I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And  I should be seeing the Case Records "Status History" field in the Ticket Details popup
    When I click move vert icon
    And  I click Faveo button
    Then I should be seeing login page
    When I click login field
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Optimization Issue" in the filter search bar
    Then I should be seeing that Ticket that I created previously is displayed
    And  I should be seeing that Customer Name and Ticket Description are displayed
    Then I should be seeing that the DNextContextUrl field is Link
    When I click the DNextContextUrl field
    Then I should be seeing that Customer is displayed in the Customer360 view page



  @regression @pia @createcase @VFALFT-11613 @ignore
    Scenario: Test Configuration DCase Webhook - Ticket Owner Update
    Given I have opened the "DCase" application
    #When I Create Aggregated Corporate Customer
      #|name               |
      #|Corporate          |
    #When I Create Ticket
      #|name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      #|Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Test" in the filter search bar
    When I click on one of the Ticket
    Then I should be seeing that the "Ticket details" page for Dcase application
    #When I update the Ticket Owner and click Update button
    #Then I should be seeing that the ticket owner updated action is captured by Webhook faveoEvent API URL will be called
    #Then I should be seeing that The faveoEvent API trigger the Camunda BPMNs to perform the required action
    #Then I should be seeing that ticket Owner is updated



  @regression @pia @createcase @VFALFT-11614 @ignore
    Scenario: Test Configuration DCase Webhook - Ticket Assigned
    Given I have opened the "DCase" application
    #When I Create Aggregated Corporate Customer
      #|name               |
      #|Corporate          |
    #When I Create Ticket
      #|name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      #|Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Test" in the filter search bar
    When I click on one of the Ticket
    Then I should be seeing that the "Ticket details" page for Dcase application
    #When I click "Assign" button for Ticket details
    #Then I should be seeing that the "Ticket duedate successfully changed" page for Dcase application



  @regression @pia @createcase @VFALFT-11615 @ignore
    Scenario: Test Configuration DCase Webhook - Ticket Due Date Update
    Given I have opened the "DCase" application
    #When I Create Aggregated Corporate Customer
      #|name               |
      #|Corporate          |
    #When I Create Ticket
      #|name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      #|Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Test" in the filter search bar
    When I click on one of the Ticket
    Then I should be seeing that the "Ticket details" page for Dcase application
    When I click "Change Due Date" button for Ticket details
    When I enter a value "" in the Due Date Field
    When I click "Update" button for Ticket details
    Then I should be seeing that the "Ticket duedate successfully changed" page for Dcase application


  @regression @pia @createcase @VFALFT-11612 @ignore
    Scenario: Test Configuration DCase Webhook - Ticket Department Update
    Given I have opened the "DCase" application
    #When I Create Aggregated Corporate Customer
      #|name               |
      #|Corporate          |
    #When I Create Ticket
      #|name                    |description          |severity |priority |ticketType                     |custom1Value   |custom1ID|custom2Value|custom2ID|
      #|Fix Line Sales Case Type|Created By Automation|1        |High     |Fix Line Sales Case Type       |TV Products    |66       |test1       |67       |
    When I click login field
    Then I should be seeing login page
    When I enter a valid username "faveo" in the user name field
    And I enter a valid password "wa7upRlsIpu_" in the password field
    And I press the login button
    Then I should be seeing have successfully logged in
    When I click "Tickets" button for dcase menu
    When I click "Inbox" button for dcase menu
    When I enter the "Test" in the filter search bar
    When I click on one of the Ticket
    Then I should be seeing that the "Ticket details" page for Dcase application
    When I click "Change Department" button for Ticket details
    When I enter a value "First Line Supp" in the Department Field
    When I click "Update" button for Ticket details
    Then I should be seeing that the "Ticket Department Successfully Changed" page for Dcase application



  @regression @pia @createcase @VFALFT-13182
    Scenario: Test DCM UI- Trouble Ticket Subject To Include Customer Name & ID
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
    #When I click the "Tickets" Button
    Then I should be seeing "Trouble Tickets" page
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    #Then I should be seeing that "customer name and id" in trouble ticket subject



  @regression @pia @createcase @VFALFT-13786 @smoke
    Scenario: Test Installation Ticket per Service Address (Individual)
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
    When I enter a value "42" in the MacAddress field
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
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Installation Management"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable



  @regression @pia @createcase @VFALFT-13953 @smoke
    Scenario: Test Installation Ticket per Service Address (Enterprise)
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
    When I enter a value "43" in the MacAddress field
    When I click the Add to Cart button
    Then I should be seeing that "Vodafone Gigafibra 50 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
    When I click the Proceed button
    Then I should be seeing the popup alert message "Checkout is successfully completed" for Products Page
    Given I have opened the "Customer Management" application
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "Onu Serial for Fiber Subscriptions", "IP", "Fix Phone Number" values are displayed
    When I select the "NIPT" value from Select Search Type DropdownList
    And  I enter "" value on Search field and click Search button
    Then I should be seeing that a related customer can be displayed
    When I click on related customer from search list
    And  I click "Product" Tab for Customer360 Page
    Then I should be seeing that  "Product List" widget is displayed in the Tab
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Installation Management"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable


  @regression @pia @createcase @VFALFT-13954
    Scenario: Test Installation Ticket per Service Address (Institute)
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    When I Create Aggregated Institute Customer
      |name               |
      |Institute          |
    When I open "Customer360" menu
    Then I should be seeing that the "Customer Search" page is opened
    And  I should be seeing that Select Search Type field is a Dropdown list
    And  I should be seeing that "Customer Name", "Personal Number", "NIPT", "Mac Of Device", "Card Serial", "Username of PPoE", "", "IP", "Fix Phone Number" values are displayed
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
    And  I click "Account" Tab for Customer360 Page
    When I click the New Order button for Postpaid
    Then I should be seeing that New Order page is opened
    When I select "T-VODAFONE GIGAFIBRA 30 MBPS" product and click
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" Offer product is selected
    When I select a value "24MonthCommitment" Product Term field
    When I click  the "Modem Basic" Add-on product
    Then I should be seeing the popup alert message "Product is added successfully" for Products Page
    When I enter a value "0024d1822c83" in the MacAddress field
    And  I enter a value "48575443AB31D1A8" in the PPPoEUser field
    And  I select a value "FIBER" TVInfrastructure field
    Then I should be seeing that a value is selected and Add to Card button becomes visible
    When I click the Add to Cart button
    Then I should be seeing that "T-Vodafone GigaFibra 30 Mbps" my selected additional product is displayed
    Then I should be seeing that "Modem Basic" my selected additional product is displayed
    When I click the Checkout button
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
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Installation Management"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable

