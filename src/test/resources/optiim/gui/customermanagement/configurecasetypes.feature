#language: en

Feature: Configure Case Types


  @regression @pia @configurecasetypes @VFALFT-10962 @ignore
  Scenario: Residential Customer-Test Provide URL to customer 360 view for a single customer
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
    Then I should be seeing that an Icon which contains the URL Link at the top of Customer page
    When I click Icon to copy URL link
    Then I should be seeing the popup alert message "Copied to clipboard!" for Customer360 Page
    #When I click Icon to copy URL link
    #Then I should be seeing that the related customer is displayed
    #Then I should be seeing the values are correct for related the Resdential Customer


  @regression @pia @configurecasetypes @VFALFT-10963 @ignore
  Scenario: Corporate Customer-Test Provide URL to customer 360 view for a single customer
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
    Then I should be seeing that an Icon which contains the URL Link at the top of Customer page
    When I click Icon to copy URL link
    Then I should be seeing the popup alert message "Copied to clipboard!" for Customer360 Page
    #And  I should be seeing that the related customer is displayed
    #Then I should be seeing the values are correct for related the Corporate Customer


  @regression @pia @configurecasetypes @VFALFT-10864
  Scenario: Test Configure Initial Installation Ticket Type and Workflow for Residential Customer
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
    #Then I should be seeing the case list
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
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
    When I click Close Ticket button for Widget Page in the Customer Case Management
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "DK Residential New installation" in the Subject field
    And I enter a value "Description field for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    When I select value "Medium" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    When I select value "Installation Management" in the Case Type field
    And  I select value "Optimization" in the Sub Types field
    And  I select value "Support" in the Sub Types field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message


  @regression @pia @configurecasetypes @VFALFT-10911
  Scenario: Negative Scenarios - Test Configure Initial Installation Ticket Type and Workflow for Corporate Customer
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
    #Then I should be seeing the case list
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
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
    When I click Close Ticket button for Widget Page in the Customer Case Management
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "DK Residential New installation" in the Subject field for create ticket page
    And I enter a value "Description field for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    When I select value "Medium" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    When I select value "Installation Management" in the Case Type field
    And  I select value "Optimization" in the Sub Types field
    And  I select value "Support" in the Sub Types field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    #Then I should be seeing "Create" mandatory fields coming
    Then I should be seeing "Ticket Details" page

  @regression @pia @configurecasetypes @VFALFT-10910
  Scenario: Negative Sceneraios - Test Configure Initial Installation Ticket Type and Workflow for Residential Customer
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
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
    When I click Close Ticket button for Widget Page in the Customer Case Management
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    When I enter a value "DK Residential New installation" in the Subject field
    And I enter a value "Description field for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    When I select value "Medium" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    When I select value "Installation Management" in the Case Type field
    And  I select value "Optimization" in the Sub Types field
    And  I select value "Support" in the Sub Types field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    #Then I should be seeing "Create" mandatory fields coming
    Then I should be seeing "Ticket Details" page


  @regression @pia @configurecasetypes @VFALFT-10909 @smoke
  Scenario: Test Configure Initial Installation Ticket Type and Workflow for Corporate Customer
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
    When I enter a value "DK Residential New installation" in the Subject field for create ticket page
    And I enter a value "Description field for New installation" in the Body field
    #Then I should be seeing that "Urgent", "High", "Medium", "Low" values are displayed
    When I select value "Medium" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Soft Churn" Case Type coming in the drop down list
    And  I should be seeing "Other" Case Type coming in the drop down list
    And  I should be seeing "Customer Retention" Case Type coming in the drop down list
    And  I should be seeing "Device Replacement" Case Type coming in the drop down list
    And  I should be seeing "Support query" Case Type coming in the drop down list
    And  I should be seeing "Installation Management" Case Type coming in the drop down list
    And  I should be seeing "After Sales Incident Case Type" Case Type coming in the drop down list
    And  I should be seeing "Manual Order Ticket" Case Type coming in the drop down list
    And  I should be seeing "Survey Ticket" Case Type coming in the drop down list
    When I select value "Installation Management" in the Case Type field
    And  I select value "Optimization" in the Sub Types field
    And  I select value "Support" in the Sub Types field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "SLA" field in the Ticket Details popup
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
    And  I should be seeing the Case Records "Comments" field in the Ticket Details popup
    When I click Close Ticket button for Widget Page in the Customer Case Management

  @regression @pia @configurecasetypes @VFALFT-11241
    Scenario: Test Date Type Custom Fields should be supported in Trouble Ticket UI for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    #Given the order process is completed
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    #When I click the "Tickets" Button
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And I select value "Installation Management" in the Case Type field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    #And  I should be seeing that "2021-06-24T00:00:00Z" in the Ticket Details popup


  @regression @pia @configurecasetypes @VFALFT-11240
    Scenario: Test Date Type Custom Fields should be supported in Trouble Ticket UI for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    #Given the order process is completed
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And I select value "Installation Management" in the Case Type field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And I should be seeing this record will come in the Trouble Tickets area
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    #And  I should be seeing that "2021-06-24T00:00:00Z" in the Ticket Details popup




  @regression @pia @configurecasetypes @VFALFT-11239 @ignore
    Scenario: Test Date Type Custom Fields should be supported in Trouble Ticket UI for Individual Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    #Given the order process is completed
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And I select value "Installation Management" in the Case Type field
    And  I select value "New Installation" in the Sub Types field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And I should be seeing this record will come in the Trouble Tickets area
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    #And  I should be seeing that "2021-06-24T00:00:00Z" in the Ticket Details popup



  @regression @pia @configurecasetypes @VFALFT-11233 @ignore
    Scenario: Negative Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Residential Customer
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
    And I enter a value "" in the Body field
    Then I should be seeing "Description" mandatory fields coming
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "" in Order Item ID for Corporate Customer
    Then I should be seeing "Order Item ID" mandatory fields coming
    Then I click create button
    Then I should be seeing "Issue Category" mandatory fields coming




  @regression @pia @configurecasetypes @VFALFT-11223 @ignore
    Scenario: Negative Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Institute Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    #Given the order process is completed
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    #When I click the "Tickets" Button
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #When I enter a value "enterAndErase" in the Subject field for create ticket page
    #Then I should be seeing "Subject" mandatory fields coming
    And I enter a value "" in the Body field
    Then I should be seeing "Description" mandatory fields coming
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "" in Order Item ID for Corporate Customer
    Then I should be seeing "Order Item ID" mandatory fields coming
    #And I enter a value "" in Error on System for Corporate Customer
    #Then I should be seeing "Error On System" mandatory fields coming
    Then I click create button
    Then I should be seeing "Issue Category" mandatory fields coming

  @regression @pia @configurecasetypes @VFALFT-11180 @ignore
    Scenario: Positive Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Institute Customer
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
    Then I should be seeing that "Main Page" for Tab
    And  I should be seeing that "Product" for Tab
    And  I should be seeing that "Order" for Tab
    And  I should be seeing that "General" for Tab
    And  I should be seeing that "Address" for Tab
    And  I should be seeing that "Contact" for Tab
    #When I click the "Tickets" Button
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "123" in Order Item ID for Corporate Customer
    And I enter a value "asd" in Error on System for Corporate Customer
    And I select value "Error Ticket" in the Issue Category field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @configurecasetypes @VFALFT-11232 @ignore
    Scenario: Positive Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Residential Customer
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "123" in Order Item ID for Corporate Customer
    And I enter a value "asd" in Error on System for Corporate Customer
    And I select value "Error Ticket" in the Issue Category field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area


  @regression @pia @configurecasetypes @VFALFT-11234 @ignore
    Scenario: Positive Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Corporate Customer
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "123" in Order Item ID for Corporate Customer
    And I enter a value "asd" in Error on System for Corporate Customer
    And I select value "Error Ticket" in the Issue Category field
    And  I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    And I should be seeing this record will come in the Trouble Tickets area



  @regression @pia @configurecasetypes @VFALFT-11235 @ignore
    Scenario: Negative Scenario-Test Configure Manual Inspection Service Case Type and Workflow for Corporate Customer
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    #Given the order process is completed
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    #When I enter a value "enterAndErase" in the Subject field for create ticket page
    #Then I should be seeing "Subject" mandatory fields coming
    And I enter a value "" in the Body field
    Then I should be seeing "Description" mandatory fields coming
    And I select value "High" in the Priority field
    And  I click "Case Type" dropdown list
    And  I should be seeing "Connectivity Problems" Case Type coming in the drop down list
    And  I should be seeing "Booster Problems" Case Type coming in the drop down list
    And  I should be seeing "Corporate LAN" Case Type coming in the drop down list
    And  I should be seeing "Device Problems" Case Type coming in the drop down list
    And  I should be seeing "Hosting" Case Type coming in the drop down list
    And  I should be seeing "Internetwork Issue" Case Type coming in the drop down list
    And  I should be seeing "Other VAS Problems" Case Type coming in the drop down list
    And  I should be seeing "Power Issue" Case Type coming in the drop down list
    And  I should be seeing "Telephone" Case Type coming in the drop down list
    And I select value "Manual Inspection Service" in the Case Type field
    Then I should be seeing "Sub Type" field coming in the Ticket Details
    And  I select value "Vodafone TV" in the Sub Types field
    And I should be seeing "Order Item ID" field coming in the Ticket Details
    And I should be seeing "Error on System" field coming in the Ticket Details
    And I should be seeing "Issue Category" field coming in the Ticket Details
    And I enter a value "" in Order Item ID for Corporate Customer
    Then I should be seeing "Order Item ID" mandatory fields coming
    #And I enter a value "" in Error on System for Corporate Customer
    #Then I should be seeing "Error On System" mandatory fields coming
    Then I click create button
    Then I should be seeing "Issue Category" mandatory fields coming
