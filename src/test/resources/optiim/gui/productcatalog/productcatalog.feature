#language: en

Feature: Product Catalog Test Cases

  @regression @pia @productcatalog @VFALFT-8569 @ignore
  Scenario: Product Catalog Login
    Given I have opened the "Product Catalog" application
    When I have logged into the system.
    Then I should be seeing have successfully logged in to the Product Catalog

