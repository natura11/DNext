#language: en

Feature: Show Cases

  @regression @pia @showcases @VFALFT-8869 @smoke
  Scenario: Filter case record on Dnext 360 degree
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
    When I enter a value "Installation Management" in the Search field
    Then I should be seeing tickets will come about "Installation Management"

  @regression @pia @showcases @VFALFT-8880 @smoke
  Scenario: Retrieve fields from Case Management to show
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
    And I should be seeing the Case Records "Status" field
    And I should be seeing the Case Records "Subject" field
    And I should be seeing the Case Records "Priority" field
    And I should be seeing the Case Records "Expected Resolution Date" field
    And I should be seeing the Case Records "Ticket ID" field
    And I should be seeing the Case Records "Assignee" field
    And I should be seeing the Case Records "Case Type" field
    And I should be seeing the Case Records "Creation Date" field

  @regression @pia @showcases @VFALFT-8985 @smoke
  Scenario: Link in the dcase from DNext 360
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
    When I click update button
    #Then I should be seeing that the page navigate to TroubleTicketUI page and related ticket is displayed in TroubleTicketUI

  @regression @pia @showcases @VFALFT-8995
  Scenario: Checking fields on the DNext 360 Trouble Ticket Details
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
    And I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And I should be seeing the Case Records "Description" field in the Ticket Details popup
    And I should be seeing the Case Records "Status" field in the Ticket Details popup
    And I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And I should be seeing the Case Records "Product Information" field in the Ticket Details popup

  @regression @pia @showcases @VFALFT-9916 @smoke
  Scenario: Test DCase - Status "Resolved" will be added to the ticket Status
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
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my billing." in the Body field
    And I select value "Medium" in the Priority field
    And I select value "Installation Management" in the Case Type field
    And I select value "Optimization" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    When I click Close button for Widget Page in the Customer Case Management
    #Then I should be seeing that the extended trouble widget as a popup displays all details of that specific ticket



  @regression @pia @showcases @VFALFT-9627 @smoke
  Scenario: Test Filter Cases for most relevant cases
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
    Then I should be seeing that "Product" for Tab
    Then I should be seeing that "Order" for Tab
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I enter a value "Installation Management" in the Search field
    Then I should be seeing tickets will come about "Installation Management"




  @regression @pia @showcases @VFALFT-9630
  Scenario: Test Extended Trouble Tickets Widget
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
    And I should be seeing the Case Records "Status" field
    And I should be seeing the Case Records "Subject" field
    And I should be seeing the Case Records "Priority" field
    And I should be seeing the Case Records "Expected Resolution Date" field
    And I should be seeing the Case Records "Ticket ID" field
    And I should be seeing the Case Records "Assignee" field
    And I should be seeing the Case Records "Case Type" field
    And I should be seeing the Case Records "Creation Date" field
    #Then I should be seeing that "Customer ID, Ticket ID,Subject,Description, Status, Priority, Assignee, Severity, SLA, Creation & Resolution Dates andStatus History, Custom fields" are displayed in the Trouble Ticket List
    #When I check the formats of the fields in the Trouble Ticket List
    #Then I should be seeing that the fields in the Trouble Ticket List are displayed as read-only fashion
    #Then I should be seeing that the tickets are ordered by creation date in descending order
    #Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    #And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    When I click Close button for Widget Page in the Customer Case Management
    Then I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed


    #single-extend ---> common ticket field
  @regression @pia @showcases @VFALFT-9629 @ignore
  Scenario: Test Single Trouble Ticket View Widget
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
    And  I should be seeing the Case Records "Ticket ID" field
    And  I should be seeing the Case Records "Subject" field
    And  I should be seeing the Case Records "Description" field
    And  I should be seeing the Case Records "Status" field
    And  I should be seeing the Case Records "Priority" field
    And  I should be seeing the Case Records "Severity" field
    And  I should be seeing the Case Records "Custom Fields" field
    And  I should be seeing the Case Records "Creation Date" field
    And  I should be seeing the Case Records "Expected Resolution Date" field
    #Then I should be seeing that "Customer ID, Ticket ID,Subject,Description, Status, Priority, Assignee, Severity, SLA, Creation & Resolution Dates andStatus History, Custom fields" are displayed in the Trouble Ticket List
    #When I check the formats of the fields in the Trouble Ticket List
    #Then I should be seeing that the fields in the Trouble Ticket List are displayed as read-only fashion
    #Then I should be seeing that the tickets are ordered by creation date in descending order
    #Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Status" field in the Ticket Details popup
    And  I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And  I should be seeing the Case Records "Priority" field in the Ticket Details popup
    #And  I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    When I click Close button for Widget Page in the Customer Case Management
    Then I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed


  @regression @pia @showcases @VFALFT-10966
    Scenario: Residential Customer-Test DCase- show SLA and Assignee fields in Trouble Ticket detail view in TroubleTicket UI
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
    #And  I should be seeing the Case Records "Customer ID" field in the Ticket Details popup
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
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    #Then I should be seeing that "SLA" field is displayed with populated value including severity level "1"
    #Then I should be seeing that "Assignee" field is displayed with correct Assigne Info and is not editable
    #Then I should be seeing that "Ticket ID" field is displayed and is not editable
    Then I should be seeing that "Created Date" field is not editable
    #Then I should be seeing that values are correct and are related to the Customer on Ticket Details popup window
    #Then I should be seeing that the"close" bustton is displayed
    #When I click the "close" button
    #Then I should be seeing that the single trouble ticket is displayed
    #Then I should be seeing that the Ticket Details popup window is redirct to Dcase



  @regression @pia @showcases @VFALFT-10964
    Scenario: Corporate Customer-Test DCase- show SLA and Assignee fields in Trouble Ticket detail view in TroubleTicket UI
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
    And  I should be seeing that the value of  the "Subject" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Description" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Priority" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Case Type" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Sub Types" is correct to the related customer for Ticket Details popup
    And  I should be seeing that the value of  the "Product Information" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Installation Ticket Number" is correct to the related customer for Ticket Details popup
    #And  I should be seeing that the value of  the "Issue Category" is correct to the related customer for Ticket Details popup
    #Then I should be seeing that "SLA" field is displayed with populated value including severity level "1"
    #Then I should be seeing that "Assignee" field is displayed with correct Assigne Info and is not editable
    #Then I should be seeing that "Ticket ID" field is displayed and is not editable
    Then I should be seeing that "Created Date" field is not editable
    #Then I should be seeing that values are correct and are related to the Customer on Ticket Details popup window
    #Then I should be seeing that the"close" bustton is displayed
    #When I click the "close" button
    #Then I should be seeing that the single trouble ticket is displayed
    #Then I should be seeing that the Ticket Details popup window is redirct to Dcase


  @regression @pia @showcases @VFALFT-8991 @ignore
    Scenario: Restricted Access fulfillment- If the ticket has been assigned to the someone who is not at the agent, the agent can not view and edit ticket
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
    When I enter a value "TA Ticket" in the Subject field for create ticket page
    And I enter a value "I have a problem about my connectivity problems." in the Body field
    And I select value "High" in the Priority field
    And I select value "Connectivity Problems" in the Case Type field
    And I select value "Coax line problem" in the Sub Types field
    And I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And I should be seeing this record will come in the Trouble Tickets area
    When I enter a value "AAAA-0000-0035" in the Search field
    Then I should be seeing tickets will not come about "AAAA-0000-0035"
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I select value "Medium" in the Priority field
    When I click update button
    #Then I should be seeing "An error occurred!" alert popup message




  @regression @pia @showcases @VFALFT-8990 @smoke
    Scenario: Restricted Access fulfillment- If the ticket has been assigned to the agent, the agent can view and edit ticket
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I enter a value "Installation Management" in the Search field
    Then I should be seeing tickets will come about "Installation Management"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I select value "Medium" in the Priority field
    When I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Trouble Ticket List




  @regression @pia @showcases @VFALFT-8996 @smoke
    Scenario: Checking whether the records before 30 days have been displayed or not
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
    When I enter a value "AAAA-0000-0035" in the Search field
    Then I should be seeing tickets will not come about "AAAA-0000-0035"




  @regression @pia @showcases @VFALFT-8993
    Scenario: Show max x cases(last 30 days) fulfillment after search in the Trouble Ticket Widget
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
    When I enter a value "Installation Management" in the Search field
    Then I should be seeing tickets will come about "Installation Management"


  @regression @pia @showcases @VFALFT-8992
    Scenario: Show max x cases(last 30 days) fulfillment in the Trouble Ticket UI
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
      #Then I should be seeing that Trouble Tickets list that are created before 30 days is displayed for related customer
    And  I should be seeing the case list


  @regression @pia @showcases @VFALFT-13861
    Scenario: Test DCase - In Ticket Extended view the "Custom Fields" column to be renamed as 'Case Type'
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
    Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I select value "Medium" in the Priority field
    When I click update button
    Then I should be seeing "Ticket updated successfully!" alert popup message
    Then I should be seeing "Trouble Tickets" page
    And  I should be seeing that the value of  the "Priority" is correct to the related customer for Trouble Ticket List


  @regression @pia @showcases @VFALFT-13934 @smoke
    Scenario: Test DCase - Description and subject fields should be static in 360 view (Individual)
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And I should be seeing the Case Records "Description" field in the Ticket Details popup
    And I should be seeing the Case Records "Status" field in the Ticket Details popup
    And I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And I should be seeing the Case Records "Comments" field in the Ticket Details popup
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable
    Then I should be seeing "Save" page
    When I click Close button for Widget Page in the Customer Case Management
    Then I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed



  @regression @pia @showcases @VFALFT-13936
    Scenario: Test DCase - Description and subject fields should be static in 360 view (Enterprise)
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And I should be seeing the Case Records "Description" field in the Ticket Details popup
    And I should be seeing the Case Records "Status" field in the Ticket Details popup
    And I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And I should be seeing the Case Records "Comments" field in the Ticket Details popup
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable
    Then I should be seeing "Save" page
    When I click Close button for Widget Page in the Customer Case Management for Enterprise and Institute Customer
    Then I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed



  @regression @pia @showcases @VFALFT-13937
    Scenario: Test DCase - Description and subject fields should be static in 360 view (Institute)
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    Then I should be seeing tickets will come about "Case Type"
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And I should be seeing the Case Records "SLA" field in the Ticket Details popup
    And I should be seeing the Case Records "Assignee" field in the Ticket Details popup
    And I should be seeing the Case Records "Ticket ID" field in the Ticket Details popup
    And I should be seeing the Case Records "Subject" field in the Ticket Details popup
    And I should be seeing the Case Records "Description" field in the Ticket Details popup
    And I should be seeing the Case Records "Status" field in the Ticket Details popup
    And I should be seeing the Case Records "Priority" field in the Ticket Details popup
    And I should be seeing the Case Records "Case Type" field in the Ticket Details popup
    And I should be seeing the Case Records "Created Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Expected Resolution Date" field in the Ticket Details popup
    And I should be seeing the Case Records "Sub Types" field in the Ticket Details popup
    And I should be seeing the Case Records "Product Information" field in the Ticket Details popup
    And I should be seeing the Case Records "Status History" field in the Ticket Details popup
    And I should be seeing the Case Records "Comments" field in the Ticket Details popup
    Then I should be seeing that "Created Date" field is not editable
    Then I should be seeing that "Description" field is not editable
    Then I should be seeing that "Subject" field is not editable
    Then I should be seeing that "Ticket ID" field is not editable
    Then I should be seeing that "Assignee" field is not editable
    Then I should be seeing that "SLA" field is not editable
    Then I should be seeing that "Expected Resolution Date" field is not editable
    Then I should be seeing "Save" page
    When I click Close button for Widget Page in the Customer Case Management for Enterprise and Institute Customer
    Then I should be seeing that detail popup window is closed and Extended Trouble Ticket List is displayed


  @regression @pia @showcases @VFALFT-13932 @smoke
    Scenario: Test DCase - Ticket's "Simple view" should be removed from Ticket widget in 360 view (Individual)
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
    When I click main move vert icon
    Then I should be seeing "Create" page
    Then I should be seeing "Refresh" page
    Then I should be not seeing "Extended" page
    Then I should be not seeing "Single" page


  @regression @pia @showcases @VFALFT-13933
    Scenario: Test DCase - Ticket's "Simple view" should be removed from Ticket widget in 360 view (Corporate)
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
    When I click main move vert icon
    Then I should be seeing "Create" page
    Then I should be seeing "Refresh" page
    Then I should be not seeing "Extended" page
    Then I should be not seeing "Single" page


  @regression @pia @showcases @VFALFT-13935
    Scenario: Test DCase - Ticket's "Simple view" should be removed from Ticket widget in 360 view (Institute)
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
    When I click main move vert icon
    Then I should be seeing "Create" page
    Then I should be seeing "Refresh" page
    Then I should be not seeing "Extended" page
    Then I should be not seeing "Single" page
