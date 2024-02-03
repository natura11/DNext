#language: en

Feature: Trouble Ticket Management


  @regression @pia @troubleticketmanagement @VFALFT-13177 @smoke
    Scenario: Test DCM - Trouble Ticket Requires "Note" Tab to be Displayed With User Comments for Corporate
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Comments" field in the Ticket Details popup


  @regression @pia @troubleticketmanagement @VFALFT-13176 @smoke
    Scenario: Test DCM - Trouble Ticket Requires "Note" Tab to be Displayed With User Comments for Individual
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
    When I Create Ticket
      |name                   |description          |severity |priority   |ticketType             |custom1Value             |custom1ID|custom2Value|custom2ID|custom3Value|custom3ID|
      |Installation Management|Created By Automation|1        |Medium     |Installation Management|New Installation         |56       |25          |108      |BERAT       |109      |
    Then I should be seeing "Trouble Tickets" page
    When I click move vert icon for Extended Widget Page
    And  I click details button for Extended Widget Page
    Then I should be seeing "Ticket Details" page
    And  I should be seeing the Case Records "Comments" field in the Ticket Details popup