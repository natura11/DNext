#language: en

Feature: Escalate Case

  @regression @pia @escalatecase @VFALFT-9373 @smoke
    Scenario: Test Negative Scenarios for Auto escalation for Corporate Customers
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Ticket Details" page
    And  I enter a value "" in the Subject field for create ticket page
    And  I enter a value "" in the Body field
    And  I click Priority field
    And  I click Case Type field
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory fields coming
    When I select value "Manual Order Ticket" in the Case Type field
    #Then I should be seeing "Sub Type" field coming in the Ticket Details
    When I click create button
    Then I should be seeing "Ticket Details" page
    #Then I should be seeing that a warning is displayed


  @regression @pia @escalatecase @VFALFT-9205 @smoke
    Scenario: Auto escalation for Corporate Customers
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
    Then I should be seeing "Trouble Tickets" page
    When I click Create New button
    Then I should be seeing "Subject", "Description", "Priority" and "Case Type" mandatory field coming
    When I enter a value "Test Ticket" in the Subject field for create ticket page
    And  I enter a value "Test Deneme Ticket" in the Body field
    When I select value "Medium" in the Priority field
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
    When I select value "Manual Order Ticket" in the Case Type field
    #Then I should be seeing "Sub Type" field coming in the Ticket Details
    #When I select "Coax line problem" in the Sub Type field
    #When I enter a value "Test Information" in the Product Information field
    #And  I select value "I want to upgrade or change my plan (or contract)" in the Issue Category field
    When I click create button
    Then I should be seeing "New ticket added successfully!" alert popup message
    #And  I should be seeing this record will come in the Trouble Tickets area
    #When I check the Severity value for this corporate customer`s ticket
    #Then I should be seeing that Severity value is displayed as "1"