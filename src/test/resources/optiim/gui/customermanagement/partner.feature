#language: en

Feature: Partner


  @regression @pia @partner @VFALFT-12429 @smoke
    Scenario: Test FE Search And Display Partner Info-1
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    And  I click Partner menu
    Then I should be seeing that the "Partner Search" page is opened for Partner Page
    When I click the Select Search Type button
    Then I should be seeing that "Partner ID" values are displayed
    Then I should be seeing that "Site Code" values are displayed
    Then I should be seeing that "Siebel ID" values are displayed
    Then I should be seeing that "Partner Name" values are displayed


  @regression @pia @partner @VFALFT-12992 @smoke
    Scenario: Test FE Search And Display Partner Info-3
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    And  I click Partner menu
    Then I should be seeing that the "Partner Search" page is opened for Partner Page
    When I select a value "Partner Name" in the Partner Search Type field
    And  I enter a value "VF Shop Fotograf_2049" in the Search Text field
    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
    And  I should be seeing that the "Partner Count" page is opened for Partner Page
    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
    And  I should be seeing that the "Partner ID" page is opened for Partner Page
    And  I should be seeing that the "Partner Name" page is opened for Partner Page
    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
    And  I should be seeing that the "Partner Status" page is opened for Partner Page
    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
    And  I should be seeing that the "Name" page is opened for Partner Page
    And  I should be seeing that the "Role Type" page is opened for Partner Page
    And  I should be seeing that the "User Login" page is opened for Partner Page
    And  I should be seeing that the "Email" page is opened for Partner Page
    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page
    #And  I check values that all fields

  @regression @pia @partner @VFALFT-12465
    Scenario: Test FE Search And Display Partner Info-2
    Given I have opened the "Customer Management" application
    When I have logged into the system.
    And  I click Partner menu
    Then I should be seeing that the "Partner Search" page is opened for Partner Page
#    When I select a value "Partner ID" in the Partner Search Type field
#    And  I enter a value "201132" in the Search Text field
#    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
#    And  I should be seeing that the "Partner Count" page is opened for Partner Page
#    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
#    And  I should be seeing that the "Partner ID" page is opened for Partner Page
#    And  I should be seeing that the "Partner Name" page is opened for Partner Page
#    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
#    And  I should be seeing that the "Partner Status" page is opened for Partner Page
#    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
#    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
#    And  I should be seeing that the "Name" page is opened for Partner Page
#    And  I should be seeing that the "Role Type" page is opened for Partner Page
#    And  I should be seeing that the "User Login" page is opened for Partner Page
#    And  I should be seeing that the "Email" page is opened for Partner Page
#    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page
    When I select a value "Partner Name" in the Partner Search Type field
    And  I enter a value "VF Shop Rimbushje Elektronike_1351" in the Search Text field
    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
    And  I should be seeing that the "Partner Count" page is opened for Partner Page
    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
    And  I should be seeing that the "Partner ID" page is opened for Partner Page
    And  I should be seeing that the "Partner Name" page is opened for Partner Page
    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
    And  I should be seeing that the "Partner Status" page is opened for Partner Page
    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
    And  I should be seeing that the "Name" page is opened for Partner Page
    And  I should be seeing that the "Role Type" page is opened for Partner Page
    And  I should be seeing that the "User Login" page is opened for Partner Page
    And  I should be seeing that the "Email" page is opened for Partner Page
    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page
    When I select a value "Siebel ID" in the Partner Search Type field
    And  I enter a value "VF-11EX7XS" in the Search Text field
    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
    And  I should be seeing that the "Partner Count" page is opened for Partner Page
    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
    And  I should be seeing that the "Partner ID" page is opened for Partner Page
    And  I should be seeing that the "Partner Name" page is opened for Partner Page
    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
    And  I should be seeing that the "Partner Status" page is opened for Partner Page
    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
    And  I should be seeing that the "Name" page is opened for Partner Page
    And  I should be seeing that the "Role Type" page is opened for Partner Page
    And  I should be seeing that the "User Login" page is opened for Partner Page
    And  I should be seeing that the "Email" page is opened for Partner Page
    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page
#    When I select a value "Trading Name" in the Partner Search Type field
#    And  I enter a value "VF Shop Express Burreli_EXP002" in the Search Text field
#    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
#    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
#    And  I should be seeing that the "Partner Count" page is opened for Partner Page
#    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
#    And  I should be seeing that the "Partner ID" page is opened for Partner Page
#    And  I should be seeing that the "Partner Name" page is opened for Partner Page
#    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
#    And  I should be seeing that the "Partner Status" page is opened for Partner Page
#    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
#    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
#    And  I should be seeing that the "Name" page is opened for Partner Page
#    And  I should be seeing that the "Role Type" page is opened for Partner Page
#    And  I should be seeing that the "User Login" page is opened for Partner Page
#    And  I should be seeing that the "Email" page is opened for Partner Page
#    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page
    When I select a value "Site Code" in the Partner Search Type field
    And  I enter a value "12345" in the Search Text field
    Then I should be seeing that the "PARTNERSHIP INFO" page is opened for Partner Page
    And  I should be seeing that the "Partnership Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Specification Name" page is opened for Partner Page
    And  I should be seeing that the "Partnership Description" page is opened for Partner Page
    And  I should be seeing that the "Partner Count" page is opened for Partner Page
    And  I should be seeing that the "PARTNER INFO" page is opened for Partner Page
    And  I should be seeing that the "Partner ID" page is opened for Partner Page
    And  I should be seeing that the "Partner Name" page is opened for Partner Page
    And  I should be seeing that the "Engaged Party" page is opened for Partner Page
    And  I should be seeing that the "Partner Status" page is opened for Partner Page
    And  I should be seeing that the "Partner Status Reason" page is opened for Partner Page
    And  I should be seeing that the "EMPLOYEES" page is opened for Partner Page
    And  I should be seeing that the "Name" page is opened for Partner Page
    And  I should be seeing that the "Role Type" page is opened for Partner Page
    And  I should be seeing that the "User Login" page is opened for Partner Page
    And  I should be seeing that the "Email" page is opened for Partner Page
    And  I should be seeing that the "Fix Phone Number" page is opened for Partner Page




