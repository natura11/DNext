#language: en

Feature: Configure Products

  @regression @pia @configureproductscatalog @VFALFT-12476
    Scenario: Test Restrict currencies at PC with only ALL,EUR,USD
    Given I have opened the "Product Catalog" application
    When I have logged into the system.
    When I open "Offering Prices" menu
    Then I should be seeing that the "Offering Prices" page is opened for Product Catalog
    When I click Search button
    And  I enter a value "Vodafone Gigafibra 30 Mbps" in the Name Field
    And  I click on related offer from search list
    #When I click "Digitalb Premium 12MCommitment" in on the Product Catalog application
    Then I should be seeing that the "Offering Price Detail" page is opened for Product Catalog
    When I click "Pricing" tab on Offering Price Detail Page
    Then I should be seeing that the "Offering Price Detail" page is opened for Product Catalog
    Then I should be seeing that the "Currency" dropdown list is opened
    Then I should be seeing that "ALL","EUR","USD" values are displayed for Currency field


