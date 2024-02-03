#language: en

Feature: Configuration Options

  @regression @pia @configurationoptionspcatalog @VFALFT-12670
    Scenario: Test City Definitions from Product Catalog
    Given I have opened the "Product Catalog" application
    When I have logged into the system.
    When I open "Offerings" menu
    Then I should be seeing that the "Offerings" page is opened for Product Catalog
    When I click Search button
    And  I enter a value "VODAFONE GIGAFIBRA 30 MBPS" in the Name Field
    And  I click on related offer from search list
    Then I should be seeing that the "Offering Detail" page is opened for Product Catalog
    When I click "Places" tab on Offering Price Detail Page
    Then I should be seeing that the "Offering Detail" page is opened for Product Catalog
    When I click Add button on the Tab for Product Catalog
    Then I should be seeing that the "Search Places" page is opened for Product Catalog
    Then I should be seeing that the "Lifecycle Status" page is opened for Product Catalog
    Then I should be seeing that "Name" field in the Search Popup
    Then I should be seeing that "Description" field in the Search Popup
    Then I should be seeing that "Start Date Time" field in the Search Popup
    Then I should be seeing that "End Date Time" field in the Search Popup
    And  I enter a value "Berat" in the Name Field
    #And  I enter a value "" in the Description Field
    #And  I enter a value "" in the Start Date Time Field
    #And  I enter a value "" in the End Date Time Field
    Then I should be seeing that the "BERAT" page is opened for Product Catalog
